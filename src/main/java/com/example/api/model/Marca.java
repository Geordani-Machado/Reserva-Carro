package com.example.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

import java.util.UUID;

@Entity
public class Marca {

    @Id
    private UUID id;

    private String nome;

    // Gerando UUID diretamente ao persistir
    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID(); // Gera um UUID aleatório
        }
    }

    // Getters e Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
