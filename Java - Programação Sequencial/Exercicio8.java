package exercicios;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor*/
public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		double custoFabrica, distribuidor, custoConsumidor, imposto;

		System.out.println("Digite o valor de fabrica do ve�culo: ");
	     custoFabrica = leia.nextDouble();
		//percentual sempre divide por 100
		distribuidor = custoFabrica + (custoFabrica*28/100);
		imposto = custoFabrica + (custoFabrica*45/100);
		custoConsumidor = custoFabrica + distribuidor + imposto;

		System.out.println("O valor do ve�culo final ser� de: " + custoConsumidor);
		leia.close();
	}
}
