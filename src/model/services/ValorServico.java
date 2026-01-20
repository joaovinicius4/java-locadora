package model.services;

import model.entities.AluguelCarro;

public class ValorServico {

	private Double precoPorHora;
	private Double precoPorDia;
	private TaxaServico taxaServico;
	
	public ValorServico(Double precoPorHora, Double precoPorDia, TaxaServico taxaServico) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxaServico = taxaServico;
	}
	
	public void processarFatura(AluguelCarro aluguelcarro) {
		
	}
	
	
}
