class Brain {

    String name;
    String species;
    double weight;
    double volume;
    String color;
    int neurons;
    int lobes;
    String function;
    boolean healthy;
    String memoryType;
    String learningAbility;
    String intelligenceLevel;
    String nervousSystem;
    String protection;
    String location;
    double oxygenConsumption;
    String bloodSupply;
    boolean active;
    String researchField;
    String notes;

    Brain(String name,String species,double weight,double volume,String color,
          int neurons,int lobes,String function,boolean healthy,String memoryType,
          String learningAbility,String intelligenceLevel,String nervousSystem,
          String protection,String location,double oxygenConsumption,
          String bloodSupply,boolean active,String researchField,String notes){

        this.name = name;
        this.species = species;
        this.weight = weight;
        this.volume = volume;
        this.color = color;
        this.neurons = neurons;
        this.lobes = lobes;
        this.function = function;
        this.healthy = healthy;
        this.memoryType = memoryType;
        this.learningAbility = learningAbility;
        this.intelligenceLevel = intelligenceLevel;
        this.nervousSystem = nervousSystem;
        this.protection = protection;
        this.location = location;
        this.oxygenConsumption = oxygenConsumption;
        this.bloodSupply = bloodSupply;
        this.active = active;
        this.researchField = researchField;
        this.notes = notes;
    }

    void display(){

		System.out.println("-----------");
        System.out.println(name);
        System.out.println(species);
        System.out.println(weight);
        System.out.println(volume);
        System.out.println(color);
        System.out.println(neurons);
        System.out.println(lobes);
        System.out.println(function);
        System.out.println(healthy);
        System.out.println(memoryType);
        System.out.println(learningAbility);
        System.out.println(intelligenceLevel);
        System.out.println(nervousSystem);
        System.out.println(protection);
        System.out.println(location);
        System.out.println(oxygenConsumption);
        System.out.println(bloodSupply);
        System.out.println(active);
        System.out.println(researchField);
        System.out.println(notes);
    }
}