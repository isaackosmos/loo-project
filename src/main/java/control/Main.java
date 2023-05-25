package control;

import model.Book;
import model.BookType;
import model.Client;
import model.NoStockException;
import model.BooksList;

public class Main extends Thread {
	
	public static void main(String[] args) {		
		Main thread = new Main();
		thread.start();	
	}
	
	public void run() {
		Client joaoSilva = new Client("Joao da Silva", "101.987.675.04");
		Client mariaSantos = new Client("Maria dos Santos", "115.765.453.10");
		
		Book pqnPrin = new Book("O Pequeno Principe", 1);
		pqnPrin.setType(BookType.ROMANCE);
		Book artGuerra = new Book("A Arte da Guerra", 2);
		artGuerra.setType(BookType.TEXT);
		
		
		BooksList joao = new BooksList(joaoSilva);
		BooksList maria = new BooksList(mariaSantos);
		
		
		try {
			joao.ownBook(pqnPrin);
			joao.ownBook(artGuerra);
			
			maria.ownBook(artGuerra);
			maria.ownBook(pqnPrin);
		}catch(NoStockException e) {
			System.out.println(e);
		}
		
		System.out.println("-----");
		
		joao.ownedBook();
		maria.ownedBook();
		
		System.out.println("-----");
		
		joao.giveBackBook(pqnPrin);
		maria.giveBackBook(artGuerra);
	
		System.out.println("-----");
		
		joao.ownedBook();
		maria.ownedBook();
	}
}
