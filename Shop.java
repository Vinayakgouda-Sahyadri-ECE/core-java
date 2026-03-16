class Shop{

int shopNumber;
String shopName;
String shopType;
String brandName;
int floorNumber;
String shopOwner;
int numberOfEmployees;
boolean airConditioner;
String openingTime;
String closingTime;
String shopArea;
String paymentMode;
boolean trialRoomAvailable;
int billingCounters;
String shopColor;
String securityCamera;
boolean musicSystem;
String shopCategory;
String shopStatus;
String popularity;

Shop(int shopNumber,String shopName,String shopType,String brandName,int floorNumber,
String shopOwner,int numberOfEmployees,boolean airConditioner,String openingTime,
String closingTime,String shopArea,String paymentMode,boolean trialRoomAvailable,
int billingCounters,String shopColor,String securityCamera,boolean musicSystem,
String shopCategory,String shopStatus,String popularity){

this.shopNumber=shopNumber;
this.shopName=shopName;
this.shopType=shopType;
this.brandName=brandName;
this.floorNumber=floorNumber;
this.shopOwner=shopOwner;
this.numberOfEmployees=numberOfEmployees;
this.airConditioner=airConditioner;
this.openingTime=openingTime;
this.closingTime=closingTime;
this.shopArea=shopArea;
this.paymentMode=paymentMode;
this.trialRoomAvailable=trialRoomAvailable;
this.billingCounters=billingCounters;
this.shopColor=shopColor;
this.securityCamera=securityCamera;
this.musicSystem=musicSystem;
this.shopCategory=shopCategory;
this.shopStatus=shopStatus;
this.popularity=popularity;
}

public void getShopDetails(){

System.out.println("-----------------------------------");
System.out.println("Shop Number: "+this.shopNumber);
System.out.println("Shop Name: "+this.shopName);
System.out.println("Shop Type: "+this.shopType);
System.out.println("Brand Name: "+this.brandName);
System.out.println("Floor Number: "+this.floorNumber);
System.out.println("Shop Owner: "+this.shopOwner);
System.out.println("Employees: "+this.numberOfEmployees);
System.out.println("Air Conditioner: "+this.airConditioner);
System.out.println("Opening Time: "+this.openingTime);
System.out.println("Closing Time: "+this.closingTime);
System.out.println("Shop Area: "+this.shopArea);
System.out.println("Payment Mode: "+this.paymentMode);
System.out.println("Trial Room Available: "+this.trialRoomAvailable);
System.out.println("Billing Counters: "+this.billingCounters);
System.out.println("Shop Color: "+this.shopColor);
System.out.println("Security Camera: "+this.securityCamera);
System.out.println("Music System: "+this.musicSystem);
System.out.println("Shop Category: "+this.shopCategory);
System.out.println("Shop Status: "+this.shopStatus);
System.out.println("Popularity: "+this.popularity);
}

}