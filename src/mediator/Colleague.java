package mediator;

public abstract class Colleague {
	
	private Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void send(String msg) {
		mediator.send(msg, this);		
	}
	
	private Mediator getMediator() {
		return mediator;

	}
	
	public abstract void receive (String message);

}
