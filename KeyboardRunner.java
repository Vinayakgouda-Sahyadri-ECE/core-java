class KeyboardRunner {

    public static void main(String[] args) {

        Keyboard k1 = new Keyboard("Logitech","K380","Black",3000,
                                   "Mechanical",true,"Bluetooth",
                                   104,true,"QWERTY",0.75,"Plastic");

        System.out.println(k1.brand);
        System.out.println(k1.model);
        System.out.println(k1.color);
        System.out.println(k1.price);
        System.out.println(k1.type);
        System.out.println(k1.wireless);
        System.out.println(k1.connectionType);
        System.out.println(k1.numberOfKeys);
        System.out.println(k1.backlight);
        System.out.println(k1.layout);
        System.out.println(k1.weight);
        System.out.println(k1.material);

    }
}