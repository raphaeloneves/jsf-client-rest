package br.com.raphaelneves.modelo;

import java.io.Serializable;

import com.google.gson.Gson;

public class Emprego implements Serializable {

	private String codPosto;
	private String nome;
	private String entidadeConveniada;
	private String endereco;
	private String municipio;
	private String uf;

	public String getCodPosto() {
		return codPosto;
	}

	public String getNome() {
		return nome;
	}

	public String getEntidadeConveniada() {
		return entidadeConveniada;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setCodPosto(String codPosto) {
		this.codPosto = codPosto;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEntidadeConveniada(String entidadeConveniada) {
		this.entidadeConveniada = entidadeConveniada;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
