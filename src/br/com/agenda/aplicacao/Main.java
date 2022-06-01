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
		
		// Registrar o contato.
		Contato contato = new Contato();
		contato.setNome("Seu Nome");
		contato.setIdade(00);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		
		
		// Atualizar o contato.
		Contato c1 = new Contato();
		c1.setNome("Seu nome atualizado");
		c1.setIdade(00);
		c1.setDataCadastro(new Date());
		c1.setId(1);// É o número que está no banco de dados - Primary Key
		
		//ContatoDAO.update(c1);
		
		
		
		//Deletar o seu contato pelo seu número de ID.
		ContatoDAO.deleteByID(2);
		
		
		
		// Vizualização dos registros do banco de dados(TODOS)
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contatos: " + c.getNome());
		}
	}

}
