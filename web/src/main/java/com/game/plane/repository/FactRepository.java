package com.game.plane.repository;

import com.game.plane.entity.Fact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactRepository extends JpaRepository<Fact, Integer> {
}
