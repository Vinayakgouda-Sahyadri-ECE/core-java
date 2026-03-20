class MedicalShop {
    String shopName;
    String licenseNumber;
    String location;
    int employeeCount;
    String gstNumber;

    boolean providesHomeDelivery;
    boolean isOpen24x7;
    int stockCategoriesCount;
    boolean hasColdStorage;
    String pharmacistName;

    String registrationDate;
    String lastAuditDate;
    int yearsInService;
    String ownerName;
    boolean isActive;

    double dailyRevenue;
    String currency;
    long shopID;
    String contactNumber;
    int customerDailyAvg;

    MedicalShop() {
        this(50000.0, "Rupees", 15.0);
        System.out.println("End");
    }

    MedicalShop(int stockCategoriesCount, int employeeCount, String shopName) {
        this(20);
        System.out.println("The variables are:" + stockCategoriesCount + "," + employeeCount + "," + shopName);
        this.stockCategoriesCount = stockCategoriesCount;
        this.employeeCount = employeeCount;
        this.shopName = shopName;
    }

    MedicalShop(int yearsInService) {
        this(yearsInService, "Bengaluru");
        System.out.println("The variable is :" + yearsInService);
        this.yearsInService = yearsInService;
    }

    MedicalShop(double dailyRevenue, String currency, double yearsInService) {
        this(1200, 5, "Care Pharma");
        System.out.println("The variables are:" + dailyRevenue + "," + currency + "," + yearsInService);
        this.dailyRevenue = dailyRevenue;
        this.currency = currency;
        this.yearsInService = (int)yearsInService;
    }

    MedicalShop(int yearsInService, String location) {
        System.out.println("The variables are:" + yearsInService + "," + location);
        this.yearsInService = yearsInService;
        this.location = location;
    }
}