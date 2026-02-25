class Zepto{

	public static double search(String foodName){
		double price = 0.0;

		if(foodName == "Horlicks500g"){
			price = 220.00;
			
		}else if(foodName == "Boost500g"){
			price = 210.00;
			
		}else if(foodName == "Bournvita500g"){
			price = 230.00;
			
		}else if(foodName == "Complan500g"){
			price = 240.00;
			
		}else if(foodName == "ProteinBar"){
			price = 60.00;
			
		}else if(foodName == "DarkChocolateBar"){
			price = 120.00;
			
		}else if(foodName == "MilkChocolateBar"){
			price = 50.00;
			
		}else if(foodName == "WhiteChocolateBar"){
			price = 90.00;
			
		}else if(foodName == "HazelnutChocolate"){
			price = 150.00;
			
		}else if(foodName == "ChocolateGiftBox"){
			price = 350.00;
			
		}else if(foodName == "SaltedCashewPack"){
			price = 180.00;
			
		}else if(foodName == "RoastedAlmondPack"){
			price = 200.00;
			
		}else if(foodName == "MixedDryFruitsPack"){
			price = 250.00;
			
		}else if(foodName == "Dates500g"){
			price = 140.00;
			
		}else if(foodName == "Raisins500g"){
			price = 130.00;
			
		}else if(foodName == "PeanutButterJar"){
			price = 160.00;
			
		}else if(foodName == "ChocolateSpreadJar"){
			price = 170.00;
			
		}else if(foodName == "StrawberryJamJar"){
			price = 140.00;
			
		}else if(foodName == "HoneyBottle500g"){
			price = 190.00;
			
		}else if(foodName == "MapleSyrupBottle"){
			price = 220.00;
			
		}else if(foodName == "NachoChipsPack"){
			price = 60.00;
			
		}else if(foodName == "TortillaWrapPack"){
			price = 120.00;
			
		}else if(foodName == "BurgerBunsPack"){
			price = 45.00;
			
		}else if(foodName == "HotDogBunsPack"){
			price = 50.00;
			
		}else if(foodName == "FrozenPeas1Kg"){
			price = 110.00;
			
		}else if(foodName == "FrozenSweetCorn1Kg"){
			price = 120.00;
			
		}else if(foodName == "FrozenFrenchFries1Kg"){
			price = 150.00;
			
		}else if(foodName == "FrozenVegPattyPack"){
			price = 130.00;
			
		}else if(foodName == "FrozenChickenNuggetsPack"){
			price = 220.00;
			
		}else if(foodName == "InstantSoupPacket"){
			price = 25.00;
			
		}else if(foodName == "InstantCoffeeSachets"){
			price = 90.00;
			
		}else if(foodName == "GreenCoffeeJar"){
			price = 240.00;
			
		}else if(foodName == "HerbalTeaPack"){
			price = 150.00;
			
		}else if(foodName == "EnergyDrinkCan"){
			price = 110.00;
			
		}else if(foodName == "SodaBottle2L"){
			price = 95.00;
			
		}else if(foodName == "MineralWaterCan20L"){
			price = 80.00;
			
		}else if(foodName == "PaperTowelsPack"){
			price = 140.00;
			
		}else if(foodName == "ToiletPaperRollPack"){
			price = 160.00;
			
		}else if(foodName == "HandWashBottle"){
			price = 85.00;
			
		}else if(foodName == "SanitizerBottle"){
			price = 70.00;
			
		}else if(foodName == "FaceWashTube"){
			price = 120.00;
			
		}else if(foodName == "BodyLotionBottle"){
			price = 190.00;
			
		}else if(foodName == "HairOilBottle"){
			price = 130.00;
			
		}else if(foodName == "DeodorantSpray"){
			price = 180.00;
			
		}else if(foodName == "LaundryLiquid1L"){
			price = 210.00;
			
		}else if(foodName == "FloorCleaner1L"){
			price = 150.00;
			
		}else if(foodName == "GarbageBagsPack"){
			price = 75.00;
			
		}else if(foodName == "AluminiumFoilRoll"){
			price = 95.00;
			
		}else if(foodName == "ClingWrapRoll"){
			price = 85.00;
			
		}else if(foodName == "PlasticStorageContainersSet"){
			price = 300.00;
			
		}else if(foodName == "DishScrubberPack"){
			price = 40.00;
			
		}else if(foodName == "MatchBoxPack"){
			price = 15.00;
			
		}else if(foodName == "CandlePack"){
			price = 35.00;
			
		}else if(foodName == "MosquitoRepellentLiquid"){
			price = 120.00;
			
		}else if(foodName == "RoomFreshenerSpray"){
			price = 170.00;
			
		}else{
			System.out.println("There is no item found which you have searched");
		}

		return price;
	}
	
	public static double search(String foodName, int quantity){

	double price = 0.0;

	if(foodName == "Horlicks500g"){
		price = 220.00 * quantity;
		
	}else if(foodName == "Boost500g"){
		price = 210.00 * quantity;
		
	}else if(foodName == "Bournvita500g"){
		price = 230.00 * quantity;
		
	}else if(foodName == "Complan500g"){
		price = 240.00 * quantity;
		
	}else if(foodName == "ProteinBar"){
		price = 60.00 * quantity;
		
	}else if(foodName == "DarkChocolateBar"){
		price = 120.00 * quantity;
		
	}else if(foodName == "MilkChocolateBar"){
		price = 50.00 * quantity;
		
	}else if(foodName == "WhiteChocolateBar"){
		price = 90.00 * quantity;
		
	}else if(foodName == "HazelnutChocolate"){
		price = 150.00 * quantity;
		
	}else if(foodName == "ChocolateGiftBox"){
		price = 350.00 * quantity;
		
	}else if(foodName == "SaltedCashewPack"){
		price = 180.00 * quantity;
		
	}else if(foodName == "RoastedAlmondPack"){
		price = 200.00 * quantity;
		
	}else if(foodName == "MixedDryFruitsPack"){
		price = 250.00 * quantity;
		
	}else if(foodName == "Dates500g"){
		price = 140.00 * quantity;
		
	}else if(foodName == "Raisins500g"){
		price = 130.00 * quantity;
		
	}else if(foodName == "PeanutButterJar"){
		price = 160.00 * quantity;
		
	}else if(foodName == "ChocolateSpreadJar"){
		price = 170.00 * quantity;
		
	}else if(foodName == "StrawberryJamJar"){
		price = 140.00 * quantity;
		
	}else if(foodName == "HoneyBottle500g"){
		price = 190.00 * quantity;
		
	}else if(foodName == "MapleSyrupBottle"){
		price = 220.00 * quantity;
		
	}else if(foodName == "NachoChipsPack"){
		price = 60.00 * quantity;
		
	}else if(foodName == "TortillaWrapPack"){
		price = 120.00 * quantity;
		
	}else if(foodName == "BurgerBunsPack"){
		price = 45.00 * quantity;
		
	}else if(foodName == "HotDogBunsPack"){
		price = 50.00 * quantity;
		
	}else if(foodName == "FrozenPeas1Kg"){
		price = 110.00 * quantity;
		
	}else if(foodName == "FrozenSweetCorn1Kg"){
		price = 120.00 * quantity;
		
	}else if(foodName == "FrozenFrenchFries1Kg"){
		price = 150.00 * quantity;
		
	}else if(foodName == "FrozenVegPattyPack"){
		price = 130.00 * quantity;
		
	}else if(foodName == "FrozenChickenNuggetsPack"){
		price = 220.00 * quantity;
		
	}else if(foodName == "InstantSoupPacket"){
		price = 25.00 * quantity;
		
	}else if(foodName == "InstantCoffeeSachets"){
		price = 90.00 * quantity;
		
	}else if(foodName == "GreenCoffeeJar"){
		price = 240.00 * quantity;
		
	}else if(foodName == "HerbalTeaPack"){
		price = 150.00 * quantity;
		
	}else if(foodName == "EnergyDrinkCan"){
		price = 110.00 * quantity;
		
	}else if(foodName == "SodaBottle2L"){
		price = 95.00 * quantity;
		
	}else if(foodName == "MineralWaterCan20L"){
		price = 80.00 * quantity;
		
	}else if(foodName == "PaperTowelsPack"){
		price = 140.00 * quantity;
		
	}else if(foodName == "ToiletPaperRollPack"){
		price = 160.00 * quantity;
		
	}else if(foodName == "HandWashBottle"){
		price = 85.00 * quantity;
		
	}else if(foodName == "SanitizerBottle"){
		price = 70.00 * quantity;
		
	}else if(foodName == "FaceWashTube"){
		price = 120.00 * quantity;
		
	}else if(foodName == "BodyLotionBottle"){
		price = 190.00 * quantity;
		
	}else if(foodName == "HairOilBottle"){
		price = 130.00 * quantity;
		
	}else if(foodName == "DeodorantSpray"){
		price = 180.00 * quantity;
		
	}else if(foodName == "LaundryLiquid1L"){
		price = 210.00 * quantity;
		
	}else if(foodName == "FloorCleaner1L"){
		price = 150.00 * quantity;
		
	}else if(foodName == "GarbageBagsPack"){
		price = 75.00 * quantity;
		
	}else if(foodName == "AluminiumFoilRoll"){
		price = 95.00 * quantity;
		
	}else if(foodName == "ClingWrapRoll"){
		price = 85.00 * quantity;
		
	}else if(foodName == "PlasticStorageContainersSet"){
		price = 300.00 * quantity;
		
	}else if(foodName == "DishScrubberPack"){
		price = 40.00 * quantity;
		
	}else if(foodName == "MatchBoxPack"){
		price = 15.00 * quantity;
		
	}else if(foodName == "CandlePack"){
		price = 35.00 * quantity;
		
	}else if(foodName == "MosquitoRepellentLiquid"){
		price = 120.00 * quantity;
		
	}else if(foodName == "RoomFreshenerSpray"){
		price = 170.00 * quantity;
		
	}else{
		System.out.println("There is no item found which you have searched");
	}

	return price;
}
}
