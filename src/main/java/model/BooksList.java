package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BooksList {

	List<Book> clientList;
	Client client;
//	Iterator<Book> bookIterator;

	public BooksList(Client client) {
		this.client = client; 
		this.clientList = new ArrayList<Book>();
//		this.bookIterator = clientList.iterator();
	}

	public void ownBook(Book book) throws NoStockException{
		if(book.getQuantity() < 1)
			throw new NoStockException("Sem estoque.");
		else { 
			clientList.add(book);
			book.setQuantity(book.getQuantity() - 1);
		}
	}

	public void giveBackBook(Book book) {
		Iterator<Book> bookIterator = clientList.iterator();
		
		while(bookIterator.hasNext()) {
			Book b = bookIterator.next();
			if(b == book) {
				bookIterator.remove();
				book.setQuantity(book.getQuantity() + 1);
			}	
		}
	}
	
	public void ownedBook() {
		Iterator<Book> bookIterator = clientList.iterator();
		
		System.out.println(client.getName() + ":");
		if(clientList.isEmpty()) {
			System.out.println("Nenhum livro emprestado");
		} else {
			while(bookIterator.hasNext()) {
				Book b = bookIterator.next();
				System.out.println(b.getName());
			}
		}
	}
}
