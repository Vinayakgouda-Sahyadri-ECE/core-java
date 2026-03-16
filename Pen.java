class Pen {

    String brand;
    String color;
    int price;
    String type;
    String inkColor;
    String material;
    boolean refillable;
    double length;
    double weight;
    String tipType;
    String gripType;
    boolean waterproof;

    Pen(String brand,String color,int price,String type,String inkColor,String material,
        boolean refillable,double length,double weight,String tipType,String gripType,
        boolean waterproof){

        this.brand = brand;
        this.color = color;
        this.price = price;
        this.type = type;
        this.inkColor = inkColor;
        this.material = material;
        this.refillable = refillable;
        this.length = length;
        this.weight = weight;
        this.tipType = tipType;
        this.gripType = gripType;
        this.waterproof = waterproof;
    }
}