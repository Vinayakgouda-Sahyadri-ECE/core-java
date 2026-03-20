class SoapHolder {
    double length;
    double width;
    String material;
    String color;
    String mountType;

    boolean hasDrainage;
    int suctionCups;
    double weightCapacity;
    boolean isRustProof;
    String finish;

    String modelName;
    String mfgDate;
    int durabilityYears;
    String brand;
    boolean isWallMounted;

    double price;
    String currency;
    long productCode;
    String shape;
    int stockUnits;

    SoapHolder() {
        this(250.0, "Rupees", 15.0);
        System.out.println("End");
    }

    SoapHolder(int suctionCups, double weightCapacity, String modelName) {
        this(5);
        System.out.println("The variables are:" + suctionCups + "," + weightCapacity + "," + modelName);
        this.suctionCups = suctionCups;
        this.weightCapacity = weightCapacity;
        this.modelName = modelName;
    }

    SoapHolder(int durabilityYears) {
        this(durabilityYears, "Steel");
        System.out.println("The variable is :" + durabilityYears);
        this.durabilityYears = durabilityYears;
    }

    SoapHolder(double price, String currency, double length) {
        this(4, 2.5, "SH-99");
        System.out.println("The variables are:" + price + "," + currency + "," + length);
        this.price = price;
        this.currency = currency;
        this.length = length;
    }

    SoapHolder(int durabilityYears, String color) {
        System.out.println("The variables are:" + durabilityYears + "," + color);
        this.durabilityYears = durabilityYears;
        this.color = color;
    }
}