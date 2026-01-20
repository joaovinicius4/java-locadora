package model.services;

public class ValorServico {

	private Double precoPorHora;
	private Double precoPorDia;
	private TaxaServico taxaservico;
	
	public ValorServico(Double precoPorHora, Double precoPorDia, TaxaServico taxaservico) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxaservico = taxaservico;
	}
	
	public void processarFatura(AluguelCarro aluguelcarro) {
		
		
	}
	
	
}
