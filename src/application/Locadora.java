package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.TaxaServico;
import model.services.ValorServico;

public class Locadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		boolean valido = false;
		AluguelCarro carro = null;
		
		while(!valido) {
			try {
			System.out.println("Entre com os dados do aluguel");
			System.out.print("Modelo do carro: ");
			String modelo = sc.nextLine();
			System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
			LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
			System.out.print("Entrega (dd/MM/yyyy hh:mm): ");
			LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);
			
			carro = new AluguelCarro(inicio, fim, new Veiculo(modelo));
			valido = true;
			}
			catch(DateTimeParseException e) {
				System.out.println("Formato da data errado");
				System.out.println();
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				System.out.println();
			}
		}
		
		valido = false;
		ValorServico valorServico = null;
		
		while(!valido) {
			try {
				System.out.print("Entre com o preço por hora: ");
				double precoPorHora = sc.nextDouble();
				System.out.print("Entre com o preço por dia: ");
				double precoPorDia = sc.nextDouble();
				valorServico = new ValorServico(precoPorHora, precoPorDia, new TaxaServico());
				valorServico.processarFatura(carro);
				valido = true;
			}
			catch(InputMismatchException e) {
				System.out.println("Entrada de dados invalida");
				sc.nextLine();
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println();
		System.out.println(carro);
		
		sc.close();
	}

}
