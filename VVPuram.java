class VVPuram{

int areaId;
String areaName;
String city;
String state;
String country;
int population;
String famousTemple;
String famousStreet;
boolean touristPlace;
boolean nightMarket;
String mainAttraction;
String nearbyMetro;
String busFacility;
String parkingArea;
String cleanlinessRating;
String safetyLevel;
String bestVisitTime;
String crowdType;
String areaStatus;
String areaRating;

FoodStreet fs;

VVPuram(int areaId,String areaName,String city,String state,String country,
int population,String famousTemple,String famousStreet,boolean touristPlace,
boolean nightMarket,String mainAttraction,String nearbyMetro,String busFacility,
String parkingArea,String cleanlinessRating,String safetyLevel,String bestVisitTime,
String crowdType,String areaStatus,String areaRating){

this.areaId=areaId;
this.areaName=areaName;
this.city=city;
this.state=state;
this.country=country;
this.population=population;
this.famousTemple=famousTemple;
this.famousStreet=famousStreet;
this.touristPlace=touristPlace;
this.nightMarket=nightMarket;
this.mainAttraction=mainAttraction;
this.nearbyMetro=nearbyMetro;
this.busFacility=busFacility;
this.parkingArea=parkingArea;
this.cleanlinessRating=cleanlinessRating;
this.safetyLevel=safetyLevel;
this.bestVisitTime=bestVisitTime;
this.crowdType=crowdType;
this.areaStatus=areaStatus;
this.areaRating=areaRating;

}

public void getVVPuramDetails(){

System.out.println("Area ID: "+this.areaId);
System.out.println("Area Name: "+this.areaName);
System.out.println("City: "+this.city);
System.out.println("State: "+this.state);
System.out.println("Country: "+this.country);
System.out.println("Population: "+this.population);
System.out.println("Famous Temple: "+this.famousTemple);
System.out.println("Famous Street: "+this.famousStreet);
System.out.println("Tourist Place: "+this.touristPlace);
System.out.println("Night Market: "+this.nightMarket);
System.out.println("Main Attraction: "+this.mainAttraction);
System.out.println("Nearby Metro: "+this.nearbyMetro);
System.out.println("Bus Facility: "+this.busFacility);
System.out.println("Parking Area: "+this.parkingArea);
System.out.println("Cleanliness Rating: "+this.cleanlinessRating);
System.out.println("Safety Level: "+this.safetyLevel);
System.out.println("Best Visit Time: "+this.bestVisitTime);
System.out.println("Crowd Type: "+this.crowdType);
System.out.println("Area Status: "+this.areaStatus);
System.out.println("Area Rating: "+this.areaRating);

this.fs.getFoodStreetDetails();

}

}