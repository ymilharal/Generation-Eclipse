package exercicios;

import java.util.Scanner;

//2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.
public class Exercicio2 {
	
	public static void main(String[] args) { 
		
	Scanner leia = new Scanner(System.in);
	
	int anos, dias, meses, idadeDias;

	System.out.println("Quantos dias de vida voc� tem? ");
	idadeDias = leia.nextInt();

	anos = idadeDias / 365;
	meses = (idadeDias%365) / 30;
	dias = (idadeDias%365) % 30;

	System.out.println("Voc� tem " + anos + " anos, " + meses + " meses " + " e " + dias + " dias de vida.");

	leia.close();
}
}