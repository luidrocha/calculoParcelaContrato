package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.DetalhamentoParcelas;
import model.service.ContratoService;
import model.service.PaypalService;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os Dados do Contrato");
		
		System.out.print("Digite o numero Contrato:");
		Integer numeroContrato = sc.nextInt();
		
		System.out.print("Digite a data de Contrato: ");
		Date dataContrato = sdf.parse(sc.next());
		
		System.out.println("Valor do Contrato: ");
		Double valContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numeroContrato, dataContrato, valContrato);
		
		System.out.println("Digite o numero de parcelas:");
		int numeroParcelas = sc.nextInt();
		
		ContratoService  contratoService = new ContratoService(new PaypalService());
		
		contratoService.ProcessaContrato(contrato, numeroParcelas);
		
		System.out.println("Parcelamento: ");
		
		for (DetalhamentoParcelas x : contrato.getParcelas()) {
			
			System.out.println(x);
			
			
		}
			
		
		sc.close();
		
	}

}
