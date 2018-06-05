package facade;

import java.util.Date;

public class Client {
	
	public static void main(String[] args) {
		
		Date from = new Date();
		Date to = new Date();
		
		TravelFacade facade = new TravelFacade();
		facade.getVooseHoteis(from, to);
		
	}

}
