class Company{

int companyId;
String companyName;
String headquarters;
String city;
String country;
int totalEmployees;
int totalDepartments;
String ceoName;
String foundedYear;
String industryType;
boolean globalPresence;
int annualRevenue;
String companyCategory;
String mainProduct;
String researchCenter;
String hrHead;
String financeHead;
String companyStatus;
String stockMarket;
String companyRating;

Project project;

Company(int companyId,String companyName,String headquarters,String city,String country,
int totalEmployees,int totalDepartments,String ceoName,String foundedYear,String industryType,
boolean globalPresence,int annualRevenue,String companyCategory,String mainProduct,
String researchCenter,String hrHead,String financeHead,String companyStatus,
String stockMarket,String companyRating){

this.companyId=companyId;
this.companyName=companyName;
this.headquarters=headquarters;
this.city=city;
this.country=country;
this.totalEmployees=totalEmployees;
this.totalDepartments=totalDepartments;
this.ceoName=ceoName;
this.foundedYear=foundedYear;
this.industryType=industryType;
this.globalPresence=globalPresence;
this.annualRevenue=annualRevenue;
this.companyCategory=companyCategory;
this.mainProduct=mainProduct;
this.researchCenter=researchCenter;
this.hrHead=hrHead;
this.financeHead=financeHead;
this.companyStatus=companyStatus;
this.stockMarket=stockMarket;
this.companyRating=companyRating;

}

public void getCompanyDetails(){

System.out.println("Company ID: "+this.companyId);
System.out.println("Company Name: "+this.companyName);
System.out.println("Headquarters: "+this.headquarters);
System.out.println("City: "+this.city);
System.out.println("Country: "+this.country);
System.out.println("Total Employees: "+this.totalEmployees);
System.out.println("Total Departments: "+this.totalDepartments);
System.out.println("CEO Name: "+this.ceoName);
System.out.println("Founded Year: "+this.foundedYear);
System.out.println("Industry Type: "+this.industryType);
System.out.println("Global Presence: "+this.globalPresence);
System.out.println("Annual Revenue: "+this.annualRevenue);
System.out.println("Company Category: "+this.companyCategory);
System.out.println("Main Product: "+this.mainProduct);
System.out.println("Research Center: "+this.researchCenter);
System.out.println("HR Head: "+this.hrHead);
System.out.println("Finance Head: "+this.financeHead);
System.out.println("Company Status: "+this.companyStatus);
System.out.println("Stock Market: "+this.stockMarket);
System.out.println("Company Rating: "+this.companyRating);

this.project.getProjectDetails();

}

}