package hotel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		reservationHandler.addPerson("Harri", "Prenja", "landvetter", "0046737373737");
		reservationHandler.addRoom("Basic", "001", "Yes");
		reservationHandler.addReservation("20150101","20150202");
	
		
		
		//
		reservationHandler.addPerson("ww", "xx", "landvetter", "0046737373737");
		reservationHandler.addRoom("Basic", "001", "Yes");
		reservationHandler.addReservation("20150101","20150202");
		
		
		
		
		reservationHandler.getReservation("0");
		
		reservationHandler.getReservation("1");
		
		
	}
	
	
	
	

}
