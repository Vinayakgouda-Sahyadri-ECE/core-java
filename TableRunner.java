class TableRunner {

    public static void main(String[] args) {

        Table t1 = new Table("Ikea","White",5000,"Wood",120,60,75,15.0,"Rectangle",4,false,"Dining");

        System.out.println(t1.brand);
        System.out.println(t1.color);
        System.out.println(t1.price);
        System.out.println(t1.material);
        System.out.println(t1.length);
        System.out.println(t1.width);
        System.out.println(t1.height);
        System.out.println(t1.weight);
        System.out.println(t1.shape);
        System.out.println(t1.legs);
        System.out.println(t1.foldable);
        System.out.println(t1.type);

    }
}