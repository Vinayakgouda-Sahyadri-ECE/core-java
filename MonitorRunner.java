class MonitorRunner {

    public static void main(String[] args) {

        Monitor m1 = new Monitor("LG","UltraGear","Black",25000,27.0,"1920x1080",
                                 144,"IPS",false,2,1,4.5);

        System.out.println(m1.brand);
        System.out.println(m1.model);
        System.out.println(m1.color);
        System.out.println(m1.price);
        System.out.println(m1.screenSize);
        System.out.println(m1.resolution);
        System.out.println(m1.refreshRate);
        System.out.println(m1.panelType);
        System.out.println(m1.curved);
        System.out.println(m1.hdmiPorts);
        System.out.println(m1.displayPorts);
        System.out.println(m1.weight);

    }
}