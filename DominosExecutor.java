class DominosExecutor {

    public static void main(String[] args) {

        String foodName = "Chicken Burger Style Pizza";

        double ref = Dominos.getFoodPrice(foodName);

        System.out.println("The Price of the Food " + foodName + " is : " + ref);
    }
}
