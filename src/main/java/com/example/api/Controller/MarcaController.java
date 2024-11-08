package com.example.api.Controller;
import com.example.api.model.Marca;
import com.example.api.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @PostMapping
    public Marca adicionarMarca(@RequestBody Marca marca) {
        Marca newMarca = marcaRepository.save(marca);
        return marcaRepository.save(newMarca);
    }

    @GetMapping
    public ResponseEntity<List<Marca>> getCarros() {
        List<Marca> marcas = marcaRepository.findAll();
        return ResponseEntity.ok(marcas);
    }
}
