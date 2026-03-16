class Formula1{

    int teamNumber;
    String teamName;
    String country;
    String teamPrincipal;
    String engineSupplier;
    int championshipsWon;
    int driversCount;
    String headquarters;
    int debutYear;
    String teamColor;
    String carModel;
    int raceWins;
    int polePositions;
    int fastestLaps;
    boolean hybridEngine;
    String tyreSupplier;
    String teamBudget;
    String currentSeasonStatus;
    String mainSponsor;
    String teamCategory;

    Franchise franchise;

    Formula1(int teamNumber,String teamName,String country,String teamPrincipal,
    String engineSupplier,int championshipsWon,int driversCount,String headquarters,
    int debutYear,String teamColor,String carModel,int raceWins,int polePositions,
    int fastestLaps,boolean hybridEngine,String tyreSupplier,String teamBudget,
    String currentSeasonStatus,String mainSponsor,String teamCategory){

        this.teamNumber=teamNumber;
        this.teamName=teamName;
        this.country=country;
        this.teamPrincipal=teamPrincipal;
        this.engineSupplier=engineSupplier;
        this.championshipsWon=championshipsWon;
        this.driversCount=driversCount;
        this.headquarters=headquarters;
        this.debutYear=debutYear;
        this.teamColor=teamColor;
        this.carModel=carModel;
        this.raceWins=raceWins;
        this.polePositions=polePositions;
        this.fastestLaps=fastestLaps;
        this.hybridEngine=hybridEngine;
        this.tyreSupplier=tyreSupplier;
        this.teamBudget=teamBudget;
        this.currentSeasonStatus=currentSeasonStatus;
        this.mainSponsor=mainSponsor;
        this.teamCategory=teamCategory;
    }

    public void getTeamDetails(){

        System.out.println("The team number is:" +this.teamNumber);
        System.out.println("The team name is:" +this.teamName);
        System.out.println("The country of team is:" +this.country);
        System.out.println("The team principal is:" +this.teamPrincipal);
        System.out.println("The engine supplier is:" +this.engineSupplier);
        System.out.println("Total championships won:" +this.championshipsWon);
        System.out.println("Number of drivers:" +this.driversCount);
        System.out.println("Headquarters location:" +this.headquarters);
        System.out.println("Debut year of team:" +this.debutYear);
        System.out.println("Team color:" +this.teamColor);
        System.out.println("Car model:" +this.carModel);
        System.out.println("Total race wins:" +this.raceWins);
        System.out.println("Pole positions:" +this.polePositions);
        System.out.println("Fastest laps:" +this.fastestLaps);
        System.out.println("Hybrid engine available:" +this.hybridEngine);
        System.out.println("Tyre supplier:" +this.tyreSupplier);
        System.out.println("Team budget:" +this.teamBudget);
        System.out.println("Current season status:" +this.currentSeasonStatus);
        System.out.println("Main sponsor:" +this.mainSponsor);
        System.out.println("Team category:" +this.teamCategory);

        this.franchise.getFranchiseDetails();
    }
}