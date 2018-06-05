package mediator;

import java.util.ArrayList;

public class ApplicationMediator implements Mediator{

	/**
	 * Controle de participantes
	 */
	private ArrayList<Colleague> colleagues;
	
	/**
	 * Construtor que inicializa o controle
	 */
	public ApplicationMediator() {
		colleagues = new ArrayList<Colleague>();
	}
	
	/**
	 * Adicionar participantes
	 * @param colleague
	 */
	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
	}
	
	@Override
	public void send(String message, Colleague origem) {
		//deixa que todos os participantes saibam que houve uma mudança
		for ( Colleague colleague : colleagues) {
			//Não propaga a mensagem para si mesmo
			if (colleague != origem){
				colleague.receive(message);
			}
		}
		
	}

}
