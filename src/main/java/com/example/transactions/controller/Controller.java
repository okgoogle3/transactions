package com.example.transactions.controller;

import com.example.transactions.controller.DTO.DataDTO;
import com.example.transactions.service.ServiceTest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class Controller {
    private final ServiceTest service;

    @PostMapping
    public ResponseEntity<Void> createData(@RequestBody DataDTO dataDTO) {
        final String name = dataDTO.getName();
        try {
            service.createTestData(name);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
