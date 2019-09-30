package model.service;

import java.util.Date;

public interface OnlinePagamentoService {
	public double taxaPagamento(double valor);
	public double Parcelamento(double valor, int meses);
	
	
}
