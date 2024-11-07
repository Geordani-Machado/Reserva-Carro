package com.example.api.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "cliente_id")
    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Carro carro;

    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Double valorReserva;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Double getValorReserva() {
        return valorReserva;
    }

    // Método para calcular o valor da reserva com base na diária do carro
    public void calcularValorReserva() {
        long dias = java.time.temporal.ChronoUnit.DAYS.between(dataInicio, dataFim);
        this.valorReserva = (double) (dias * carro.getDiaria());
    }
}
