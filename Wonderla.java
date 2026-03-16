class Wonderla{

int parkId;
String parkName;
String location;
String city;
String state;
int totalRides;
int totalPools;
String openingTime;
String closingTime;
boolean parkingAvailable;
int parkingCapacity;
String parkOwner;
String securitySystem;
boolean foodCourtAvailable;
int restaurants;
int lockers;
String parkCategory;
String mainAttraction;
String maintenanceStatus;
String parkStatus;

LazyPool lazyPool;

Wonderla(int parkId,String parkName,String location,String city,String state,
int totalRides,int totalPools,String openingTime,String closingTime,
boolean parkingAvailable,int parkingCapacity,String parkOwner,
String securitySystem,boolean foodCourtAvailable,int restaurants,int lockers,
String parkCategory,String mainAttraction,String maintenanceStatus,String parkStatus){

this.parkId=parkId;
this.parkName=parkName;
this.location=location;
this.city=city;
this.state=state;
this.totalRides=totalRides;
this.totalPools=totalPools;
this.openingTime=openingTime;
this.closingTime=closingTime;
this.parkingAvailable=parkingAvailable;
this.parkingCapacity=parkingCapacity;
this.parkOwner=parkOwner;
this.securitySystem=securitySystem;
this.foodCourtAvailable=foodCourtAvailable;
this.restaurants=restaurants;
this.lockers=lockers;
this.parkCategory=parkCategory;
this.mainAttraction=mainAttraction;
this.maintenanceStatus=maintenanceStatus;
this.parkStatus=parkStatus;

}

public void getParkDetails(){

System.out.println("Park ID: "+this.parkId);
System.out.println("Park Name: "+this.parkName);
System.out.println("Location: "+this.location);
System.out.println("City: "+this.city);
System.out.println("State: "+this.state);
System.out.println("Total Rides: "+this.totalRides);
System.out.println("Total Pools: "+this.totalPools);
System.out.println("Opening Time: "+this.openingTime);
System.out.println("Closing Time: "+this.closingTime);
System.out.println("Parking Available: "+this.parkingAvailable);
System.out.println("Parking Capacity: "+this.parkingCapacity);
System.out.println("Park Owner: "+this.parkOwner);
System.out.println("Security System: "+this.securitySystem);
System.out.println("Food Court Available: "+this.foodCourtAvailable);
System.out.println("Restaurants: "+this.restaurants);
System.out.println("Lockers: "+this.lockers);
System.out.println("Park Category: "+this.parkCategory);
System.out.println("Main Attraction: "+this.mainAttraction);
System.out.println("Maintenance Status: "+this.maintenanceStatus);
System.out.println("Park Status: "+this.parkStatus);

this.lazyPool.getLazyPoolDetails();

}

}