package Iterator;

public class Cliente {

	public static void main(String[] args) {
		

		AgregadorDeCanais canaisEsportes = new CanaisEsportes();
		System.out.println("Canais de Esportes:");
		
		for (IteratorInterface it = canaisEsportes.criarIterator(); !it.isDone(); it.next()) {
			System.out.println(it.currentItem().nome);
		}
		
		AgregadorDeCanais canaisFilmes = new CanaisFilmes();
		System.out.println("Canais de Filmes:");

		for (IteratorInterface it = canaisFilmes.criarIterator(); !it.isDone(); it.next()) {
			System.out.println(it.currentItem().nome);
		}
		
	}

}
