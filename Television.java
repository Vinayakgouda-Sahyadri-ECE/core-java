class Television {

    String brand;
    String model;
    String color;
    int price;
    double screenSize;
    String resolution;
    String displayType;
    boolean smartTV;
    int hdmiPorts;
    int usbPorts;
    int powerConsumption;
    double weight;

    Television(String brand,String model,String color,int price,double screenSize,
               String resolution,String displayType,boolean smartTV,
               int hdmiPorts,int usbPorts,int powerConsumption,double weight){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.displayType = displayType;
        this.smartTV = smartTV;
        this.hdmiPorts = hdmiPorts;
        this.usbPorts = usbPorts;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
    }
}