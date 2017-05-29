package br.com.senai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.senai.model.Cidade;

public class CidadeDAO {

	public void salvar(Cidade cidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();

		entityManager.getTransaction().begin();

		entityManager.merge(cidade);

		entityManager.getTransaction().commit();

		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Cidade> listarcidades() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Cidade Order By estadoCidade, nomeCidade");
		return query.getResultList();
	}
	
	public void delete(Cidade cidade) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();

		entityManager.getTransaction().begin();
		
		cidade = entityManager.merge(cidade);
		
		entityManager.remove(cidade);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
	}

}
