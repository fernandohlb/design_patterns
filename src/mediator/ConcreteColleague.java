package mediator;

public class ConcreteColleague extends Colleague{

	public ConcreteColleague(Mediator m) {
		super(m);
	}
	
	@Override
	public void receive(String message) {
		System.out.println("Concrete Receive: " + message);
		
	}

}
