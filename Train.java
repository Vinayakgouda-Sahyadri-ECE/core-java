class Train{
     int trainNumber;
	 String trainName;
	 String source;
	 String destination;
	 String departureTime;
	 String arrivalTime;
	 String totalDistance;
	 String totalBoggies;
	 String trainType;
	 int platformNumber;
	 String engineType;
	 String averageSpeed;
	 String runningDaily;
	 boolean pantryAvailable;
	 int acCoaches;
	 int sleeperCoaches;
	 int generalCoaches;
	 String trainStatus;
	 String ticketBookingMode;
	 String railwayZone;
	 Boggy boggy;
	 
	 Train(int trainNumber,String trainName,String source,String destination,String departureTime,String arrivalTime,String totalDistance,String totalBoggies,String trainType,int platformNumber,String engineType,String averageSpeed,String runningDaily,
	 boolean pantryAvailable,
	 int acCoaches,
	 int sleeperCoaches,
	 int generalCoaches,
	 String trainStatus,
	 String ticketBookingMode,
	 String railwayZone){
	 
	 this.trainNumber=trainNumber;
	 this.trainName=trainName;
	 this.source=source;
	 this.destination=destination;
	 this.departureTime=departureTime;
	 this.arrivalTime=arrivalTime;
	 this.totalDistance=totalDistance;
	 this.totalBoggies=totalBoggies;
	 this.trainType=trainType;
	 this.platformNumber=platformNumber;
	 this.engineType=engineType;
	 this.averageSpeed=averageSpeed;
	 this.runningDaily=runningDaily;
	 this.pantryAvailable=pantryAvailable;
	 this.acCoaches=acCoaches;
	 this.sleeperCoaches=sleeperCoaches;
	 this.generalCoaches=generalCoaches;
	 this.trainStatus=trainStatus;
	 this.ticketBookingMode=ticketBookingMode;
	 this.railwayZone=railwayZone;
	 
	 }
	 
	 public void getTrainDetails(){
	    System.out.println("The train number is:" +this.trainNumber);
		System.out.println("The train name is:" +this.trainName);
		System.out.println("The source of train is:" +this.source);
		System.out.println("The destination of train is:" +this.destination);
		System.out.println("The departure time of train:" +this.departureTime);
		System.out.println("The arrival time of train is:" +this.arrivalTime);
		System.out.println("The total distance of a train is:" +this.totalDistance);
		System.out.println("The total boggies of a train is:" +this.totalBoggies);
		System.out.println("The type of a train is:" +this.trainType);
		System.out.println("The platform number of train is:" +this.platformNumber);
		System.out.println("The engine type of train is:" +this.engineType);
		System.out.println("The averageSpeed of a train is:" +this.averageSpeed);
		System.out.println("The arriving time of train is:" +this.arrivalTime);
		System.out.println("The running status of train is:" +this.runningDaily);
		System.out.println("The pantry status of train is:" +this.pantryAvailable);
		System.out.println("No ac coaches in a train:" +this.acCoaches);
		System.out.println("No of sleeper coaches in a train:" +this.sleeperCoaches);
		System.out.println("No of general coaches in a train:" +this.generalCoaches);
		System.out.println("Train status:" +this.trainStatus);
		System.out.println("The train booking mode:" +this.ticketBookingMode);
		System.out.println("Name of railway zone:" +this.railwayZone);
		this.boggy.getBoggyDetails();
		}
	}