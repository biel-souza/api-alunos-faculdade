package com.gabriel.escola.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import com.gabriel.escola.repositories.EnderecoRepository;
import org.springframework.web.bind.annotation.*;
import com.gabriel.escola.entities.Endereco;

import java.util.List;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping
    public Endereco saveAluno(@RequestBody Endereco endereco) {
        Endereco result = enderecoRepository.save(endereco);


        return result;
    }
}
