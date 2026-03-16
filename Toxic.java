class Toxic {

    String name;
    String chemicalType;
    String color;
    String smell;
    String state;
    double quantity;
    double toxicityLevel;
    String hazardClass;
    String storageCondition;
    boolean flammable;
    boolean corrosive;
    String manufacturer;
    String country;
    String usage;
    String safetyLevel;
    String containerType;
    double weight;
    String warningLabel;
    boolean requiresLicense;
    String supplier;

    Toxic(String name,String chemicalType,String color,String smell,String state,
          double quantity,double toxicityLevel,String hazardClass,String storageCondition,
          boolean flammable,boolean corrosive,String manufacturer,String country,
          String usage,String safetyLevel,String containerType,double weight,
          String warningLabel,boolean requiresLicense,String supplier){

        this.name = name;
        this.chemicalType = chemicalType;
        this.color = color;
        this.smell = smell;
        this.state = state;
        this.quantity = quantity;
        this.toxicityLevel = toxicityLevel;
        this.hazardClass = hazardClass;
        this.storageCondition = storageCondition;
        this.flammable = flammable;
        this.corrosive = corrosive;
        this.manufacturer = manufacturer;
        this.country = country;
        this.usage = usage;
        this.safetyLevel = safetyLevel;
        this.containerType = containerType;
        this.weight = weight;
        this.warningLabel = warningLabel;
        this.requiresLicense = requiresLicense;
        this.supplier = supplier;
    }

    void display(){

        System.out.println(name);
        System.out.println(chemicalType);
        System.out.println(color);
        System.out.println(smell);
        System.out.println(state);
        System.out.println(quantity);
        System.out.println(toxicityLevel);
        System.out.println(hazardClass);
        System.out.println(storageCondition);
        System.out.println(flammable);
        System.out.println(corrosive);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(usage);
        System.out.println(safetyLevel);
        System.out.println(containerType);
        System.out.println(weight);
        System.out.println(warningLabel);
        System.out.println(requiresLicense);
        System.out.println(supplier);
    }
}