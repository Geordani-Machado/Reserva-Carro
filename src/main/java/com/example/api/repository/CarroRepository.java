package com.example.api.repository;

import com.example.api.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface CarroRepository extends JpaRepository<Carro, Long>{
}
