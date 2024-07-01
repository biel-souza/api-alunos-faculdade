package com.gabriel.escola.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import com.gabriel.escola.repositories.AlunoRepository;
import org.springframework.web.bind.annotation.*;
import com.gabriel.escola.entities.Aluno;

import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class UserController {
    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> getAlunos() {
        List<Aluno> result = alunoRepository.findAll();

        return result;
    }

    @PostMapping
    public Aluno saveAluno(@RequestBody Aluno aluno) {
        Aluno result = alunoRepository.save(aluno);


        return result;
    }
}
