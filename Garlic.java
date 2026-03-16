class Garlic {

    String name;
    String color;
    String type;
    String origin;
    double weight;
    double price;
    String taste;
    String quality;
    boolean organic;
    boolean fresh;
    int quantity;
    String packaging;
    String brand;
    String country;
    double moisture;
    String grade;
    String harvestSeason;
    boolean exportQuality;
    String storageType;
    String supplier;

    Garlic(String name,String color,String type,String origin,double weight,double price,
           String taste,String quality,boolean organic,boolean fresh,int quantity,
           String packaging,String brand,String country,double moisture,String grade,
           String harvestSeason,boolean exportQuality,String storageType,String supplier){

        this.name=name;
        this.color=color;
        this.type=type;
        this.origin=origin;
        this.weight=weight;
        this.price=price;
        this.taste=taste;
        this.quality=quality;
        this.organic=organic;
        this.fresh=fresh;
        this.quantity=quantity;
        this.packaging=packaging;
        this.brand=brand;
        this.country=country;
        this.moisture=moisture;
        this.grade=grade;
        this.harvestSeason=harvestSeason;
        this.exportQuality=exportQuality;
        this.storageType=storageType;
        this.supplier=supplier;
    }

    void display(){

		System.out.println("--------");
        System.out.println(name);
        System.out.println(color);
        System.out.println(type);
        System.out.println(origin);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(taste);
        System.out.println(quality);
        System.out.println(organic);
        System.out.println(fresh);
        System.out.println(quantity);
        System.out.println(packaging);
        System.out.println(brand);
        System.out.println(country);
        System.out.println(moisture);
        System.out.println(grade);
        System.out.println(harvestSeason);
        System.out.println(exportQuality);
        System.out.println(storageType);
        System.out.println(supplier);
    }
}