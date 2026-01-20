package model.entities;

import java.time.LocalDateTime;

public class AluguelCarro {
	
	private LocalDateTime inicio;
	private LocalDateTime fim;
	private Veiculos veiculo;
	private Fatura fatura;
	
	public AluguelCarro(LocalDateTime inicio, LocalDateTime fim, Veiculos veiculo, Fatura fatura) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
		this.fatura = fatura;
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
	
	
	
	
}
