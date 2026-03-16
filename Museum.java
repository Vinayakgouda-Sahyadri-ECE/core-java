class Museum{

int museumId;
String museumName;
String location;
String city;
String state;
int totalGalleries;
int totalArtifacts;
String openingTime;
String closingTime;
boolean ticketRequired;
int ticketPrice;
String museumOwner;
String securitySystem;
boolean guideAvailable;
int staffCount;
int cameraCount;
String museumCategory;
String mainAttraction;
String maintenanceStatus;
String museumStatus;

Diamond diamond;

Museum(int museumId,String museumName,String location,String city,String state,
int totalGalleries,int totalArtifacts,String openingTime,String closingTime,
boolean ticketRequired,int ticketPrice,String museumOwner,String securitySystem,
boolean guideAvailable,int staffCount,int cameraCount,String museumCategory,
String mainAttraction,String maintenanceStatus,String museumStatus){

this.museumId=museumId;
this.museumName=museumName;
this.location=location;
this.city=city;
this.state=state;
this.totalGalleries=totalGalleries;
this.totalArtifacts=totalArtifacts;
this.openingTime=openingTime;
this.closingTime=closingTime;
this.ticketRequired=ticketRequired;
this.ticketPrice=ticketPrice;
this.museumOwner=museumOwner;
this.securitySystem=securitySystem;
this.guideAvailable=guideAvailable;
this.staffCount=staffCount;
this.cameraCount=cameraCount;
this.museumCategory=museumCategory;
this.mainAttraction=mainAttraction;
this.maintenanceStatus=maintenanceStatus;
this.museumStatus=museumStatus;

}

public void getMuseumDetails(){

System.out.println("Museum ID: "+this.museumId);
System.out.println("Museum Name: "+this.museumName);
System.out.println("Location: "+this.location);
System.out.println("City: "+this.city);
System.out.println("State: "+this.state);
System.out.println("Total Galleries: "+this.totalGalleries);
System.out.println("Total Artifacts: "+this.totalArtifacts);
System.out.println("Opening Time: "+this.openingTime);
System.out.println("Closing Time: "+this.closingTime);
System.out.println("Ticket Required: "+this.ticketRequired);
System.out.println("Ticket Price: "+this.ticketPrice);
System.out.println("Museum Owner: "+this.museumOwner);
System.out.println("Security System: "+this.securitySystem);
System.out.println("Guide Available: "+this.guideAvailable);
System.out.println("Staff Count: "+this.staffCount);
System.out.println("Camera Count: "+this.cameraCount);
System.out.println("Museum Category: "+this.museumCategory);
System.out.println("Main Attraction: "+this.mainAttraction);
System.out.println("Maintenance Status: "+this.maintenanceStatus);
System.out.println("Museum Status: "+this.museumStatus);

this.diamond.getDiamondDetails();

}

}