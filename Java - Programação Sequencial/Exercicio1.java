package exercicios;

import java.util.Scanner;

//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int meses, dias, idadeDias, idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Quantos meses faz desde que completou " + idade + " anos?");
		meses = leia.nextInt();
		
		System.out.println("Quantos dias fazem desde que completou " + idade + " anos e " + meses + " meses?");
		dias = leia.nextInt();
				
		idadeDias = (365 * idade) + (30 * meses) + dias;
		System.out.println("Voc� tem " + idadeDias + " dias de vida, parab�ns!");
		
		leia.close();
		
	}

}