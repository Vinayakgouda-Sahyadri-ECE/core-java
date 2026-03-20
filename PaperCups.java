class PaperCups {
    double capacityMl;
    int quantityPerPack;
    String material;
    String color;
    double thicknessGsm;

    boolean isEcoFriendly;
    boolean hasLid;
    double height;
    boolean isMicrowavable;
    String designTheme;

    String batchID;
    String mfgDate;
    int shelfLifeYears;
    String supplierName;
    boolean isLeakProof;

    double price;
    String currency;
    long sku;
    String occasionType;
    int recycledContentPercent;

    PaperCups() {
        this(150.0, "Rupees", 250.0);
        System.out.println("End");
    }

    PaperCups(int quantityPerPack, double thicknessGsm, String batchID) {
        this(3);
        System.out.println("The variables are:" + quantityPerPack + "," + thicknessGsm + "," + batchID);
        this.quantityPerPack = quantityPerPack;
        this.thicknessGsm = thicknessGsm;
        this.batchID = batchID;
    }

    PaperCups(int shelfLifeYears) {
        this(shelfLifeYears, "White");
        System.out.println("The variable is :" + shelfLifeYears);
        this.shelfLifeYears = shelfLifeYears;
    }

    PaperCups(double price, String currency, double capacityMl) {
        this(50, 210.0, "PC-B12");
        System.out.println("The variables are:" + price + "," + currency + "," + capacityMl);
        this.price = price;
        this.currency = currency;
        this.capacityMl = capacityMl;
    }

    PaperCups(int shelfLifeYears, String material) {
        System.out.println("The variables are:" + shelfLifeYears + "," + material);
        this.shelfLifeYears = shelfLifeYears;
        this.material = material;
    }
}