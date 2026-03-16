class Paper {

    String brand;
    String color;
    String type;
    String size;
    double weight;
    double price;
    int quantity;
    String texture;
    String material;
    boolean recyclable;
    boolean waterproof;
    String manufacturer;
    String country;
    int gsm;
    String usage;
    String packaging;
    double thickness;
    boolean ecoFriendly;
    String finish;
    String supplier;

    Paper(String brand,String color,String type,String size,double weight,double price,
          int quantity,String texture,String material,boolean recyclable,
          boolean waterproof,String manufacturer,String country,int gsm,
          String usage,String packaging,double thickness,boolean ecoFriendly,
          String finish,String supplier){

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
        this.texture = texture;
        this.material = material;
        this.recyclable = recyclable;
        this.waterproof = waterproof;
        this.manufacturer = manufacturer;
        this.country = country;
        this.gsm = gsm;
        this.usage = usage;
        this.packaging = packaging;
        this.thickness = thickness;
        this.ecoFriendly = ecoFriendly;
        this.finish = finish;
        this.supplier = supplier;
    }

    void display(){

		System.out.println("----------");
        System.out.println(brand);
        System.out.println(color);
        System.out.println(type);
        System.out.println(size);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(texture);
        System.out.println(material);
        System.out.println(recyclable);
        System.out.println(waterproof);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(gsm);
        System.out.println(usage);
        System.out.println(packaging);
        System.out.println(thickness);
        System.out.println(ecoFriendly);
        System.out.println(finish);
        System.out.println(supplier);
    }
}