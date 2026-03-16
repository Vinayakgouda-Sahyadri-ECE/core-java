class TourismAngadi{

int tourismId;
String companyName;
String founderName;
String establishedYear;
String headquarters;
String country;
int totalEmployees;
String ceoName;
String companyType;
boolean onlineBooking;
boolean internationalTours;
String mainService;
String customerSupport;
String website;
String paymentOptions;
String travelInsurance;
String transportFacility;
String accommodationType;
String companyStatus;
String companyRating;

Package pkg;

TourismAngadi(int tourismId,String companyName,String founderName,String establishedYear,
String headquarters,String country,int totalEmployees,String ceoName,String companyType,
boolean onlineBooking,boolean internationalTours,String mainService,String customerSupport,
String website,String paymentOptions,String travelInsurance,String transportFacility,
String accommodationType,String companyStatus,String companyRating){

this.tourismId=tourismId;
this.companyName=companyName;
this.founderName=founderName;
this.establishedYear=establishedYear;
this.headquarters=headquarters;
this.country=country;
this.totalEmployees=totalEmployees;
this.ceoName=ceoName;
this.companyType=companyType;
this.onlineBooking=onlineBooking;
this.internationalTours=internationalTours;
this.mainService=mainService;
this.customerSupport=customerSupport;
this.website=website;
this.paymentOptions=paymentOptions;
this.travelInsurance=travelInsurance;
this.transportFacility=transportFacility;
this.accommodationType=accommodationType;
this.companyStatus=companyStatus;
this.companyRating=companyRating;

}

public void getTourismDetails(){

System.out.println("Tourism ID: "+this.tourismId);
System.out.println("Company Name: "+this.companyName);
System.out.println("Founder: "+this.founderName);
System.out.println("Established Year: "+this.establishedYear);
System.out.println("Headquarters: "+this.headquarters);
System.out.println("Country: "+this.country);
System.out.println("Total Employees: "+this.totalEmployees);
System.out.println("CEO: "+this.ceoName);
System.out.println("Company Type: "+this.companyType);
System.out.println("Online Booking: "+this.onlineBooking);
System.out.println("International Tours: "+this.internationalTours);
System.out.println("Main Service: "+this.mainService);
System.out.println("Customer Support: "+this.customerSupport);
System.out.println("Website: "+this.website);
System.out.println("Payment Options: "+this.paymentOptions);
System.out.println("Travel Insurance: "+this.travelInsurance);
System.out.println("Transport Facility: "+this.transportFacility);
System.out.println("Accommodation Type: "+this.accommodationType);
System.out.println("Company Status: "+this.companyStatus);
System.out.println("Company Rating: "+this.companyRating);

this.pkg.getPackageDetails();

}

}