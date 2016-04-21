package br.com.fiap;

import java.math.BigDecimal;

public class Cliente {
	
	private String nome;
	private String endereco;
	private BigDecimal numeroRg;
	private BigDecimal numeroCpf;

	public Cliente() {
		super();
	}

	public Cliente(BigDecimal numeroRg) {
		this();
		this.numeroRg = numeroRg;
	}

	public Cliente(String nome, String endereco, BigDecimal numeroRg, BigDecimal numeroCpf) {
		this(numeroRg);
		this.nome = nome;
		this.endereco = endereco;
		this.numeroRg = numeroRg;
		this.numeroCpf = numeroCpf;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public BigDecimal getNumeroRg() {
		return numeroRg;
	}
	
	public void setNumeroRg(BigDecimal numeroRg) {
		this.numeroRg = numeroRg;
	}
	
	public BigDecimal getNumeroCpf() {
		return numeroCpf;
	}
	
	public void setNumeroCpf(BigDecimal numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
