class Organ {

    String name;
    String system;
    String location;
    double weight;
    double size;
    String function;
    String color;
    boolean vital;
    String tissueType;
    String bloodSupply;
    String nerveSupply;
    String protection;
    String shape;
    String species;
    String developmentStage;
    boolean paired;
    String medicalField;
    String researchUse;
    String notes;
    String supplier;

    Organ(String name,String system,String location,double weight,double size,
          String function,String color,boolean vital,String tissueType,
          String bloodSupply,String nerveSupply,String protection,
          String shape,String species,String developmentStage,boolean paired,
          String medicalField,String researchUse,String notes,String supplier){

        this.name = name;
        this.system = system;
        this.location = location;
        this.weight = weight;
        this.size = size;
        this.function = function;
        this.color = color;
        this.vital = vital;
        this.tissueType = tissueType;
        this.bloodSupply = bloodSupply;
        this.nerveSupply = nerveSupply;
        this.protection = protection;
        this.shape = shape;
        this.species = species;
        this.developmentStage = developmentStage;
        this.paired = paired;
        this.medicalField = medicalField;
        this.researchUse = researchUse;
        this.notes = notes;
        this.supplier = supplier;
    }

    void display(){
		
		System.out.println("----------------");
        System.out.println(name);
        System.out.println(system);
        System.out.println(location);
        System.out.println(weight);
        System.out.println(size);
        System.out.println(function);
        System.out.println(color);
        System.out.println(vital);
        System.out.println(tissueType);
        System.out.println(bloodSupply);
        System.out.println(nerveSupply);
        System.out.println(protection);
        System.out.println(shape);
        System.out.println(species);
        System.out.println(developmentStage);
        System.out.println(paired);
        System.out.println(medicalField);
        System.out.println(researchUse);
        System.out.println(notes);
        System.out.println(supplier);
    }
}