package hotel;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;


import java.util.ArrayList;
import java.util.Set;

public class reservationHandler {
	
	String arrDate;
	String depDate;
	static Integer resNr=0;
	String personInfo;
	
	//all arraylists to constructors
	static ArrayList<Person>personList = new ArrayList<Person>(); //stores personal data
	static ArrayList<RoomDetails>roomList = new ArrayList<RoomDetails>(); //stores the details for the booking
	static ArrayList<String> room = new ArrayList<String>();

	//Used to create a multimap array list with one key and several values.
	static  Multimap<String, String> multiMap = ArrayListMultimap.create();


	
	
	//Creates reservation Number and adds, person information, RoomDetails and
	public static void addReservation(String arrDate, String depDate){
		
		
		 String newnumber = resNr.toString();
		 
		//Adds the arguments info to the multiMap 
		 for(int i =0; i<1; i++){
			
		    multiMap.put(newnumber, arrDate);
		    multiMap.put(newnumber, depDate);
		
	
		    
		    
		}
		
		 resNr++;
		
	
		
		
	}
	
	
	
	//method for the room type "database"
	public static void addRoom(String roomType, String roomNr, String availability){
		
		 String newnumber = resNr.toString();
		
		 roomList.add (new RoomDetails(roomType, roomNr, availability));
		
		//Adds the arguments info to the multiMap 
		 for(int i =0; i<1; i++){
			
		    multiMap.put(newnumber, roomType);
		    multiMap.put(newnumber, roomNr);
		    multiMap.put(newnumber, availability);
		   


	   //     System.out.println(newnumber + ":" + multiMap.get(newnumber));
		
		}
   	
    
	}
	
	
	

	//method for the room type "database"
	public static void addPerson(String firstname, String lastname, String address, String phoneNr){
		
		 String newnumber = resNr.toString();
		 personList.add (new Person(firstname, lastname, address, phoneNr));
		
		//Adds the arguments info to the multiMap 
		 for(int i =0; i<1; i++){
			 	
			 	
			    multiMap.put(newnumber, firstname);
			    multiMap.put(newnumber, lastname);
			    multiMap.put(newnumber, address);
			    multiMap.put(newnumber, phoneNr);
		   


	   //     System.out.println(newnumber + ":" + multiMap.get(newnumber));
		
		}
   	
    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * interfaces
	 * 
	 */
	
	public int removeRoom(){
			
		return 1;
	}
	

	public int updateReservation(){
		
		return 1;
	}
	
	public int removeReservation(){
		
		return 1;
	}
	
	public int editRoom(){
		
		return 1;
	}
	
	
	//Prints out the choosen reservation in a array
	public static void getReservation(String newnumber){
		
		
	      System.out.println(newnumber + ":" + multiMap.get(newnumber));

	

	
	}
}
	


