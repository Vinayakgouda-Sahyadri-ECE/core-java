class RefrigeratorRunner {

    public static void main(String[] args) {

        Refrigerator r1 = new Refrigerator("Samsung","RT28","Silver",32000,
                                           253,"Double Door",2,true,
                                           4,true,45.0,150);

        System.out.println(r1.brand);
        System.out.println(r1.model);
        System.out.println(r1.color);
        System.out.println(r1.price);
        System.out.println(r1.capacity);
        System.out.println(r1.type);
        System.out.println(r1.doors);
        System.out.println(r1.inverterTechnology);
        System.out.println(r1.energyRating);
        System.out.println(r1.frostFree);
        System.out.println(r1.weight);
        System.out.println(r1.powerConsumption);

    }
}