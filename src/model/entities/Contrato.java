package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numeroContrato;
	private Date dataContrato;
	private Double valorContrato;
	
	private List<DetalhamentoParcelas> parcelas = new ArrayList<>();
	
	public Contrato() {
		
	}

	public Contrato(Integer numeroContrato, Date dataContrato, Double valorContrato) {
		super();
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
		
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public List<DetalhamentoParcelas> getParcelas() {
		return parcelas;
	}

	public void addParcelas(DetalhamentoParcelas parcela) {

	parcelas.add(parcela);
	
	
}
	
	public void removeParcelas(DetalhamentoParcelas parcela) {
		
		parcelas.remove(parcela);
	}
	
}	
	
	
