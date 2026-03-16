class Form{

int formId;
String formName;
String state;
String category;
int originYear;
String famousRegion;
String mainMovements;
String musicStyle;
String costumeStyle;
boolean facialExpression;
int stepsCount;
String movementType;
String graceLevel;
String storyElement;
String performanceStage;
String performerType;
String historicalValue;
String fameLevel;
String country;
String formStatus;

Form(int formId,String formName,String state,String category,int originYear,
String famousRegion,String mainMovements,String musicStyle,String costumeStyle,
boolean facialExpression,int stepsCount,String movementType,String graceLevel,
String storyElement,String performanceStage,String performerType,
String historicalValue,String fameLevel,String country,String formStatus){

this.formId=formId;
this.formName=formName;
this.state=state;
this.category=category;
this.originYear=originYear;
this.famousRegion=famousRegion;
this.mainMovements=mainMovements;
this.musicStyle=musicStyle;
this.costumeStyle=costumeStyle;
this.facialExpression=facialExpression;
this.stepsCount=stepsCount;
this.movementType=movementType;
this.graceLevel=graceLevel;
this.storyElement=storyElement;
this.performanceStage=performanceStage;
this.performerType=performerType;
this.historicalValue=historicalValue;
this.fameLevel=fameLevel;
this.country=country;
this.formStatus=formStatus;

}

public void getFormDetails(){

System.out.println("------------------------------------");
System.out.println("Form ID: "+this.formId);
System.out.println("Form Name: "+this.formName);
System.out.println("State: "+this.state);
System.out.println("Category: "+this.category);
System.out.println("Origin Year: "+this.originYear);
System.out.println("Famous Region: "+this.famousRegion);
System.out.println("Main Movements: "+this.mainMovements);
System.out.println("Music Style: "+this.musicStyle);
System.out.println("Costume Style: "+this.costumeStyle);
System.out.println("Facial Expression: "+this.facialExpression);
System.out.println("Steps Count: "+this.stepsCount);
System.out.println("Movement Type: "+this.movementType);
System.out.println("Grace Level: "+this.graceLevel);
System.out.println("Story Element: "+this.storyElement);
System.out.println("Performance Stage: "+this.performanceStage);
System.out.println("Performer Type: "+this.performerType);
System.out.println("Historical Value: "+this.historicalValue);
System.out.println("Fame Level: "+this.fameLevel);
System.out.println("Country: "+this.country);
System.out.println("Form Status: "+this.formStatus);

}

}