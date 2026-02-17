class UberEatsExecutor {

    public static void main(String[] args) {

        String foodName = "Corn Cheese Sandwich";

        double ref = UberEats.getFoodPrice(foodName);

        System.out.println("The Price of the Food " + foodName + " is : " + ref);
    }
}
