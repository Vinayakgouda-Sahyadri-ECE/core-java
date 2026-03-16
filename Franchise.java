class Franchise{

    int franchiseId;
    String ownerName;
    String companyName;
    int establishedYear;
    String country;
    String franchiseValue;
    int totalEmployees;
    String technicalDirector;
    String baseLocation;
    String mainFactory;
    String windTunnelFacility;
    boolean juniorTeamAvailable;
    String marketingHead;
    String financialStatus;
    String technologyPartner;
    String fuelPartner;
    String trainingAcademy;
    int numberOfSponsors;
    String brandValue;
    String franchiseStatus;

    Franchise(int franchiseId,
    String ownerName,
    String companyName,
    int establishedYear,
    String country,
    String franchiseValue,
    int totalEmployees,
    String technicalDirector,
    String baseLocation,
    String mainFactory,
    String windTunnelFacility,
    boolean juniorTeamAvailable,
    String marketingHead,
    String financialStatus,
    String technologyPartner,
    String fuelPartner,
    String trainingAcademy,
    int numberOfSponsors,
    String brandValue,
    String franchiseStatus){

        this.franchiseId = franchiseId;
        this.ownerName = ownerName;
        this.companyName = companyName;
        this.establishedYear = establishedYear;
        this.country = country;
        this.franchiseValue = franchiseValue;
        this.totalEmployees = totalEmployees;
        this.technicalDirector = technicalDirector;
        this.baseLocation = baseLocation;
        this.mainFactory = mainFactory;
        this.windTunnelFacility = windTunnelFacility;
        this.juniorTeamAvailable = juniorTeamAvailable;
        this.marketingHead = marketingHead;
        this.financialStatus = financialStatus;
        this.technologyPartner = technologyPartner;
        this.fuelPartner = fuelPartner;
        this.trainingAcademy = trainingAcademy;
        this.numberOfSponsors = numberOfSponsors;
        this.brandValue = brandValue;
        this.franchiseStatus = franchiseStatus;
    }

    public void getFranchiseDetails(){

        System.out.println("---------------------------------------");
        System.out.println("Franchise ID: " + this.franchiseId);
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Company Name: " + this.companyName);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Country: " + this.country);
        System.out.println("Franchise Value: " + this.franchiseValue);
        System.out.println("Total Employees: " + this.totalEmployees);
        System.out.println("Technical Director: " + this.technicalDirector);
        System.out.println("Base Location: " + this.baseLocation);
        System.out.println("Main Factory: " + this.mainFactory);
        System.out.println("Wind Tunnel Facility: " + this.windTunnelFacility);
        System.out.println("Junior Team Available: " + this.juniorTeamAvailable);
        System.out.println("Marketing Head: " + this.marketingHead);
        System.out.println("Financial Status: " + this.financialStatus);
        System.out.println("Technology Partner: " + this.technologyPartner);
        System.out.println("Fuel Partner: " + this.fuelPartner);
        System.out.println("Training Academy: " + this.trainingAcademy);
        System.out.println("Number of Sponsors: " + this.numberOfSponsors);
        System.out.println("Brand Value: " + this.brandValue);
        System.out.println("Franchise Status: " + this.franchiseStatus);
    }
}