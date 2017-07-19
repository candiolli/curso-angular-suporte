package com.cursosuporte.listatelefonica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Contato")
@Table
public class Contato {

	@Id
	private Long id;
	private String name;
	private Long telefone;

	@Column(name = "id_operadora")
	private Long idOperadora;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Long getIdOperadora() {
		return idOperadora;
	}

	public void setIdOperadora(Long idOperadora) {
		this.idOperadora = idOperadora;
	}

}
