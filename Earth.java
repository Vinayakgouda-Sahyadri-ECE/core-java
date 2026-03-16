class Earth{

int planetId;
String planetName;
double diameter;
double mass;
double gravity;
double rotationPeriod;
double revolutionPeriod;
String atmosphereComposition;
double surfaceArea;
double landPercentage;
double waterPercentage;
String planetType;
String galaxyName;
String solarSystemName;
String lifeExistence;
String magneticField;
String averageTemperature;
String planetAge;
String earthStatus;
String naturalSatellite;

Earth(int planetId,String planetName,double diameter,double mass,double gravity,
double rotationPeriod,double revolutionPeriod,String atmosphereComposition,
double surfaceArea,double landPercentage,double waterPercentage,String planetType,
String galaxyName,String solarSystemName,String lifeExistence,String magneticField,
String averageTemperature,String planetAge,String earthStatus,String naturalSatellite){

this.planetId=planetId;
this.planetName=planetName;
this.diameter=diameter;
this.mass=mass;
this.gravity=gravity;
this.rotationPeriod=rotationPeriod;
this.revolutionPeriod=revolutionPeriod;
this.atmosphereComposition=atmosphereComposition;
this.surfaceArea=surfaceArea;
this.landPercentage=landPercentage;
this.waterPercentage=waterPercentage;
this.planetType=planetType;
this.galaxyName=galaxyName;
this.solarSystemName=solarSystemName;
this.lifeExistence=lifeExistence;
this.magneticField=magneticField;
this.averageTemperature=averageTemperature;
this.planetAge=planetAge;
this.earthStatus=earthStatus;
this.naturalSatellite=naturalSatellite;

}

public void getEarthDetails(){

System.out.println("----------------------------------");
System.out.println("Planet ID: "+this.planetId);
System.out.println("Planet Name: "+this.planetName);
System.out.println("Diameter: "+this.diameter);
System.out.println("Mass: "+this.mass);
System.out.println("Gravity: "+this.gravity);
System.out.println("Rotation Period: "+this.rotationPeriod);
System.out.println("Revolution Period: "+this.revolutionPeriod);
System.out.println("Atmosphere Composition: "+this.atmosphereComposition);
System.out.println("Surface Area: "+this.surfaceArea);
System.out.println("Land Percentage: "+this.landPercentage);
System.out.println("Water Percentage: "+this.waterPercentage);
System.out.println("Planet Type: "+this.planetType);
System.out.println("Galaxy Name: "+this.galaxyName);
System.out.println("Solar System Name: "+this.solarSystemName);
System.out.println("Life Existence: "+this.lifeExistence);
System.out.println("Magnetic Field: "+this.magneticField);
System.out.println("Average Temperature: "+this.averageTemperature);
System.out.println("Planet Age: "+this.planetAge);
System.out.println("Earth Status: "+this.earthStatus);
System.out.println("Natural Satellite: "+this.naturalSatellite);

}

}