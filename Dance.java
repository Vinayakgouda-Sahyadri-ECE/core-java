class Dance{

int danceId;
String danceName;
String originCountry;
String danceType;
String costumeType;
String musicType;
String performancePlace;
String danceStyle;
int numberOfPerformers;
String difficultyLevel;
String popularity;
String energyLevel;
String culturalSignificance;
String rhythmType;
String mainInstrument;
String trainingRequired;
String stageType;
String lightingStyle;
String performanceDuration;
String danceStatus;

Form form;

Dance(int danceId,String danceName,String originCountry,String danceType,
String costumeType,String musicType,String performancePlace,String danceStyle,
int numberOfPerformers,String difficultyLevel,String popularity,String energyLevel,
String culturalSignificance,String rhythmType,String mainInstrument,
String trainingRequired,String stageType,String lightingStyle,
String performanceDuration,String danceStatus){

this.danceId=danceId;
this.danceName=danceName;
this.originCountry=originCountry;
this.danceType=danceType;
this.costumeType=costumeType;
this.musicType=musicType;
this.performancePlace=performancePlace;
this.danceStyle=danceStyle;
this.numberOfPerformers=numberOfPerformers;
this.difficultyLevel=difficultyLevel;
this.popularity=popularity;
this.energyLevel=energyLevel;
this.culturalSignificance=culturalSignificance;
this.rhythmType=rhythmType;
this.mainInstrument=mainInstrument;
this.trainingRequired=trainingRequired;
this.stageType=stageType;
this.lightingStyle=lightingStyle;
this.performanceDuration=performanceDuration;
this.danceStatus=danceStatus;

}

public void getDanceDetails(){

System.out.println("Dance ID: "+this.danceId);
System.out.println("Dance Name: "+this.danceName);
System.out.println("Origin Country: "+this.originCountry);
System.out.println("Dance Type: "+this.danceType);
System.out.println("Costume Type: "+this.costumeType);
System.out.println("Music Type: "+this.musicType);
System.out.println("Performance Place: "+this.performancePlace);
System.out.println("Dance Style: "+this.danceStyle);
System.out.println("Number Of Performers: "+this.numberOfPerformers);
System.out.println("Difficulty Level: "+this.difficultyLevel);
System.out.println("Popularity: "+this.popularity);
System.out.println("Energy Level: "+this.energyLevel);
System.out.println("Cultural Significance: "+this.culturalSignificance);
System.out.println("Rhythm Type: "+this.rhythmType);
System.out.println("Main Instrument: "+this.mainInstrument);
System.out.println("Training Required: "+this.trainingRequired);
System.out.println("Stage Type: "+this.stageType);
System.out.println("Lighting Style: "+this.lightingStyle);
System.out.println("Performance Duration: "+this.performanceDuration);
System.out.println("Dance Status: "+this.danceStatus);

this.form.getFormDetails();

}

}