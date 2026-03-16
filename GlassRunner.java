class GlassRunner {

    public static void main(String[] args) {

        Glass g1 = new Glass("Milton","Drinking","Transparent",200,
                             "Glass",300,12.0,6.5,0.3,
                             true,true,"Round");

        System.out.println(g1.brand);
        System.out.println(g1.type);
        System.out.println(g1.color);
        System.out.println(g1.price);
        System.out.println(g1.material);
        System.out.println(g1.capacity);
        System.out.println(g1.height);
        System.out.println(g1.diameter);
        System.out.println(g1.weight);
        System.out.println(g1.transparent);
        System.out.println(g1.reusable);
        System.out.println(g1.shape);

    }
}