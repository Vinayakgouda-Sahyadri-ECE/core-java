class FoodStreet{

int streetId;
String streetName;
String location;
String city;
String state;
String country;
int totalStalls;
String famousFood;
String openingTime;
String closingTime;
boolean vegetarianFood;
boolean dessertAvailable;
String popularDish;
String hygieneRating;
String parkingFacility;
String nearestMetro;
String crowdLevel;
String bestSeason;
String streetStatus;
String rating;

FoodStreet(int streetId,String streetName,String location,String city,String state,
String country,int totalStalls,String famousFood,String openingTime,String closingTime,
boolean vegetarianFood,boolean dessertAvailable,String popularDish,String hygieneRating,
String parkingFacility,String nearestMetro,String crowdLevel,String bestSeason,
String streetStatus,String rating){

this.streetId=streetId;
this.streetName=streetName;
this.location=location;
this.city=city;
this.state=state;
this.country=country;
this.totalStalls=totalStalls;
this.famousFood=famousFood;
this.openingTime=openingTime;
this.closingTime=closingTime;
this.vegetarianFood=vegetarianFood;
this.dessertAvailable=dessertAvailable;
this.popularDish=popularDish;
this.hygieneRating=hygieneRating;
this.parkingFacility=parkingFacility;
this.nearestMetro=nearestMetro;
this.crowdLevel=crowdLevel;
this.bestSeason=bestSeason;
this.streetStatus=streetStatus;
this.rating=rating;

}

public void getFoodStreetDetails(){

System.out.println("Street ID: "+this.streetId);
System.out.println("Street Name: "+this.streetName);
System.out.println("Location: "+this.location);
System.out.println("City: "+this.city);
System.out.println("State: "+this.state);
System.out.println("Country: "+this.country);
System.out.println("Total Stalls: "+this.totalStalls);
System.out.println("Famous Food: "+this.famousFood);
System.out.println("Opening Time: "+this.openingTime);
System.out.println("Closing Time: "+this.closingTime);
System.out.println("Vegetarian Food: "+this.vegetarianFood);
System.out.println("Dessert Available: "+this.dessertAvailable);
System.out.println("Popular Dish: "+this.popularDish);
System.out.println("Hygiene Rating: "+this.hygieneRating);
System.out.println("Parking Facility: "+this.parkingFacility);
System.out.println("Nearest Metro: "+this.nearestMetro);
System.out.println("Crowd Level: "+this.crowdLevel);
System.out.println("Best Season: "+this.bestSeason);
System.out.println("Street Status: "+this.streetStatus);
System.out.println("Rating: "+this.rating);

}

}