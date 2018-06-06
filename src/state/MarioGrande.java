package state;

public class MarioGrande implements MarioState{

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario ganhou 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario ganhou poder da bola de fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPenas() {
		System.out.println("Mario ganhou poder de voar");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario Pequeno");
		return new MarioPequeno();
	}
	
	

}
