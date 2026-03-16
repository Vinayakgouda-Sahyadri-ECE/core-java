class CameraRunner {

    public static void main(String[] args) {

        Camera c1 = new Camera("Canon","EOS 1500D",45000,24,"Black","Wide",true,1200,"CMOS",0.7,true,true);

        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.price);
        System.out.println(c1.megapixel);
        System.out.println(c1.color);
        System.out.println(c1.lensType);
        System.out.println(c1.flash);
        System.out.println(c1.battery);
        System.out.println(c1.sensorType);
        System.out.println(c1.weight);
        System.out.println(c1.wifi);
        System.out.println(c1.videoSupport);

    }
}