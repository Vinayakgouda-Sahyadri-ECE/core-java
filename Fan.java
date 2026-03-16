class Fan {

    String brand;
    String color;
    int price;
    String type;
    int numberOfBlades;
    int speedLevels;
    boolean remoteControl;
    int powerConsumption;
    double weight;
    String material;
    int voltage;
    String size;

    Fan(String brand,String color,int price,String type,int numberOfBlades,
        int speedLevels,boolean remoteControl,int powerConsumption,
        double weight,String material,int voltage,String size){

        this.brand = brand;
        this.color = color;
        this.price = price;
        this.type = type;
        this.numberOfBlades = numberOfBlades;
        this.speedLevels = speedLevels;
        this.remoteControl = remoteControl;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.material = material;
        this.voltage = voltage;
        this.size = size;
    }
}