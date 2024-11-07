package com.example.api.Controller;
import com.example.api.model.Carro;
import com.example.api.repository.CarroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroRepository carroRepository;

    @PostMapping
    public Carro adicionarCarro(@RequestBody Carro carro) {
        return carroRepository.save(carro);
    }

    @GetMapping
    public List<Carro> listarCarros() {
        return carroRepository.findAll();
    }
}
