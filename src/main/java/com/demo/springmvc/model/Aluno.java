package com.demo.springmvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "tb_aluno")
public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "aluno_seq", sequenceName = "aluno_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_seq")
	private Long id;
	
	@Column(nullable = false, length = 50)
	@NotBlank(message = "Nome é uma informação obrigatória.")
	private String nome;
	
	@Column(nullable = false, length = 150)
	@NotBlank(message = "Matricula é uma informação obrigatória.")
	private String matricula;
	
	@Column(nullable = false, length = 2000)
	@NotBlank(message = "Sexo é uma informação obrigatória.")
	private String sexo;
	

}
