package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api.model.Reserva;
import org.springframework.stereotype.Repository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
