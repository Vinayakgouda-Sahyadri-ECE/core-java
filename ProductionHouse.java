class ProductionHouse{

int houseId;
String houseName;
String ownerName;
String foundedYear;
String headquarters;
String country;
int totalEmployees;
int totalMoviesProduced;
String famousMovie;
String industryType;
boolean internationalProjects;
String distributionPartner;
String studioLocation;
String mainDirector;
String mainProducer;
String productionCategory;
String equipmentUsed;
String editingStudio;
String companyStatus;
String companyRating;

Movie movie;

ProductionHouse(int houseId,String houseName,String ownerName,String foundedYear,
String headquarters,String country,int totalEmployees,int totalMoviesProduced,
String famousMovie,String industryType,boolean internationalProjects,
String distributionPartner,String studioLocation,String mainDirector,
String mainProducer,String productionCategory,String equipmentUsed,
String editingStudio,String companyStatus,String companyRating){

this.houseId=houseId;
this.houseName=houseName;
this.ownerName=ownerName;
this.foundedYear=foundedYear;
this.headquarters=headquarters;
this.country=country;
this.totalEmployees=totalEmployees;
this.totalMoviesProduced=totalMoviesProduced;
this.famousMovie=famousMovie;
this.industryType=industryType;
this.internationalProjects=internationalProjects;
this.distributionPartner=distributionPartner;
this.studioLocation=studioLocation;
this.mainDirector=mainDirector;
this.mainProducer=mainProducer;
this.productionCategory=productionCategory;
this.equipmentUsed=equipmentUsed;
this.editingStudio=editingStudio;
this.companyStatus=companyStatus;
this.companyRating=companyRating;

}

public void getProductionHouseDetails(){

System.out.println("Production House ID: "+this.houseId);
System.out.println("House Name: "+this.houseName);
System.out.println("Owner Name: "+this.ownerName);
System.out.println("Founded Year: "+this.foundedYear);
System.out.println("Headquarters: "+this.headquarters);
System.out.println("Country: "+this.country);
System.out.println("Total Employees: "+this.totalEmployees);
System.out.println("Total Movies Produced: "+this.totalMoviesProduced);
System.out.println("Famous Movie: "+this.famousMovie);
System.out.println("Industry Type: "+this.industryType);
System.out.println("International Projects: "+this.internationalProjects);
System.out.println("Distribution Partner: "+this.distributionPartner);
System.out.println("Studio Location: "+this.studioLocation);
System.out.println("Main Director: "+this.mainDirector);
System.out.println("Main Producer: "+this.mainProducer);
System.out.println("Production Category: "+this.productionCategory);
System.out.println("Equipment Used: "+this.equipmentUsed);
System.out.println("Editing Studio: "+this.editingStudio);
System.out.println("Company Status: "+this.companyStatus);
System.out.println("Company Rating: "+this.companyRating);

this.movie.getMovieDetails();

}

}