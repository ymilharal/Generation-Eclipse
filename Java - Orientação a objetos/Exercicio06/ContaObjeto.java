package Exercicio06;

public class ContaObjeto {

	public static void main(String[] args) {
		
		Conta banco = new Conta();
		
		while (banco.visualiza��o < 2) {
		banco.entrada();
		banco.valores();
		banco.visualiza��o++;
	}
	}
}
