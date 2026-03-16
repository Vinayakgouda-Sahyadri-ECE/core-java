class PVR {

    String theatreName;
    String location;
    String city;
    String screenType;
    int totalScreens;
    int totalSeats;
    double ticketPrice;
    boolean imaxAvailable;
    boolean foodCourt;
    String soundSystem;
    String projectionType;
    String ownerCompany;
    int openingYear;
    double rating;
    String website;
    String contactNumber;
    boolean parkingAvailable;
    String country;
    String seatingType;
    String supplier;

    PVR(String theatreName,String location,String city,String screenType,int totalScreens,
        int totalSeats,double ticketPrice,boolean imaxAvailable,boolean foodCourt,
        String soundSystem,String projectionType,String ownerCompany,int openingYear,
        double rating,String website,String contactNumber,boolean parkingAvailable,
        String country,String seatingType,String supplier){

        this.theatreName = theatreName;
        this.location = location;
        this.city = city;
        this.screenType = screenType;
        this.totalScreens = totalScreens;
        this.totalSeats = totalSeats;
        this.ticketPrice = ticketPrice;
        this.imaxAvailable = imaxAvailable;
        this.foodCourt = foodCourt;
        this.soundSystem = soundSystem;
        this.projectionType = projectionType;
        this.ownerCompany = ownerCompany;
        this.openingYear = openingYear;
        this.rating = rating;
        this.website = website;
        this.contactNumber = contactNumber;
        this.parkingAvailable = parkingAvailable;
        this.country = country;
        this.seatingType = seatingType;
        this.supplier = supplier;
    }

    void display(){

        System.out.println(theatreName);
        System.out.println(location);
        System.out.println(city);
        System.out.println(screenType);
        System.out.println(totalScreens);
        System.out.println(totalSeats);
        System.out.println(ticketPrice);
        System.out.println(imaxAvailable);
        System.out.println(foodCourt);
        System.out.println(soundSystem);
        System.out.println(projectionType);
        System.out.println(ownerCompany);
        System.out.println(openingYear);
        System.out.println(rating);
        System.out.println(website);
        System.out.println(contactNumber);
        System.out.println(parkingAvailable);
        System.out.println(country);
        System.out.println(seatingType);
        System.out.println(supplier);
    }
}