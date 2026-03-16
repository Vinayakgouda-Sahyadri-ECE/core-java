class MouseRunner {

    public static void main(String[] args) {

        Mouse m1 = new Mouse("Logitech","G102","Black",1500,
                             "Gaming",false,"USB",8000,6,
                             true,0.09,"Plastic");

        System.out.println(m1.brand);
        System.out.println(m1.model);
        System.out.println(m1.color);
        System.out.println(m1.price);
        System.out.println(m1.type);
        System.out.println(m1.wireless);
        System.out.println(m1.connectionType);
        System.out.println(m1.dpi);
        System.out.println(m1.buttons);
        System.out.println(m1.rgb);
        System.out.println(m1.weight);
        System.out.println(m1.material);

    }
}