package model;

public class NoStockException extends RuntimeException {
	
	public NoStockException(String msg) {
		super(msg);
	}
}
