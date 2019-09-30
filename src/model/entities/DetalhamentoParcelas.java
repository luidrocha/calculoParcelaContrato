package model.entities;

import java.util.Date;

public class DetalhamentoParcelas {

	private Date dataPagamnto;
	private Double valorPagamento;
	
	public DetalhamentoParcelas() {
		
	}

	public DetalhamentoParcelas(Date dataPagamnto, Double valorPagamento) {
		
		this.dataPagamnto = dataPagamnto;
		this.valorPagamento = valorPagamento;
	}

	public Date getDataPagamnto() {
		return dataPagamnto;
	}

	public void setDataPagamnto(Date dataPagamnto) {
		this.dataPagamnto = dataPagamnto;
	}

	public Double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	
	
}
