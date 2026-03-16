class Trophy {

    String name;
    String material;
    String color;
    double height;
    double weight;
    double price;
    String eventName;
    String category;
    String shape;
    String manufacturer;
    String country;
    int year;
    boolean engraved;
    String engravingText;
    String baseMaterial;
    String finish;
    String supplier;
    String awardType;
    String packaging;
    int quantity;

    Trophy(String name,String material,String color,double height,double weight,double price,
           String eventName,String category,String shape,String manufacturer,String country,
           int year,boolean engraved,String engravingText,String baseMaterial,String finish,
           String supplier,String awardType,String packaging,int quantity){

        this.name = name;
        this.material = material;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.price = price;
        this.eventName = eventName;
        this.category = category;
        this.shape = shape;
        this.manufacturer = manufacturer;
        this.country = country;
        this.year = year;
        this.engraved = engraved;
        this.engravingText = engravingText;
        this.baseMaterial = baseMaterial;
        this.finish = finish;
        this.supplier = supplier;
        this.awardType = awardType;
        this.packaging = packaging;
        this.quantity = quantity;
    }

    void display(){

        System.out.println(name);
        System.out.println(material);
        System.out.println(color);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(eventName);
        System.out.println(category);
        System.out.println(shape);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(year);
        System.out.println(engraved);
        System.out.println(engravingText);
        System.out.println(baseMaterial);
        System.out.println(finish);
        System.out.println(supplier);
        System.out.println(awardType);
        System.out.println(packaging);
        System.out.println(quantity);
    }
}