class TheoBroma {
    String productName;
    double weight;
    String category;
    double calorieCount;
    boolean isEggless;

    double sugarContent;
    double fatContent;
    String mainIngredient;
    boolean containsNuts;
    String frostingType;

    String orderID;
    String bakeDate;
    int shelfLifeDays;
    String branchName;
    boolean isCustomized;

    double price;
    String currency;
    long itemCode;
    String deliverySlot;
    int loyaltyPoints;

    TheoBroma() {
        this(750.0, "Rupees", 500.0);
        System.out.println("End");
    }

    TheoBroma(double sugarContent, double fatContent, String orderID) {
        this(3);
        System.out.println("The variables are:" + sugarContent + "," + fatContent + "," + orderID);
        this.sugarContent = sugarContent;
        this.fatContent = fatContent;
        this.orderID = orderID;
    }

    TheoBroma(int shelfLifeDays) {
        this(shelfLifeDays, "Cake");
        System.out.println("The variable is :" + shelfLifeDays);
        this.shelfLifeDays = shelfLifeDays;
    }

    TheoBroma(double price, String currency, double weight) {
        this(45.5, 20.0, "TH-BAKE-01");
        System.out.println("The variables are:" + price + "," + currency + "," + weight);
        this.price = price;
        this.currency = currency;
        this.weight = weight;
    }

    TheoBroma(int shelfLifeDays, String category) {
        System.out.println("The variables are:" + shelfLifeDays + "," + category);
        this.shelfLifeDays = shelfLifeDays;
        this.category = category;
    }
}