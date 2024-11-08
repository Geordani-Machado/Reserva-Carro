package com.example.api.model;
import jakarta.persistence.*;
import java.util.UUID;


@Entity
public class Marca {

    @Id
    private UUID id;

    private String nome;

    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID();
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
