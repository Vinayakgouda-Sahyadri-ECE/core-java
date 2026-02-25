class Zomato{
	
	public static double search(String foodName){
		double price = 0.0;

		if(foodName == "MasalaDose"){
			price = 92.56;
			  
		}else if(foodName == "Idli"){
			price = 40.00;
			  
		}else if(foodName == "Vada"){
			price = 35.00;
			  
		}else if(foodName == "Poori"){
			price = 60.00;
			  
		}else if(foodName == "Upma"){
			price = 50.00;
			  
		}else if(foodName == "Pongal"){
			price = 70.00;
			  
		}else if(foodName == "BisibeleBath"){
			price = 80.00;
			  
		}else if(foodName == "TomatoRice"){
			price = 75.00;
			  
		}else if(foodName == "CurdRice"){
			price = 65.00;
			  
		}else if(foodName == "VegMeals"){
			price = 120.00;
			  
		}else if(foodName == "ChickenMeals"){
			price = 180.00;
			  
		}else if(foodName == "Biriyani"){
			price = 160.45;
			  
		}else if(foodName == "ChickenBiriyani"){
			price = 190.00;
			  
		}else if(foodName == "MuttonBiriyani"){
			price = 250.00;
			  
		}else if(foodName == "EggBiriyani"){
			price = 140.00;
			  
		}else if(foodName == "VegBiriyani"){
			price = 130.00;
			  
		}else if(foodName == "Noodles"){
			price = 120.00;
			  
		}else if(foodName == "FriedRice"){
			price = 130.00;
			  
		}else if(foodName == "ChickenFriedRice"){
			price = 160.45;
			  
		}else if(foodName == "PaneerButterMasala"){
			price = 170.00;
			  
		}else if(foodName == "ButterNaan"){
			price = 40.00;
			  
		}else if(foodName == "Roti"){
			price = 20.00;
			  
		}else if(foodName == "ChickenKabab"){
			price = 100.00;
			  
		}else if(foodName == "ChickenLolipop"){
			price = 160.45;
			  
		}else if(foodName == "GobiManchurian"){
			price = 110.00;
			  
		}else if(foodName == "PaneerTikka"){
			price = 190.00;
			  
		}else if(foodName == "SambarRice"){
			price = 85.00;
			  
		}else if(foodName == "RasamRice"){
			price = 80.00;
			  
		}else if(foodName == "LemonRice"){
			price = 70.00;
			  
		}else if(foodName == "Puliyogare"){
			price = 75.00;
			  
		}else if(foodName == "Chapathi"){
			price = 25.00;
			  
		}else if(foodName == "Parotta"){
			price = 35.00;
			  
		}else if(foodName == "ChickenCurry"){
			price = 180.00;
			  
		}else if(foodName == "MuttonCurry"){
			price = 260.00;
			  
		}else if(foodName == "DalTadka"){
			price = 120.00;
			  
		}else if(foodName == "PalakPaneer"){
			price = 170.00;
			  
		}else if(foodName == "FishFry"){
			price = 220.00;
			  
		}else if(foodName == "PrawnMasala"){
			price = 240.00;
			  
		}else if(foodName == "EggCurry"){
			price = 130.00;
			  
		}else if(foodName == "VegSoup"){
			price = 60.00;
			  
		}else if(foodName == "ChickenSoup"){
			price = 90.00;
			  
		}else if(foodName == "TomatoSoup"){
			price = 70.00;
			  
		}else if(foodName == "ChoclateShake"){
			price = 40.00;
			  
		}else if(foodName == "VanillaShake"){
			price = 50.00;
			  
		}else if(foodName == "StrawberryShake"){
			price = 55.00;
			  
		}else if(foodName == "MangoShake"){
			price = 60.00;
			  
		}else if(foodName == "ColdCoffee"){
			price = 65.00;
			  
		}else if(foodName == "Lassi"){
			price = 45.00;
			  
		}else if(foodName == "Buttermilk"){
			price = 30.00;
			  
		}else if(foodName == "FreshLimeJuice"){
			price = 35.00;
			  
		}else if(foodName == "WaterBottle"){
			price = 20.00;
			  
		}else if(foodName == "Tea"){
			price = 15.00;
			  
		}else if(foodName == "Coffee"){
			price = 25.00;
			  
		}else if(foodName == "BadamMilk"){
			price = 50.00;
			  
		}else{
			System.out.println("There is no food found which you have searched");
		}
		
		return price; 
	}
	
	public static double search(String foodName, int quantity){

	double price = 0.0;

	if(foodName == "MasalaDose"){
		price = 92.56 * quantity;
		  
	}else if(foodName == "Idli"){
		price = 40.00 * quantity;
		  
	}else if(foodName == "Vada"){
		price = 35.00 * quantity;
		  
	}else if(foodName == "Poori"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "Upma"){
		price = 50.00 * quantity;
		  
	}else if(foodName == "Pongal"){
		price = 70.00 * quantity;
		  
	}else if(foodName == "BisibeleBath"){
		price = 80.00 * quantity;
		  
	}else if(foodName == "TomatoRice"){
		price = 75.00 * quantity;
		  
	}else if(foodName == "CurdRice"){
		price = 65.00 * quantity;
		  
	}else if(foodName == "VegMeals"){
		price = 120.00 * quantity;
		  
	}else if(foodName == "ChickenMeals"){
		price = 180.00 * quantity;
		  
	}else if(foodName == "Biriyani"){
		price = 160.45 * quantity;
		  
	}else if(foodName == "ChickenBiriyani"){
		price = 190.00 * quantity;
		  
	}else if(foodName == "MuttonBiriyani"){
		price = 250.00 * quantity;
		  
	}else if(foodName == "EggBiriyani"){
		price = 140.00 * quantity;
		  
	}else if(foodName == "VegBiriyani"){
		price = 130.00 * quantity;
		  
	}else if(foodName == "Noodles"){
		price = 120.00 * quantity;
		  
	}else if(foodName == "FriedRice"){
		price = 130.00 * quantity;
		  
	}else if(foodName == "ChickenFriedRice"){
		price = 160.45 * quantity;
		  
	}else if(foodName == "PaneerButterMasala"){
		price = 170.00 * quantity;
		  
	}else if(foodName == "ButterNaan"){
		price = 40.00 * quantity;
		  
	}else if(foodName == "Roti"){
		price = 20.00 * quantity;
		  
	}else if(foodName == "ChickenKabab"){
		price = 100.00 * quantity;
		  
	}else if(foodName == "ChickenLolipop"){
		price = 160.45 * quantity;
		  
	}else if(foodName == "GobiManchurian"){
		price = 110.00 * quantity;
		  
	}else if(foodName == "PaneerTikka"){
		price = 190.00 * quantity;
		  
	}else if(foodName == "SambarRice"){
		price = 85.00 * quantity;
		  
	}else if(foodName == "RasamRice"){
		price = 80.00 * quantity;
		  
	}else if(foodName == "LemonRice"){
		price = 70.00 * quantity;
		  
	}else if(foodName == "Puliyogare"){
		price = 75.00 * quantity;
		  
	}else if(foodName == "Chapathi"){
		price = 25.00 * quantity;
		  
	}else if(foodName == "Parotta"){
		price = 35.00 * quantity;
		  
	}else if(foodName == "ChickenCurry"){
		price = 180.00 * quantity;
		  
	}else if(foodName == "MuttonCurry"){
		price = 260.00 * quantity;
		  
	}else if(foodName == "DalTadka"){
		price = 120.00 * quantity;
		  
	}else if(foodName == "PalakPaneer"){
		price = 170.00 * quantity;
		  
	}else if(foodName == "FishFry"){
		price = 220.00 * quantity;
		  
	}else if(foodName == "PrawnMasala"){
		price = 240.00 * quantity;
		  
	}else if(foodName == "EggCurry"){
		price = 130.00 * quantity;
		  
	}else if(foodName == "VegSoup"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "ChickenSoup"){
		price = 90.00 * quantity;
		  
	}else if(foodName == "TomatoSoup"){
		price = 70.00 * quantity;
		  
	}else if(foodName == "ChoclateShake"){
		price = 40.00 * quantity;
		  
	}else if(foodName == "VanillaShake"){
		price = 50.00 * quantity;
		  
	}else if(foodName == "StrawberryShake"){
		price = 55.00 * quantity;
		  
	}else if(foodName == "MangoShake"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "ColdCoffee"){
		price = 65.00 * quantity;
		  
	}else if(foodName == "Lassi"){
		price = 45.00 * quantity;
		  
	}else if(foodName == "Buttermilk"){
		price = 30.00 * quantity;
		  
	}else if(foodName == "FreshLimeJuice"){
		price = 35.00 * quantity;
		  
	}else if(foodName == "WaterBottle"){
		price = 20.00 * quantity;
		  
	}else if(foodName == "Tea"){
		price = 15.00 * quantity;
		  
	}else if(foodName == "Coffee"){
		price = 25.00 * quantity;
		  
	}else if(foodName == "BadamMilk"){
		price = 50.00 * quantity;
		  
	}else{
		System.out.println("There is no food found which you have searched");
	}

	return price;
}
}
