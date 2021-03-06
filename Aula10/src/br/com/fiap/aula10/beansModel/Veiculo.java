package br.com.fiap.aula10.beansModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Veiculo {
	private String placa;
	private String modelo;
	private int potencia;
	private String proprietario;
	private int anoFabricacao; 
	
	public Veiculo() {}

	public Veiculo(String placa, String modelo, int potencia, String proprietario, int anoFabricacao) throws Exception {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.potencia = potencia;
		this.proprietario = proprietario;
		setAnoFabricacao(anoFabricacao);
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) throws Exception {
		// encapsular regra 
		Date data = new Date();
		DateFormat dtf = new SimpleDateFormat("yyyy");
		
		
		if (anoFabricacao > Integer.parseInt(dtf.format(data))) {
			throw new Exception("Data deve ser menor ou igual ao ano corrente.");
		}
		this.anoFabricacao = anoFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	
	
}
