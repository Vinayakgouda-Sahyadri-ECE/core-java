class Element{

int atomicNumber;
String elementName;
String symbol;
String elementCategory;
double atomicWeight;
int groupNumber;
int periodNumber;
String stateAtRoomTemp;
String discoveredBy;
String discoveryYear;
String color;
double meltingPoint;
double boilingPoint;
double density;
String electronConfiguration;
String elementFamily;
String reactivity;
String commonUses;
String elementStatus;
String elementOrigin;

Element(int atomicNumber,String elementName,String symbol,String elementCategory,
double atomicWeight,int groupNumber,int periodNumber,String stateAtRoomTemp,
String discoveredBy,String discoveryYear,String color,double meltingPoint,
double boilingPoint,double density,String electronConfiguration,
String elementFamily,String reactivity,String commonUses,
String elementStatus,String elementOrigin){

this.atomicNumber=atomicNumber;
this.elementName=elementName;
this.symbol=symbol;
this.elementCategory=elementCategory;
this.atomicWeight=atomicWeight;
this.groupNumber=groupNumber;
this.periodNumber=periodNumber;
this.stateAtRoomTemp=stateAtRoomTemp;
this.discoveredBy=discoveredBy;
this.discoveryYear=discoveryYear;
this.color=color;
this.meltingPoint=meltingPoint;
this.boilingPoint=boilingPoint;
this.density=density;
this.electronConfiguration=electronConfiguration;
this.elementFamily=elementFamily;
this.reactivity=reactivity;
this.commonUses=commonUses;
this.elementStatus=elementStatus;
this.elementOrigin=elementOrigin;

}

public void getElementDetails(){

System.out.println("----------------------------------");
System.out.println("Atomic Number: "+this.atomicNumber);
System.out.println("Element Name: "+this.elementName);
System.out.println("Symbol: "+this.symbol);
System.out.println("Element Category: "+this.elementCategory);
System.out.println("Atomic Weight: "+this.atomicWeight);
System.out.println("Group Number: "+this.groupNumber);
System.out.println("Period Number: "+this.periodNumber);
System.out.println("State At Room Temp: "+this.stateAtRoomTemp);
System.out.println("Discovered By: "+this.discoveredBy);
System.out.println("Discovery Year: "+this.discoveryYear);
System.out.println("Color: "+this.color);
System.out.println("Melting Point: "+this.meltingPoint);
System.out.println("Boiling Point: "+this.boilingPoint);
System.out.println("Density: "+this.density);
System.out.println("Electron Configuration: "+this.electronConfiguration);
System.out.println("Element Family: "+this.elementFamily);
System.out.println("Reactivity: "+this.reactivity);
System.out.println("Common Uses: "+this.commonUses);
System.out.println("Element Status: "+this.elementStatus);
System.out.println("Element Origin: "+this.elementOrigin);

}

}