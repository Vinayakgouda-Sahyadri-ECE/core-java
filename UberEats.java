class UberEats {

    public static double getFoodPrice(String foodName) {

        double price = 0.0;

        if (foodName == "Paneer Sandwich") {
            price = 140;
            return price;

        } else if (foodName == "Corn Cheese Sandwich") {
            price = 160;
            return price;

        } else if (foodName == "BBQ Chicken Sandwich") {
            price = 190;
            return price;

        } else if (foodName == "Mexican Veg Burger") {
            price = 150;
            return price;

        } else if (foodName == "BBQ Chicken Burger") {
            price = 180;
            return price;

        } else if (foodName == "Stuffed Aloo Burger") {
            price = 130;
            return price;

        } else if (foodName == "Cheese Burst Pizza Slice") {
            price = 170;
            return price;

        } else if (foodName == "BBQ Chicken Pizza Slice") {
            price = 210;
            return price;

        } else if (foodName == "Mushroom Pizza Slice") {
            price = 160;
            return price;

        } else if (foodName == "Sweet Potato Fries") {
            price = 120;
            return price;

        } else if (foodName == "Masala Fries") {
            price = 100;
            return price;

        } else if (foodName == "Loaded Cheese Fries") {
            price = 150;
            return price;

        } else if (foodName == "Paneer Kathi Roll") {
            price = 170;
            return price;

        } else if (foodName == "Chicken Kathi Roll") {
            price = 200;
            return price;

        } else if (foodName == "Veg Hakka Noodles Special") {
            price = 160;
            return price;

        } else if (foodName == "Chicken Hakka Noodles Special") {
            price = 200;
            return price;

        } else if (foodName == "Schezwan Veg Rice Bowl") {
            price = 170;
            return price;

        } else if (foodName == "Schezwan Chicken Rice Bowl") {
            price = 220;
            return price;

        } else if (foodName == "Paneer Korma") {
            price = 230;
            return price;

        } else if (foodName == "Chicken Korma") {
            price = 260;
            return price;

        } else if (foodName == "Veg Crispy") {
            price = 150;
            return price;

        } else if (foodName == "Chicken Crispy") {
            price = 210;
            return price;

        } else if (foodName == "Veg Momos Fried") {
            price = 130;
            return price;

        } else if (foodName == "Chicken Momos Fried") {
            price = 170;
            return price;

        } else if (foodName == "Chocolate Lava Cake") {
            price = 110;
            return price;

        } else if (foodName == "Choco Fudge Brownie") {
            price = 100;
            return price;

        } else if (foodName == "Red Velvet Pastry") {
            price = 120;
            return price;

        } else if (foodName == "Mini Donut Box") {
            price = 90;
            return price;

        } else if (foodName == "Kulfi Stick") {
            price = 60;
            return price;

        } else if (foodName == "Oreo Milkshake") {
            price = 140;
            return price;

        } else if (foodName == "KitKat Milkshake") {
            price = 150;
            return price;

        } else if (foodName == "Hazelnut Cold Coffee") {
            price = 130;
            return price;

        } else if (foodName == "Cappuccino") {
            price = 90;
            return price;

        } else if (foodName == "Green Apple Juice") {
            price = 80;
            return price;

        } else if (foodName == "Pomegranate Juice") {
            price = 100;
            return price;

        } else if (foodName == "Veg Maharaja Thali") {
            price = 220;
            return price;

        } else if (foodName == "Non Veg Maharaja Thali") {
            price = 280;
            return price;

        } else if (foodName == "Paneer Dum Rice") {
            price = 210;
            return price;

        } else if (foodName == "Chicken Dum Rice") {
            price = 250;
            return price;

        } else if (foodName == "Mutton Dum Rice") {
            price = 300;
            return price;

        } else if (foodName == "Butter Kulcha") {
            price = 40;
            return price;

        } else if (foodName == "Cheese Kulcha") {
            price = 60;
            return price;

        } else if (foodName == "Curd Rice Bowl") {
            price = 90;
            return price;

        } else if (foodName == "Veg Curry Meal") {
            price = 170;
            return price;

        } else if (foodName == "Chicken Curry Meal") {
            price = 230;
            return price;

        } else if (foodName == "Snack Combo Veg") {
            price = 160;
            return price;

        } else if (foodName == "Snack Combo NonVeg") {
            price = 210;
            return price;

        } else if (foodName == "Cheese Corn Balls") {
            price = 110;
            return price;

        } else if (foodName == "Chicken Popcorn") {
            price = 150;
            return price;

        } else if (foodName == "Aloo Cheese Puff") {
            price = 60;
            return price;

        } else if (foodName == "Veg Puff") {
            price = 50;
            return price;

        } else if (foodName == "Chicken Puff") {
            price = 70;
            return price;

        } else {
            System.out.println("The Food Name is Not Found.");
            return price;
        }
    }
}
