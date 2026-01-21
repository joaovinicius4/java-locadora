package model.entities;

public class Fatura {
	
	private Double pagamentoBasico;
	private Double taxa;
	
	
	public Fatura(Double pagamentoBasico, Double taxa) {
		this.pagamentoBasico = pagamentoBasico;
		this.taxa = taxa;
	}


	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}


	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}


	public Double getTaxa() {
		return taxa;
	}


	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double getPagamentoTotal() {
		return getPagamentoBasico() + getTaxa();
	}
	
	@Override
	public String toString() {
	    return "Pagamento básico: "
	            + String.format("%.2f", pagamentoBasico)
	            + "\nTaxa: "
	            + String.format("%.2f", taxa)
	            + "\nPagamento total: "
	            + String.format("%.2f", getPagamentoTotal());
	}

	
	
}
