class UberEats{

	public static double search(String foodName){
		double price = 0.0;

		if(foodName == "PlainDosa"){
			price = 70.00;
			 
		}else if(foodName == "OnionDosa"){
			price = 85.00;
			 
		}else if(foodName == "RavaDosa"){
			price = 95.00;
			 
		}else if(foodName == "SetDosa"){
			price = 80.00;
			 
		}else if(foodName == "NeerDosa"){
			price = 90.00;
			 
		}else if(foodName == "AkkiRoti"){
			price = 60.00;
			 
		}else if(foodName == "RagiMudde"){
			price = 75.00;
			 
		}else if(foodName == "PlainRice"){
			price = 50.00;
			 
		}else if(foodName == "JeeraRice"){
			price = 90.00;
			 
		}else if(foodName == "GheeRice"){
			price = 110.00;
			 
		}else if(foodName == "VegPulav"){
			price = 120.00;
			 
		}else if(foodName == "MushroomPulav"){
			price = 140.00;
			 
		}else if(foodName == "PaneerPulav"){
			price = 150.00;
			 
		}else if(foodName == "ChickenPulav"){
			price = 170.00;
			 
		}else if(foodName == "MuttonPulav"){
			price = 220.00;
			 
		}else if(foodName == "CurdVada"){
			price = 60.00;
			 
		}else if(foodName == "OnionUttapam"){
			price = 95.00;
			 
		}else if(foodName == "TomatoUttapam"){
			price = 90.00;
			 
		}else if(foodName == "MixVegUttapam"){
			price = 100.00;
			 
		}else if(foodName == "PlainUttapam"){
			price = 75.00;
			 
		}else if(foodName == "BreadButter"){
			price = 40.00;
			 
		}else if(foodName == "BreadJam"){
			price = 45.00;
			 
		}else if(foodName == "VegOmelette"){
			price = 70.00;
			 
		}else if(foodName == "BoiledEggs"){
			price = 30.00;
			 
		}else if(foodName == "ScrambledEggs"){
			price = 80.00;
			 
		}else if(foodName == "PlainParatha"){
			price = 40.00;
			 
		}else if(foodName == "AlooParatha"){
			price = 60.00;
			 
		}else if(foodName == "GobiParatha"){
			price = 65.00;
			 
		}else if(foodName == "PaneerParatha"){
			price = 75.00;
			 
		}else if(foodName == "ChickenParatha"){
			price = 90.00;
			 
		}else if(foodName == "VegetableSalad"){
			price = 50.00;
			 
		}else if(foodName == "FruitSalad"){
			price = 70.00;
			 
		}else if(foodName == "PlainMaggi"){
			price = 40.00;
			 
		}else if(foodName == "EggMaggi"){
			price = 60.00;
			 
		}else if(foodName == "VegMaggi"){
			price = 55.00;
			 
		}else if(foodName == "ChickenMaggi"){
			price = 75.00;
			 
		}else if(foodName == "TomatoKetchupPack"){
			price = 5.00;
			 
		}else if(foodName == "MayonnaisePack"){
			price = 10.00;
			 
		}else if(foodName == "PlainCurd"){
			price = 25.00;
			 
		}else if(foodName == "GheeRoastDosa"){
			price = 110.00;
			 
		}else if(foodName == "MasalaUttapam"){
			price = 105.00;
			 
		}else if(foodName == "VegCutlet"){
			price = 35.00;
			 
		}else if(foodName == "ChickenCutlet"){
			price = 55.00;
			 
		}else if(foodName == "PlainIdiyappam"){
			price = 70.00;
			 
		}else if(foodName == "EggIdiyappam"){
			price = 90.00;
			 
		}else if(foodName == "VegStew"){
			price = 120.00;
			 
		}else if(foodName == "ChickenStew"){
			price = 160.00;
			 
		}else if(foodName == "PlainKhakra"){
			price = 20.00;
			 
		}else if(foodName == "MasalaKhakra"){
			price = 25.00;
			 
		}else if(foodName == "RoastedPapad"){
			price = 15.00;
			 
		}else if(foodName == "FriedPapad"){
			price = 20.00;
			 
		}else if(foodName == "SimpleDalRice"){
			price = 95.00;
			 
		}else if(foodName == "VegetableUpkari"){
			price = 85.00;
			 
		}else if(foodName == "PlainChapatiMeal"){
			price = 110.00;
			 
		}else if(foodName == "MiniTiffinCombo"){
			price = 130.00;
			 
		}else{
			System.out.println("There is no food found which you have searched");
		}

		 return price;
	}
	
