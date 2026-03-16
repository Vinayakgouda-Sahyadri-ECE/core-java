class LensKart{

int storeId;
String storeName;
String location;
String city;
String state;
int totalEmployees;
int totalFrames;
String openingTime;
String closingTime;
boolean eyeTestAvailable;
int doctorsAvailable;
String storeOwner;
String securitySystem;
boolean homeDelivery;
int billingCounters;
int trialMirrors;
String storeCategory;
String mainAttraction;
String maintenanceStatus;
String storeStatus;

Frame frame;

LensKart(int storeId,String storeName,String location,String city,String state,
int totalEmployees,int totalFrames,String openingTime,String closingTime,
boolean eyeTestAvailable,int doctorsAvailable,String storeOwner,
String securitySystem,boolean homeDelivery,int billingCounters,
int trialMirrors,String storeCategory,String mainAttraction,
String maintenanceStatus,String storeStatus){

this.storeId=storeId;
this.storeName=storeName;
this.location=location;
this.city=city;
this.state=state;
this.totalEmployees=totalEmployees;
this.totalFrames=totalFrames;
this.openingTime=openingTime;
this.closingTime=closingTime;
this.eyeTestAvailable=eyeTestAvailable;
this.doctorsAvailable=doctorsAvailable;
this.storeOwner=storeOwner;
this.securitySystem=securitySystem;
this.homeDelivery=homeDelivery;
this.billingCounters=billingCounters;
this.trialMirrors=trialMirrors;
this.storeCategory=storeCategory;
this.mainAttraction=mainAttraction;
this.maintenanceStatus=maintenanceStatus;
this.storeStatus=storeStatus;

}

public void getStoreDetails(){

System.out.println("Store ID: "+this.storeId);
System.out.println("Store Name: "+this.storeName);
System.out.println("Location: "+this.location);
System.out.println("City: "+this.city);
System.out.println("State: "+this.state);
System.out.println("Total Employees: "+this.totalEmployees);
System.out.println("Total Frames: "+this.totalFrames);
System.out.println("Opening Time: "+this.openingTime);
System.out.println("Closing Time: "+this.closingTime);
System.out.println("Eye Test Available: "+this.eyeTestAvailable);
System.out.println("Doctors Available: "+this.doctorsAvailable);
System.out.println("Store Owner: "+this.storeOwner);
System.out.println("Security System: "+this.securitySystem);
System.out.println("Home Delivery: "+this.homeDelivery);
System.out.println("Billing Counters: "+this.billingCounters);
System.out.println("Trial Mirrors: "+this.trialMirrors);
System.out.println("Store Category: "+this.storeCategory);
System.out.println("Main Attraction: "+this.mainAttraction);
System.out.println("Maintenance Status: "+this.maintenanceStatus);
System.out.println("Store Status: "+this.storeStatus);

this.frame.getFrameDetails();

}

}