class Rhythms{

int rhythmId;
String rhythmName;
String musicType;
String originCountry;
String popularRegion;
String tempo;
String beatPattern;
String rhythmCategory;
String danceAssociation;
String festivalUsage;
boolean livePerformance;
int popularityRank;
String culturalImportance;
String rhythmMood;
String rhythmLanguage;
String composerName;
String traditionalUse;
String rhythmEra;
String rhythmStatus;
String rhythmStyle;

MusicInstrument instrument;

Rhythms(int rhythmId,String rhythmName,String musicType,String originCountry,
String popularRegion,String tempo,String beatPattern,String rhythmCategory,
String danceAssociation,String festivalUsage,boolean livePerformance,
int popularityRank,String culturalImportance,String rhythmMood,
String rhythmLanguage,String composerName,String traditionalUse,
String rhythmEra,String rhythmStatus,String rhythmStyle){

this.rhythmId=rhythmId;
this.rhythmName=rhythmName;
this.musicType=musicType;
this.originCountry=originCountry;
this.popularRegion=popularRegion;
this.tempo=tempo;
this.beatPattern=beatPattern;
this.rhythmCategory=rhythmCategory;
this.danceAssociation=danceAssociation;
this.festivalUsage=festivalUsage;
this.livePerformance=livePerformance;
this.popularityRank=popularityRank;
this.culturalImportance=culturalImportance;
this.rhythmMood=rhythmMood;
this.rhythmLanguage=rhythmLanguage;
this.composerName=composerName;
this.traditionalUse=traditionalUse;
this.rhythmEra=rhythmEra;
this.rhythmStatus=rhythmStatus;
this.rhythmStyle=rhythmStyle;

}

public void getRhythmDetails(){

System.out.println("Rhythm ID: "+this.rhythmId);
System.out.println("Rhythm Name: "+this.rhythmName);
System.out.println("Music Type: "+this.musicType);
System.out.println("Origin Country: "+this.originCountry);
System.out.println("Popular Region: "+this.popularRegion);
System.out.println("Tempo: "+this.tempo);
System.out.println("Beat Pattern: "+this.beatPattern);
System.out.println("Rhythm Category: "+this.rhythmCategory);
System.out.println("Dance Association: "+this.danceAssociation);
System.out.println("Festival Usage: "+this.festivalUsage);
System.out.println("Live Performance: "+this.livePerformance);
System.out.println("Popularity Rank: "+this.popularityRank);
System.out.println("Cultural Importance: "+this.culturalImportance);
System.out.println("Rhythm Mood: "+this.rhythmMood);
System.out.println("Rhythm Language: "+this.rhythmLanguage);
System.out.println("Composer Name: "+this.composerName);
System.out.println("Traditional Use: "+this.traditionalUse);
System.out.println("Rhythm Era: "+this.rhythmEra);
System.out.println("Rhythm Status: "+this.rhythmStatus);
System.out.println("Rhythm Style: "+this.rhythmStyle);

this.instrument.getInstrumentDetails();

}

}