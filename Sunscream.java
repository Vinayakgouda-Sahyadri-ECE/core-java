class Sunscream {
    double netVolume;
    int spfRating;
    String formulaType;
    double paRating;
    String tintColor;

    double zincOxidePercent;
    double titaniumDioxidePercent;
    boolean isWaterResistant;
    boolean isFragranceFree;
    String finishType;

    String batchCode;
    String manufactureDate;
    int expiryDate;
    String brand;
    boolean isCrueltyFree;

    double price;
    String currency;
    long barcode;
    String skinConcern;
    int reappliationInterval;

    Sunscream() {
        this(499.0, "Rupees", 50.0);
        System.out.println("End");
    }

    Sunscream(int spfRating, double paRating, String batchCode) {
        this(24);
        System.out.println("The variables are:" + spfRating + "," + paRating + "," + batchCode);
        this.spfRating = spfRating;
        this.paRating = paRating;
        this.batchCode = batchCode;
    }

    Sunscream(int expiryDate) {
        this(expiryDate, "Creamy White");
        System.out.println("The variable is :" + expiryDate);
        this.expiryDate = expiryDate;
    }

    Sunscream(double price, String currency, double netVolume) {
        this(50, 4.0, "SUN-BLK-26");
        System.out.println("The variables are:" + price + "," + currency + "," + netVolume);
        this.price = price;
        this.currency = currency;
        this.netVolume = netVolume;
    }

    Sunscream(int expiryDate, String formulaType) {
        System.out.println("The variables are:" + expiryDate + "," + formulaType);
        this.expiryDate = expiryDate;
        this.formulaType = formulaType;
    }
}