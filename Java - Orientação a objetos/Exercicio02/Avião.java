package Exercicio02;

import java.util.Scanner;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
public class Avi�o {
	//ATRIBUTOS
	String modelo = "ATR 42-500", cor = "rosa purpura",cidades[] = {"Piranapiacaba", "Mairipor�", "Niteroi"};
	String cidadesEscolha, nome, horarios [] = {"7:30 am", "9:30 am", "10:30"};
	int passagem = 0;
	Scanner leia = new Scanner(System.in);
	
	public void destinos() {
		System.out.println("Guia de viagens: " + "[" + cidades[0] + "] " + "[" + cidades[1] + "] "+ "[" + cidades[2] + "]");
		System.out.println("Quero ir a: ");
		cidadesEscolha = leia.nextLine();
	}
	public void partida() {
		if (cidadesEscolha.equals(cidades[0])) {
			System.out.println("O voo para " + cidades[0] + " sair�: " + horarios[0]);
			String piloto = "Jorge Clonei";
			System.out.println("O piloto �: " + piloto);
		}
		else if (cidadesEscolha.equals(cidades[1])) {
			System.out.println("O voo para " + cidades[1] + " sair�: " + horarios[1]);
			String piloto = "Marai Kerei";
			System.out.println("O piloto �: " + piloto);
		}
		else if (cidadesEscolha.equals(cidades[2])) {
			System.out.println("O voo para " + cidades[2] + " sair�: " + horarios[2]);
			String piloto = "Justin Bieber";
			System.out.println("O piloto �: " + piloto);
		}
		else {
			System.out.println("Op��o invalida, tente novamente...\n");
	}
	}
	public void informa��es() {
		System.out.println("O modelo do avi�o �: " + modelo + ", da Azul e tem capacidade para 48 passageiros.");
		System.out.println("A cor do avi�o �: " + cor + ".");
		System.out.println("Obrigada por nos escolher, fa�a uma boa viagem!\n");
}
}