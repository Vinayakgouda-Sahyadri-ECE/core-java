class Conditioner {

    String brand;
    String type;
    String color;
    String fragrance;
    double price;
    int volume;
    String hairType;
    boolean herbal;
    boolean sulfateFree;
    String manufacturer;
    String country;
    String packagingType;
    double weight;
    String expiryDate;
    String ingredients;
    boolean antiDandruff;
    String usage;
    String texture;
    String supplier;
    int quantity;

    Conditioner(String brand,String type,String color,String fragrance,double price,
                int volume,String hairType,boolean herbal,boolean sulfateFree,
                String manufacturer,String country,String packagingType,double weight,
                String expiryDate,String ingredients,boolean antiDandruff,
                String usage,String texture,String supplier,int quantity){

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.fragrance = fragrance;
        this.price = price;
        this.volume = volume;
        this.hairType = hairType;
        this.herbal = herbal;
        this.sulfateFree = sulfateFree;
        this.manufacturer = manufacturer;
        this.country = country;
        this.packagingType = packagingType;
        this.weight = weight;
        this.expiryDate = expiryDate;
        this.ingredients = ingredients;
        this.antiDandruff = antiDandruff;
        this.usage = usage;
        this.texture = texture;
        this.supplier = supplier;
        this.quantity = quantity;
    }

    void display(){

        System.out.println(brand);
        System.out.println(type);
        System.out.println(color);
        System.out.println(fragrance);
        System.out.println(price);
        System.out.println(volume);
        System.out.println(hairType);
        System.out.println(herbal);
        System.out.println(sulfateFree);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(packagingType);
        System.out.println(weight);
        System.out.println(expiryDate);
        System.out.println(ingredients);
        System.out.println(antiDandruff);
        System.out.println(usage);
        System.out.println(texture);
        System.out.println(supplier);
        System.out.println(quantity);
    }
}