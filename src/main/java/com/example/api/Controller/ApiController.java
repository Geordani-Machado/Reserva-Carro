package com.example.api.Controller;

import com.example.api.model.Carro;
import com.example.api.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private CarroRepository carroRepository;

    @GetMapping("/carros")
    public ResponseEntity<List<Carro>> getCarros() {
        List<Carro> carros = carroRepository.findAll();
        return ResponseEntity.ok(carros);
    }
}
