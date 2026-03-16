class Government{

int governmentId;
String governmentName;
String country;
String state;
String leaderName;
String governingParty;
String electionYear;
String headquarters;
int totalMinisters;
String governmentType;
boolean democraticSystem;
boolean digitalGovernance;
String mainDepartment;
String citizenServices;
String officialWebsite;
String taxSystem;
String welfarePrograms;
String lawAuthority;
String governmentStatus;
String governmentRating;

Policy policy;

Government(int governmentId,String governmentName,String country,String state,
String leaderName,String governingParty,String electionYear,String headquarters,
int totalMinisters,String governmentType,boolean democraticSystem,boolean digitalGovernance,
String mainDepartment,String citizenServices,String officialWebsite,String taxSystem,
String welfarePrograms,String lawAuthority,String governmentStatus,String governmentRating){

this.governmentId=governmentId;
this.governmentName=governmentName;
this.country=country;
this.state=state;
this.leaderName=leaderName;
this.governingParty=governingParty;
this.electionYear=electionYear;
this.headquarters=headquarters;
this.totalMinisters=totalMinisters;
this.governmentType=governmentType;
this.democraticSystem=democraticSystem;
this.digitalGovernance=digitalGovernance;
this.mainDepartment=mainDepartment;
this.citizenServices=citizenServices;
this.officialWebsite=officialWebsite;
this.taxSystem=taxSystem;
this.welfarePrograms=welfarePrograms;
this.lawAuthority=lawAuthority;
this.governmentStatus=governmentStatus;
this.governmentRating=governmentRating;

}

public void getGovernmentDetails(){

System.out.println("Government ID: "+this.governmentId);
System.out.println("Government Name: "+this.governmentName);
System.out.println("Country: "+this.country);
System.out.println("State: "+this.state);
System.out.println("Leader Name: "+this.leaderName);
System.out.println("Governing Party: "+this.governingParty);
System.out.println("Election Year: "+this.electionYear);
System.out.println("Headquarters: "+this.headquarters);
System.out.println("Total Ministers: "+this.totalMinisters);
System.out.println("Government Type: "+this.governmentType);
System.out.println("Democratic System: "+this.democraticSystem);
System.out.println("Digital Governance: "+this.digitalGovernance);
System.out.println("Main Department: "+this.mainDepartment);
System.out.println("Citizen Services: "+this.citizenServices);
System.out.println("Official Website: "+this.officialWebsite);
System.out.println("Tax System: "+this.taxSystem);
System.out.println("Welfare Programs: "+this.welfarePrograms);
System.out.println("Law Authority: "+this.lawAuthority);
System.out.println("Government Status: "+this.governmentStatus);
System.out.println("Government Rating: "+this.governmentRating);

this.policy.getPolicyDetails();

}

}