package com.gabriel.escola.repositories;

import com.gabriel.escola.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository  extends JpaRepository<Aluno, Integer> {

}
