package br.com.sestren.vraptormultimodule.comum.rest;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long handle;
	private String nome;
	private String caminhoImagem;
	private BigDecimal preco;

	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaminhoImagem() {
		return caminhoImagem;
	}

	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		String str = "Nome: " + this.nome;
		if (this.preco != null)
			str += " Preço: " + this.preco.toString();
		return str;
	}

	public Long getHandle() {
		return handle;
	}

	public void setHandle(Long handle) {
		this.handle = handle;
	}
}
