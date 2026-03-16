class Mall{

int mallId;
String mallName;
String location;
String city;
String state;
int totalFloors;
int totalShops;
String openingTime;
String closingTime;
boolean parkingAvailable;
int parkingCapacity;
String mallOwner;
String securitySystem;
boolean foodCourtAvailable;
int escalators;
int elevators;
String mallCategory;
String mainAttraction;
String maintenanceStatus;
String mallStatus;

Shop shop;

Mall(int mallId,String mallName,String location,String city,String state,int totalFloors,
int totalShops,String openingTime,String closingTime,boolean parkingAvailable,
int parkingCapacity,String mallOwner,String securitySystem,boolean foodCourtAvailable,
int escalators,int elevators,String mallCategory,String mainAttraction,
String maintenanceStatus,String mallStatus){

this.mallId=mallId;
this.mallName=mallName;
this.location=location;
this.city=city;
this.state=state;
this.totalFloors=totalFloors;
this.totalShops=totalShops;
this.openingTime=openingTime;
this.closingTime=closingTime;
this.parkingAvailable=parkingAvailable;
this.parkingCapacity=parkingCapacity;
this.mallOwner=mallOwner;
this.securitySystem=securitySystem;
this.foodCourtAvailable=foodCourtAvailable;
this.escalators=escalators;
this.elevators=elevators;
this.mallCategory=mallCategory;
this.mainAttraction=mainAttraction;
this.maintenanceStatus=maintenanceStatus;
this.mallStatus=mallStatus;
}

public void getMallDetails(){

System.out.println("Mall ID: "+this.mallId);
System.out.println("Mall Name: "+this.mallName);
System.out.println("Location: "+this.location);
System.out.println("City: "+this.city);
System.out.println("State: "+this.state);
System.out.println("Total Floors: "+this.totalFloors);
System.out.println("Total Shops: "+this.totalShops);
System.out.println("Opening Time: "+this.openingTime);
System.out.println("Closing Time: "+this.closingTime);
System.out.println("Parking Available: "+this.parkingAvailable);
System.out.println("Parking Capacity: "+this.parkingCapacity);
System.out.println("Mall Owner: "+this.mallOwner);
System.out.println("Security System: "+this.securitySystem);
System.out.println("Food Court Available: "+this.foodCourtAvailable);
System.out.println("Escalators: "+this.escalators);
System.out.println("Elevators: "+this.elevators);
System.out.println("Mall Category: "+this.mallCategory);
System.out.println("Main Attraction: "+this.mainAttraction);
System.out.println("Maintenance Status: "+this.maintenanceStatus);
System.out.println("Mall Status: "+this.mallStatus);

this.shop.getShopDetails();
}

}