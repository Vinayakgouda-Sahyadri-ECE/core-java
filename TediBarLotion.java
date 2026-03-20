class TediBarLotion {
    double netWeight;
    String bottleType;
    String lotionColor;
    double pHLevel;
    String fragrance;

    double moistureContent;
    double glycerinPercent;
    double vitaminEContent;
    boolean isDermatologicallyTested;
    String skinType;

    String batchNumber;
    String mfgDate;
    int expiryMonths;
    String factoryLocation;
    boolean isSealIntact;

    double price;
    String currency;
    long barCode;
    String targetedAgeGroup;
    int shelfLife;

    TediBarLotion() {
        this(350.0, "Rupees", 200.0);
        System.out.println("End");
    }

    TediBarLotion(double glycerinPercent, double vitaminEContent, String batchNumber) {
        this(24);
        System.out.println("The variables are:" + glycerinPercent + "," + vitaminEContent + "," + batchNumber);
        this.glycerinPercent = glycerinPercent;
        this.vitaminEContent = vitaminEContent;
        this.batchNumber = batchNumber;
    }

    TediBarLotion(int shelfLife) {
        this(shelfLife, "White");
        System.out.println("The variable is :" + shelfLife);
        this.shelfLife = shelfLife;
    }

    TediBarLotion(double price, String currency, double netWeight) {
        this(12.5, 2.0, "TB2026");
        System.out.println("The variables are:" + price + "," + currency + "," + netWeight);
        this.price = price;
        this.currency = currency;
        this.netWeight = netWeight;
    }

    TediBarLotion(int shelfLife, String lotionColor) {
        System.out.println("The variables are:" + shelfLife + "," + lotionColor);
        this.shelfLife = shelfLife;
        this.lotionColor = lotionColor;
    }
}