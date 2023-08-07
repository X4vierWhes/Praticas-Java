package Entity;

public class Veiculo {
	private String placa;
	private String renavam;
	private String modelo;
	private int fabricacao;
	private Condutor condutor;
	
	
/////////////////////////////////////////////////////	
	//Construtores
	
	public Veiculo() {
		setPlaca("");
		setRenavam("");
		setModelo("");
		setFabricacao(0);
		setCondutor(null);
	}
	
	public Veiculo(String placa, String renavam, String modelo, int fabricacao, Condutor condutor) {
		setPlaca(placa);
		setRenavam(renavam);
		setModelo(modelo);
		setFabricacao(fabricacao);
		setCondutor(condutor);
	}
	
/////////////////////////////////////////////////////	
	//Getters e Setters
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		if (placa != null && !(placa.equals(""))) {
			this.placa = placa;
		} else {
			this.placa = "Não Informado";
		}
	}
	
////////////////////////////////////////////////////	
	
	public String getRenavam() {
		return renavam;
	}
	
	public void setRenavam(String renavam) {
		
		if (renavam != null && !(renavam.equals(""))) {
			this.renavam = renavam;
		} else {
			this.renavam = "Não Informado";
		}
	}
	
////////////////////////////////////////////////////	
	
	public int getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(int fabricacao) {
		
		if(fabricacao >= 0) {
			this.fabricacao = fabricacao;
		}else {
			this.fabricacao = 0;
		}
	}
	
////////////////////////////////////////////////////	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		
		if (modelo != null && !(modelo.equals(""))) {
			this.modelo = modelo;
		} else {
			this.modelo = "Não Informado";
		}
	}
	
////////////////////////////////////////////////////	
	public Condutor getCondutor() {
		return condutor;
	}
	
	public void setCondutor(Condutor condutor) {
		if(condutor != null) {
			this.condutor = condutor;
		}else {
			this.condutor.setName("");
			this.condutor.setCpf("");
			
		}
	}


}
