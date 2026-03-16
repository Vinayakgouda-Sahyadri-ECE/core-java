class PC{

int pcId;
String pcBrand;
String processor;
String operatingSystem;
int ramSize;
int storageSize;
String graphicsCard;
String motherboard;
String powerSupply;
String cabinetType;
boolean wifiAvailable;
boolean bluetoothAvailable;
String monitorType;
String keyboardType;
String mouseType;
String speakerType;
String coolingSystem;
String pcColor;
String pcCategory;
String pcStatus;

Hardware hardware;

PC(int pcId,String pcBrand,String processor,String operatingSystem,
int ramSize,int storageSize,String graphicsCard,String motherboard,
String powerSupply,String cabinetType,boolean wifiAvailable,
boolean bluetoothAvailable,String monitorType,String keyboardType,
String mouseType,String speakerType,String coolingSystem,
String pcColor,String pcCategory,String pcStatus){

this.pcId=pcId;
this.pcBrand=pcBrand;
this.processor=processor;
this.operatingSystem=operatingSystem;
this.ramSize=ramSize;
this.storageSize=storageSize;
this.graphicsCard=graphicsCard;
this.motherboard=motherboard;
this.powerSupply=powerSupply;
this.cabinetType=cabinetType;
this.wifiAvailable=wifiAvailable;
this.bluetoothAvailable=bluetoothAvailable;
this.monitorType=monitorType;
this.keyboardType=keyboardType;
this.mouseType=mouseType;
this.speakerType=speakerType;
this.coolingSystem=coolingSystem;
this.pcColor=pcColor;
this.pcCategory=pcCategory;
this.pcStatus=pcStatus;

}

public void getPCDetails(){

System.out.println("PC ID: "+this.pcId);
System.out.println("PC Brand: "+this.pcBrand);
System.out.println("Processor: "+this.processor);
System.out.println("Operating System: "+this.operatingSystem);
System.out.println("RAM Size: "+this.ramSize);
System.out.println("Storage Size: "+this.storageSize);
System.out.println("Graphics Card: "+this.graphicsCard);
System.out.println("Motherboard: "+this.motherboard);
System.out.println("Power Supply: "+this.powerSupply);
System.out.println("Cabinet Type: "+this.cabinetType);
System.out.println("WiFi Available: "+this.wifiAvailable);
System.out.println("Bluetooth Available: "+this.bluetoothAvailable);
System.out.println("Monitor Type: "+this.monitorType);
System.out.println("Keyboard Type: "+this.keyboardType);
System.out.println("Mouse Type: "+this.mouseType);
System.out.println("Speaker Type: "+this.speakerType);
System.out.println("Cooling System: "+this.coolingSystem);
System.out.println("PC Color: "+this.pcColor);
System.out.println("PC Category: "+this.pcCategory);
System.out.println("PC Status: "+this.pcStatus);

this.hardware.getHardwareDetails();

}

}