class Stand {

    String brand;
    String type;
    String material;
    String color;
    double height;
    double width;
    double weight;
    double price;
    boolean adjustable;
    boolean foldable;
    int capacity;
    String usage;
    String manufacturer;
    String country;
    String shape;
    boolean portable;
    String finish;
    int warranty;
    String supplier;
    String design;

    Stand(String brand,String type,String material,String color,double height,
          double width,double weight,double price,boolean adjustable,
          boolean foldable,int capacity,String usage,String manufacturer,
          String country,String shape,boolean portable,String finish,
          int warranty,String supplier,String design){

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.adjustable = adjustable;
        this.foldable = foldable;
        this.capacity = capacity;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.country = country;
        this.shape = shape;
        this.portable = portable;
        this.finish = finish;
        this.warranty = warranty;
        this.supplier = supplier;
        this.design = design;
    }

    void display(){
		
		System.out.println("------");
        System.out.println(brand);
        System.out.println(type);
        System.out.println(material);
        System.out.println(color);
        System.out.println(height);
        System.out.println(width);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(adjustable);
        System.out.println(foldable);
        System.out.println(capacity);
        System.out.println(usage);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(shape);
        System.out.println(portable);
        System.out.println(finish);
        System.out.println(warranty);
        System.out.println(supplier);
        System.out.println(design);
    }
}