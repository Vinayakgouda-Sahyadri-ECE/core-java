class Ipl{

int teamId;
String teamName;
String captain;
String homeGround;
String city;
String state;
int totalPlayers;
int totalMatches;
String coachName;
String ownerName;
String jerseyColor;
String sponsor;
boolean trophyWinner;
int championships;
String foundedYear;
String teamCategory;
String practiceGround;
String trainingCoach;
String teamStatus;
String fanBase;

Player player;

Ipl(int teamId,String teamName,String captain,String homeGround,String city,String state,
int totalPlayers,int totalMatches,String coachName,String ownerName,String jerseyColor,
String sponsor,boolean trophyWinner,int championships,String foundedYear,
String teamCategory,String practiceGround,String trainingCoach,String teamStatus,String fanBase){

this.teamId=teamId;
this.teamName=teamName;
this.captain=captain;
this.homeGround=homeGround;
this.city=city;
this.state=state;
this.totalPlayers=totalPlayers;
this.totalMatches=totalMatches;
this.coachName=coachName;
this.ownerName=ownerName;
this.jerseyColor=jerseyColor;
this.sponsor=sponsor;
this.trophyWinner=trophyWinner;
this.championships=championships;
this.foundedYear=foundedYear;
this.teamCategory=teamCategory;
this.practiceGround=practiceGround;
this.trainingCoach=trainingCoach;
this.teamStatus=teamStatus;
this.fanBase=fanBase;

}

public void getTeamDetails(){

System.out.println("Team ID: "+this.teamId);
System.out.println("Team Name: "+this.teamName);
System.out.println("Captain: "+this.captain);
System.out.println("Home Ground: "+this.homeGround);
System.out.println("City: "+this.city);
System.out.println("State: "+this.state);
System.out.println("Total Players: "+this.totalPlayers);
System.out.println("Total Matches: "+this.totalMatches);
System.out.println("Coach Name: "+this.coachName);
System.out.println("Owner Name: "+this.ownerName);
System.out.println("Jersey Color: "+this.jerseyColor);
System.out.println("Sponsor: "+this.sponsor);
System.out.println("Trophy Winner: "+this.trophyWinner);
System.out.println("Championships: "+this.championships);
System.out.println("Founded Year: "+this.foundedYear);
System.out.println("Team Category: "+this.teamCategory);
System.out.println("Practice Ground: "+this.practiceGround);
System.out.println("Training Coach: "+this.trainingCoach);
System.out.println("Team Status: "+this.teamStatus);
System.out.println("Fan Base: "+this.fanBase);

this.player.getPlayerDetails();

}

}