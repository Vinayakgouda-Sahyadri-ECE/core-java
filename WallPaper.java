class WallPaper {

    String brand;
    String color;
    String pattern;
    String material;
    double width;
    double height;
    double price;
    boolean waterproof;
    boolean washable;
    String texture;
    String style;
    String design;
    int rollLength;
    double weight;
    String manufacturer;
    String country;
    boolean ecoFriendly;
    String finish;
    String roomType;
    String adhesiveType;

    WallPaper(String brand,String color,String pattern,String material,double width,
              double height,double price,boolean waterproof,boolean washable,
              String texture,String style,String design,int rollLength,double weight,
              String manufacturer,String country,boolean ecoFriendly,String finish,
              String roomType,String adhesiveType){

        this.brand = brand;
        this.color = color;
        this.pattern = pattern;
        this.material = material;
        this.width = width;
        this.height = height;
        this.price = price;
        this.waterproof = waterproof;
        this.washable = washable;
        this.texture = texture;
        this.style = style;
        this.design = design;
        this.rollLength = rollLength;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.country = country;
        this.ecoFriendly = ecoFriendly;
        this.finish = finish;
        this.roomType = roomType;
        this.adhesiveType = adhesiveType;
    }

    void display(){
	
		System.out.println("-----------------");
        System.out.println(brand);
        System.out.println(color);
        System.out.println(pattern);
        System.out.println(material);
        System.out.println(width);
        System.out.println(height);
        System.out.println(price);
        System.out.println(waterproof);
        System.out.println(washable);
        System.out.println(texture);
        System.out.println(style);
        System.out.println(design);
        System.out.println(rollLength);
        System.out.println(weight);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(ecoFriendly);
        System.out.println(finish);
        System.out.println(roomType);
        System.out.println(adhesiveType);
    }
}