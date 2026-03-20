class BedSheet {
    double length;
    double width;
    String material;
    int threadCount;
    String colorPattern;

    String sizeCategory;
    boolean isWashable;
    double weight;
    boolean isWrinkleFree;
    String weaveType;

    String designCode;
    String mfgDate;
    int warrantyMonths;
    String manufacturer;
    boolean isPreShrunk;

    double price;
    String currency;
    long gtin;
    String suitableSeason;
    int setPcs;

    BedSheet() {
        this(899.0, "Rupees", 108.0);
        System.out.println("End");
    }

    BedSheet(int threadCount, double weight, String designCode) {
        this(12);
        System.out.println("The variables are:" + threadCount + "," + weight + "," + designCode);
        this.threadCount = threadCount;
        this.weight = weight;
        this.designCode = designCode;
    }

    BedSheet(int warrantyMonths) {
        this(warrantyMonths, "Floral Print");
        System.out.println("The variable is :" + warrantyMonths);
        this.warrantyMonths = warrantyMonths;
    }

    BedSheet(double price, String currency, double length) {
        this(300, 1.2, "BS-001");
        System.out.println("The variables are:" + price + "," + currency + "," + length);
        this.price = price;
        this.currency = currency;
        this.length = length;
    }

    BedSheet(int warrantyMonths, String material) {
        System.out.println("The variables are:" + warrantyMonths + "," + material);
        this.warrantyMonths = warrantyMonths;
        this.material = material;
    }
}