	public static double search(String foodName, int quantity){

	double price = 0.0;

	if(foodName == "PlainDosa"){
		price = 70.00 * quantity;
		 
	}else if(foodName == "OnionDosa"){
		price = 85.00 * quantity;
		 
	}else if(foodName == "RavaDosa"){
		price = 95.00 * quantity;
		 
	}else if(foodName == "SetDosa"){
		price = 80.00 * quantity;
		 
	}else if(foodName == "NeerDosa"){
		price = 90.00 * quantity;
		 
	}else if(foodName == "AkkiRoti"){
		price = 60.00 * quantity;
		 
	}else if(foodName == "RagiMudde"){
		price = 75.00 * quantity;
		 
	}else if(foodName == "PlainRice"){
		price = 50.00 * quantity;
		 
	}else if(foodName == "JeeraRice"){
		price = 90.00 * quantity;
		 
	}else if(foodName == "GheeRice"){
		price = 110.00 * quantity;
		 
	}else if(foodName == "VegPulav"){
		price = 120.00 * quantity;
		 
	}else if(foodName == "MushroomPulav"){
		price = 140.00 * quantity;
		 
	}else if(foodName == "PaneerPulav"){
		price = 150.00 * quantity;
		 
	}else if(foodName == "ChickenPulav"){
		price = 170.00 * quantity;
		 
	}else if(foodName == "MuttonPulav"){
		price = 220.00 * quantity;
		 
	}else if(foodName == "CurdVada"){
		price = 60.00 * quantity;
		 
	}else if(foodName == "OnionUttapam"){
		price = 95.00 * quantity;
		 
	}else if(foodName == "TomatoUttapam"){
		price = 90.00 * quantity;
		 
	}else if(foodName == "MixVegUttapam"){
		price = 100.00 * quantity;
		 
	}else if(foodName == "PlainUttapam"){
		price = 75.00 * quantity;
		 
	}else if(foodName == "BreadButter"){
		price = 40.00 * quantity;
		 
	}else if(foodName == "BreadJam"){
		price = 45.00 * quantity;
		 
	}else if(foodName == "VegOmelette"){
		price = 70.00 * quantity;
		 
	}else if(foodName == "BoiledEggs"){
		price = 30.00 * quantity;
		 
	}else if(foodName == "ScrambledEggs"){
		price = 80.00 * quantity;
		 
	}else if(foodName == "PlainParatha"){
		price = 40.00 * quantity;
		 
	}else if(foodName == "AlooParatha"){
		price = 60.00 * quantity;
		 
	}else if(foodName == "GobiParatha"){
		price = 65.00 * quantity;
		 
	}else if(foodName == "PaneerParatha"){
		price = 75.00 * quantity;
		 
	}else if(foodName == "ChickenParatha"){
		price = 90.00 * quantity;
		 
	}else if(foodName == "VegetableSalad"){
		price = 50.00 * quantity;
		 
	}else if(foodName == "FruitSalad"){
		price = 70.00 * quantity;
		 
	}else if(foodName == "PlainMaggi"){
		price = 40.00 * quantity;
		 
	}else if(foodName == "EggMaggi"){
		price = 60.00 * quantity;
		 
	}else if(foodName == "VegMaggi"){
		price = 55.00 * quantity;
		 
	}else if(foodName == "ChickenMaggi"){
		price = 75.00 * quantity;
		 
	}else if(foodName == "TomatoKetchupPack"){
		price = 5.00 * quantity;
		 
	}else if(foodName == "MayonnaisePack"){
		price = 10.00 * quantity;
		 
	}else if(foodName == "PlainCurd"){
		price = 25.00 * quantity;
		 
	}else if(foodName == "GheeRoastDosa"){
		price = 110.00 * quantity;
		 
	}else if(foodName == "MasalaUttapam"){
		price = 105.00 * quantity;
		 
	}else if(foodName == "VegCutlet"){
		price = 35.00 * quantity;
		 
	}else if(foodName == "ChickenCutlet"){
		price = 55.00 * quantity;
		 
	}else if(foodName == "PlainIdiyappam"){
		price = 70.00 * quantity;
		 
	}else if(foodName == "EggIdiyappam"){
		price = 90.00 * quantity;
		 
	}else if(foodName == "VegStew"){
		price = 120.00 * quantity;
		 
	}else if(foodName == "ChickenStew"){
		price = 160.00 * quantity;
		 
	}else if(foodName == "PlainKhakra"){
		price = 20.00 * quantity;
		 
	}else if(foodName == "MasalaKhakra"){
		price = 25.00 * quantity;
		 
	}else if(foodName == "RoastedPapad"){
		price = 15.00 * quantity;
		 
	}else if(foodName == "FriedPapad"){
		price = 20.00 * quantity;
		 
	}else if(foodName == "SimpleDalRice"){
		price = 95.00 * quantity;
		 
	}else if(foodName == "VegetableUpkari"){
		price = 85.00 * quantity;
		 
	}else if(foodName == "PlainChapatiMeal"){
		price = 110.00 * quantity;
		 
	}else if(foodName == "MiniTiffinCombo"){
		price = 130.00 * quantity;
		 
	}else{
		System.out.println("There is no food found which you have searched");
	}

	return price;
}
}
