package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class testeRequestSoapComJAva {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

		LivrariaWS cliente = new LivrariaWSProxy();
		
		
		Livro[] livros = cliente.getLivrosPorTitulo("Piada");
		
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
			System.out.println(livro.getAutor());
		}
		
	}

}
