package exercicios;

import java.util.Scanner;

/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = entrada.nextInt();
		

			if (numero % 2 == 0){
					System.out.println("O numero � par");
					double numeroRaiz = Math.sqrt(numero);
					System.out.println("A raiz quadrada ser�: " + numeroRaiz);
				}
			else {
					System.out.println("O numero � impar");
					double numeroPot = Math.pow(numero, 2);
					System.out.println("O resultado de " + numero + " elevado ao quadrado ser�: " + numeroPot);			
	}
			entrada.close();
}
}