class Mouse {

    String brand;
    String model;
    String color;
    int price;
    String type;
    boolean wireless;
    String connectionType;
    int dpi;
    int buttons;
    boolean rgb;
    double weight;
    String material;

    Mouse(String brand,String model,String color,int price,String type,
          boolean wireless,String connectionType,int dpi,int buttons,
          boolean rgb,double weight,String material){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.type = type;
        this.wireless = wireless;
        this.connectionType = connectionType;
        this.dpi = dpi;
        this.buttons = buttons;
        this.rgb = rgb;
        this.weight = weight;
        this.material = material;
    }
}