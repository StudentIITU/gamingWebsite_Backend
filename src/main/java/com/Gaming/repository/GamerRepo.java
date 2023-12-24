package com.Gaming.repository;

import com.Gaming.components.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GamerRepo extends JpaRepository<Gamer, Long> {
    Optional<Gamer> findByEmail(String email);
}
