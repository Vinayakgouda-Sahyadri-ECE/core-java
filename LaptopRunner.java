class LaptopRunner {

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Dell","XPS15","Silver",120000,16,512,"Intel i7",15.6,"Windows 11",6000,true,1);

        System.out.println(l1.brand);
        System.out.println(l1.model);
        System.out.println(l1.color);
        System.out.println(l1.price);
        System.out.println(l1.ram);
        System.out.println(l1.storage);
        System.out.println(l1.processor);
        System.out.println(l1.screenSize);
        System.out.println(l1.os);
        System.out.println(l1.battery);
        System.out.println(l1.fingerprint);
        System.out.println(l1.weight);

    }
}