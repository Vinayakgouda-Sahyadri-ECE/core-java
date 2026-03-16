class Service{

int serviceId;
String serviceName;
String serviceCategory;
String serviceType;
String duration;
double servicePrice;
String targetGender;
String toolsUsed;
String difficultyLevel;
String serviceQuality;
String comfortLevel;
String serviceChair;
String bodyPart;
String serviceMethod;
String effortLevel;
String popularity;
String bestTime;
String specialOffer;
String serviceStatus;
String serviceRating;

Service(int serviceId,String serviceName,String serviceCategory,String serviceType,
String duration,double servicePrice,String targetGender,String toolsUsed,
String difficultyLevel,String serviceQuality,String comfortLevel,String serviceChair,
String bodyPart,String serviceMethod,String effortLevel,String popularity,
String bestTime,String specialOffer,String serviceStatus,String serviceRating){

this.serviceId=serviceId;
this.serviceName=serviceName;
this.serviceCategory=serviceCategory;
this.serviceType=serviceType;
this.duration=duration;
this.servicePrice=servicePrice;
this.targetGender=targetGender;
this.toolsUsed=toolsUsed;
this.difficultyLevel=difficultyLevel;
this.serviceQuality=serviceQuality;
this.comfortLevel=comfortLevel;
this.serviceChair=serviceChair;
this.bodyPart=bodyPart;
this.serviceMethod=serviceMethod;
this.effortLevel=effortLevel;
this.popularity=popularity;
this.bestTime=bestTime;
this.specialOffer=specialOffer;
this.serviceStatus=serviceStatus;
this.serviceRating=serviceRating;

}

public void getServiceDetails(){

System.out.println("--------------------------------");
System.out.println("Service ID: "+this.serviceId);
System.out.println("Service Name: "+this.serviceName);
System.out.println("Service Category: "+this.serviceCategory);
System.out.println("Service Type: "+this.serviceType);
System.out.println("Duration: "+this.duration);
System.out.println("Service Price: "+this.servicePrice);
System.out.println("Target Gender: "+this.targetGender);
System.out.println("Tools Used: "+this.toolsUsed);
System.out.println("Difficulty Level: "+this.difficultyLevel);
System.out.println("Service Quality: "+this.serviceQuality);
System.out.println("Comfort Level: "+this.comfortLevel);
System.out.println("Service Chair: "+this.serviceChair);
System.out.println("Body Part: "+this.bodyPart);
System.out.println("Service Method: "+this.serviceMethod);
System.out.println("Effort Level: "+this.effortLevel);
System.out.println("Popularity: "+this.popularity);
System.out.println("Best Time: "+this.bestTime);
System.out.println("Special Offer: "+this.specialOffer);
System.out.println("Service Status: "+this.serviceStatus);
System.out.println("Service Rating: "+this.serviceRating);

}

}