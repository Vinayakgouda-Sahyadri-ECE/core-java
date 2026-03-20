class ComedyShow {
    String showName;
    String performerName;
    double durationMinutes;
    String language;
    String venue;

    int seatingCapacity;
    double ticketPrice;
    String genre;
    boolean isAdultOnly;
    int jokesCount;

    String showDate;
    String startTime;
    int ratingStars;
    String productionHouse;
    boolean isSoldOut;

    double totalRevenue;
    String currency;
    long showID;
    String city;
    int crewSize;

    ComedyShow() {
        this(999.0, "Rupees", 90.0);
        System.out.println("End");
    }

    ComedyShow(int seatingCapacity, double ticketPrice, String showName) {
        this(5);
        System.out.println("The variables are:" + seatingCapacity + "," + ticketPrice + "," + showName);
        this.seatingCapacity = seatingCapacity;
        this.ticketPrice = ticketPrice;
        this.showName = showName;
    }

    ComedyShow(int ratingStars) {
        this(ratingStars, "Standup");
        System.out.println("The variable is :" + ratingStars);
        this.ratingStars = ratingStars;
    }

    ComedyShow(double totalRevenue, String currency, double durationMinutes) {
        this(200, 500.0, "Midnight Laughs");
        System.out.println("The variables are:" + totalRevenue + "," + currency + "," + durationMinutes);
        this.totalRevenue = totalRevenue;
        this.currency = currency;
        this.durationMinutes = durationMinutes;
    }

    ComedyShow(int ratingStars, String genre) {
        System.out.println("The variables are:" + ratingStars + "," + genre);
        this.ratingStars = ratingStars;
        this.genre = genre;
    }
}