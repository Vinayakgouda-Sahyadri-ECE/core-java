class Wire {
    double length;
    String material;
    String color;
    double thickness;
    double resistance;

    int gauge;
    double voltageRating;
    double currentCapacity;
    boolean isInsulated;
    String insulationType;

    String batchNumber;
    String mfgDate;
    int warrantyMonths;
    String manufacturer;
    boolean isFireResistant;

    double pricePerMeter;
    String currency;
    long serialNumber;
    String flexibilityGrade;
    int rollWeight;

    Wire() {
        this(1500.0, "Rupees", 100.0);
        System.out.println("End");
    }

    Wire(int gauge, double voltageRating, String batchNumber) {
        this(60);
        System.out.println("The variables are:" + gauge + "," + voltageRating + "," + batchNumber);
        this.gauge = gauge;
        this.voltageRating = voltageRating;
        this.batchNumber = batchNumber;
    }

    Wire(int warrantyMonths) {
        this(warrantyMonths, "Red");
        System.out.println("The variable is :" + warrantyMonths);
        this.warrantyMonths = warrantyMonths;
    }

    Wire(double pricePerMeter, String currency, double length) {
        this(14, 440.0, "WR-X100");
        System.out.println("The variables are:" + pricePerMeter + "," + currency + "," + length);
        this.pricePerMeter = pricePerMeter;
        this.currency = currency;
        this.length = length;
    }

    Wire(int warrantyMonths, String color) {
        System.out.println("The variables are:" + warrantyMonths + "," + color);
        this.warrantyMonths = warrantyMonths;
        this.color = color;
    }
}