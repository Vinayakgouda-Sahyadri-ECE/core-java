class Lotion {

    String brand;
    String type;
    String fragrance;
    String color;
    double price;
    int volume;
    String skinType;
    boolean herbal;
    boolean moisturizing;
    String manufacturer;
    String country;
    String packagingType;
    double weight;
    String expiryDate;
    String ingredients;
    boolean sunscreen;
    String usage;
    String texture;
    String supplier;
    int quantity;

    Lotion(String brand,String type,String fragrance,String color,double price,
           int volume,String skinType,boolean herbal,boolean moisturizing,
           String manufacturer,String country,String packagingType,double weight,
           String expiryDate,String ingredients,boolean sunscreen,
           String usage,String texture,String supplier,int quantity){

        this.brand = brand;
        this.type = type;
        this.fragrance = fragrance;
        this.color = color;
        this.price = price;
        this.volume = volume;
        this.skinType = skinType;
        this.herbal = herbal;
        this.moisturizing = moisturizing;
        this.manufacturer = manufacturer;
        this.country = country;
        this.packagingType = packagingType;
        this.weight = weight;
        this.expiryDate = expiryDate;
        this.ingredients = ingredients;
        this.sunscreen = sunscreen;
        this.usage = usage;
        this.texture = texture;
        this.supplier = supplier;
        this.quantity = quantity;
    }

    void display(){

		System.out.println("--------------");
        System.out.println(brand);
        System.out.println(type);
        System.out.println(fragrance);
        System.out.println(color);
        System.out.println(price);
        System.out.println(volume);
        System.out.println(skinType);
        System.out.println(herbal);
        System.out.println(moisturizing);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(packagingType);
        System.out.println(weight);
        System.out.println(expiryDate);
        System.out.println(ingredients);
        System.out.println(sunscreen);
        System.out.println(usage);
        System.out.println(texture);
        System.out.println(supplier);
        System.out.println(quantity);
    }
}