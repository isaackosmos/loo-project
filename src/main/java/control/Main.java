package control;

import model.Book;
import model.BookType;
import model.Client;
import model.BooksList;

public class Main {

	
	public static void main(String[] args) {
		
		Client joaoSilva = new Client("Joao da Silva", "101.987.675.04");
		Client mariaSantos = new Client("Maria dos Santos", "115.765.453.10");
		
		Book pqnPrin = new Book("O Pequeno Principe", 1);
		pqnPrin.setType(BookType.ROMANCE);
		Book artGuerra = new Book("A Arte da Guerra", 2);
		artGuerra.setType(BookType.TEXT);
		
		
		BooksList joao = new BooksList(joaoSilva);
		BooksList maria = new BooksList(mariaSantos);
		
		joao.ownBook(pqnPrin);
		joao.ownBook(artGuerra);
		
		maria.ownBook(artGuerra);
		
		joao.ownedBook();
		maria.ownedBook();
		
		System.out.println("-----");
		
		joao.giveBackBook(pqnPrin);
		maria.giveBackBook(artGuerra);
		
		joao.ownedBook();
		maria.ownedBook();
	}
}
