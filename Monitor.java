class Monitor {

    String brand;
    String model;
    String color;
    int price;
    double screenSize;
    String resolution;
    int refreshRate;
    String panelType;
    boolean curved;
    int hdmiPorts;
    int displayPorts;
    double weight;

    Monitor(String brand,String model,String color,int price,double screenSize,
            String resolution,int refreshRate,String panelType,boolean curved,
            int hdmiPorts,int displayPorts,double weight){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.panelType = panelType;
        this.curved = curved;
        this.hdmiPorts = hdmiPorts;
        this.displayPorts = displayPorts;
        this.weight = weight;
    }
}