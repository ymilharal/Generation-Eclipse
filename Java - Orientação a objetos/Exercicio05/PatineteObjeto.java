package Exercicio05;

public class PatineteObjeto {

	public static void main(String[] args) {
		Patinete pagina = new Patinete();
		
		while (pagina.tentativa < 2) {
			pagina.boasvindas();
			pagina.introdu��o();
			pagina.modelos();
			pagina.despedida();
		}
	}
}