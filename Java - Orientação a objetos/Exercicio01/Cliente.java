package Exercicio01;

import java.util.Scanner;

/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
public class Cliente {
	//atributo
	String nome,produto[] = {"melancia", "banana", "mamao"}, produtoEscolha;
	double produtoValor, imposto = 1, pagamento, pre�o[] = {5, 2, 3};
	Scanner leia = new Scanner(System.in);
			
	public void atendimento () {
		System.out.println("Atendimento cordial e com excelencia para " + nome);
	}
	public void verProdutos() {
		System.out.print("Guia de produtos: ");
		System.out.println("[" + produto[0] +"] " + " [" + produto[1] +"]" + " [ "+ produto[2] + "]");
	}
	public void comprar() {
		System.out.print("Quero comprar uma: ");
		produtoEscolha = leia.nextLine();
	}
	public void pagar() {
		if (produtoEscolha.equals(produto[0])) {
			System.out.println("O valor da " + produto[0] + " ser� de: " + "R$" + pre�o[0]);
			pagamento = pre�o[0] + imposto;
			System.out.println("O valor a ser pago com imposto �: " + "R$" + pagamento);
			System.out.println("Obrigada pela compra no nosso mercado Jo�o tr�s produtos\n");
		}
		else if (produtoEscolha.equals(produto[1])) {
			System.out.println("O valor da " + produto[1] + " ser� de: " + "R$" + pre�o[1]);
			pagamento = pre�o[1] + imposto;
			System.out.println("O valor a ser pago com imposto �: " + "R$" + pagamento);
			System.out.println("Obrigada pela compra no nosso mercado Jo�o tr�s produtos\n");
		}
		else if (produtoEscolha.equals(produto[2])) {
			System.out.println("O valor do " + produto[2] + " ser� de: " + "R$" + pre�o[2]);
			pagamento = pre�o[2] + imposto;
			System.out.println("O valor a ser pago com imposto �: " + "R$" + pagamento);
			System.out.println("Obrigada pela compra no nosso mercado Jo�o tr�s produtos\n");
		}
		else {
			System.out.println("Op��o invalida, tente novamente...\n");
		}
	}
}