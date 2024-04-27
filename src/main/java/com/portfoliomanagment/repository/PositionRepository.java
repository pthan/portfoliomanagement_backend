package com.portfoliomanagment.repository;

import com.portfoliomanagment.models.Position;
import com.portfoliomanagment.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
