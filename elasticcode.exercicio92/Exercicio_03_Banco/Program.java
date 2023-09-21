package Exercicio_03_Banco;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Cadastre sua conta Bancaria:");
		System.out.println();

		ContaCorrente Conta = new ContaCorrente();

		System.out.print("Numero da conta: ");
		Conta.numero = sc.next();

		Cliente primeiroTitular = new Cliente();

		System.out.print("Nome Titular 1: ");
		primeiroTitular.nome = sc.next();
		System.out.print("Ano de Nascimento Titular 1: ");
		primeiroTitular.anoDeNascimento = sc.next();
		System.out.print("CPF Titular 1: ");
		primeiroTitular.cpf = sc.next();

		Conta.primeiroTitular = primeiroTitular;

		Cliente segundoTitular = null;
		System.out.println();
		System.out.print("Deseja adicionar um segundo Titular? (S/N) ");
		char confirmarTitular2 = sc.next().charAt(0);

		if ((confirmarTitular2 == 'S') || (confirmarTitular2 == 's')) {

			segundoTitular = new Cliente();
			System.out.print("Nome Titular 2: ");
			segundoTitular.nome = sc.next();
			System.out.print("Ano de Nascimento Titular 2: ");
			segundoTitular.anoDeNascimento = sc.next();
			System.out.print("CPF Titular 2: ");
			segundoTitular.cpf = sc.next();

			Conta.segundoTitular = segundoTitular;
		} 
			
		Conta.saldo = 2000;
		System.out.print("Saldo da Conta: " + Conta.saldo);
		Conta.saldo = 2000;
		Conta.limiteTotal = 4000;
		System.out.println();
		System.out.print("Deposito: ");
		Conta.credito(sc.nextDouble());
		System.out.print("Saque: ");
		Conta.debito(sc.nextDouble());

		Conta.resumo();

		sc.close();
	}

}