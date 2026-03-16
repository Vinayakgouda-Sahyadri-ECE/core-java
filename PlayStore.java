class PlayStore{

int storeId;
String storeName;
String developerCompany;
String headquarters;
String country;
int totalApps;
int totalUsers;
String launchYear;
String ceoName;
String parentCompany;
String platformType;
String storeCategory;
boolean inAppPurchase;
boolean securityVerification;
String paymentSystem;
String updateSystem;
String ratingSystem;
String mainFeature;
String storeStatus;
String popularity;

Application application;

PlayStore(int storeId,String storeName,String developerCompany,String headquarters,
String country,int totalApps,int totalUsers,String launchYear,String ceoName,
String parentCompany,String platformType,String storeCategory,boolean inAppPurchase,
boolean securityVerification,String paymentSystem,String updateSystem,
String ratingSystem,String mainFeature,String storeStatus,String popularity){

this.storeId=storeId;
this.storeName=storeName;
this.developerCompany=developerCompany;
this.headquarters=headquarters;
this.country=country;
this.totalApps=totalApps;
this.totalUsers=totalUsers;
this.launchYear=launchYear;
this.ceoName=ceoName;
this.parentCompany=parentCompany;
this.platformType=platformType;
this.storeCategory=storeCategory;
this.inAppPurchase=inAppPurchase;
this.securityVerification=securityVerification;
this.paymentSystem=paymentSystem;
this.updateSystem=updateSystem;
this.ratingSystem=ratingSystem;
this.mainFeature=mainFeature;
this.storeStatus=storeStatus;
this.popularity=popularity;

}

public void getStoreDetails(){

System.out.println("Store ID: "+this.storeId);
System.out.println("Store Name: "+this.storeName);
System.out.println("Developer Company: "+this.developerCompany);
System.out.println("Headquarters: "+this.headquarters);
System.out.println("Country: "+this.country);
System.out.println("Total Apps: "+this.totalApps);
System.out.println("Total Users: "+this.totalUsers);
System.out.println("Launch Year: "+this.launchYear);
System.out.println("CEO Name: "+this.ceoName);
System.out.println("Parent Company: "+this.parentCompany);
System.out.println("Platform Type: "+this.platformType);
System.out.println("Store Category: "+this.storeCategory);
System.out.println("In App Purchase: "+this.inAppPurchase);
System.out.println("Security Verification: "+this.securityVerification);
System.out.println("Payment System: "+this.paymentSystem);
System.out.println("Update System: "+this.updateSystem);
System.out.println("Rating System: "+this.ratingSystem);
System.out.println("Main Feature: "+this.mainFeature);
System.out.println("Store Status: "+this.storeStatus);
System.out.println("Popularity: "+this.popularity);

this.application.getApplicationDetails();

}

}