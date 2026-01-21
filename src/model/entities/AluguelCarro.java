package model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AluguelCarro {
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	private LocalDateTime inicio;
	private LocalDateTime fim;
	private Veiculos veiculo;
	private Fatura fatura;
	
	public AluguelCarro(LocalDateTime inicio, LocalDateTime fim, Veiculos veiculo) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	@Override
	public String toString() {
	    return "Modelo do carro: "
	            + veiculo
	            + "\nRetirada: "
	            + inicio.format(fmt)
	            + "\nEntrega: "
	            + fim.format(fmt)
	            + "\n\nFATURA:\n"
	            + fatura;
	}	
	
}
