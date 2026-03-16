class Organizer {

    String brand;
    String type;
    String material;
    String color;
    double price;
    int compartments;
    String usage;
    double weight;
    String manufacturer;
    String country;
    String size;
    boolean portable;
    boolean waterproof;
    String design;
    String packaging;
    String supplier;
    int warranty;
    String finish;
    String storageCapacity;
    int quantity;

    Organizer(String brand,String type,String material,String color,double price,
              int compartments,String usage,double weight,String manufacturer,
              String country,String size,boolean portable,boolean waterproof,
              String design,String packaging,String supplier,int warranty,
              String finish,String storageCapacity,int quantity){

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.compartments = compartments;
        this.usage = usage;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.country = country;
        this.size = size;
        this.portable = portable;
        this.waterproof = waterproof;
        this.design = design;
        this.packaging = packaging;
        this.supplier = supplier;
        this.warranty = warranty;
        this.finish = finish;
        this.storageCapacity = storageCapacity;
        this.quantity = quantity;
    }

    void display(){

		System.out.println("--------------");
        System.out.println(brand);
        System.out.println(type);
        System.out.println(material);
        System.out.println(color);
        System.out.println(price);
        System.out.println(compartments);
        System.out.println(usage);
        System.out.println(weight);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(size);
        System.out.println(portable);
        System.out.println(waterproof);
        System.out.println(design);
        System.out.println(packaging);
        System.out.println(supplier);
        System.out.println(warranty);
        System.out.println(finish);
        System.out.println(storageCapacity);
        System.out.println(quantity);
    }
}