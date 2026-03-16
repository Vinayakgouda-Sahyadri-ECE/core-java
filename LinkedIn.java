class LinkedIn{

int linkedinId;
String platformName;
String founderName;
String foundedYear;
String headquarters;
String country;
int totalUsers;
String ceoName;
String platformType;
boolean mobileApp;
boolean webAccess;
String mainPurpose;
String jobSearchFeature;
String networkingFeature;
String messagingSystem;
String premiumSubscription;
String verificationSystem;
String platformSecurity;
String platformStatus;
String platformRating;

Profile profile;

LinkedIn(int linkedinId,String platformName,String founderName,String foundedYear,
String headquarters,String country,int totalUsers,String ceoName,String platformType,
boolean mobileApp,boolean webAccess,String mainPurpose,String jobSearchFeature,
String networkingFeature,String messagingSystem,String premiumSubscription,
String verificationSystem,String platformSecurity,String platformStatus,
String platformRating){

this.linkedinId=linkedinId;
this.platformName=platformName;
this.founderName=founderName;
this.foundedYear=foundedYear;
this.headquarters=headquarters;
this.country=country;
this.totalUsers=totalUsers;
this.ceoName=ceoName;
this.platformType=platformType;
this.mobileApp=mobileApp;
this.webAccess=webAccess;
this.mainPurpose=mainPurpose;
this.jobSearchFeature=jobSearchFeature;
this.networkingFeature=networkingFeature;
this.messagingSystem=messagingSystem;
this.premiumSubscription=premiumSubscription;
this.verificationSystem=verificationSystem;
this.platformSecurity=platformSecurity;
this.platformStatus=platformStatus;
this.platformRating=platformRating;

}

public void getLinkedInDetails(){

System.out.println("LinkedIn ID: "+this.linkedinId);
System.out.println("Platform Name: "+this.platformName);
System.out.println("Founder: "+this.founderName);
System.out.println("Founded Year: "+this.foundedYear);
System.out.println("Headquarters: "+this.headquarters);
System.out.println("Country: "+this.country);
System.out.println("Total Users: "+this.totalUsers);
System.out.println("CEO: "+this.ceoName);
System.out.println("Platform Type: "+this.platformType);
System.out.println("Mobile App: "+this.mobileApp);
System.out.println("Web Access: "+this.webAccess);
System.out.println("Main Purpose: "+this.mainPurpose);
System.out.println("Job Search Feature: "+this.jobSearchFeature);
System.out.println("Networking Feature: "+this.networkingFeature);
System.out.println("Messaging System: "+this.messagingSystem);
System.out.println("Premium Subscription: "+this.premiumSubscription);
System.out.println("Verification System: "+this.verificationSystem);
System.out.println("Platform Security: "+this.platformSecurity);
System.out.println("Platform Status: "+this.platformStatus);
System.out.println("Platform Rating: "+this.platformRating);

this.profile.getProfileDetails();

}

}