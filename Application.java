class Application{

int appId;
String appName;
String developerName;
String category;
String appVersion;
int downloads;
double rating;
String appSize;
boolean freeApp;
boolean inAppPurchase;
String supportedPlatform;
String programmingLanguage;
String releaseDate;
String lastUpdate;
String appType;
String targetAudience;
String appSecurity;
String appLicense;
String appStatus;
String popularity;

Application(int appId,String appName,String developerName,String category,
String appVersion,int downloads,double rating,String appSize,boolean freeApp,
boolean inAppPurchase,String supportedPlatform,String programmingLanguage,
String releaseDate,String lastUpdate,String appType,String targetAudience,
String appSecurity,String appLicense,String appStatus,String popularity){

this.appId=appId;
this.appName=appName;
this.developerName=developerName;
this.category=category;
this.appVersion=appVersion;
this.downloads=downloads;
this.rating=rating;
this.appSize=appSize;
this.freeApp=freeApp;
this.inAppPurchase=inAppPurchase;
this.supportedPlatform=supportedPlatform;
this.programmingLanguage=programmingLanguage;
this.releaseDate=releaseDate;
this.lastUpdate=lastUpdate;
this.appType=appType;
this.targetAudience=targetAudience;
this.appSecurity=appSecurity;
this.appLicense=appLicense;
this.appStatus=appStatus;
this.popularity=popularity;

}

public void getApplicationDetails(){

System.out.println("------------------------------------");
System.out.println("App ID: "+this.appId);
System.out.println("App Name: "+this.appName);
System.out.println("Developer Name: "+this.developerName);
System.out.println("Category: "+this.category);
System.out.println("App Version: "+this.appVersion);
System.out.println("Downloads: "+this.downloads);
System.out.println("Rating: "+this.rating);
System.out.println("App Size: "+this.appSize);
System.out.println("Free App: "+this.freeApp);
System.out.println("In App Purchase: "+this.inAppPurchase);
System.out.println("Supported Platform: "+this.supportedPlatform);
System.out.println("Programming Language: "+this.programmingLanguage);
System.out.println("Release Date: "+this.releaseDate);
System.out.println("Last Update: "+this.lastUpdate);
System.out.println("App Type: "+this.appType);
System.out.println("Target Audience: "+this.targetAudience);
System.out.println("App Security: "+this.appSecurity);
System.out.println("App License: "+this.appLicense);
System.out.println("App Status: "+this.appStatus);
System.out.println("Popularity: "+this.popularity);

}

}