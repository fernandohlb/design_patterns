package facade;

import java.util.ArrayList;
import java.util.Date;

public class TravelFacade {

	private HotelBooker hotelBooker;
	private VooBooker voosBooker;
	
	public void getVooseHoteis(Date from, Date to) {
		ArrayList<Voo> voos= voosBooker.getVoosFor(from, to);
		ArrayList<Hotel> hoteis = hotelBooker.getHotelNamesFor(from, to);
		
		//Retorna as listas de voos e Hoteis
		
	}
	
}
