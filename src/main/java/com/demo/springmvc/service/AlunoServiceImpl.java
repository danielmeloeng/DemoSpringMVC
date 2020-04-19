package com.demo.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.springmvc.data.AlunoData;
import com.demo.springmvc.model.Aluno;

@Service
@Transactional
public class AlunoServiceImpl implements AlunoService {
	
	@Autowired
	private AlunoData alunoData;

	@Override
	public void salvar(Aluno aluno) {
		this.alunoData.save(aluno);		
	}

	@Override
	public void atualizar(Aluno aluno) {
		this.alunoData.save(aluno);		
	}

	@Override
	public void excluir(Long id) {
		Aluno aluno = this.buscar(id);
		this.alunoData.delete(aluno);		
	}

	@Override
	public List<Aluno> listar() {
		return this.alunoData.findAll();
	}

	@Override
	public Aluno buscar(Long id) {		
		return this.alunoData.findById(id).get();
	}
}
