class Cell {

    String name;
    String type;
    String organism;
    String shape;
    double size;
    String nucleusType;
    String membraneType;
    String cytoplasm;
    String function;
    boolean living;
    String discoveryYear;
    String discoveredBy;
    int chromosomeCount;
    String reproductionType;
    String energySource;
    String structure;
    String location;
    boolean microscopic;
    String researchField;
    String notes;

    Cell(String name,String type,String organism,String shape,double size,
         String nucleusType,String membraneType,String cytoplasm,String function,
         boolean living,String discoveryYear,String discoveredBy,int chromosomeCount,
         String reproductionType,String energySource,String structure,
         String location,boolean microscopic,String researchField,String notes){

        this.name = name;
        this.type = type;
        this.organism = organism;
        this.shape = shape;
        this.size = size;
        this.nucleusType = nucleusType;
        this.membraneType = membraneType;
        this.cytoplasm = cytoplasm;
        this.function = function;
        this.living = living;
        this.discoveryYear = discoveryYear;
        this.discoveredBy = discoveredBy;
        this.chromosomeCount = chromosomeCount;
        this.reproductionType = reproductionType;
        this.energySource = energySource;
        this.structure = structure;
        this.location = location;
        this.microscopic = microscopic;
        this.researchField = researchField;
        this.notes = notes;
    }

    void display(){

		System.out.println("--------");
        System.out.println(name);
        System.out.println(type);
        System.out.println(organism);
        System.out.println(shape);
        System.out.println(size);
        System.out.println(nucleusType);
        System.out.println(membraneType);
        System.out.println(cytoplasm);
        System.out.println(function);
        System.out.println(living);
        System.out.println(discoveryYear);
        System.out.println(discoveredBy);
        System.out.println(chromosomeCount);
        System.out.println(reproductionType);
        System.out.println(energySource);
        System.out.println(structure);
        System.out.println(location);
        System.out.println(microscopic);
        System.out.println(researchField);
        System.out.println(notes);
    }
}