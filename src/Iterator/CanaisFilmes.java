package Iterator;

public class CanaisFilmes implements AgregadorDeCanais{

	private Canal[] canais;
	
	public CanaisFilmes() {
		canais = new Canal[4];
		
		canais[0] = new Canal("Cinemax");
		canais[1] = new Canal("HBO");
		canais[2] = new Canal("Telecine");
		canais[3] = new Canal("Sony");
		
	}
	
	
	@Override
	public IteratorInterface criarIterator() {
		return new IteratorMatrizDeCanais(canais);
	}

}
