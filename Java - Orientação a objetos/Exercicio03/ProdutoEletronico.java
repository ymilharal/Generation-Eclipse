package Exercicio03;

import java.util.Scanner;

public class ProdutoEletronico {
	//atributos
	Scanner leia = new Scanner(System.in);
	
	double pre�o[] = {150.00, 1550.00, 450.00}, pre�oTotal;
	String nome;
	String produto[][]= {{"Balan�a de cozinha", "Notebook ultrafino", "GoPro Hero9"},{"Suporta at� 10 kg Funciona com 2 pilhas e Display em led.", 
		"Possui tela full HD antirreflexo de 15,6", "Videos com resolu��o de at� 5k, a prova d'agua e possui sitema de estabiliza��o."}};
	int produtoEscolha, lugarEscolha, vezes = 0;

	
	public void produtos() {
		System.out.println("===Guia de produtos=== \n1)[" + produto[0][0] + "]: " + produto[1][0]);
		System.out.println("2)[" + produto[0][1] + "]: " + produto[1][1]);
		System.out.println("3)[" + produto[0][2] + "]: " + produto[1][2]);
		produtoEscolha = leia.nextInt();
	}
	public void frete() {
		System.out.println("===Escolha sua regi�o=== \n1)[S�o paulo]= gratuito.");
		System.out.println("2)[Rio de Janeiro]= gratuito");
		System.out.println("3)[Demais regi�es]= R$30,00]");
		lugarEscolha = leia.nextInt();
	}
	public void pre�os() {
		switch (produtoEscolha) {
	    case 1 :
	      System.out.println("O valor da " + produto[0][0] + " � de: R$" + pre�o[0]);
	      break;
	    case 2:
	      System.out.println("O valor do " + produto[0][1] + " � de: R$" + pre�o[1]);
	      break;
	    case 3:
	      System.out.println("O valor da " + produto[0][2] + " � de: R$" + pre�o[2]);
	      break;
	    default:
	      System.out.println("Op��o invalida tente novamente...");
	  }
	}
	public void calculando() {
		if (produtoEscolha == 1 && lugarEscolha == 1) {
			pre�oTotal = pre�o[0] + 0;
			System.out.println("O valor total com frete ser� de: R$" + pre�oTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if (produtoEscolha == 1 && lugarEscolha == 2) {
			pre�oTotal = pre�o[0] + 0;
			System.out.println("O valor total com frete ser� de: R$" + pre�oTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if (produtoEscolha == 1 && lugarEscolha == 3) {
			pre�oTotal = pre�o[0] + 30;
			System.out.println("O valor total com frete ser� de: R$" + pre�oTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if(produtoEscolha == 2 && lugarEscolha == 1) {
			pre�oTotal = pre�o[1] + 0;
			System.out.println("O valor total com frete ser� de: R$" + pre�oTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if(produtoEscolha == 2 && lugarEscolha == 2) {
			pre�oTotal = pre�o[1] + 0;
			System.out.println("O valor total com frete ser� de: R$" + pre�oTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if (produtoEscolha == 2 && lugarEscolha == 3) {
			pre�oTotal = pre�o[1] + 30;
			System.out.println("O valor total com frete ser� de: R$" + pre�oTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if (produtoEscolha == 3 && lugarEscolha == 1) {
			pre�oTotal = pre�o[2] + 0;
			System.out.println("O valor total com frete ser� de: R$" + pre�oTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if(produtoEscolha == 3 && lugarEscolha == 2) {
			pre�oTotal = pre�o[1] + 0;
			System.out.println("O valor total com frete ser� de: R$" + pre�oTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if (produtoEscolha == 3 && lugarEscolha == 3) {
			pre�oTotal = pre�o[2] + 30;
			System.out.println("O valor total com frete ser� de: R$" + pre�oTotal);
			System.out.println("Obrigada pela compra!");
		}
		else {
			System.out.println("Op��o invalida, tente novamente...\n");
	}
		System.out.println("\n=== Tenha uma boa tarde ===\n");
	}
}
