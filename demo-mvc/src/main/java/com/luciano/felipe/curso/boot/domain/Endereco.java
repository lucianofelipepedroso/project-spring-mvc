package com.luciano.felipe.curso.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ENDERECOS")
public abstract class Endereco extends AbstractEntity<Long> {
	
	@Column(nullable = false)
	private String logradouro;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false,length = 2)
	private  UF uf;
	
	@Column(length = 9,nullable = false)
	private String cep;
	
	@Column(length = 5,nullable = false)
	private Integer numero;
	
	private String complemento;

}
