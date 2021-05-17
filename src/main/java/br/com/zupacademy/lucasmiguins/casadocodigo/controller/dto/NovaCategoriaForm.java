package br.com.zupacademy.lucasmiguins.casadocodigo.controller.dto;

import javax.validation.constraints.NotBlank;

import br.com.zupacademy.lucasmiguins.casadocodigo.modelo.Categoria;

public class NovaCategoriaForm {
	
	@NotBlank
	private String nome;

	public Categoria toModel() {
		return new Categoria(this.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}