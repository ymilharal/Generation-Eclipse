package exercicios;

import java.util.Scanner;

//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
public class exercicio02for {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeros, pares = 0, impares = 0;
		
		for (int i = 0; i < 10; i++) {
		    System.out.print("Digite 10 n�meros de entrada: ");
		    numeros = leia.nextInt();
		    
		    if (numeros % 2 == 0) {
		    	pares++;
		    }
		    else {
		    	impares++;
		    }
		}
		System.out.println(pares + " s�o pares.");
		System.out.println(impares + " s�o impares.");
		leia.close();
	}

}
