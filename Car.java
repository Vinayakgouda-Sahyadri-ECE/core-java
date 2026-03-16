class Car {

    String brand;
    String model;
    String color;
    int price;
    int seatingCapacity;
    String fuelType;
    String transmission;
    int mileage;
    int engineCapacity;
    boolean sunroof;
    String type;
    int airbags;

    Car(String brand,String model,String color,int price,int seatingCapacity,
        String fuelType,String transmission,int mileage,int engineCapacity,
        boolean sunroof,String type,int airbags){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        this.sunroof = sunroof;
        this.type = type;
        this.airbags = airbags;
    }
}