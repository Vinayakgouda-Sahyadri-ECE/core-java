class Dominos{

	public static double search(String foodName){
		double price = 0.0;

		if(foodName == "VegLoadedPizza"){
			price = 299.00;
			  
		}else if(foodName == "CheeseBurstPizza"){
			price = 349.00;
			  
		}else if(foodName == "PepperoniPizza"){
			price = 399.00;
			  
		}else if(foodName == "ChickenDominatoPizza"){
			price = 379.00;
			  
		}else if(foodName == "IndiTandooriPaneerPizza"){
			price = 369.00;
			  
		}else if(foodName == "VeggieParadisePizza"){
			price = 329.00;
			  
		}else if(foodName == "ChickenGoldenDelightPizza"){
			price = 389.00;
			  
		}else if(foodName == "NonVegSupremePizza"){
			price = 419.00;
			  
		}else if(foodName == "PaneerZingyPizza"){
			price = 359.00;
			  
		}else if(foodName == "ChickenFiestaPizza"){
			price = 399.00;
			  
		}else if(foodName == "VegExtravaganzaPizza"){
			price = 349.00;
			  
		}else if(foodName == "ChickenPepperPizza"){
			price = 389.00;
			  
		}else if(foodName == "PaneerOnionPizza"){
			price = 319.00;
			  
		}else if(foodName == "CapsicumCornPizza"){
			price = 299.00;
			  
		}else if(foodName == "DoubleCheesePizza"){
			price = 359.00;
			  
		}else if(foodName == "SpicyTripleChickenPizza"){
			price = 429.00;
			  
		}else if(foodName == "VeggieMaxPizza"){
			price = 339.00;
			  
		}else if(foodName == "ChickenBBQPizza"){
			price = 409.00;
			  
		}else if(foodName == "PaneerMushroomPizza"){
			price = 349.00;
			  
		}else if(foodName == "CornCheesePizza"){
			price = 309.00;
			  
		}else if(foodName == "GarlicBreadsticks"){
			price = 149.00;
			  
		}else if(foodName == "StuffedGarlicBreadWithCheese"){
			price = 199.00;
			  
		}else if(foodName == "TacoMexicanaVeg"){
			price = 179.00;
			  
		}else if(foodName == "TacoMexicanaNonVeg"){
			price = 199.00;
			  
		}else if(foodName == "PotatoWedges"){
			price = 129.00;
			  
		}else if(foodName == "ChickenParcel"){
			price = 119.00;
			  
		}else if(foodName == "VegParcel"){
			price = 99.00;
			  
		}else if(foodName == "ChickenDominatorsSide"){
			price = 229.00;
			  
		}else if(foodName == "CheesyDipCup"){
			price = 35.00;
			  
		}else if(foodName == "TandooriDipCup"){
			price = 35.00;
			  
		}else if(foodName == "ChocoLavaCakeDominos"){
			price = 109.00;
			  
		}else if(foodName == "ButterscotchMousseCake"){
			price = 119.00;
			  
		}else if(foodName == "NewYorkCheesecake"){
			price = 129.00;
			  
		}else if(foodName == "ChocolateBrownieFantasy"){
			price = 139.00;
			  
		}else if(foodName == "Pepsi500ml"){
			price = 60.00;
			  
		}else if(foodName == "7Up500ml"){
			price = 60.00;
			  
		}else if(foodName == "Mirinda500ml"){
			price = 60.00;
			  
		}else if(foodName == "MountainDew500ml"){
			price = 60.00;
			  
		}else if(foodName == "LiptonIceTea"){
			price = 70.00;
			  
		}else if(foodName == "PaneerStuffedCrustPizza"){
			price = 399.00;
			  
		}else if(foodName == "ChickenStuffedCrustPizza"){
			price = 429.00;
			  
		}else if(foodName == "CheeseVolcanoPizza"){
			price = 449.00;
			  
		}else if(foodName == "MexicanGreenWavePizza"){
			price = 339.00;
			  
		}else if(foodName == "DeluxeVeggiePizza"){
			price = 349.00;
			  
		}else if(foodName == "PepperBarbecueChickenPizza"){
			price = 399.00;
			  
		}else if(foodName == "ChickenSausagePizza"){
			price = 379.00;
			  
		}else if(foodName == "VegDoubleCheeseMarblePizza"){
			price = 369.00;
			  
		}else if(foodName == "CheeseNLoadedPizza"){
			price = 289.00;
			  
		}else if(foodName == "ChickenNLoadedPizza"){
			price = 309.00;
			  
		}else if(foodName == "VegBurgerPizza"){
			price = 119.00;
			  
		}else if(foodName == "ChickenBurgerPizza"){
			price = 139.00;
			  
		}else if(foodName == "VegPastaItalianoWhite"){
			price = 149.00;
			  
		}else if(foodName == "NonVegPastaItalianoRed"){
			price = 169.00;
			  
		}else if(foodName == "PaneerZestyPizza"){
			price = 359.00;
			  
		}else{
			System.out.println("There is no food found which you have searched");
		}

		return price;
	}
	
	
	public static double search(String foodName, int quantity){

	double price = 0.0;

	if(foodName == "VegLoadedPizza"){
		price = 299.00 * quantity;
		  
	}else if(foodName == "CheeseBurstPizza"){
		price = 349.00 * quantity;
		  
	}else if(foodName == "PepperoniPizza"){
		price = 399.00 * quantity;
		  
	}else if(foodName == "ChickenDominatoPizza"){
		price = 379.00 * quantity;
		  
	}else if(foodName == "IndiTandooriPaneerPizza"){
		price = 369.00 * quantity;
		  
	}else if(foodName == "VeggieParadisePizza"){
		price = 329.00 * quantity;
		  
	}else if(foodName == "ChickenGoldenDelightPizza"){
		price = 389.00 * quantity;
		  
	}else if(foodName == "NonVegSupremePizza"){
		price = 419.00 * quantity;
		  
	}else if(foodName == "PaneerZingyPizza"){
		price = 359.00 * quantity;
		  
	}else if(foodName == "ChickenFiestaPizza"){
		price = 399.00 * quantity;
		  
	}else if(foodName == "VegExtravaganzaPizza"){
		price = 349.00 * quantity;
		  
	}else if(foodName == "ChickenPepperPizza"){
		price = 389.00 * quantity;
		  
	}else if(foodName == "PaneerOnionPizza"){
		price = 319.00 * quantity;
		  
	}else if(foodName == "CapsicumCornPizza"){
		price = 299.00 * quantity;
		  
	}else if(foodName == "DoubleCheesePizza"){
		price = 359.00 * quantity;
		  
	}else if(foodName == "SpicyTripleChickenPizza"){
		price = 429.00 * quantity;
		  
	}else if(foodName == "VeggieMaxPizza"){
		price = 339.00 * quantity;
		  
	}else if(foodName == "ChickenBBQPizza"){
		price = 409.00 * quantity;
		  
	}else if(foodName == "PaneerMushroomPizza"){
		price = 349.00 * quantity;
		  
	}else if(foodName == "CornCheesePizza"){
		price = 309.00 * quantity;
		  
	}else if(foodName == "GarlicBreadsticks"){
		price = 149.00 * quantity;
		  
	}else if(foodName == "StuffedGarlicBreadWithCheese"){
		price = 199.00 * quantity;
		  
	}else if(foodName == "TacoMexicanaVeg"){
		price = 179.00 * quantity;
		  
	}else if(foodName == "TacoMexicanaNonVeg"){
		price = 199.00 * quantity;
		  
	}else if(foodName == "PotatoWedges"){
		price = 129.00 * quantity;
		  
	}else if(foodName == "ChickenParcel"){
		price = 119.00 * quantity;
		  
	}else if(foodName == "VegParcel"){
		price = 99.00 * quantity;
		  
	}else if(foodName == "ChickenDominatorsSide"){
		price = 229.00 * quantity;
		  
	}else if(foodName == "CheesyDipCup"){
		price = 35.00 * quantity;
		  
	}else if(foodName == "TandooriDipCup"){
		price = 35.00 * quantity;
		  
	}else if(foodName == "ChocoLavaCakeDominos"){
		price = 109.00 * quantity;
		  
	}else if(foodName == "ButterscotchMousseCake"){
		price = 119.00 * quantity;
		  
	}else if(foodName == "NewYorkCheesecake"){
		price = 129.00 * quantity;
		  
	}else if(foodName == "ChocolateBrownieFantasy"){
		price = 139.00 * quantity;
		  
	}else if(foodName == "Pepsi500ml"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "7Up500ml"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "Mirinda500ml"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "MountainDew500ml"){
		price = 60.00 * quantity;
		  
	}else if(foodName == "LiptonIceTea"){
		price = 70.00 * quantity;
		  
	}else if(foodName == "PaneerStuffedCrustPizza"){
		price = 399.00 * quantity;
		  
	}else if(foodName == "ChickenStuffedCrustPizza"){
		price = 429.00 * quantity;
		  
	}else if(foodName == "CheeseVolcanoPizza"){
		price = 449.00 * quantity;
		  
	}else if(foodName == "MexicanGreenWavePizza"){
		price = 339.00 * quantity;
		  
	}else if(foodName == "DeluxeVeggiePizza"){
		price = 349.00 * quantity;
		  
	}else if(foodName == "PepperBarbecueChickenPizza"){
		price = 399.00 * quantity;
		  
	}else if(foodName == "ChickenSausagePizza"){
		price = 379.00 * quantity;
		  
	}else if(foodName == "VegDoubleCheeseMarblePizza"){
		price = 369.00 * quantity;
		  
	}else if(foodName == "CheeseNLoadedPizza"){
		price = 289.00 * quantity;
		  
	}else if(foodName == "ChickenNLoadedPizza"){
		price = 309.00 * quantity;
		  
	}else if(foodName == "VegBurgerPizza"){
		price = 119.00 * quantity;
		  
	}else if(foodName == "ChickenBurgerPizza"){
		price = 139.00 * quantity;
		  
	}else if(foodName == "VegPastaItalianoWhite"){
		price = 149.00 * quantity;
		  
	}else if(foodName == "NonVegPastaItalianoRed"){
		price = 169.00 * quantity;
		  
	}else if(foodName == "PaneerZestyPizza"){
		price = 359.00 * quantity;
		  
	}else{
		System.out.println("There is no food found which you have searched");
	}

	return price;
}
}
