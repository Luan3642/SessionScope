package br.com.senai.dao;

import javax.persistence.EntityManager;

import br.com.senai.model.Cidade;

public class CidadeDAO {
	
	public void salvar(Cidade cidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.merge(cidade);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
	}

}
