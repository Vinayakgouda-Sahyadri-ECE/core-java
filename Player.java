class Player{

int playerId;
String playerName;
String playerRole;
String battingStyle;
String bowlingStyle;
String nationality;
int matchesPlayed;
int runsScored;
int wicketsTaken;
int jerseyNumber;
String teamName;
int age;
String height;
double strikeRate;
double economy;
boolean captain;
String playerCategory;
String fitnessLevel;
String experience;
String playerStatus;

Player(int playerId,String playerName,String playerRole,String battingStyle,
String bowlingStyle,String nationality,int matchesPlayed,int runsScored,
int wicketsTaken,int jerseyNumber,String teamName,int age,String height,
double strikeRate,double economy,boolean captain,String playerCategory,
String fitnessLevel,String experience,String playerStatus){

this.playerId=playerId;
this.playerName=playerName;
this.playerRole=playerRole;
this.battingStyle=battingStyle;
this.bowlingStyle=bowlingStyle;
this.nationality=nationality;
this.matchesPlayed=matchesPlayed;
this.runsScored=runsScored;
this.wicketsTaken=wicketsTaken;
this.jerseyNumber=jerseyNumber;
this.teamName=teamName;
this.age=age;
this.height=height;
this.strikeRate=strikeRate;
this.economy=economy;
this.captain=captain;
this.playerCategory=playerCategory;
this.fitnessLevel=fitnessLevel;
this.experience=experience;
this.playerStatus=playerStatus;

}

public void getPlayerDetails(){

System.out.println("-----------------------------------");
System.out.println("Player ID: "+this.playerId);
System.out.println("Player Name: "+this.playerName);
System.out.println("Player Role: "+this.playerRole);
System.out.println("Batting Style: "+this.battingStyle);
System.out.println("Bowling Style: "+this.bowlingStyle);
System.out.println("Nationality: "+this.nationality);
System.out.println("Matches Played: "+this.matchesPlayed);
System.out.println("Runs Scored: "+this.runsScored);
System.out.println("Wickets Taken: "+this.wicketsTaken);
System.out.println("Jersey Number: "+this.jerseyNumber);
System.out.println("Team Name: "+this.teamName);
System.out.println("Age: "+this.age);
System.out.println("Height: "+this.height);
System.out.println("Strike Rate: "+this.strikeRate);
System.out.println("Economy: "+this.economy);
System.out.println("Captain: "+this.captain);
System.out.println("Player Category: "+this.playerCategory);
System.out.println("Fitness Level: "+this.fitnessLevel);
System.out.println("Experience: "+this.experience);
System.out.println("Player Status: "+this.playerStatus);

}

}