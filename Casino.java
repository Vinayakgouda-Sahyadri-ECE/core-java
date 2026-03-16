class Casino{

int casinoId;
String casinoName;
String casinoType;
String gameType;
int numberOfTables;
int slotMachines;
String casinoOwner;
boolean vipRoomAvailable;
String openingTime;
String closingTime;
String casinoArea;
String paymentMode;
boolean liveMusic;
int dealers;
String casinoColor;
String securityLevel;
boolean barService;
String casinoCategory;
String casinoStatus;
String popularity;

Casino(int casinoId,String casinoName,String casinoType,String gameType,
int numberOfTables,int slotMachines,String casinoOwner,
boolean vipRoomAvailable,String openingTime,String closingTime,
String casinoArea,String paymentMode,boolean liveMusic,int dealers,
String casinoColor,String securityLevel,boolean barService,
String casinoCategory,String casinoStatus,String popularity){

this.casinoId=casinoId;
this.casinoName=casinoName;
this.casinoType=casinoType;
this.gameType=gameType;
this.numberOfTables=numberOfTables;
this.slotMachines=slotMachines;
this.casinoOwner=casinoOwner;
this.vipRoomAvailable=vipRoomAvailable;
this.openingTime=openingTime;
this.closingTime=closingTime;
this.casinoArea=casinoArea;
this.paymentMode=paymentMode;
this.liveMusic=liveMusic;
this.dealers=dealers;
this.casinoColor=casinoColor;
this.securityLevel=securityLevel;
this.barService=barService;
this.casinoCategory=casinoCategory;
this.casinoStatus=casinoStatus;
this.popularity=popularity;

}

public void getCasinoDetails(){

System.out.println("-------------------------------------");
System.out.println("Casino ID: "+this.casinoId);
System.out.println("Casino Name: "+this.casinoName);
System.out.println("Casino Type: "+this.casinoType);
System.out.println("Game Type: "+this.gameType);
System.out.println("Number Of Tables: "+this.numberOfTables);
System.out.println("Slot Machines: "+this.slotMachines);
System.out.println("Casino Owner: "+this.casinoOwner);
System.out.println("VIP Room Available: "+this.vipRoomAvailable);
System.out.println("Opening Time: "+this.openingTime);
System.out.println("Closing Time: "+this.closingTime);
System.out.println("Casino Area: "+this.casinoArea);
System.out.println("Payment Mode: "+this.paymentMode);
System.out.println("Live Music: "+this.liveMusic);
System.out.println("Dealers: "+this.dealers);
System.out.println("Casino Color: "+this.casinoColor);
System.out.println("Security Level: "+this.securityLevel);
System.out.println("Bar Service: "+this.barService);
System.out.println("Casino Category: "+this.casinoCategory);
System.out.println("Casino Status: "+this.casinoStatus);
System.out.println("Popularity: "+this.popularity);

}

}