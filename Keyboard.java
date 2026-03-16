class Keyboard {

    String brand;
    String model;
    String color;
    int price;
    String type;
    boolean wireless;
    String connectionType;
    int numberOfKeys;
    boolean backlight;
    String layout;
    double weight;
    String material;

    Keyboard(String brand,String model,String color,int price,String type,
             boolean wireless,String connectionType,int numberOfKeys,
             boolean backlight,String layout,double weight,String material){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.type = type;
        this.wireless = wireless;
        this.connectionType = connectionType;
        this.numberOfKeys = numberOfKeys;
        this.backlight = backlight;
        this.layout = layout;
        this.weight = weight;
        this.material = material;
    }
}