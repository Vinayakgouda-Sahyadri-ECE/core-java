class HelmetRunner {

    public static void main(String[] args) {

        Helmet h1 = new Helmet("Studds","Thunder","Black",2000,
                               "Full Face","Fiber",1.4,true,
                               true,"Medium",true,"Glossy");

        System.out.println(h1.brand);
        System.out.println(h1.model);
        System.out.println(h1.color);
        System.out.println(h1.price);
        System.out.println(h1.type);
        System.out.println(h1.material);
        System.out.println(h1.weight);
        System.out.println(h1.visor);
        System.out.println(h1.ventilation);
        System.out.println(h1.size);
        System.out.println(h1.isiCertified);
        System.out.println(h1.finish);

    }
}