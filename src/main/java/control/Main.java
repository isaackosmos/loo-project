package control;

import dao.EmployeeDao;
import model.Client;
import model.Employee;
import model.GiveBackBook;
import model.OwnBook;
import model.RomanceBook;
import model.Service;
import view.FrameBase;

public class Main {

	
	public static void main(String[] args) {
		
		Client client = new Client("Joao da Silva");
		RomanceBook book = new RomanceBook("O Pequeno Principe");
		
		OwnBook own = new OwnBook(client, book);
		own.doService();
		
		GiveBackBook give = new GiveBackBook(client, book);
		give.doService();
	}
}
