class ZomatoExecutor {

    public static void main(String[] args) {

        String foodName = "Jalebi";

        double ref = Zomato.search(foodName);

        System.out.println("The Price of the Food " + foodName + " is : " + ref);
    }
}
