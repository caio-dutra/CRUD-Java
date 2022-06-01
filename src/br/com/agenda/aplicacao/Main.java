package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

//MVC
/*
* Model
* View
* Controller
*/

public class Main {
	
	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("José da Silva");
		contato.setIdade(39);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		// Atualizar o contato.
		Contato c1 = new Contato();
		c1.setNome("José Antônio da Silva");
		c1.setIdade(69);
		c1.setDataCadastro(new Date());
		c1.setId(1);// É o número que está no banco de dados - Primary Key
		
		ContatoDAO.update(c1);
		
		
		
		// Vizualização dos registros do banco de dados(TODOS)
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contatos: " + c.getNome());
		}
	}

}
