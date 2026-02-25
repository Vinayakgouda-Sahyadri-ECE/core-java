class FoodPanda{

	public static double search(String foodName){
		double price = 0.0;

		if(foodName == "TandooriRoti"){
			price = 25.00;
			 
		}else if(foodName == "ButterKulcha"){
			price = 35.00;
			 
		}else if(foodName == "PlainKulcha"){
			price = 30.00;
			 
		}else if(foodName == "StuffedKulcha"){
			price = 60.00;
			 
		}else if(foodName == "CholeBhature"){
			price = 120.00;
			 
		}else if(foodName == "RajmaCurry"){
			price = 110.00;
			 
		}else if(foodName == "KadhiChawal"){
			price = 100.00;
			 
		}else if(foodName == "JeeraRoti"){
			price = 30.00;
			 
		}else if(foodName == "PlainNaan"){
			price = 35.00;
			 
		}else if(foodName == "ButterNaanSpecial"){
			price = 45.00;
			 
		}else if(foodName == "GarlicNaan"){
			price = 50.00;
			 
		}else if(foodName == "LachhaParatha"){
			price = 55.00;
			 
		}else if(foodName == "MethiParatha"){
			price = 60.00;
			 
		}else if(foodName == "PalakParatha"){
			price = 65.00;
			 
		}else if(foodName == "CornParatha"){
			price = 70.00;
			 
		}else if(foodName == "VegetableKorma"){
			price = 130.00;
			 
		}else if(foodName == "MalaiKofta"){
			price = 150.00;
			 
		}else if(foodName == "ShahiPaneer"){
			price = 170.00;
			 
		}else if(foodName == "ChanaMasala"){
			price = 120.00;
			 
		}else if(foodName == "BhindiMasala"){
			price = 110.00;
			 
		}else if(foodName == "AlooGobi"){
			price = 105.00;
			 
		}else if(foodName == "BainganBharta"){
			price = 115.00;
			 
		}else if(foodName == "MatarPaneer"){
			price = 160.00;
			 
		}else if(foodName == "VegetableFriedRiceSpecial"){
			price = 140.00;
			 
		}else if(foodName == "HakkaNoodlesVeg"){
			price = 130.00;
			 
		}else if(foodName == "HakkaNoodlesChicken"){
			price = 160.00;
			 
		}else if(foodName == "SchezwanRice"){
			price = 150.00;
			 
		}else if(foodName == "SchezwanNoodles"){
			price = 145.00;
			 
		}else if(foodName == "VegManchowSoup"){
			price = 90.00;
			 
		}else if(foodName == "ChickenManchowSoup"){
			price = 110.00;
			 
		}else if(foodName == "HotAndSourSoup"){
			price = 95.00;
			 
		}else if(foodName == "VegSpringRolls"){
			price = 120.00;
			 
		}else if(foodName == "ChickenSpringRolls"){
			price = 150.00;
			 
		}else if(foodName == "ChilliPaneer"){
			price = 170.00;
			 
		}else if(foodName == "ChilliChicken"){
			price = 190.00;
			 
		}else if(foodName == "VegFriedMoments"){
			price = 100.00;
			 
		}else if(foodName == "ChickenFriedMoments"){
			price = 130.00;
			 
		}else if(foodName == "PlainIceCreamCup"){
			price = 35.00;
			 
		}else if(foodName == "MangoIceCreamCup"){
			price = 40.00;
			 
		}else if(foodName == "PistaIceCreamCup"){
			price = 45.00;
			 
		}else if(foodName == "ChocolateIceCreamCup"){
			price = 50.00;
			 
		}else if(foodName == "VanillaMilkshake"){
			price = 60.00;
			 
		}else if(foodName == "RoseMilk"){
			price = 55.00;
			 
		}else if(foodName == "BadamShake"){
			price = 75.00;
			 
		}else if(foodName == "MosambiJuice"){
			price = 50.00;
			 
		}else if(foodName == "CarrotJuice"){
			price = 45.00;
			 
		}else if(foodName == "BeetrootJuice"){
			price = 45.00;
			 
		}else if(foodName == "TenderCoconutWater"){
			price = 40.00;
			 
		}else if(foodName == "PlainMilk"){
			price = 25.00;
			 
		}else if(foodName == "HotMilk"){
			price = 30.00;
			 
		}else if(foodName == "BlackCoffee"){
			price = 35.00;
			 
		}else if(foodName == "GreenTea"){
			price = 30.00;
			 
		}else if(foodName == "LemonTea"){
			price = 35.00;
			 
		}else if(foodName == "HoneyMilk"){
			price = 40.00;
			 
		}else if(foodName == "SugarFreeCoffee"){
			price = 45.00;
			 
		}else{
			System.out.println("There is no food found which you have searched");
		}

		return price;
	}
	
	public static double search(String foodName, int quantity){

	double price = 0.0;

	if(foodName == "TandooriRoti"){
		price = 25.00 * quantity;
		 
	}else if(foodName == "ButterKulcha"){
		price = 35.00 * quantity;
		 
	}else if(foodName == "PlainKulcha"){
		price = 30.00 * quantity;
		 
	}else if(foodName == "StuffedKulcha"){
		price = 60.00 * quantity;
		 
	}else if(foodName == "CholeBhature"){
		price = 120.00 * quantity;
		 
	}else if(foodName == "RajmaCurry"){
		price = 110.00 * quantity;
		 
	}else if(foodName == "KadhiChawal"){
		price = 100.00 * quantity;
		 
	}else if(foodName == "JeeraRoti"){
		price = 30.00 * quantity;
		 
	}else if(foodName == "PlainNaan"){
		price = 35.00 * quantity;
		 
	}else if(foodName == "ButterNaanSpecial"){
		price = 45.00 * quantity;
		 
	}else if(foodName == "GarlicNaan"){
		price = 50.00 * quantity;
		 
	}else if(foodName == "LachhaParatha"){
		price = 55.00 * quantity;
		 
	}else if(foodName == "MethiParatha"){
		price = 60.00 * quantity;
		 
	}else if(foodName == "PalakParatha"){
		price = 65.00 * quantity;
		 
	}else if(foodName == "CornParatha"){
		price = 70.00 * quantity;
		 
	}else if(foodName == "VegetableKorma"){
		price = 130.00 * quantity;
		 
	}else if(foodName == "MalaiKofta"){
		price = 150.00 * quantity;
		 
	}else if(foodName == "ShahiPaneer"){
		price = 170.00 * quantity;
		 
	}else if(foodName == "ChanaMasala"){
		price = 120.00 * quantity;
		 
	}else if(foodName == "BhindiMasala"){
		price = 110.00 * quantity;
		 
	}else if(foodName == "AlooGobi"){
		price = 105.00 * quantity;
		 
	}else if(foodName == "BainganBharta"){
		price = 115.00 * quantity;
		 
	}else if(foodName == "MatarPaneer"){
		price = 160.00 * quantity;
		 
	}else if(foodName == "VegetableFriedRiceSpecial"){
		price = 140.00 * quantity;
		 
	}else if(foodName == "HakkaNoodlesVeg"){
		price = 130.00 * quantity;
		 
	}else if(foodName == "HakkaNoodlesChicken"){
		price = 160.00 * quantity;
		 
	}else if(foodName == "SchezwanRice"){
		price = 150.00 * quantity;
		 
	}else if(foodName == "SchezwanNoodles"){
		price = 145.00 * quantity;
		 
	}else if(foodName == "VegManchowSoup"){
		price = 90.00 * quantity;
		 
	}else if(foodName == "ChickenManchowSoup"){
		price = 110.00 * quantity;
		 
	}else if(foodName == "HotAndSourSoup"){
		price = 95.00 * quantity;
		 
	}else if(foodName == "VegSpringRolls"){
		price = 120.00 * quantity;
		 
	}else if(foodName == "ChickenSpringRolls"){
		price = 150.00 * quantity;
		 
	}else if(foodName == "ChilliPaneer"){
		price = 170.00 * quantity;
		 
	}else if(foodName == "ChilliChicken"){
		price = 190.00 * quantity;
		 
	}else if(foodName == "VegFriedMoments"){
		price = 100.00 * quantity;
		 
	}else if(foodName == "ChickenFriedMoments"){
		price = 130.00 * quantity;
		 
	}else if(foodName == "PlainIceCreamCup"){
		price = 35.00 * quantity;
		 
	}else if(foodName == "MangoIceCreamCup"){
		price = 40.00 * quantity;
		 
	}else if(foodName == "PistaIceCreamCup"){
		price = 45.00 * quantity;
		 
	}else if(foodName == "ChocolateIceCreamCup"){
		price = 50.00 * quantity;
		 
	}else if(foodName == "VanillaMilkshake"){
		price = 60.00 * quantity;
		 
	}else if(foodName == "RoseMilk"){
		price = 55.00 * quantity;
		 
	}else if(foodName == "BadamShake"){
		price = 75.00 * quantity;
		 
	}else if(foodName == "MosambiJuice"){
		price = 50.00 * quantity;
		 
	}else if(foodName == "CarrotJuice"){
		price = 45.00 * quantity;
		 
	}else if(foodName == "BeetrootJuice"){
		price = 45.00 * quantity;
		 
	}else if(foodName == "TenderCoconutWater"){
		price = 40.00 * quantity;
		 
	}else if(foodName == "PlainMilk"){
		price = 25.00 * quantity;
		 
	}else if(foodName == "HotMilk"){
		price = 30.00 * quantity;
		 
	}else if(foodName == "BlackCoffee"){
		price = 35.00 * quantity;
		 
	}else if(foodName == "GreenTea"){
		price = 30.00 * quantity;
		 
	}else if(foodName == "LemonTea"){
		price = 35.00 * quantity;
		 
	}else if(foodName == "HoneyMilk"){
		price = 40.00 * quantity;
		 
	}else if(foodName == "SugarFreeCoffee"){
		price = 45.00 * quantity;
		 
	}else{
		System.out.println("There is no food found which you have searched");
	}

	return price;
}
}
