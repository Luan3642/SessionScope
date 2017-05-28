package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 747232006350159378L;

	private Long idCliente;
	private Date cadastroCliente = new Date();
	private String nomeCliente;
	private String enderecoCliente;
	private String cepCliente;
	private String foneaCliente;
	private String fonebCliente;
	private String cidadeCliente;
	private String rgCliente;
	private String cpfCliente;
	private Date lastUpdae = new Date();

	@Id
	@GeneratedValue
	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getCepCliente() {
		return cepCliente;
	}

	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}

	public String getFoneaCliente() {
		return foneaCliente;
	}

	public void setFoneaCliente(String foneaCliente) {
		this.foneaCliente = foneaCliente;
	}

	public String getFonebCliente() {
		return fonebCliente;
	}

	public void setFonebCliente(String fonebCliente) {
		this.fonebCliente = fonebCliente;
	}

	public String getCidadeCliente() {
		return cidadeCliente;
	}

	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}

	public String getRgCliente() {
		return rgCliente;
	}

	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Date getCadastroCliente() {
		return cadastroCliente;
	}

	public void setCadastroCliente(Date cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
	}

	public Date getLastUpdae() {
		return lastUpdae;
	}

	public void setLastUpdae(Date lastUpdae) {
		this.lastUpdae = lastUpdae;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", enderecoCliente="
				+ enderecoCliente + ", cepCliente=" + cepCliente + ", foneaCliente=" + foneaCliente + ", fonebCliente="
				+ fonebCliente + ", cidadeCliente=" + cidadeCliente + ", rgCliente=" + rgCliente + ", cpfCliente="
				+ cpfCliente + "]";
	}

}
