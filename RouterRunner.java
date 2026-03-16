class RouterRunner {

    public static void main(String[] args) {

        Router r1 = new Router("TP-Link","Archer C6","Black",3500,
                               4,"Dual Band",1200,true,4,
                               true,0.6,"WPA2");

        System.out.println(r1.brand);
        System.out.println(r1.model);
        System.out.println(r1.color);
        System.out.println(r1.price);
        System.out.println(r1.numberOfAntennas);
        System.out.println(r1.frequencyBand);
        System.out.println(r1.maxSpeed);
        System.out.println(r1.dualBand);
        System.out.println(r1.lanPorts);
        System.out.println(r1.wifiSupport);
        System.out.println(r1.weight);
        System.out.println(r1.securityType);

    }
}