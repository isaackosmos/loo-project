package model;


public class Client {

	private String name;
	private String cpf;
	
	public Client(String name, String cpf) {
		this.setName(name);
		this.setCpf(cpf);
		
	}

	public String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	
	
}
