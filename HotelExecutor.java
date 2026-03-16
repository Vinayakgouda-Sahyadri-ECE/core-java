class HotelExecutor{
  public static void main(String[] args){
      Hotel hotel = new Hotel();
      hotel.HotelId=4;
	  
	  Floor floor = new Floor();
	  floor.FloorNumber=17;
	  hotel.floor=floor;
	  
	  hotel.getDetails();
	  
	  

	  }
	 }
