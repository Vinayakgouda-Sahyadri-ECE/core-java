class BottleRunner {

    public static void main(String[] args) {

        Bottle b1 = new Bottle("Milton","Blue",500,1.0,"Steel",true,0.5,"Round",true,"Screw",25.0,7.0);

        System.out.println(b1.brand);
        System.out.println(b1.color);
        System.out.println(b1.price);
        System.out.println(b1.capacity);
        System.out.println(b1.material);
        System.out.println(b1.insulated);
        System.out.println(b1.weight);
        System.out.println(b1.shape);
        System.out.println(b1.leakProof);
        System.out.println(b1.capType);
        System.out.println(b1.height);
        System.out.println(b1.diameter);

    }
}