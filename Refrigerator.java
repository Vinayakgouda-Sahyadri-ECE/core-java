class Refrigerator {

    String brand;
    String model;
    String color;
    int price;
    int capacity;
    String type;
    int doors;
    boolean inverterTechnology;
    int energyRating;
    boolean frostFree;
    double weight;
    int powerConsumption;

    Refrigerator(String brand,String model,String color,int price,int capacity,
                 String type,int doors,boolean inverterTechnology,int energyRating,
                 boolean frostFree,double weight,int powerConsumption){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.capacity = capacity;
        this.type = type;
        this.doors = doors;
        this.inverterTechnology = inverterTechnology;
        this.energyRating = energyRating;
        this.frostFree = frostFree;
        this.weight = weight;
        this.powerConsumption = powerConsumption;
    }
}