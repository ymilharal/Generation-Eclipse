package exercicios;

import java.util.Scanner;

//1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
public class ExercicioVetor01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double maiorPontuacao = 0.0;
		double [] pontuacao = new double [5]; //vetor com 5 posi��es
		int i;
		System.out.println("===PONTUA��O===");
		//Adicionando valores ao vetor
		for (i = 0; i <= 4; i++) {
			System.out.print("Insira a " + (i + 1) + " pontua��o: ");
			pontuacao[i] = entrada.nextDouble();
			
			if (pontuacao[i] > maiorPontuacao) {
				maiorPontuacao = pontuacao[i];
			}
		}
		//Imprimindo valores do vetor
		for (i = 0; i <= 4; i++) {
			System.out.print(pontuacao [i] + " | ");
		}
		System.out.println("\nA maior pontua��o � de: " + maiorPontuacao);
		
		entrada.close();
	}
	}