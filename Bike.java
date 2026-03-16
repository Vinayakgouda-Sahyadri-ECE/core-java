class Bike {

    String brand;
    String model;
    String color;
    int price;
    int engineCapacity;
    int mileage;
    String fuelType;
    String transmission;
    int fuelTankCapacity;
    boolean abs;
    int gears;
    String type;

    Bike(String brand,String model,String color,int price,int engineCapacity,int mileage,
         String fuelType,String transmission,int fuelTankCapacity,boolean abs,int gears,String type){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.fuelTankCapacity = fuelTankCapacity;
        this.abs = abs;
        this.gears = gears;
        this.type = type;
    }
}