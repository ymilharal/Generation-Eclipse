package Exercicio01Heran�a;

public class AnimalTeste {

	public static void main (String[] args) {
		
		var flora = new Cachorro();
		var florir = new Cavalo();
		var floriu = new Pregui�a();
		
		flora.setRa�a("Buldogue Frances");
		flora.setIdade(7);
		flora.setEstimativaVida(14);
		flora.setLate("Latido.");
		flora.setAlimentacao("ra��es small breed");
		
		System.out.println("===Guia de animais===\n");
		System.out.println("Cachorro: " + flora.getRa�a() + " est� com " + flora.getIdade() + " anos e vive em m�dia " + flora.getEstimativaVida() +
				" anos sua alimenta��o � de " + flora.getAlimentacao() + " o som que emite \ncostuma ser um " + flora.getLate());
		
		florir.setRa�a("Fr�sio");
		florir.setIdade(15);
		florir.setEstimativaVida(40);
		florir.setRelincha("Relinchar");
		florir.setCorrida("e � um cavalo de corrida.");
		florir.setAlimentacao("com nutrientes");
		
		System.out.println("\nCavalo: " + florir.getRa�a() + " est� com " + florir.getIdade() + " anos e vive em m�dia " + florir.getEstimativaVida() +
				" anos sua alimenta��o � " + florir.getAlimentacao() + ", o som que emite costuma ser um " + florir.getRelincha() + florir.getCorrida());
		
		floriu.setRa�a("Pregui�a-comum (Bradypus variegatus)");
		floriu.setIdade(25);
		floriu.setEstimativaVida(50);
		floriu.setCamufla("Pelagem que se camufla no ambiente");
		floriu.setLentid�o("lento");
		floriu.setAlimentacao("folhas e frutos");
		
		System.out.println("\nPregui�a: " + floriu.getRa�a() + " est� com " + floriu.getIdade() + " anos e vive em media " + floriu.getEstimativaVida() +
				" anos sua alimenta��o � composta de " + floriu.getAlimentacao() + ",\n � caracterisco ele ser um animal " + floriu.getLentid�o());
		
		System.out.println("\n===Fechou Guia de animais===");	
	}
}
