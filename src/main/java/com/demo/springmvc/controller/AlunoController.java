package com.demo.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import java.util.List;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.springmvc.model.Aluno;
import com.demo.springmvc.service.AlunoService;

@Controller
@Scope("request")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@PostMapping("/salvar")
	public ModelAndView salvar(@Valid Aluno aluno, BindingResult result) {
		ModelAndView mv = new ModelAndView("/index");
		if(result.hasErrors()) {
			return add(aluno);
		}			
		this.alunoService.salvar(aluno);
		return mv;		
	}

	@GetMapping("/excluir/{id}")
	public ModelAndView excluir(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("/index");
		this.alunoService.excluir(id);
		return mv;
	}

	@GetMapping("/")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("/index");
		List<Aluno> alunos = this.alunoService.listar();
		mv.addObject("alunos",alunos);
		return mv;
	}

	@GetMapping("/buscar/{id}")
	public ModelAndView buscar(@PathVariable("id") Long id) {
		Aluno aluno = this.alunoService.buscar(id);
		return add(aluno);
	}
	
	@GetMapping("/add")
	public ModelAndView add(Aluno aluno) {		
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("aluno", aluno);		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
