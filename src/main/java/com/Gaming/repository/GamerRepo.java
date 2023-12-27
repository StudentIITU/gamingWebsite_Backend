package com.Gaming.repository;

import com.Gaming.components.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamerRepo extends JpaRepository<Gamer, Long> {
    Gamer findByEmail(String email);
}
