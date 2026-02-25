class Blinkit{

	public static double search(String foodName){
		double price = 0.0;

		if(foodName == "ToorDal1Kg"){
			price = 160.00;
			 
		}else if(foodName == "MoongDal1Kg"){
			price = 150.00;
			 
		}else if(foodName == "UradDal1Kg"){
			price = 170.00;
			 
		}else if(foodName == "MasoorDal1Kg"){
			price = 140.00;
			 
		}else if(foodName == "ChanaDal1Kg"){
			price = 130.00;
			 
		}else if(foodName == "BasmatiRice5Kg"){
			price = 450.00;
			 
		}else if(foodName == "SonaMasooriRice5Kg"){
			price = 380.00;
			 
		}else if(foodName == "WheatFlour5Kg"){
			price = 250.00;
			 
		}else if(foodName == "RagiFlour1Kg"){
			price = 60.00;
			 
		}else if(foodName == "Maida1Kg"){
			price = 55.00;
			 
		}else if(foodName == "Sugar1Kg"){
			price = 45.00;
			 
		}else if(foodName == "Salt1Kg"){
			price = 25.00;
			 
		}else if(foodName == "TurmericPowder100g"){
			price = 30.00;
			 
		}else if(foodName == "ChilliPowder100g"){
			price = 35.00;
			 
		}else if(foodName == "CorianderPowder100g"){
			price = 28.00;
			 
		}else if(foodName == "CuminSeeds100g"){
			price = 40.00;
			 
		}else if(foodName == "MustardSeeds100g"){
			price = 20.00;
			 
		}else if(foodName == "GroundnutOil1L"){
			price = 150.00;
			 
		}else if(foodName == "SunflowerOil1L"){
			price = 140.00;
			 
		}else if(foodName == "CoconutOil1L"){
			price = 180.00;
			 
		}else if(foodName == "Tomato1Kg"){
			price = 30.00;
			 
		}else if(foodName == "Onion1Kg"){
			price = 35.00;
			 
		}else if(foodName == "Potato1Kg"){
			price = 25.00;
			 
		}else if(foodName == "Carrot1Kg"){
			price = 40.00;
			 
		}else if(foodName == "Beans1Kg"){
			price = 60.00;
			 
		}else if(foodName == "Cabbage1Pc"){
			price = 30.00;
			 
		}else if(foodName == "Cauliflower1Pc"){
			price = 35.00;
			 
		}else if(foodName == "Spinach1Bunch"){
			price = 20.00;
			 
		}else if(foodName == "CorianderLeaves1Bunch"){
			price = 10.00;
			 
		}else if(foodName == "GreenChilli250g"){
			price = 15.00;
			 
		}else if(foodName == "Garlic250g"){
			price = 30.00;
			 
		}else if(foodName == "Ginger250g"){
			price = 35.00;
			 
		}else if(foodName == "Broccoli1Pc"){
			price = 45.00;
			 
		}else if(foodName == "Capsicum500g"){
			price = 50.00;
			 
		}else if(foodName == "Chicken1Kg"){
			price = 220.00;
			 
		}else if(foodName == "Mutton1Kg"){
			price = 650.00;
			 
		}else if(foodName == "Fish1Kg"){
			price = 300.00;
			 
		}else if(foodName == "EggTray30Pc"){
			price = 210.00;
			 
		}else if(foodName == "Milk1L"){
			price = 50.00;
			 
		}else if(foodName == "Curd1KgPack"){
			price = 70.00;
			 
		}else if(foodName == "Paneer1Kg"){
			price = 400.00;
			 
		}else if(foodName == "Butter500g"){
			price = 250.00;
			 
		}else if(foodName == "CheeseSlicesPack"){
			price = 120.00;
			 
		}else if(foodName == "BreadLoaf"){
			price = 40.00;
			 
		}else if(foodName == "BrownBreadLoaf"){
			price = 45.00;
			 
		}else if(foodName == "Oats1Kg"){
			price = 180.00;
			 
		}else if(foodName == "CornFlakes500g"){
			price = 160.00;
			 
		}else if(foodName == "TeaPowder500g"){
			price = 220.00;
			 
		}else if(foodName == "CoffeePowder200g"){
			price = 180.00;
			 
		}else if(foodName == "DetergentPowder1Kg"){
			price = 110.00;
			 
		}else if(foodName == "BathSoapPack"){
			price = 90.00;
			 
		}else if(foodName == "ShampooBottle"){
			price = 140.00;
			 
		}else if(foodName == "ToothpasteTube"){
			price = 60.00;
			 
		}else if(foodName == "Toothbrush"){
			price = 25.00;
			 
		}else if(foodName == "DishwashLiquid"){
			price = 95.00;
			 
		}else{
			System.out.println("There is no item found which you have searched");
		}

		return price;
	}
	
	public static double search(String foodName, int quantity){

	double price = 0.0;

	if(foodName == "ToorDal1Kg"){
		price = 160.00 * quantity;
		 
	}else if(foodName == "MoongDal1Kg"){
		price = 150.00 * quantity;
		 
	}else if(foodName == "UradDal1Kg"){
		price = 170.00 * quantity;
		 
	}else if(foodName == "MasoorDal1Kg"){
		price = 140.00 * quantity;
		 
	}else if(foodName == "ChanaDal1Kg"){
		price = 130.00 * quantity;
		 
	}else if(foodName == "BasmatiRice5Kg"){
		price = 450.00 * quantity;
		 
	}else if(foodName == "SonaMasooriRice5Kg"){
		price = 380.00 * quantity;
		 
	}else if(foodName == "WheatFlour5Kg"){
		price = 250.00 * quantity;
		 
	}else if(foodName == "RagiFlour1Kg"){
		price = 60.00 * quantity;
		 
	}else if(foodName == "Maida1Kg"){
		price = 55.00 * quantity;
		 
	}else if(foodName == "Sugar1Kg"){
		price = 45.00 * quantity;
		 
	}else if(foodName == "Salt1Kg"){
		price = 25.00 * quantity;
		 
	}else if(foodName == "TurmericPowder100g"){
		price = 30.00 * quantity;
		 
	}else if(foodName == "ChilliPowder100g"){
		price = 35.00 * quantity;
		 
	}else if(foodName == "CorianderPowder100g"){
		price = 28.00 * quantity;
		 
	}else if(foodName == "CuminSeeds100g"){
		price = 40.00 * quantity;
		 
	}else if(foodName == "MustardSeeds100g"){
		price = 20.00 * quantity;
		 
	}else if(foodName == "GroundnutOil1L"){
		price = 150.00 * quantity;
		 
	}else if(foodName == "SunflowerOil1L"){
		price = 140.00 * quantity;
		 
	}else if(foodName == "CoconutOil1L"){
		price = 180.00 * quantity;
		 
	}else if(foodName == "Tomato1Kg"){
		price = 30.00 * quantity;
		 
	}else if(foodName == "Onion1Kg"){
		price = 35.00 * quantity;
		 
	}else if(foodName == "Potato1Kg"){
		price = 25.00 * quantity;
		 
	}else if(foodName == "Carrot1Kg"){
		price = 40.00 * quantity;
		 
	}else if(foodName == "Beans1Kg"){
		price = 60.00 * quantity;
		 
	}else if(foodName == "Cabbage1Pc"){
		price = 30.00 * quantity;
		 
	}else if(foodName == "Cauliflower1Pc"){
		price = 35.00 * quantity;
		 
	}else if(foodName == "Spinach1Bunch"){
		price = 20.00 * quantity;
		 
	}else if(foodName == "CorianderLeaves1Bunch"){
		price = 10.00 * quantity;
		 
	}else if(foodName == "GreenChilli250g"){
		price = 15.00 * quantity;
		 
	}else if(foodName == "Garlic250g"){
		price = 30.00 * quantity;
		 
	}else if(foodName == "Ginger250g"){
		price = 35.00 * quantity;
		 
	}else if(foodName == "Broccoli1Pc"){
		price = 45.00 * quantity;
		 
	}else if(foodName == "Capsicum500g"){
		price = 50.00 * quantity;
		 
	}else if(foodName == "Chicken1Kg"){
		price = 220.00 * quantity;
		 
	}else if(foodName == "Mutton1Kg"){
		price = 650.00 * quantity;
		 
	}else if(foodName == "Fish1Kg"){
		price = 300.00 * quantity;
		 
	}else if(foodName == "EggTray30Pc"){
		price = 210.00 * quantity;
		 
	}else if(foodName == "Milk1L"){
		price = 50.00 * quantity;
		 
	}else if(foodName == "Curd1KgPack"){
		price = 70.00 * quantity;
		 
	}else if(foodName == "Paneer1Kg"){
		price = 400.00 * quantity;
		 
	}else if(foodName == "Butter500g"){
		price = 250.00 * quantity;
		 
	}else if(foodName == "CheeseSlicesPack"){
		price = 120.00 * quantity;
		 
	}else if(foodName == "BreadLoaf"){
		price = 40.00 * quantity;
		 
	}else if(foodName == "BrownBreadLoaf"){
		price = 45.00 * quantity;
		 
	}else if(foodName == "Oats1Kg"){
		price = 180.00 * quantity;
		 
	}else if(foodName == "CornFlakes500g"){
		price = 160.00 * quantity;
		 
	}else if(foodName == "TeaPowder500g"){
		price = 220.00 * quantity;
		 
	}else if(foodName == "CoffeePowder200g"){
		price = 180.00 * quantity;
		 
	}else if(foodName == "DetergentPowder1Kg"){
		price = 110.00 * quantity;
		 
	}else if(foodName == "BathSoapPack"){
		price = 90.00 * quantity;
		 
	}else if(foodName == "ShampooBottle"){
		price = 140.00 * quantity;
		 
	}else if(foodName == "ToothpasteTube"){
		price = 60.00 * quantity;
		 
	}else if(foodName == "Toothbrush"){
		price = 25.00 * quantity;
		 
	}else if(foodName == "DishwashLiquid"){
		price = 95.00 * quantity;
		 
	}else{
		System.out.println("There is no item found which you have searched");
	}

	return price;
}
}
