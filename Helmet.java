class Helmet {

    String brand;
    String model;
    String color;
    int price;
    String type;
    String material;
    double weight;
    boolean visor;
    boolean ventilation;
    String size;
    boolean isiCertified;
    String finish;

    Helmet(String brand,String model,String color,int price,String type,
           String material,double weight,boolean visor,boolean ventilation,
           String size,boolean isiCertified,String finish){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.visor = visor;
        this.ventilation = ventilation;
        this.size = size;
        this.isiCertified = isiCertified;
        this.finish = finish;
    }
}