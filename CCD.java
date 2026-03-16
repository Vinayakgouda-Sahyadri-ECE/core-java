class CCD{

int cafeId;
String cafeName;
String founderName;
String establishedYear;
String headquarters;
String country;
int totalEmployees;
String ceoName;
String companyType;
boolean dineIn;
boolean takeaway;
String mainService;
String customerSupport;
String website;
String paymentOptions;
String wifiFacility;
String seatingCapacity;
String cafeStatus;
String cafeLocation;
String cafeRating;

Coffee coffee;

CCD(int cafeId,String cafeName,String founderName,String establishedYear,
String headquarters,String country,int totalEmployees,String ceoName,
String companyType,boolean dineIn,boolean takeaway,String mainService,
String customerSupport,String website,String paymentOptions,String wifiFacility,
String seatingCapacity,String cafeStatus,String cafeLocation,String cafeRating){

this.cafeId=cafeId;
this.cafeName=cafeName;
this.founderName=founderName;
this.establishedYear=establishedYear;
this.headquarters=headquarters;
this.country=country;
this.totalEmployees=totalEmployees;
this.ceoName=ceoName;
this.companyType=companyType;
this.dineIn=dineIn;
this.takeaway=takeaway;
this.mainService=mainService;
this.customerSupport=customerSupport;
this.website=website;
this.paymentOptions=paymentOptions;
this.wifiFacility=wifiFacility;
this.seatingCapacity=seatingCapacity;
this.cafeStatus=cafeStatus;
this.cafeLocation=cafeLocation;
this.cafeRating=cafeRating;

}

public void getCCDDetails(){

System.out.println("Cafe ID: "+this.cafeId);
System.out.println("Cafe Name: "+this.cafeName);
System.out.println("Founder: "+this.founderName);
System.out.println("Established Year: "+this.establishedYear);
System.out.println("Headquarters: "+this.headquarters);
System.out.println("Country: "+this.country);
System.out.println("Total Employees: "+this.totalEmployees);
System.out.println("CEO: "+this.ceoName);
System.out.println("Company Type: "+this.companyType);
System.out.println("Dine In: "+this.dineIn);
System.out.println("Takeaway: "+this.takeaway);
System.out.println("Main Service: "+this.mainService);
System.out.println("Customer Support: "+this.customerSupport);
System.out.println("Website: "+this.website);
System.out.println("Payment Options: "+this.paymentOptions);
System.out.println("WiFi Facility: "+this.wifiFacility);
System.out.println("Seating Capacity: "+this.seatingCapacity);
System.out.println("Cafe Status: "+this.cafeStatus);
System.out.println("Cafe Location: "+this.cafeLocation);
System.out.println("Cafe Rating: "+this.cafeRating);

this.coffee.getCoffeeDetails();

}

}