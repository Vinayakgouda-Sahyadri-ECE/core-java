class Printer {

    String brand;
    String model;
    String color;
    int price;
    String type;
    boolean wireless;
    String connectionType;
    int printSpeed;
    String printTechnology;
    boolean duplexPrinting;
    double weight;
    int paperCapacity;

    Printer(String brand,String model,String color,int price,String type,
            boolean wireless,String connectionType,int printSpeed,
            String printTechnology,boolean duplexPrinting,double weight,
            int paperCapacity){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.type = type;
        this.wireless = wireless;
        this.connectionType = connectionType;
        this.printSpeed = printSpeed;
        this.printTechnology = printTechnology;
        this.duplexPrinting = duplexPrinting;
        this.weight = weight;
        this.paperCapacity = paperCapacity;
    }
}