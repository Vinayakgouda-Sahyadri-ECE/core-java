class PeriodicTable{

int tableId;
String tableName;
int totalElements;
int totalGroups;
int totalPeriods;
String discoveredBy;
String discoveryYear;
String classification;
String tableType;
String mainCategory;
boolean metalsPresent;
boolean nonMetalsPresent;
boolean metalloidsPresent;
String tableLanguage;
String tableVersion;
String referenceBook;
String scientificUse;
String educationUse;
String tableStatus;
String tableRegion;

Element element;

PeriodicTable(int tableId,String tableName,int totalElements,int totalGroups,
int totalPeriods,String discoveredBy,String discoveryYear,String classification,
String tableType,String mainCategory,boolean metalsPresent,boolean nonMetalsPresent,
boolean metalloidsPresent,String tableLanguage,String tableVersion,String referenceBook,
String scientificUse,String educationUse,String tableStatus,String tableRegion){

this.tableId=tableId;
this.tableName=tableName;
this.totalElements=totalElements;
this.totalGroups=totalGroups;
this.totalPeriods=totalPeriods;
this.discoveredBy=discoveredBy;
this.discoveryYear=discoveryYear;
this.classification=classification;
this.tableType=tableType;
this.mainCategory=mainCategory;
this.metalsPresent=metalsPresent;
this.nonMetalsPresent=nonMetalsPresent;
this.metalloidsPresent=metalloidsPresent;
this.tableLanguage=tableLanguage;
this.tableVersion=tableVersion;
this.referenceBook=referenceBook;
this.scientificUse=scientificUse;
this.educationUse=educationUse;
this.tableStatus=tableStatus;
this.tableRegion=tableRegion;

}

public void getTableDetails(){

System.out.println("Table ID: "+this.tableId);
System.out.println("Table Name: "+this.tableName);
System.out.println("Total Elements: "+this.totalElements);
System.out.println("Total Groups: "+this.totalGroups);
System.out.println("Total Periods: "+this.totalPeriods);
System.out.println("Discovered By: "+this.discoveredBy);
System.out.println("Discovery Year: "+this.discoveryYear);
System.out.println("Classification: "+this.classification);
System.out.println("Table Type: "+this.tableType);
System.out.println("Main Category: "+this.mainCategory);
System.out.println("Metals Present: "+this.metalsPresent);
System.out.println("Non Metals Present: "+this.nonMetalsPresent);
System.out.println("Metalloids Present: "+this.metalloidsPresent);
System.out.println("Table Language: "+this.tableLanguage);
System.out.println("Table Version: "+this.tableVersion);
System.out.println("Reference Book: "+this.referenceBook);
System.out.println("Scientific Use: "+this.scientificUse);
System.out.println("Education Use: "+this.educationUse);
System.out.println("Table Status: "+this.tableStatus);
System.out.println("Table Region: "+this.tableRegion);

this.element.getElementDetails();

}

}