package com.example.api.Controller;
import com.example.api.model.Reserva;
import com.example.api.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @PostMapping
    public Reserva adicionarReserva(@RequestBody Reserva reserva) {
        reserva.calcularValorReserva();
        return reservaRepository.save(reserva);
    }

    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }
}
