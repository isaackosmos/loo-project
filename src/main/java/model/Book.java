package model;

public abstract class Book {

	private String name;
	private int quantity;
	private BookType type;

	public Book(String name, int quantity) {
		this.setName(name);
		this.setQuantity(quantity);
	}

	public BookType getType() {
		return type;
	}

	public void setType(BookType type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}


}
