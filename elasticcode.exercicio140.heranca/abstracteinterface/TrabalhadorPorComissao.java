package heranca.abstract_140;

public class TrabalhadorPorComissao  implements SeguroSaude {
	
	
	private String matriculaPlano;
	private int qtdeDependentes;
	private String nomeCompletoTitular;

	public TrabalhadorPorComissao(String matriculaPlano, int qtdeDependentes, String nomeCompletoTitular) {
		super();
		this.matriculaPlano = matriculaPlano;
		this.qtdeDependentes = qtdeDependentes;
		this.nomeCompletoTitular = nomeCompletoTitular;
	}

	public String getMatriculaPlano() {
		return matriculaPlano;
	}

	public int getQtdeDependentes() {
		return qtdeDependentes;
	}

	public String getNomeCompletoTitular() {
		
		return nomeCompletoTitular;
	}
	
	


}
