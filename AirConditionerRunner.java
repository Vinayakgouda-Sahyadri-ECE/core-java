class AirConditionerRunner {

    public static void main(String[] args) {

        AirConditioner ac1 = new AirConditioner("Daikin","FTKF","White",45000,
                                                1.5,"Split",5,true,
                                                5000,true,35.0,1500);

        System.out.println(ac1.brand);
        System.out.println(ac1.model);
        System.out.println(ac1.color);
        System.out.println(ac1.price);
        System.out.println(ac1.capacity);
        System.out.println(ac1.type);
        System.out.println(ac1.energyRating);
        System.out.println(ac1.inverterTechnology);
        System.out.println(ac1.coolingPower);
        System.out.println(ac1.remoteControl);
        System.out.println(ac1.weight);
        System.out.println(ac1.powerConsumption);

    }
}