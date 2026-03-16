class Router {

    String brand;
    String model;
    String color;
    int price;
    int numberOfAntennas;
    String frequencyBand;
    int maxSpeed;
    boolean dualBand;
    int lanPorts;
    boolean wifiSupport;
    double weight;
    String securityType;

    Router(String brand,String model,String color,int price,int numberOfAntennas,
           String frequencyBand,int maxSpeed,boolean dualBand,int lanPorts,
           boolean wifiSupport,double weight,String securityType){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.numberOfAntennas = numberOfAntennas;
        this.frequencyBand = frequencyBand;
        this.maxSpeed = maxSpeed;
        this.dualBand = dualBand;
        this.lanPorts = lanPorts;
        this.wifiSupport = wifiSupport;
        this.weight = weight;
        this.securityType = securityType;
    }
}