package com.luciano.felipe.curso.boot.domain;

import java.io.Serializable;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@MappedSuperclass
@ToString
public abstract class AbstractEntity <ID extends Serializable> implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

}
