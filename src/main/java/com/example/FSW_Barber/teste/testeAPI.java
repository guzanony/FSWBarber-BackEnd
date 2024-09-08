package com.example.FSW_Barber.teste;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/teste")
public class testeAPI {

    @GetMapping
    public ResponseEntity<String> listarClientes() {
        return ResponseEntity.ok("Olá mundo");
    }
}
