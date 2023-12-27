package com.Gaming.repository;

import com.Gaming.entities.GamerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GamerRepo extends JpaRepository<GamerEntity, Long> {
    Optional<GamerEntity> findByEmail(String email);
}

// SPRITE UJE SPAT
