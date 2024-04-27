package com.portfoliomanagment.repository;

import java.util.Optional;

import com.portfoliomanagment.models.ERole;
import com.portfoliomanagment.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
