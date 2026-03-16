class ShoeRunner {

    public static void main(String[] args) {

        Shoe s1 = new Shoe("Nike","AirMax","Black",7000,
                           9,"Sports","Leather",0.9,
                           false,"Rubber","Standard","Men");

        System.out.println(s1.brand);
        System.out.println(s1.model);
        System.out.println(s1.color);
        System.out.println(s1.price);
        System.out.println(s1.size);
        System.out.println(s1.type);
        System.out.println(s1.material);
        System.out.println(s1.weight);
        System.out.println(s1.waterproof);
        System.out.println(s1.soleType);
        System.out.println(s1.laceType);
        System.out.println(s1.gender);

    }
}