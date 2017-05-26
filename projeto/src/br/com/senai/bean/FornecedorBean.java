package br.com.senai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.senai.dao.FornecedorDAO;
import br.com.senai.model.Fornecedor;

@ManagedBean
@SessionScoped
public class FornecedorBean {

	private Fornecedor fornecedor = new Fornecedor();
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	private Thread currentThread;
	
	public FornecedorBean() {
		fornecedores = new FornecedorDAO().listar();
	}
	
	public String salvar() throws InterruptedException {
		//fornecedores.add(fornecedor);
		currentThread = Thread.currentThread();
		Thread.sleep(500);
		new FornecedorDAO().salvar(fornecedor);
		fornecedores = new FornecedorDAO().listar();
		fornecedor = new Fornecedor();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cidade salva com sucesso!"));
		return "fornecedor_list?faces-redirect=true";
	}
	
	public String editar(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
		return "fornecedor_cad?faces-redirect=true";
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

}
