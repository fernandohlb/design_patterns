package state;

public class MarioPequeno implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario fica Grande");
		return new MarioGrande();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario fica grande e ganha poder de fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPenas() {
		System.out.println("Mario ganhou poder de voar");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario Morre");
		return new MarioMorto();
	}

}
