class ZeptoExecutor {

    public static void main(String[] args) {

        String foodName = "Tomato Sauce";

        double ref = Zepto.getFoodPrice(foodName);

        System.out.println("The Price of the Food " + foodName + " is : " + ref);
    }
}
