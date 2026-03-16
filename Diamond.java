class Diamond{

int diamondId;
String diamondName;
double weightCarat;
String color;
String clarity;
String cutType;
String originCountry;
String discoveredYear;
String shape;
double price;
String owner;
String museumDisplay;
String hardness;
String brilliance;
String fluorescence;
String category;
String rarityLevel;
String preservationMethod;
String diamondStatus;
String historicalValue;

Diamond(int diamondId,String diamondName,double weightCarat,String color,
String clarity,String cutType,String originCountry,String discoveredYear,
String shape,double price,String owner,String museumDisplay,String hardness,
String brilliance,String fluorescence,String category,String rarityLevel,
String preservationMethod,String diamondStatus,String historicalValue){

this.diamondId=diamondId;
this.diamondName=diamondName;
this.weightCarat=weightCarat;
this.color=color;
this.clarity=clarity;
this.cutType=cutType;
this.originCountry=originCountry;
this.discoveredYear=discoveredYear;
this.shape=shape;
this.price=price;
this.owner=owner;
this.museumDisplay=museumDisplay;
this.hardness=hardness;
this.brilliance=brilliance;
this.fluorescence=fluorescence;
this.category=category;
this.rarityLevel=rarityLevel;
this.preservationMethod=preservationMethod;
this.diamondStatus=diamondStatus;
this.historicalValue=historicalValue;

}

public void getDiamondDetails(){

System.out.println("-----------------------------------");
System.out.println("Diamond ID: "+this.diamondId);
System.out.println("Diamond Name: "+this.diamondName);
System.out.println("Weight (Carat): "+this.weightCarat);
System.out.println("Color: "+this.color);
System.out.println("Clarity: "+this.clarity);
System.out.println("Cut Type: "+this.cutType);
System.out.println("Origin Country: "+this.originCountry);
System.out.println("Discovered Year: "+this.discoveredYear);
System.out.println("Shape: "+this.shape);
System.out.println("Price: "+this.price);
System.out.println("Owner: "+this.owner);
System.out.println("Museum Display: "+this.museumDisplay);
System.out.println("Hardness: "+this.hardness);
System.out.println("Brilliance: "+this.brilliance);
System.out.println("Fluorescence: "+this.fluorescence);
System.out.println("Category: "+this.category);
System.out.println("Rarity Level: "+this.rarityLevel);
System.out.println("Preservation Method: "+this.preservationMethod);
System.out.println("Diamond Status: "+this.diamondStatus);
System.out.println("Historical Value: "+this.historicalValue);

}

}