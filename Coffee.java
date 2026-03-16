class Coffee{

int coffeeId;
String coffeeName;
String coffeeType;
String coffeeOrigin;
String roastLevel;
double coffeePrice;
String cupSize;
boolean milkIncluded;
boolean sugarIncluded;
String flavor;
String caffeineLevel;
String temperature;
String servingStyle;
String beansType;
String preparationMethod;
String aromaLevel;
String popularity;
String bestTimeToDrink;
String specialOffer;
String rating;

Coffee(int coffeeId,String coffeeName,String coffeeType,String coffeeOrigin,
String roastLevel,double coffeePrice,String cupSize,boolean milkIncluded,
boolean sugarIncluded,String flavor,String caffeineLevel,String temperature,
String servingStyle,String beansType,String preparationMethod,String aromaLevel,
String popularity,String bestTimeToDrink,String specialOffer,String rating){

this.coffeeId=coffeeId;
this.coffeeName=coffeeName;
this.coffeeType=coffeeType;
this.coffeeOrigin=coffeeOrigin;
this.roastLevel=roastLevel;
this.coffeePrice=coffeePrice;
this.cupSize=cupSize;
this.milkIncluded=milkIncluded;
this.sugarIncluded=sugarIncluded;
this.flavor=flavor;
this.caffeineLevel=caffeineLevel;
this.temperature=temperature;
this.servingStyle=servingStyle;
this.beansType=beansType;
this.preparationMethod=preparationMethod;
this.aromaLevel=aromaLevel;
this.popularity=popularity;
this.bestTimeToDrink=bestTimeToDrink;
this.specialOffer=specialOffer;
this.rating=rating;

}

public void getCoffeeDetails(){

System.out.println("------------------------------");
System.out.println("Coffee ID: "+this.coffeeId);
System.out.println("Coffee Name: "+this.coffeeName);
System.out.println("Coffee Type: "+this.coffeeType);
System.out.println("Coffee Origin: "+this.coffeeOrigin);
System.out.println("Roast Level: "+this.roastLevel);
System.out.println("Coffee Price: "+this.coffeePrice);
System.out.println("Cup Size: "+this.cupSize);
System.out.println("Milk Included: "+this.milkIncluded);
System.out.println("Sugar Included: "+this.sugarIncluded);
System.out.println("Flavor: "+this.flavor);
System.out.println("Caffeine Level: "+this.caffeineLevel);
System.out.println("Temperature: "+this.temperature);
System.out.println("Serving Style: "+this.servingStyle);
System.out.println("Beans Type: "+this.beansType);
System.out.println("Preparation Method: "+this.preparationMethod);
System.out.println("Aroma Level: "+this.aromaLevel);
System.out.println("Popularity: "+this.popularity);
System.out.println("Best Time To Drink: "+this.bestTimeToDrink);
System.out.println("Special Offer: "+this.specialOffer);
System.out.println("Rating: "+this.rating);

}

}