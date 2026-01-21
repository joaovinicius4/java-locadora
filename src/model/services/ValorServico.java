package model.services;

import java.time.Duration;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class ValorServico {

	private Double precoPorHora;
	private Double precoPorDia;
	private InterfaceServico taxaServico;
	
	public ValorServico(Double precoPorHora, Double precoPorDia, InterfaceServico taxaServico) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxaServico = taxaServico;
	}
	
	public void processarFatura(AluguelCarro aluguelCarro) {
		
		double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
		double horas = minutos/60;
		
		double pagBasico;
		if(horas <= 12) {
			pagBasico = precoPorHora * Math.ceil(horas);
		}
		else {
			pagBasico = precoPorDia * Math.ceil(horas/24);
		}
		
		double taxa = taxaServico.taxa(pagBasico);
		aluguelCarro.setFatura(new Fatura(pagBasico, taxa));
	}
	
	
}
