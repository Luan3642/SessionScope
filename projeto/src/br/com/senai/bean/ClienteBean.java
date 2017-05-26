package br.com.senai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.senai.dao.ClienteDAO;
import br.com.senai.model.Cliente;

@ManagedBean
@SessionScoped
public class ClienteBean {

	private Cliente cliente = new Cliente();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private Thread currentThread;

	public ClienteBean() {
		clientes = new ClienteDAO().listarClientes();
	}

	public String salvar() throws InterruptedException {
		currentThread = Thread.currentThread();
		Thread.sleep(500);
		new ClienteDAO().salvar(cliente);
		clientes = new ClienteDAO().listarClientes();
		cliente = new Cliente();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente salvo com sucesso"));
		return "cliente_list?faces-redirect=true";
	}

	public String editar(Cliente cliente) {
		this.cliente = cliente;
		return "cliente_cad?faces-redirect=true";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
