package model.entities;

public class Veiculos {
	private String modelo;

	public Veiculos(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
	    return modelo;
	}

	
}
