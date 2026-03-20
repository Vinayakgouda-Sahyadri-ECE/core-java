class Comb {
    double length;
    String material;
    String color;
    int toothCount;
    double toothSpacing;

    boolean isAntiStatic;
    String handleType;
    double weight;
    boolean isHeatResistant;
    String toothType;

    String batchNumber;
    String mfgDate;
    int lifeSpanMonths;
    String brandName;
    boolean isFoldable;

    double price;
    String currency;
    long upcCode;
    String hairType;
    int inventoryCount;

    Comb() {
        this(45.0, "Rupees", 18.5);
        System.out.println("End");
    }

    Comb(int toothCount, double toothSpacing, String batchNumber) {
        this(36);
        System.out.println("The variables are:" + toothCount + "," + toothSpacing + "," + batchNumber);
        this.toothCount = toothCount;
        this.toothSpacing = toothSpacing;
        this.batchNumber = batchNumber;
    }

    Comb(int lifeSpanMonths) {
        this(lifeSpanMonths, "Black");
        System.out.println("The variable is :" + lifeSpanMonths);
        this.lifeSpanMonths = lifeSpanMonths;
    }

    Comb(double price, String currency, double length) {
        this(50, 0.5, "C-500");
        System.out.println("The variables are:" + price + "," + currency + "," + length);
        this.price = price;
        this.currency = currency;
        this.length = length;
    }

    Comb(int lifeSpanMonths, String color) {
        System.out.println("The variables are:" + lifeSpanMonths + "," + color);
        this.lifeSpanMonths = lifeSpanMonths;
        this.color = color;
    }
}