class Swiggy{

	public static double search(String foodName){
		double price = 0.0;

		if(foodName == "Samosa"){
			price = 20.00;
			  
		}else if(foodName == "Kachori"){
			price = 25.00;
			  
		}else if(foodName == "PaniPuri"){
			price = 30.00;
			  
		}else if(foodName == "BhelPuri"){
			price = 35.00;
			  
		}else if(foodName == "SevPuri"){
			price = 40.00;
			  
		}else if(foodName == "DahiPuri"){
			price = 45.00;
			  
		}else if(foodName == "AlooTikki"){
			price = 30.00;
			  
		}else if(foodName == "PavBhaji"){
			price = 90.00;
			  
		}else if(foodName == "VadaPav"){
			price = 25.00;
			  
		}else if(foodName == "MisalPav"){
			price = 80.00;
			  
		}else if(foodName == "Dhokla"){
			price = 50.00;
			  
		}else if(foodName == "Khaman"){
			price = 45.00;
			  
		}else if(foodName == "Thepla"){
			price = 40.00;
			  
		}else if(foodName == "Handvo"){
			price = 60.00;
			  
		}else if(foodName == "Fafda"){
			price = 55.00;
			  
		}else if(foodName == "Jalebi"){
			price = 50.00;
			  
		}else if(foodName == "Rasgulla"){
			price = 35.00;
			  
		}else if(foodName == "GulabJamun"){
			price = 40.00;
			  
		}else if(foodName == "KajuKatli"){
			price = 70.00;
			  
		}else if(foodName == "Laddu"){
			price = 30.00;
			  
		}else if(foodName == "Barfi"){
			price = 45.00;
			  
		}else if(foodName == "Brownie"){
			price = 60.00;
			  
		}else if(foodName == "CupCake"){
			price = 40.00;
			  
		}else if(foodName == "Donut"){
			price = 50.00;
			  
		}else if(foodName == "Sandwich"){
			price = 70.00;
			  
		}else if(foodName == "GrilledSandwich"){
			price = 90.00;
			  
		}else if(foodName == "ClubSandwich"){
			price = 110.00;
			  
		}else if(foodName == "FrenchFries"){
			price = 80.00;
			  
		}else if(foodName == "CheeseBalls"){
			price = 100.00;
			  
		}else if(foodName == "Nachos"){
			price = 120.00;
			  
		}else if(foodName == "Popcorn"){
			price = 60.00;
			  
		}else if(foodName == "Chips"){
			price = 30.00;
			  
		}else if(foodName == "Peanuts"){
			price = 25.00;
			  
		}else if(foodName == "Cashews"){
			price = 90.00;
			  
		}else if(foodName == "Almonds"){
			price = 100.00;
			  
		}else if(foodName == "Pista"){
			price = 110.00;
			  
		}else if(foodName == "Apple"){
			price = 40.00;
			  
		}else if(foodName == "Banana"){
			price = 10.00;
			  
		}else if(foodName == "Orange"){
			price = 30.00;
			  
		}else if(foodName == "Grapes"){
			price = 50.00;
			  
		}else if(foodName == "Watermelon"){
			price = 35.00;
			  
		}else if(foodName == "Pineapple"){
			price = 45.00;
			  
		}else if(foodName == "Papaya"){
			price = 30.00;
			  
		}else if(foodName == "Guava"){
			price = 25.00;
			  
		}else if(foodName == "CustardApple"){
			price = 60.00;
			  
		}else if(foodName == "DragonFruit"){
			price = 120.00;
			  
		}else if(foodName == "IceCreamVanilla"){
			price = 40.00;
			  
		}else if(foodName == "IceCreamChocolate"){
			price = 45.00;
			  
		}else if(foodName == "IceCreamStrawberry"){
			price = 45.00;
			  
		}else if(foodName == "Falooda"){
			price = 90.00;
			  
		}else if(foodName == "MilkCake"){
			price = 70.00;
			  
		}else if(foodName == "Halwa"){
			price = 60.00;
			  
		}else if(foodName == "Khichdi"){
			price = 80.00;
			  
		}else if(foodName == "Momos"){
			price = 100.00;
			  
		}else if(foodName == "SpringRoll"){
			price = 110.00;
			  
		}else{
			System.out.println("There is no food found which you have searched");
		}

		return price;
	}
	
