class Universe{

int universeId;
String universeName;
String discoveredBy;
String discoveryYear;
long totalGalaxies;
long totalStars;
long totalPlanets;
String universeType;
String dominantEnergy;
double ageOfUniverse;
String expansionTheory;
boolean darkMatterPresent;
boolean darkEnergyPresent;
String universeShape;
String observationMethod;
String researchAgency;
String telescopeUsed;
String cosmicBackground;
String universeStatus;
String universeRegion;

Earth earth;

Universe(int universeId,String universeName,String discoveredBy,String discoveryYear,
long totalGalaxies,long totalStars,long totalPlanets,String universeType,
String dominantEnergy,double ageOfUniverse,String expansionTheory,
boolean darkMatterPresent,boolean darkEnergyPresent,String universeShape,
String observationMethod,String researchAgency,String telescopeUsed,
String cosmicBackground,String universeStatus,String universeRegion){

this.universeId=universeId;
this.universeName=universeName;
this.discoveredBy=discoveredBy;
this.discoveryYear=discoveryYear;
this.totalGalaxies=totalGalaxies;
this.totalStars=totalStars;
this.totalPlanets=totalPlanets;
this.universeType=universeType;
this.dominantEnergy=dominantEnergy;
this.ageOfUniverse=ageOfUniverse;
this.expansionTheory=expansionTheory;
this.darkMatterPresent=darkMatterPresent;
this.darkEnergyPresent=darkEnergyPresent;
this.universeShape=universeShape;
this.observationMethod=observationMethod;
this.researchAgency=researchAgency;
this.telescopeUsed=telescopeUsed;
this.cosmicBackground=cosmicBackground;
this.universeStatus=universeStatus;
this.universeRegion=universeRegion;

}

public void getUniverseDetails(){

System.out.println("Universe ID: "+this.universeId);
System.out.println("Universe Name: "+this.universeName);
System.out.println("Discovered By: "+this.discoveredBy);
System.out.println("Discovery Year: "+this.discoveryYear);
System.out.println("Total Galaxies: "+this.totalGalaxies);
System.out.println("Total Stars: "+this.totalStars);
System.out.println("Total Planets: "+this.totalPlanets);
System.out.println("Universe Type: "+this.universeType);
System.out.println("Dominant Energy: "+this.dominantEnergy);
System.out.println("Age Of Universe: "+this.ageOfUniverse);
System.out.println("Expansion Theory: "+this.expansionTheory);
System.out.println("Dark Matter Present: "+this.darkMatterPresent);
System.out.println("Dark Energy Present: "+this.darkEnergyPresent);
System.out.println("Universe Shape: "+this.universeShape);
System.out.println("Observation Method: "+this.observationMethod);
System.out.println("Research Agency: "+this.researchAgency);
System.out.println("Telescope Used: "+this.telescopeUsed);
System.out.println("Cosmic Background: "+this.cosmicBackground);
System.out.println("Universe Status: "+this.universeStatus);
System.out.println("Universe Region: "+this.universeRegion);

this.earth.getEarthDetails();

}

}