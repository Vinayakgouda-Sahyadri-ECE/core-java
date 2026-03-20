class PlasticPlate {
    double diameter;
    String shape;
    String color;
    double weight;
    String plasticGrade;

    boolean isReusable;
    boolean isBpaFree;
    int packQuantity;
    double maxTemperature;
    String finish;

    String batchNo;
    String mfgDate;
    int shelfLifeYears;
    String manufacturerName;
    boolean isDisposable;

    double price;
    String currency;
    long productID;
    String usageType;
    int recycledPercent;

    PlasticPlate() {
        this(120.0, "Rupees", 10.5);
        System.out.println("End");
    }

    PlasticPlate(int packQuantity, double maxTemperature, String batchNo) {
        this(10);
        System.out.println("The variables are:" + packQuantity + "," + maxTemperature + "," + batchNo);
        this.packQuantity = packQuantity;
        this.maxTemperature = maxTemperature;
        this.batchNo = batchNo;
    }

    PlasticPlate(int shelfLifeYears) {
        this(shelfLifeYears, "Round");
        System.out.println("The variable is :" + shelfLifeYears);
        this.shelfLifeYears = shelfLifeYears;
    }

    PlasticPlate(double price, String currency, double diameter) {
        this(25, 80.0, "PL-88");
        System.out.println("The variables are:" + price + "," + currency + "," + diameter);
        this.price = price;
        this.currency = currency;
        this.diameter = diameter;
    }

    PlasticPlate(int shelfLifeYears, String color) {
        System.out.println("The variables are:" + shelfLifeYears + "," + color);
        this.shelfLifeYears = shelfLifeYears;
        this.color = color;
    }
}