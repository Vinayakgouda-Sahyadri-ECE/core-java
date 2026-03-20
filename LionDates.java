class LionDates {
    double netWeight;
    String containerType;
    String dateType;
    double calories;
    String origin;

    double ironContent;
    double potassiumContent;
    double fiber;
    boolean isOrganic;
    String fruitQuality;

    String batchNumber;
    String manufactureDate;
    int expiryDate;
    String factoryLocation;
    boolean isSealIntact;

    double price;
    String currency;
    long barCode;
    String targetedConsumer;
    int shelfLifeMonths;

    LionDates() {
        this(250.0, "Rupees", 500.0);
        System.out.println("End");
    }

    LionDates(double ironContent, double potassiumContent, String batchNumber) {
        this(18);
        System.out.println("The variables are:" + ironContent + "," + potassiumContent + "," + batchNumber);
        this.ironContent = ironContent;
        this.potassiumContent = potassiumContent;
        this.batchNumber = batchNumber;
    }

    LionDates(int shelfLifeMonths) {
        this(shelfLifeMonths, "Dark Brown");
        System.out.println("The variable is :" + shelfLifeMonths);
        this.shelfLifeMonths = shelfLifeMonths;
    }

    LionDates(double price, String currency, double netWeight) {
        this(3.5, 650.0, "LD2026");
        System.out.println("The variables are:" + price + "," + currency + "," + netWeight);
        this.price = price;
        this.currency = currency;
        this.netWeight = netWeight;
    }

    LionDates(int shelfLifeMonths, String dateType) {
        System.out.println("The variables are:" + shelfLifeMonths + "," + dateType);
        this.shelfLifeMonths = shelfLifeMonths;
        this.dateType = dateType;
    }
}