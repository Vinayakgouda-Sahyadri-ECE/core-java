class Map {

    String name;
    String type;
    String region;
    String country;
    String language;
    String publisher;
    String color;
    double width;
    double height;
    double price;
    int year;
    String scale;
    String material;
    boolean laminated;
    boolean folded;
    int pages;
    String usage;
    String format;
    String supplier;
    String design;

    Map(String name,String type,String region,String country,String language,
        String publisher,String color,double width,double height,double price,
        int year,String scale,String material,boolean laminated,boolean folded,
        int pages,String usage,String format,String supplier,String design){

        this.name = name;
        this.type = type;
        this.region = region;
        this.country = country;
        this.language = language;
        this.publisher = publisher;
        this.color = color;
        this.width = width;
        this.height = height;
        this.price = price;
        this.year = year;
        this.scale = scale;
        this.material = material;
        this.laminated = laminated;
        this.folded = folded;
        this.pages = pages;
        this.usage = usage;
        this.format = format;
        this.supplier = supplier;
        this.design = design;
    }

    void display(){
 
        System.out.println("---------------");
        System.out.println(name);
        System.out.println(type);
        System.out.println(region);
        System.out.println(country);
        System.out.println(language);
        System.out.println(publisher);
        System.out.println(color);
        System.out.println(width);
        System.out.println(height);
        System.out.println(price);
        System.out.println(year);
        System.out.println(scale);
        System.out.println(material);
        System.out.println(laminated);
        System.out.println(folded);
        System.out.println(pages);
        System.out.println(usage);
        System.out.println(format);
        System.out.println(supplier);
        System.out.println(design);
    }
}