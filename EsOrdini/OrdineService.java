import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class OrdineService {
    public void aggiungiOrdine(Scanner scanner) throws Exception {
        Connection conn = DBManager.getConnection();

        try {
            System.out.print("ID cliente: ");
            int clienteId = scanner.nextInt();
            scanner.nextLine();

            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO ordini (cliente_id, stato) VALUES (?, ?)",
                Statement.RETURN_GENERATED_KEYS
            );
            ps.setInt(1, clienteId);
            ps.setString(2, "In lavorazione");
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            int ordineId = rs.getInt(1);

            while (true) {
                System.out.print("ID prodotto (0 per terminare): ");
                int prodottoId = scanner.nextInt();
                if (prodottoId == 0) break;
                System.out.print("Quantità: ");
                int qty = scanner.nextInt();

                PreparedStatement ps2 = conn.prepareStatement(
                    "INSERT INTO ordine_prodotti (ordine_id, prodotto_id, quantita) VALUES (?, ?, ?)"
                );
                ps2.setInt(1, ordineId);
                ps2.setInt(2, prodottoId);
                ps2.setInt(3, qty);
                ps2.executeUpdate();
            }

            conn.commit();
            System.out.println("Ordine salvato con successo.");
        } catch (Exception e) {
            conn.rollback();
            System.out.println("Errore: ordine non salvato.");
            throw e;
        }
    }

    public void visualizzaStorico(Scanner scanner) throws Exception {
        Connection conn = DBManager.getConnection();
        System.out.print("ID cliente: ");
        int clienteId = scanner.nextInt();

        PreparedStatement ps = conn.prepareStatement(
            "SELECT o.id, o.data, o.stato, p.nome, op.quantita " +
            "FROM ordini o JOIN ordine_prodotti op ON o.id = op.ordine_id " +
            "JOIN prodotti p ON p.id = op.prodotto_id " +
            "WHERE o.cliente_id = ?"
        );
        ps.setInt(1, clienteId);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.printf("Ordine #%d | Data: %s | Stato: %s | %s x %d\n",
                rs.getInt("id"), rs.getTimestamp("data"), rs.getString("stato"),
                rs.getString("nome"), rs.getInt("quantita"));
        }
    }

    public void aggiornaStato(Scanner scanner) throws Exception {
        Connection conn = DBManager.getConnection();
        System.out.print("ID ordine: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nuovo stato: ");
        String stato = scanner.nextLine();

        PreparedStatement ps = conn.prepareStatement(
            "UPDATE ordini SET stato = ? WHERE id = ?"
        );
        ps.setString(1, stato);
        ps.setInt(2, id);
        int affected = ps.executeUpdate();

        conn.commit();
        if (affected > 0) {
            System.out.println("Ordine aggiornato.");
        } else {
            System.out.println("Ordine non trovato.");
        }
    }
}