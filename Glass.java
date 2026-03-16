class Glass {

    String brand;
    String type;
    String color;
    int price;
    String material;
    double capacity;
    double height;
    double diameter;
    double weight;
    boolean transparent;
    boolean reusable;
    String shape;

    Glass(String brand,String type,String color,int price,String material,
          double capacity,double height,double diameter,double weight,
          boolean transparent,boolean reusable,String shape){

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.material = material;
        this.capacity = capacity;
        this.height = height;
        this.diameter = diameter;
        this.weight = weight;
        this.transparent = transparent;
        this.reusable = reusable;
        this.shape = shape;
    }
}