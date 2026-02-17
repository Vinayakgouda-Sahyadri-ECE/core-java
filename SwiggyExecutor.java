class SwiggyExecutor {

    public static void main(String[] args) {

        String foodName = "Butter Chicken";

        double ref = Swiggy.getFoodPrice(foodName);

        System.out.println("The Price of the Food " + foodName + " is : " + ref);
    }
}
