package model.service;

import java.util.Date;

public class PaypalService implements OnlinePagamentoService {

	private static final double PERCENTUAL_FIXO = 0.02;
	private static final double JUROS_MENSAL = 0.01;
	
	
	@Override
	public double taxaPagamento(double valor) {
		
		
		return valor * PERCENTUAL_FIXO;
		
		
	}

	@Override
	public 	double Parcelamento(double valor, int meses) {
		// 

		return valor * JUROS_MENSAL *  meses;
		
	}

}
