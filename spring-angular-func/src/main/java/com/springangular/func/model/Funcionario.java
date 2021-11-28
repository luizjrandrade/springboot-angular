package com.springangular.func.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "sobrenome")
	private String sobrenome;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "dpto")
	private String dpto;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String sobrenome, String emailId, String dpto) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.emailId = emailId;
		this.dpto = dpto;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDpto() {
		return dpto;
	}
	public void setDpto(String dpto) {
		this.dpto = dpto;
	}
	
}
