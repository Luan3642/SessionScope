package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = -3448478794383986221L;

	private Long id;
	private Date cadastroProduto = new Date();
	private String descricaoProduto;
	private String marcaProduto;
	private Fornecedor fornecedor;
	private Double valorCompraProduto;
	private boolean active = true;
	private Date lastUpdate = new Date();

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCadastroProduto() {
		return cadastroProduto;
	}

	public void setCadastroProduto(Date cadastroProduto) {
		this.cadastroProduto = cadastroProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Double getValorCompraProduto() {
		return valorCompraProduto;
	}

	public void setValorCompraProduto(Double valorCompraProduto) {
		this.valorCompraProduto = valorCompraProduto;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
