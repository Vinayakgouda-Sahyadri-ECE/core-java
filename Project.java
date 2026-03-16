class Project{

int projectId;
String projectName;
String projectType;
String clientName;
String startDate;
String endDate;
int teamSize;
double projectBudget;
String projectManager;
String projectTechnology;
String projectDomain;
String developmentMethod;
String testingMethod;
String deploymentType;
String programmingLanguage;
String databaseUsed;
String projectLocation;
String projectStatus;
String projectPriority;
String projectOutcome;

Project(int projectId,String projectName,String projectType,String clientName,
String startDate,String endDate,int teamSize,double projectBudget,String projectManager,
String projectTechnology,String projectDomain,String developmentMethod,
String testingMethod,String deploymentType,String programmingLanguage,
String databaseUsed,String projectLocation,String projectStatus,
String projectPriority,String projectOutcome){

this.projectId=projectId;
this.projectName=projectName;
this.projectType=projectType;
this.clientName=clientName;
this.startDate=startDate;
this.endDate=endDate;
this.teamSize=teamSize;
this.projectBudget=projectBudget;
this.projectManager=projectManager;
this.projectTechnology=projectTechnology;
this.projectDomain=projectDomain;
this.developmentMethod=developmentMethod;
this.testingMethod=testingMethod;
this.deploymentType=deploymentType;
this.programmingLanguage=programmingLanguage;
this.databaseUsed=databaseUsed;
this.projectLocation=projectLocation;
this.projectStatus=projectStatus;
this.projectPriority=projectPriority;
this.projectOutcome=projectOutcome;

}

public void getProjectDetails(){

System.out.println("----------------------------------");
System.out.println("Project ID: "+this.projectId);
System.out.println("Project Name: "+this.projectName);
System.out.println("Project Type: "+this.projectType);
System.out.println("Client Name: "+this.clientName);
System.out.println("Start Date: "+this.startDate);
System.out.println("End Date: "+this.endDate);
System.out.println("Team Size: "+this.teamSize);
System.out.println("Project Budget: "+this.projectBudget);
System.out.println("Project Manager: "+this.projectManager);
System.out.println("Project Technology: "+this.projectTechnology);
System.out.println("Project Domain: "+this.projectDomain);
System.out.println("Development Method: "+this.developmentMethod);
System.out.println("Testing Method: "+this.testingMethod);
System.out.println("Deployment Type: "+this.deploymentType);
System.out.println("Programming Language: "+this.programmingLanguage);
System.out.println("Database Used: "+this.databaseUsed);
System.out.println("Project Location: "+this.projectLocation);
System.out.println("Project Status: "+this.projectStatus);
System.out.println("Project Priority: "+this.projectPriority);
System.out.println("Project Outcome: "+this.projectOutcome);

}

}