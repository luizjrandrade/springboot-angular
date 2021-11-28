package com.springangular.func.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springangular.func.model.Funcionario;
import com.springangular.func.repository.FuncionarioRepository;

@RestController
@RequestMapping("/api/v1/")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping("/funcionarios")
	public List<Funcionario> getAllFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
}
