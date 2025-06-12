package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
