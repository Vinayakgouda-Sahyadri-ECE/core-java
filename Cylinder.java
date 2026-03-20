class Cylinder {
    double height;
    double radius;
    String gasType;
    double capacityKg;
    double emptyWeight;

    double pressureRating;
    String valveType;
    double totalWeight;
    boolean isFull;
    String colorCode;

    String cylinderID;
    String lastTestDate;
    int nextTestYear;
    String provider;
    boolean isLeakTested;

    double depositAmount;
    String currency;
    long serialNumber;
    String usageType;
    int storageLifeYears;

    Cylinder() {
        this(1200.0, "Rupees", 14.2);
        System.out.println("End");
    }

    Cylinder(double capacityKg, double pressureRating, String cylinderID) {
        this(10);
        System.out.println("The variables are:" + capacityKg + "," + pressureRating + "," + cylinderID);
        this.capacityKg = capacityKg;
        this.pressureRating = pressureRating;
        this.cylinderID = cylinderID;
    }

    Cylinder(int storageLifeYears) {
        this(storageLifeYears, "Red");
        System.out.println("The variable is :" + storageLifeYears);
        this.storageLifeYears = storageLifeYears;
    }

    Cylinder(double depositAmount, String currency, double capacityKg) {
        this(14.2, 1.6, "GAS-IND-01");
        System.out.println("The variables are:" + depositAmount + "," + currency + "," + capacityKg);
        this.depositAmount = depositAmount;
        this.currency = currency;
        this.capacityKg = capacityKg;
    }

    Cylinder(int storageLifeYears, String gasType) {
        System.out.println("The variables are:" + storageLifeYears + "," + gasType);
        this.storageLifeYears = storageLifeYears;
        this.gasType = gasType;
    }
}