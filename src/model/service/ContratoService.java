package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;

public class ContratoService {

	private OnlinePagamentoService onlinePagamentoService;

	public ContratoService(OnlinePagamentoService onlinePagamentoService) {

		this.onlinePagamentoService = onlinePagamentoService;
	}

	public void ProcessaContrato(Contrato contrato, int meses) {

		double valorBase = contrato.getValorContrato() / meses;
		
		for(int x = 1; x<=meses; x++) {
			
			Date date = addMeses(contrato.getDataContrato(), x);
//			interest  juros mensal
			double updateCota = valorBase + onlinePagamentoService.Parcelamento(valorBase, x);
// paymentFree adiciona percentual fixo
			double fullCota = updateCota + onlinePagamentoService.taxaPagamento(updateCota);
			
		}
		
			}
	private Date addMeses(Date data, int n) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH,n);
		
		return cal.getTime();
		
	}
}