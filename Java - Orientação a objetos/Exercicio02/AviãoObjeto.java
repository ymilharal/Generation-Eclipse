package Exercicio02;

import java.util.Scanner;

public class Avi�oObjeto {

	public static void main(String[] args) {
		Avi�o viagem = new Avi�o();
		Scanner leia = new Scanner(System.in);

		while (viagem.passagem < 2) {
			System.out.println("Digite seu nome: ");
			viagem.nome = leia.nextLine();
			System.out.println("Bem vindo(a) " + viagem.nome + " a Companhia Aerobrasileirissimo! ");

			viagem.destinos();
			viagem.partida();
			viagem.informa��es();

			viagem.passagem++;
		}
		leia.close();
	}
}