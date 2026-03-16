class Salon{

int salonId;
String salonName;
String ownerName;
String establishedYear;
String location;
String country;
int totalStaff;
String managerName;
String salonType;
boolean onlineBooking;
boolean homeService;
String mainService;
String customerSupport;
String website;
String paymentOptions;
String wifiFacility;
String airConditioning;
String interiorType;
String salonStatus;
String salonRating;

Service service;

Salon(int salonId,String salonName,String ownerName,String establishedYear,
String location,String country,int totalStaff,String managerName,String salonType,
boolean onlineBooking,boolean homeService,String mainService,String customerSupport,
String website,String paymentOptions,String wifiFacility,String airConditioning,
String interiorType,String salonStatus,String salonRating){

this.salonId=salonId;
this.salonName=salonName;
this.ownerName=ownerName;
this.establishedYear=establishedYear;
this.location=location;
this.country=country;
this.totalStaff=totalStaff;
this.managerName=managerName;
this.salonType=salonType;
this.onlineBooking=onlineBooking;
this.homeService=homeService;
this.mainService=mainService;
this.customerSupport=customerSupport;
this.website=website;
this.paymentOptions=paymentOptions;
this.wifiFacility=wifiFacility;
this.airConditioning=airConditioning;
this.interiorType=interiorType;
this.salonStatus=salonStatus;
this.salonRating=salonRating;

}

public void getSalonDetails(){

System.out.println("Salon ID: "+this.salonId);
System.out.println("Salon Name: "+this.salonName);
System.out.println("Owner Name: "+this.ownerName);
System.out.println("Established Year: "+this.establishedYear);
System.out.println("Location: "+this.location);
System.out.println("Country: "+this.country);
System.out.println("Total Staff: "+this.totalStaff);
System.out.println("Manager Name: "+this.managerName);
System.out.println("Salon Type: "+this.salonType);
System.out.println("Online Booking: "+this.onlineBooking);
System.out.println("Home Service: "+this.homeService);
System.out.println("Main Service: "+this.mainService);
System.out.println("Customer Support: "+this.customerSupport);
System.out.println("Website: "+this.website);
System.out.println("Payment Options: "+this.paymentOptions);
System.out.println("WiFi Facility: "+this.wifiFacility);
System.out.println("Air Conditioning: "+this.airConditioning);
System.out.println("Interior Type: "+this.interiorType);
System.out.println("Salon Status: "+this.salonStatus);
System.out.println("Salon Rating: "+this.salonRating);

this.service.getServiceDetails();

}

}