class Grow{

int growId;
String growPlatformName;
String companyName;
String headquarters;
String country;
String foundedYear;
int totalUsers;
String ceoName;
String platformType;
boolean mobileAppAvailable;
boolean webPlatformAvailable;
String supportedCountries;
String investmentTypes;
String securitySystem;
String customerSupport;
String paymentGateway;
String brokerageCharges;
String platformStatus;
String platformRating;
String mainFeature;

Stock stock;

Grow(int growId,String growPlatformName,String companyName,String headquarters,
String country,String foundedYear,int totalUsers,String ceoName,String platformType,
boolean mobileAppAvailable,boolean webPlatformAvailable,String supportedCountries,
String investmentTypes,String securitySystem,String customerSupport,
String paymentGateway,String brokerageCharges,String platformStatus,
String platformRating,String mainFeature){

this.growId=growId;
this.growPlatformName=growPlatformName;
this.companyName=companyName;
this.headquarters=headquarters;
this.country=country;
this.foundedYear=foundedYear;
this.totalUsers=totalUsers;
this.ceoName=ceoName;
this.platformType=platformType;
this.mobileAppAvailable=mobileAppAvailable;
this.webPlatformAvailable=webPlatformAvailable;
this.supportedCountries=supportedCountries;
this.investmentTypes=investmentTypes;
this.securitySystem=securitySystem;
this.customerSupport=customerSupport;
this.paymentGateway=paymentGateway;
this.brokerageCharges=brokerageCharges;
this.platformStatus=platformStatus;
this.platformRating=platformRating;
this.mainFeature=mainFeature;

}

public void getGrowDetails(){

System.out.println("Grow ID: "+this.growId);
System.out.println("Platform Name: "+this.growPlatformName);
System.out.println("Company Name: "+this.companyName);
System.out.println("Headquarters: "+this.headquarters);
System.out.println("Country: "+this.country);
System.out.println("Founded Year: "+this.foundedYear);
System.out.println("Total Users: "+this.totalUsers);
System.out.println("CEO Name: "+this.ceoName);
System.out.println("Platform Type: "+this.platformType);
System.out.println("Mobile App Available: "+this.mobileAppAvailable);
System.out.println("Web Platform Available: "+this.webPlatformAvailable);
System.out.println("Supported Countries: "+this.supportedCountries);
System.out.println("Investment Types: "+this.investmentTypes);
System.out.println("Security System: "+this.securitySystem);
System.out.println("Customer Support: "+this.customerSupport);
System.out.println("Payment Gateway: "+this.paymentGateway);
System.out.println("Brokerage Charges: "+this.brokerageCharges);
System.out.println("Platform Status: "+this.platformStatus);
System.out.println("Platform Rating: "+this.platformRating);
System.out.println("Main Feature: "+this.mainFeature);

this.stock.getStockDetails();

}

}