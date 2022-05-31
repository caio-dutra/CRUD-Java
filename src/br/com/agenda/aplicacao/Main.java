package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("João Pedro");
		contato.setIdade(23);
		contato.setDataCadastro(new Date());
		
		contatoDao.save(contato);
		
		// Vizualização dos registros do banco de dados(TODOS)
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contatos: " + c.getNome());
		}
	}

}
