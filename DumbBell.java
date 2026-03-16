class DumbBell {

    String brand;
    String material;
    String color;
    double weight;
    double price;
    String type;
    String shape;
    String gripType;
    boolean adjustable;
    boolean rubberCoated;
    String manufacturer;
    String country;
    int warranty;
    String usage;
    String finish;
    double length;
    double diameter;
    String packaging;
    String supplier;
    int quantity;

    DumbBell(String brand,String material,String color,double weight,double price,
             String type,String shape,String gripType,boolean adjustable,
             boolean rubberCoated,String manufacturer,String country,int warranty,
             String usage,String finish,double length,double diameter,
             String packaging,String supplier,int quantity){

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.type = type;
        this.shape = shape;
        this.gripType = gripType;
        this.adjustable = adjustable;
        this.rubberCoated = rubberCoated;
        this.manufacturer = manufacturer;
        this.country = country;
        this.warranty = warranty;
        this.usage = usage;
        this.finish = finish;
        this.length = length;
        this.diameter = diameter;
        this.packaging = packaging;
        this.supplier = supplier;
        this.quantity = quantity;
    }

    void display(){

        System.out.println(brand);
        System.out.println(material);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(type);
        System.out.println(shape);
        System.out.println(gripType);
        System.out.println(adjustable);
        System.out.println(rubberCoated);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(warranty);
        System.out.println(usage);
        System.out.println(finish);
        System.out.println(length);
        System.out.println(diameter);
        System.out.println(packaging);
        System.out.println(supplier);
        System.out.println(quantity);
    }
}