	public static double search(String foodName, int quantity){

	double price = 0.0;

	if(foodName == "Samosa"){
		price = 20.00 * quantity;
		  
	}else if(foodName == "Kachori"){
		price = 25.00 * quantity;
		  
	}else if(foodName == "PaniPuri"){
		price = 30.00 * quantity;
		  
	}else if(foodName == "BhelPuri"){
		price = 35.00 * quantity;
		  
	}else if(foodName == "SevPuri"){
		price = 40.00 * quantity;
		  
	}else if(foodName == "DahiPuri"){
		price = 45.00 * quantity;
		  
	}else if(foodName == "AlooTikki"){
		price = 30.00 * quantity;
		  
	}else if(foodName == "PavBhaji"){
		price = 90.00 * quantity;
		  
	}else if(foodName == "VadaPav"){
		price = 25.00 * quantity;
		  
	}else if(foodName == "MisalPav"){
		price = 80.00 * quantity;
		  
	}else if(foodName == "Dhokla"){
		price = 50.00 * quantity;
		  
	}else if(foodName == "Khaman"){
		price = 45.00 * quantity;
		  
	}else if(foodName == "Thepla"){
		price = 40.00 * quantity;
		  
	}else if(foodName == "Handvo"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "Fafda"){
		price = 55.00 * quantity;
		  
	}else if(foodName == "Jalebi"){
		price = 50.00 * quantity;
		  
	}else if(foodName == "Rasgulla"){
		price = 35.00 * quantity;
		  
	}else if(foodName == "GulabJamun"){
		price = 40.00 * quantity;
		  
	}else if(foodName == "KajuKatli"){
		price = 70.00 * quantity;
		  
	}else if(foodName == "Laddu"){
		price = 30.00 * quantity;
		  
	}else if(foodName == "Barfi"){
		price = 45.00 * quantity;
		  
	}else if(foodName == "Brownie"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "CupCake"){
		price = 40.00 * quantity;
		  
	}else if(foodName == "Donut"){
		price = 50.00 * quantity;
		  
	}else if(foodName == "Sandwich"){
		price = 70.00 * quantity;
		  
	}else if(foodName == "GrilledSandwich"){
		price = 90.00 * quantity;
		  
	}else if(foodName == "ClubSandwich"){
		price = 110.00 * quantity;
		  
	}else if(foodName == "FrenchFries"){
		price = 80.00 * quantity;
		  
	}else if(foodName == "CheeseBalls"){
		price = 100.00 * quantity;
		  
	}else if(foodName == "Nachos"){
		price = 120.00 * quantity;
		  
	}else if(foodName == "Popcorn"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "Chips"){
		price = 30.00 * quantity;
		  
	}else if(foodName == "Peanuts"){
		price = 25.00 * quantity;
		  
	}else if(foodName == "Cashews"){
		price = 90.00 * quantity;
		  
	}else if(foodName == "Almonds"){
		price = 100.00 * quantity;
		  
	}else if(foodName == "Pista"){
		price = 110.00 * quantity;
		  
	}else if(foodName == "Apple"){
		price = 40.00 * quantity;
		  
	}else if(foodName == "Banana"){
		price = 10.00 * quantity;
		  
	}else if(foodName == "Orange"){
		price = 30.00 * quantity;
		  
	}else if(foodName == "Grapes"){
		price = 50.00 * quantity;
		  
	}else if(foodName == "Watermelon"){
		price = 35.00 * quantity;
		  
	}else if(foodName == "Pineapple"){
		price = 45.00 * quantity;
		  
	}else if(foodName == "Papaya"){
		price = 30.00 * quantity;
		  
	}else if(foodName == "Guava"){
		price = 25.00 * quantity;
		  
	}else if(foodName == "CustardApple"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "DragonFruit"){
		price = 120.00 * quantity;
		  
	}else if(foodName == "IceCreamVanilla"){
		price = 40.00 * quantity;
		  
	}else if(foodName == "IceCreamChocolate"){
		price = 45.00 * quantity;
		  
	}else if(foodName == "IceCreamStrawberry"){
		price = 45.00 * quantity;
		  
	}else if(foodName == "Falooda"){
		price = 90.00 * quantity;
		  
	}else if(foodName == "MilkCake"){
		price = 70.00 * quantity;
		  
	}else if(foodName == "Halwa"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "Khichdi"){
		price = 80.00 * quantity;
		  
	}else if(foodName == "Momos"){
		price = 100.00 * quantity;
		  
	}else if(foodName == "SpringRoll"){
		price = 110.00 * quantity;
		  
	}else{
		System.out.println("There is no food found which you have searched");
	}

	return price;
}
}
