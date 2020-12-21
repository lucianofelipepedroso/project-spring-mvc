package com.luciano.felipe.curso.boot.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "FUNCIONARIOS")
public abstract class Funcionario extends AbstractEntity<Long> {
	
	@Column(nullable = false,unique = true,name = "nome")
	private String nome;
	
	@Column(nullable = false,columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@Column(columnDefinition = "DATE",nullable = false,name = "data_entrada")
	private LocalDate dataEntrada;
	
	@Column(columnDefinition = "DATE",name = "data_saida")
	private LocalDate dataSaida;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "endereco_id_fk")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name = "cargo_id_fk")
	private Cargo cargo;

}
