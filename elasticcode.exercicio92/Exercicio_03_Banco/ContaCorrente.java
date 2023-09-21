package Exercicio_03_Banco;

public class ContaCorrente {
	String numero;
	String tipo;
	double saldo;
	double limiteTotal;
	double limiteAtual;
	Cliente primeiroTitular;
	Cliente segundoTitular;



	void credito(double valor) {
		double saldoMais = this.saldo + valor;
		this.saldo = saldoMais;
	}

	void debito(double valor) {
		double saldoMenos = this.saldo - valor;
		this.saldo = saldoMenos;

	}

	void resumo() {
		System.out.println();
		System.out.println("Numero da Conta: " + numero);
		System.out.println("Titular 1: " + primeiroTitular.nome);
		if (segundoTitular != null) {
			System.out.println("Titular 2: " + segundoTitular.nome);
		}
		System.out.println("Saldo Atual: " + saldo);
		 limiteAtual = limiteTotal + saldo;
		System.out.println("Limite Atual: " + limiteAtual);
		System.out.println("Litime Total: " + limiteTotal);
		if(saldo < 0 ){
			System.out.println("Procure o Gerente!");
		}
	}

	public void setPrimeiroTitular(Cliente primeiroTitular) {
		this.primeiroTitular = primeiroTitular;
	}

	

	public void setSegundoTitular(Cliente segundoTitular) {
		this.segundoTitular = segundoTitular;
	}

	
	
}
