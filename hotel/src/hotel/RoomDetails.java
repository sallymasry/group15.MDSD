package hotel;


public class RoomDetails {

		
		public String roomNr;
		public String availability;
		public String roomType;
		
		
		
		public int price;
		public int bedsize;
		
		
		
		
		
		
	public RoomDetails(String roomType, String roomNr, String availability ){	
		this.roomType = roomType;
		this.roomNr = roomNr;
		this.availability = availability;
	
	
	
	
	}	
		//Basic
		public void RoomDetailsBasic (){
			
			//for room number, create an array 0-9, in every array space array[i] should equal 0 or 1, if 0 NOT available, if 1 available
			// the same should be done for the suite rooms
			
			bedsize = 500;						
			roomNr = roomNr; //FIXA ARRAY 10 rum
			price =  1000; // 1000kr/natt
	
		
			
		}
		
	public void RoomDetailsSuite (){
			
			bedsize = 600;
			roomNr = roomNr; //FIXA ARRAY 10 rum
			price =  2000; // 1000kr/natt
	
		
			
		}
		
		
	
		}
		
		
	
	
	

