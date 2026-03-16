class PrinterRunner {

    public static void main(String[] args) {

        Printer p1 = new Printer("HP","LaserJet Pro","White",15000,
                                 "Laser",true,"WiFi",20,
                                 "Laser",true,7.5,250);

        System.out.println(p1.brand);
        System.out.println(p1.model);
        System.out.println(p1.color);
        System.out.println(p1.price);
        System.out.println(p1.type);
        System.out.println(p1.wireless);
        System.out.println(p1.connectionType);
        System.out.println(p1.printSpeed);
        System.out.println(p1.printTechnology);
        System.out.println(p1.duplexPrinting);
        System.out.println(p1.weight);
        System.out.println(p1.paperCapacity);

    }
}