package br.com.senai.util;

import br.com.senai.bean.CidadeBean;
import br.com.senai.model.Cidade;

public class util {
	
	public static void main(String[] args) {
		
		CidadeBean cidadeBean = new CidadeBean();
		
		for (Cidade cidades: cidadeBean.cidades) {
			System.out.println(cidades.getNomeCidade()+"\n");
		}
		
	}
	
}
