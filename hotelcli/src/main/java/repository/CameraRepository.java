package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Camera;

@Repository
public interface CameraRepository extends JpaRepository<Camera, Long> {
}
