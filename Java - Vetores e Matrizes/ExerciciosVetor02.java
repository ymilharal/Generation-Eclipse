package exercicios;
/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

public class ExerciciosVetor02 {

	public static void main(String[] args) {
		int [] dado = new int [10];
		int lancamento = 10, maiorPontuacao = 0, totalMp = 0;
		double media = 0.0, soma = 0.0;
		
		System.out.println("===Sorteando Valores===");
		
		for (int i = 0; i < lancamento; i++) {
		dado[i] = ((int)(1 + Math.random()*6));
		}
		for (int i = 0; i < lancamento; i++) {
			soma = soma + dado[i];
			
			System.out.println("O " + (i+1) + "� lan�amento foi: " + dado[i]);
			
			if (dado[i] > maiorPontuacao) {
				maiorPontuacao = dado[i];
				totalMp++;
		}
		}
			media = soma / lancamento;
			System.out.println("\nO maior valor apareceu: " + totalMp + "x");
			System.out.println("A m�dia dos lan�amentos foi de: " + media);
			System.out.println("O maior valor foi de: " + maiorPontuacao);
	}
}