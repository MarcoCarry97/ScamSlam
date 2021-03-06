package es.edu.upc.hackaton.repository;

import es.edu.upc.hackaton.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Auth, String> {
}
