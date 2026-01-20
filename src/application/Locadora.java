package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculos;
import model.services.TaxaServico;
import model.services.ValorServico;

public class Locadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Entrega (dd/MM/yyyy hh:mm): ");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);
		
		AluguelCarro carro = new AluguelCarro(inicio, fim, new Veiculos(modelo));
		
		System.out.print("Entre com o preço por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double precoPorDia = sc.nextDouble();
		
	
		ValorServico valorServico = new ValorServico(precoPorHora, precoPorDia, new TaxaServico());
		valorServico.processarFatura(carro);
		
		System.out.println("Fatura: ");
		System.out.println("Pagamento Basico: " + carro.getFatura().getPagamentoBasico());
		System.out.println("Imposto: " + carro.getFatura().getTaxa());
		System.out.println("Pagamento Total: "+ carro.getFatura().getPagamentoTotal());
		
		sc.close();
	}

}
