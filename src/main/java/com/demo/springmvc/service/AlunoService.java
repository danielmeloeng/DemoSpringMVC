package com.demo.springmvc.service;

import java.util.List;

import com.demo.springmvc.model.Aluno;

public interface AlunoService {

	public void salvar(Aluno aluno);
	
	public void atualizar(Aluno aluno);
	
	public void excluir(Long id);
	
	public List<Aluno> listar();
	
	public Aluno buscar(Long id);
	
}
