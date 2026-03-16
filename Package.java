class Package{

int packageId;
String packageName;
String destination;
int durationDays;
double packagePrice;
String transportType;
String hotelType;
String foodIncluded;
String tourGuide;
String sightseeingPlaces;
String departureCity;
String returnCity;
String season;
String packageCategory;
String visaRequired;
String insuranceIncluded;
String bookingStatus;
String packageRating;
String travelMode;
String specialOffer;

Package(int packageId,String packageName,String destination,int durationDays,
double packagePrice,String transportType,String hotelType,String foodIncluded,
String tourGuide,String sightseeingPlaces,String departureCity,String returnCity,
String season,String packageCategory,String visaRequired,String insuranceIncluded,
String bookingStatus,String packageRating,String travelMode,String specialOffer){

this.packageId=packageId;
this.packageName=packageName;
this.destination=destination;
this.durationDays=durationDays;
this.packagePrice=packagePrice;
this.transportType=transportType;
this.hotelType=hotelType;
this.foodIncluded=foodIncluded;
this.tourGuide=tourGuide;
this.sightseeingPlaces=sightseeingPlaces;
this.departureCity=departureCity;
this.returnCity=returnCity;
this.season=season;
this.packageCategory=packageCategory;
this.visaRequired=visaRequired;
this.insuranceIncluded=insuranceIncluded;
this.bookingStatus=bookingStatus;
this.packageRating=packageRating;
this.travelMode=travelMode;
this.specialOffer=specialOffer;

}

public void getPackageDetails(){

System.out.println("--------------------------------");
System.out.println("Package ID: "+this.packageId);
System.out.println("Package Name: "+this.packageName);
System.out.println("Destination: "+this.destination);
System.out.println("Duration Days: "+this.durationDays);
System.out.println("Package Price: "+this.packagePrice);
System.out.println("Transport Type: "+this.transportType);
System.out.println("Hotel Type: "+this.hotelType);
System.out.println("Food Included: "+this.foodIncluded);
System.out.println("Tour Guide: "+this.tourGuide);
System.out.println("Sightseeing Places: "+this.sightseeingPlaces);
System.out.println("Departure City: "+this.departureCity);
System.out.println("Return City: "+this.returnCity);
System.out.println("Season: "+this.season);
System.out.println("Package Category: "+this.packageCategory);
System.out.println("Visa Required: "+this.visaRequired);
System.out.println("Insurance Included: "+this.insuranceIncluded);
System.out.println("Booking Status: "+this.bookingStatus);
System.out.println("Package Rating: "+this.packageRating);
System.out.println("Travel Mode: "+this.travelMode);
System.out.println("Special Offer: "+this.specialOffer);

}

}