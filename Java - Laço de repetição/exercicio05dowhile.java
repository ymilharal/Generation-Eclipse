package exercicios;

import java.util.Scanner;

/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
public class exercicio05dowhile {

	public static void main(String[] args) {
		
		var leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite aqui o n�mero: ");
			numero = leia.nextInt();
			
			soma = soma + numero;
		} while(numero != 0);
		System.out.println("A soma dos n�meros �: " + soma);
		leia.close();
	}

}
