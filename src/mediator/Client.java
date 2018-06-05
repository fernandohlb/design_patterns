package mediator;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationMediator mediator = new ApplicationMediator();
		
		Colleague desktop = new ConcreteColleague(mediator);
		Colleague mobile = new MobileColleague(mediator);
		Colleague computer = new ComputerColleague(mediator);
		
		mediator.addColleague(desktop);
		mediator.addColleague(mobile);
		mediator.addColleague(computer);
		
		desktop.send("Desktop falando: Ola Mundo");
		mobile.send("Mobile falando: oi");
		computer.send("Computer falando: Hello!");
		
	}

}
