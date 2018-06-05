package mediator;

public class ComputerColleague extends Colleague{

	public ComputerColleague(Mediator m) {
		super(m);
	}
	
	@Override
	public void receive(String message) {
		System.out.println("Computer Receive: " + message);
		
	}

}
