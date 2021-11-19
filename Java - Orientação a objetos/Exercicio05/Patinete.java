package Exercicio05;
/*5) Crie uma classe patinete e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

import java.util.Scanner;

public class Patinete {
	Scanner leia = new Scanner(System.in);
	
	String nome;
	String modelo[][] = {{"Xiaomi M365", "Two Dogs TD-Monster", "Atrio(infantil)"},{"Patinete Eletrico que atinge a velocidade de at� 30km/h.",
		"Patinete Eletrico e com assento que atinge a velocidade de at� 45km/h.", "Patine n�o eletrico com duas rodas que suporta at� 50kg."}};
	int tentativa = 0;
	
	public void boasvindas() {
		System.out.println("Qual o seu nome usuario? ");
		nome = leia.nextLine();
		System.out.println("Ol� " + nome + ", seja bem vindo ao mundo dos patinetes!");
	}
	public void introdu��o() {
		System.out.println("Trotineta ou Patinete � um meio de transporte, que � constitu�do por duas rodas em s�rie, "
		+ "\nque sustentam uma base onde o usu�rio apoia os p�s, guiando-o atrav�s de um guid�o que se eleva at� a altura da cintura.");
	}
	public void modelos() {
		System.out.println("\n===Conhe�a alguns modelos===");
		System.out.println("[" + modelo[0][0] + "] " + " = " + modelo [1][0]);
		System.out.println("[" + modelo[0][1] + " ] " + " = " + modelo [1][1]);
		System.out.println("[" + modelo[0][2] + "] " + " = " + modelo [1][2]);
	}
	public void valores() {
		System.out.println("O " + modelo[0][0] + " custa cerca de : R$2.500,00");
		System.out.println("O " + modelo[0][1] + " custa cerca de : R$8.000,00");
		System.out.println("O " + modelo[0][2] + " custa cerca de : R$209,90");
	}
	public void despedida() {
		System.out.println("\n\nObrigada por acessar nossa pagina " + nome + " espero que tenhamos ajudado na sua pesquisa!\n");
	}
}
