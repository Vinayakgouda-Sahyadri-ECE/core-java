class FoodPandaExecutor {

    public static void main(String[] args) {

        String foodName = "Paneer Dum Rice";

        double ref = FoodPanda.getFoodPrice(foodName);

        System.out.println("The Price of the Food " + foodName + " is : " + ref);
    }
}
