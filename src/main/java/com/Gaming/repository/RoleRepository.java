package com.Gaming.repository;

import com.Gaming.components.Roles;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface RoleRepository extends JpaRepository<Roles, Long> {
}
