class ProgrammingLanguage{

int languageId;
String languageName;
String developer;
String firstReleaseYear;
String paradigm;
String typingDiscipline;
String executionType;
boolean objectOriented;
boolean platformIndependent;
String compilerName;
String officialWebsite;
String latestVersion;
String primaryUse;
String supportedPlatforms;
String popularFramework;
String packageManager;
String documentationType;
String communitySupport;
String languageStatus;
String languageRating;

Syntax syntax;

ProgrammingLanguage(int languageId,String languageName,String developer,String firstReleaseYear,
String paradigm,String typingDiscipline,String executionType,boolean objectOriented,
boolean platformIndependent,String compilerName,String officialWebsite,
String latestVersion,String primaryUse,String supportedPlatforms,String popularFramework,
String packageManager,String documentationType,String communitySupport,
String languageStatus,String languageRating){

this.languageId=languageId;
this.languageName=languageName;
this.developer=developer;
this.firstReleaseYear=firstReleaseYear;
this.paradigm=paradigm;
this.typingDiscipline=typingDiscipline;
this.executionType=executionType;
this.objectOriented=objectOriented;
this.platformIndependent=platformIndependent;
this.compilerName=compilerName;
this.officialWebsite=officialWebsite;
this.latestVersion=latestVersion;
this.primaryUse=primaryUse;
this.supportedPlatforms=supportedPlatforms;
this.popularFramework=popularFramework;
this.packageManager=packageManager;
this.documentationType=documentationType;
this.communitySupport=communitySupport;
this.languageStatus=languageStatus;
this.languageRating=languageRating;

}

public void getProgrammingLanguageDetails(){

System.out.println("Language ID: "+this.languageId);
System.out.println("Language Name: "+this.languageName);
System.out.println("Developer: "+this.developer);
System.out.println("First Release Year: "+this.firstReleaseYear);
System.out.println("Paradigm: "+this.paradigm);
System.out.println("Typing Discipline: "+this.typingDiscipline);
System.out.println("Execution Type: "+this.executionType);
System.out.println("Object Oriented: "+this.objectOriented);
System.out.println("Platform Independent: "+this.platformIndependent);
System.out.println("Compiler Name: "+this.compilerName);
System.out.println("Official Website: "+this.officialWebsite);
System.out.println("Latest Version: "+this.latestVersion);
System.out.println("Primary Use: "+this.primaryUse);
System.out.println("Supported Platforms: "+this.supportedPlatforms);
System.out.println("Popular Framework: "+this.popularFramework);
System.out.println("Package Manager: "+this.packageManager);
System.out.println("Documentation Type: "+this.documentationType);
System.out.println("Community Support: "+this.communitySupport);
System.out.println("Language Status: "+this.languageStatus);
System.out.println("Language Rating: "+this.languageRating);

this.syntax.getSyntaxDetails();

}

}