class MusicInstrument{

int instrumentId;
String instrumentName;
String instrumentType;
String material;
String originCountry;
String soundType;
String instrumentFamily;
double weight;
double length;
String color;
boolean electric;
String tuningType;
int numberOfStrings;
String manufacturer;
String instrumentUsage;
String maintenanceType;
String instrumentQuality;
String soundLevel;
String popularity;
String instrumentStatus;

MusicInstrument(int instrumentId,String instrumentName,String instrumentType,
String material,String originCountry,String soundType,String instrumentFamily,
double weight,double length,String color,boolean electric,String tuningType,
int numberOfStrings,String manufacturer,String instrumentUsage,
String maintenanceType,String instrumentQuality,String soundLevel,
String popularity,String instrumentStatus){

this.instrumentId=instrumentId;
this.instrumentName=instrumentName;
this.instrumentType=instrumentType;
this.material=material;
this.originCountry=originCountry;
this.soundType=soundType;
this.instrumentFamily=instrumentFamily;
this.weight=weight;
this.length=length;
this.color=color;
this.electric=electric;
this.tuningType=tuningType;
this.numberOfStrings=numberOfStrings;
this.manufacturer=manufacturer;
this.instrumentUsage=instrumentUsage;
this.maintenanceType=maintenanceType;
this.instrumentQuality=instrumentQuality;
this.soundLevel=soundLevel;
this.popularity=popularity;
this.instrumentStatus=instrumentStatus;

}

public void getInstrumentDetails(){

System.out.println("----------------------------------");
System.out.println("Instrument ID: "+this.instrumentId);
System.out.println("Instrument Name: "+this.instrumentName);
System.out.println("Instrument Type: "+this.instrumentType);
System.out.println("Material: "+this.material);
System.out.println("Origin Country: "+this.originCountry);
System.out.println("Sound Type: "+this.soundType);
System.out.println("Instrument Family: "+this.instrumentFamily);
System.out.println("Weight: "+this.weight);
System.out.println("Length: "+this.length);
System.out.println("Color: "+this.color);
System.out.println("Electric: "+this.electric);
System.out.println("Tuning Type: "+this.tuningType);
System.out.println("Number Of Strings: "+this.numberOfStrings);
System.out.println("Manufacturer: "+this.manufacturer);
System.out.println("Instrument Usage: "+this.instrumentUsage);
System.out.println("Maintenance Type: "+this.maintenanceType);
System.out.println("Instrument Quality: "+this.instrumentQuality);
System.out.println("Sound Level: "+this.soundLevel);
System.out.println("Popularity: "+this.popularity);
System.out.println("Instrument Status: "+this.instrumentStatus);

}

}