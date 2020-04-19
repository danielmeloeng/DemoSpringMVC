package com.demo.springmvc.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springmvc.model.Aluno;

@Repository
public interface AlunoData extends JpaRepository<Aluno, Long> {

}
