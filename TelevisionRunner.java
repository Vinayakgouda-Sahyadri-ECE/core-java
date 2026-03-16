class TelevisionRunner {

    public static void main(String[] args) {

        Television t1 = new Television("Sony","Bravia","Black",60000,
                                       55.0,"4K","LED",true,
                                       3,2,120,15.5);

        System.out.println(t1.brand);
        System.out.println(t1.model);
        System.out.println(t1.color);
        System.out.println(t1.price);
        System.out.println(t1.screenSize);
        System.out.println(t1.resolution);
        System.out.println(t1.displayType);
        System.out.println(t1.smartTV);
        System.out.println(t1.hdmiPorts);
        System.out.println(t1.usbPorts);
        System.out.println(t1.powerConsumption);
        System.out.println(t1.weight);

    }
}