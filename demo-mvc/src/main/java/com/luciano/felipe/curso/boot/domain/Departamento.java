package com.luciano.felipe.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
@Getter
@Setter
@NoArgsConstructor
public class Departamento extends AbstractEntity<Long>{
	
	@Column(name = "nome",length = 60,nullable = false,unique = true)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;

}
