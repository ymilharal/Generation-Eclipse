package Exercicio06;

import java.util.Scanner;

/*6) Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informa��es deste objeto no
console.*/
public class Conta {
	Scanner leia = new Scanner(System.in);
	double saldo = 680.00, saldoDevedor = -250.00, credito = 5.000;
	int usuario, visualiza��o = 0;
	String nome;

	public void entrada() {
		System.out.print("===Banco BNB=== \nDigite seu nome: ");
		nome = leia.next();
		System.out.println("Ol� " + nome + " em qual conta voc� gostaria de entrar? (1 ou 2)");
		usuario = leia.nextInt();
	}
	public void valores() {
		if (usuario == 1) {
		System.out.println("A conta possui saldo devedor de: R$" + saldoDevedor);
		System.out.println("Favor pagar pendencias ou seu cart�o ser� cancelado.");
		System.out.println("\nObrigada por utilizar nossos sistemas, at� mais!");
	}
	else if (usuario == 2) {
		System.out.println("A conta possui saldo de R$" + saldo);
		System.out.println("Seu limite de credito � de: R$" + credito);
		System.out.println("\nObrigada por utilizar nossos sistemas, at� mais!");
	}
	else {
		System.out.println("Op��o invalida tente novamente.");
	}
}
}
