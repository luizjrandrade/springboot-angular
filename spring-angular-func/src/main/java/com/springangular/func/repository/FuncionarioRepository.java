package com.springangular.func.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springangular.func.model.Funcionario;

//repositorio com interface

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
