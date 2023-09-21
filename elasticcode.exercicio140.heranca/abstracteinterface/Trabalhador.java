package heranca.abstract_140;

public abstract class Trabalhador {
	private String nome;
	private String Sobrenome;

	public Trabalhador(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.Sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public abstract double gerarSalario();

}
