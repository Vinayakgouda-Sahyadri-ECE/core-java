class PhoneRunner {

    public static void main(String[] args) {

        Phone p1 = new Phone("Samsung","S23","Black",80000,256,5000,6.5,"Snapdragon",12,"Android",108,true);

        System.out.println(p1.brand);
        System.out.println(p1.model);
        System.out.println(p1.color);
        System.out.println(p1.price);
        System.out.println(p1.storage);
        System.out.println(p1.battery);
        System.out.println(p1.screenSize);
        System.out.println(p1.processor);
        System.out.println(p1.ram);
        System.out.println(p1.os);
        System.out.println(p1.camera);
        System.out.println(p1.dualSim);

    }
}