class BigDaddy{

int cruiseId;
String cruiseName;
String location;
String city;
String state;
int totalFloors;
int passengerCapacity;
String openingTime;
String closingTime;
boolean restaurantAvailable;
int staffCount;
String cruiseOwner;
String securitySystem;
boolean barAvailable;
int elevators;
int decks;
String cruiseCategory;
String mainAttraction;
String maintenanceStatus;
String cruiseStatus;

Casino casino;

BigDaddy(int cruiseId,String cruiseName,String location,String city,String state,
int totalFloors,int passengerCapacity,String openingTime,String closingTime,
boolean restaurantAvailable,int staffCount,String cruiseOwner,String securitySystem,
boolean barAvailable,int elevators,int decks,String cruiseCategory,
String mainAttraction,String maintenanceStatus,String cruiseStatus){

this.cruiseId=cruiseId;
this.cruiseName=cruiseName;
this.location=location;
this.city=city;
this.state=state;
this.totalFloors=totalFloors;
this.passengerCapacity=passengerCapacity;
this.openingTime=openingTime;
this.closingTime=closingTime;
this.restaurantAvailable=restaurantAvailable;
this.staffCount=staffCount;
this.cruiseOwner=cruiseOwner;
this.securitySystem=securitySystem;
this.barAvailable=barAvailable;
this.elevators=elevators;
this.decks=decks;
this.cruiseCategory=cruiseCategory;
this.mainAttraction=mainAttraction;
this.maintenanceStatus=maintenanceStatus;
this.cruiseStatus=cruiseStatus;

}

public void getCruiseDetails(){

System.out.println("Cruise ID: "+this.cruiseId);
System.out.println("Cruise Name: "+this.cruiseName);
System.out.println("Location: "+this.location);
System.out.println("City: "+this.city);
System.out.println("State: "+this.state);
System.out.println("Total Floors: "+this.totalFloors);
System.out.println("Passenger Capacity: "+this.passengerCapacity);
System.out.println("Opening Time: "+this.openingTime);
System.out.println("Closing Time: "+this.closingTime);
System.out.println("Restaurant Available: "+this.restaurantAvailable);
System.out.println("Staff Count: "+this.staffCount);
System.out.println("Cruise Owner: "+this.cruiseOwner);
System.out.println("Security System: "+this.securitySystem);
System.out.println("Bar Available: "+this.barAvailable);
System.out.println("Elevators: "+this.elevators);
System.out.println("Decks: "+this.decks);
System.out.println("Cruise Category: "+this.cruiseCategory);
System.out.println("Main Attraction: "+this.mainAttraction);
System.out.println("Maintenance Status: "+this.maintenanceStatus);
System.out.println("Cruise Status: "+this.cruiseStatus);

this.casino.getCasinoDetails();

}

}