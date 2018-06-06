package Iterator;

import java.util.ArrayList;

public class CanaisEsportes implements AgregadorDeCanais{
	
	protected ArrayList<Canal> canais;
	
	public CanaisEsportes() {
		canais = new ArrayList<Canal>();
		
		canais.add(new Canal("Esporte ao vivo"));
		canais.add(new Canal("Basquete"));
		canais.add(new Canal("Campeonato Brasileiro"));
		canais.add(new Canal("Esgrima"));
		canais.add(new Canal("Natação"));
		
	}

	@Override
	public IteratorInterface criarIterator() {
		return new IteratorListaDeCanais(canais);
	}

	
}
