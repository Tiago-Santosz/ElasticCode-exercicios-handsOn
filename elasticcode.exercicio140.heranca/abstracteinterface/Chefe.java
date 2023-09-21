package heranca.abstract_140;

public class Chefe extends Trabalhador implements SeguroSaude {
	private double salarioBase;
	private String matriculaPlano;
	private int qtdeDependentes;
	
	
	
	public Chefe(String nome, String sobrenome, String matriculaPlano, int qtdeDependentes) {
		super(nome, sobrenome);
		this.matriculaPlano = matriculaPlano;
		this.qtdeDependentes = qtdeDependentes;
	}

	public Chefe(String nome, String sobrenome, double salarioBase) {
		super(nome, sobrenome);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public String getMatriculaPlano() {
		return this.matriculaPlano;
	}

	public int getQtdeDependentes() {
		return qtdeDependentes;
	}

	public String getNomeCompletoTitular() {
		return getNome() + "" + getSobrenome();
	}

	public double gerarSalario() {
		return 0;
	}

}
