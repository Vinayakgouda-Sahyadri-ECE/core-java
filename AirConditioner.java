class AirConditioner {

    String brand;
    String model;
    String color;
    int price;
    double capacity;
    String type;
    int energyRating;
    boolean inverterTechnology;
    int coolingPower;
    boolean remoteControl;
    double weight;
    int powerConsumption;

    AirConditioner(String brand,String model,String color,int price,double capacity,
                   String type,int energyRating,boolean inverterTechnology,
                   int coolingPower,boolean remoteControl,double weight,
                   int powerConsumption){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.capacity = capacity;
        this.type = type;
        this.energyRating = energyRating;
        this.inverterTechnology = inverterTechnology;
        this.coolingPower = coolingPower;
        this.remoteControl = remoteControl;
        this.weight = weight;
        this.powerConsumption = powerConsumption;
    }
}