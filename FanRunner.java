class FanRunner {

    public static void main(String[] args) {

        Fan f1 = new Fan("Usha","White",2500,"Ceiling",
                         3,5,false,75,
                         4.2,"Metal",220,"48 inch");

        System.out.println(f1.brand);
        System.out.println(f1.color);
        System.out.println(f1.price);
        System.out.println(f1.type);
        System.out.println(f1.numberOfBlades);
        System.out.println(f1.speedLevels);
        System.out.println(f1.remoteControl);
        System.out.println(f1.powerConsumption);
        System.out.println(f1.weight);
        System.out.println(f1.material);
        System.out.println(f1.voltage);
        System.out.println(f1.size);

    }
}