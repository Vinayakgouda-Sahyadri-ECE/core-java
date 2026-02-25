class EatSure{

	public static double getPrice(String foodName){
		double price = 0.0;

		if(foodName == "ClassicChickenWrap"){
			price = 180.00;
			  
		}else if(foodName == "PaneerTikkaWrap"){
			price = 170.00;
			  
		}else if(foodName == "CheesyCornWrap"){
			price = 160.00;
			  
		}else if(foodName == "SpicyChickenWrap"){
			price = 190.00;
			  
		}else if(foodName == "DoubleEggWrap"){
			price = 150.00;
			  
		}else if(foodName == "ChickenTandooriWrap"){
			price = 200.00;
			  
		}else if(foodName == "VegSignatureWrap"){
			price = 155.00;
			  
		}else if(foodName == "ChickenSignatureWrap"){
			price = 210.00;
			  
		}else if(foodName == "PeriPeriChickenBowl"){
			price = 220.00;
			  
		}else if(foodName == "MexicanRiceBowl"){
			price = 195.00;
			  
		}else if(foodName == "PaneerRiceBowl"){
			price = 185.00;
			  
		}else if(foodName == "ButterChickenBowl"){
			price = 240.00;
			  
		}else if(foodName == "DalMakhaniBowl"){
			price = 175.00;
			  
		}else if(foodName == "RajmaChawalBowl"){
			price = 165.00;
			  
		}else if(foodName == "ChickenKeemaBowl"){
			price = 230.00;
			  
		}else if(foodName == "VegLoadedNachoBox"){
			price = 210.00;
			  
		}else if(foodName == "ChickenLoadedNachoBox"){
			price = 240.00;
			  
		}else if(foodName == "CheeseGarlicBread"){
			price = 150.00;
			  
		}else if(foodName == "StuffedGarlicBread"){
			price = 170.00;
			  
		}else if(foodName == "ClassicMargherita"){
			price = 220.00;
			  
		}else if(foodName == "FarmhouseSpecial"){
			price = 260.00;
			  
		}else if(foodName == "ChickenOverload"){
			price = 300.00;
			  
		}else if(foodName == "VegExotica"){
			price = 250.00;
			  
		}else if(foodName == "ChickenSausageDelight"){
			price = 280.00;
			  
		}else if(foodName == "PaneerMakhaniPizza"){
			price = 270.00;
			  
		}else if(foodName == "ChocolateTruffleCake"){
			price = 120.00;
			  
		}else if(foodName == "RedVelvetCake"){
			price = 130.00;
			  
		}else if(foodName == "ButterscotchCake"){
			price = 115.00;
			  
		}else if(foodName == "BlackForestCake"){
			price = 110.00;
			  
		}else if(foodName == "BlueberryCheesecake"){
			price = 150.00;
			  
		}else if(foodName == "ChocolateJarCake"){
			price = 140.00;
			  
		}else if(foodName == "MangoJarCake"){
			price = 135.00;
			  
		}else if(foodName == "ChocolateMousseCup"){
			price = 125.00;
			  
		}else if(foodName == "ChocoLavaCup"){
			price = 100.00;
			  
		}else if(foodName == "MiniBrownieBite"){
			price = 90.00;
			  
		}else if(foodName == "ChickenPopcornBox"){
			price = 210.00;
			  
		}else if(foodName == "VegCrunchyBox"){
			price = 180.00;
			  
		}else if(foodName == "LoadedFriesBox"){
			price = 190.00;
			  
		}else if(foodName == "ChickenWingsBox"){
			price = 260.00;
			  
		}else if(foodName == "BBQChickenBox"){
			price = 275.00;
			  
		}else if(foodName == "PaneerCrunchBox"){
			price = 200.00;
			  
		}else if(foodName == "VeggieDelightBox"){
			price = 185.00;
			  
		}else if(foodName == "ChocolateShakeJar"){
			price = 160.00;
			  
		}else if(foodName == "OreoShakeJar"){
			price = 170.00;
			  
		}else if(foodName == "KitkatShakeJar"){
			price = 175.00;
			  
		}else if(foodName == "StrawberryShakeJar"){
			price = 165.00;
			  
		}else if(foodName == "ColdCoffeeJar"){
			price = 155.00;
			  
		}else if(foodName == "MintLemonCooler"){
			price = 120.00;
			  
		}else if(foodName == "WatermelonCooler"){
			price = 130.00;
			  
		}else if(foodName == "ChocolateWaffle"){
			price = 190.00;
			  
		}else if(foodName == "NutellaWaffle"){
			price = 210.00;
			  
		}else if(foodName == "BelgianWaffleBox"){
			price = 220.00;
			  
		}else if(foodName == "ChocoChipPancake"){
			price = 180.00;
			  
		}else if(foodName == "MapleSyrupPancake"){
			price = 170.00;
			  
		}else{
			System.out.println("There is no food found which you have searched");
		}

		return price;
	}
	
	public static double getPrice(String foodName, int quantity){

	double price = 0.0;

	if(foodName == "ClassicChickenWrap"){
		price = 180.00 * quantity;
		  
	}else if(foodName == "PaneerTikkaWrap"){
		price = 170.00 * quantity;
		  
	}else if(foodName == "CheesyCornWrap"){
		price = 160.00 * quantity;
		  
	}else if(foodName == "SpicyChickenWrap"){
		price = 190.00 * quantity;
		  
	}else if(foodName == "DoubleEggWrap"){
		price = 150.00 * quantity;
		  
	}else if(foodName == "ChickenTandooriWrap"){
		price = 200.00 * quantity;
		  
	}else if(foodName == "VegSignatureWrap"){
		price = 155.00 * quantity;
		  
	}else if(foodName == "ChickenSignatureWrap"){
		price = 210.00 * quantity;
		  
	}else if(foodName == "PeriPeriChickenBowl"){
		price = 220.00 * quantity;
		  
	}else if(foodName == "MexicanRiceBowl"){
		price = 195.00 * quantity;
		  
	}else if(foodName == "PaneerRiceBowl"){
		price = 185.00 * quantity;
		  
	}else if(foodName == "ButterChickenBowl"){
		price = 240.00 * quantity;
		  
	}else if(foodName == "DalMakhaniBowl"){
		price = 175.00 * quantity;
		  
	}else if(foodName == "RajmaChawalBowl"){
		price = 165.00 * quantity;
		  
	}else if(foodName == "ChickenKeemaBowl"){
		price = 230.00 * quantity;
		  
	}else if(foodName == "VegLoadedNachoBox"){
		price = 210.00 * quantity;
		  
	}else if(foodName == "ChickenLoadedNachoBox"){
		price = 240.00 * quantity;
		  
	}else if(foodName == "CheeseGarlicBread"){
		price = 150.00 * quantity;
		  
	}else if(foodName == "StuffedGarlicBread"){
		price = 170.00 * quantity;
		  
	}else if(foodName == "ClassicMargherita"){
		price = 220.00 * quantity;
		  
	}else if(foodName == "FarmhouseSpecial"){
		price = 260.00 * quantity;
		  
	}else if(foodName == "ChickenOverload"){
		price = 300.00 * quantity;
		  
	}else if(foodName == "VegExotica"){
		price = 250.00 * quantity;
		  
	}else if(foodName == "ChickenSausageDelight"){
		price = 280.00 * quantity;
		  
	}else if(foodName == "PaneerMakhaniPizza"){
		price = 270.00 * quantity;
		  
	}else if(foodName == "ChocolateTruffleCake"){
		price = 120.00 * quantity;
		  
	}else if(foodName == "RedVelvetCake"){
		price = 130.00 * quantity;
		  
	}else if(foodName == "ButterscotchCake"){
		price = 115.00 * quantity;
		  
	}else if(foodName == "BlackForestCake"){
		price = 110.00 * quantity;
		  
	}else if(foodName == "BlueberryCheesecake"){
		price = 150.00 * quantity;
		  
	}else if(foodName == "ChocolateJarCake"){
		price = 140.00 * quantity;
		  
	}else if(foodName == "MangoJarCake"){
		price = 135.00 * quantity;
		  
	}else if(foodName == "ChocolateMousseCup"){
		price = 125.00 * quantity;
		  
	}else if(foodName == "ChocoLavaCup"){
		price = 100.00 * quantity;
		  
	}else if(foodName == "MiniBrownieBite"){
		price = 90.00 * quantity;
		  
	}else if(foodName == "ChickenPopcornBox"){
		price = 210.00 * quantity;
		  
	}else if(foodName == "VegCrunchyBox"){
		price = 180.00 * quantity;
		  
	}else if(foodName == "LoadedFriesBox"){
		price = 190.00 * quantity;
		  
	}else if(foodName == "ChickenWingsBox"){
		price = 260.00 * quantity;
		  
	}else if(foodName == "BBQChickenBox"){
		price = 275.00 * quantity;
		  
	}else if(foodName == "PaneerCrunchBox"){
		price = 200.00 * quantity;
		  
	}else if(foodName == "VeggieDelightBox"){
		price = 185.00 * quantity;
		  
	}else if(foodName == "ChocolateShakeJar"){
		price = 160.00 * quantity;
		  
	}else if(foodName == "OreoShakeJar"){
		price = 170.00 * quantity;
		  
	}else if(foodName == "KitkatShakeJar"){
		price = 175.00 * quantity;
		  
	}else if(foodName == "StrawberryShakeJar"){
		price = 165.00 * quantity;
		  
	}else if(foodName == "ColdCoffeeJar"){
		price = 155.00 * quantity;
		  
	}else if(foodName == "MintLemonCooler"){
		price = 120.00 * quantity;
		  
	}else if(foodName == "WatermelonCooler"){
		price = 130.00 * quantity;
		  
	}else if(foodName == "ChocolateWaffle"){
		price = 190.00 * quantity;
		  
	}else if(foodName == "NutellaWaffle"){
		price = 210.00 * quantity;
		  
	}else if(foodName == "BelgianWaffleBox"){
		price = 220.00 * quantity;
		  
	}else if(foodName == "ChocoChipPancake"){
		price = 180.00 * quantity;
		  
	}else if(foodName == "MapleSyrupPancake"){
		price = 170.00 * quantity;
		  
	}else{
		System.out.println("There is no food found which you have searched");
	}

	return price;
}
}
