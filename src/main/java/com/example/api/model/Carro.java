package com.example.api.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.util.UUID;

@Entity
public class Carro {

    @Id
    private UUID id;

    private String nome;
    private String modelo;
    private int anoFabricacao;
    private String cor;


    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

    private boolean reservado;
    private float preco; // Atributo para o preço diário

    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID();
        }
    }

    // Getters e Setters para os atributos

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getDiaria() {
        return preco;
    }
}
