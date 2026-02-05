class SuperMarket{
public static void main(String [] args){
	
String vegetables[] = {"Carrot","Beans","Tomato","Raddish","Ladies Fingure","Cabbage","Cauli flower","Bringel","Potato","Beetroot","Brcoli","Cucumber","Onion","Drum Stick","Bitter guard","Red chilli","Green chilli","Capsicum","cassava","Soya Beans","baby Corn","Pumpkin","Garlic","Ginger","Mushromm"};
String fruits[] = {"Banana","Apple","water melon","Straw berry","Musk melon","Chikku","Mango","orange","Grapes","Kiwi","Avacado","Pomogranet ","Guava","Jack fruit","Blue Berry ","Rasberry","Termerind","Custurd Apple","Pine apple","Cherry","Coconut","Dates","Papaya","Peach","Pear"};
String kitchenUtilenses[] = {"knife","Paring knife ","Bread knife","Knife sharpening","cutting board","scissors","Vegetable peeler ","Garlic press ","Grater ","Measuring jug","Blender ","Stirring spoon","Masher ","Oven gloves","Plastic containers ","Kitchen foil","Frok","Cooker","Dish soap","Plate ","Bowls","cups","glasses","Microwave ","Paper towels"};
String perfumes[] = {"Bella Vita White Oud Eau De Parfum","Park Avenue Knight Eau De Parfum","DGZ Party Night Eau De Parfum ","Renee Dark Desire Eau De Parfum","The Man Company Blanc Body Parfum","La French Bestow Eau De Parfum For Men","Carlton London Blush Limited Edition","La French Influencer Eau De Perfume Spray","Ajmal Neea Eau De Parfum","Wipro Softouch 2X French Perfume Fabri","Grace Perfumed Talc","Skinn By Titan Raw Eau De Perfume For Men","Ramsons U.R.Awesome Pour Femme Eau De","Nivea Fresh Natural Roll On","Police To Be Body Spray Deodorant For Men","Kamasutra Spark Men","Skinn By Titan Verge Eau De Perfume","Bryan & Candy New York Japanese Cherry","Nivea Natural Glow Deodorant Roll On","Nivea Fresh Natural Deodoran","Fogg Extreme Fragrance Body Spray "};
String stationary[] = {"pen","pencil","sharpner","Long Scale","Eraser","Compass","Geometry","Protractor","Steel scale","Penpencil","Lead","Long book","king size book","Ruled Book","Unruled book","Classmate book","Sketch pen","Gum","Gum tape","Whitner","Gliter pen","Stepler","Slam Book","Dairy ","Drwaing Book"};
String meats[] = {"Form chiken","Nati chiken","Tyson Chiken","Pork","Mutton","Lamb","jelly fish","anjal fish","Bangude fish","Buthayi Fish","Crab","Squid","Stake","prawns","Sea shell","Tuna Fish","Caveir","Salmon","octopus","oyster","cuttelfish","Liver","Heart","Brain","Intestines"};
String toys[] = {"Chess Board","Business Board","Carrom board","Snake and Ladder","Ludo Board","Lego set","Hot Wheels","Rubiqs cube","Bow and Arrow","Water Gun","Shooting guns","Dot","Bubble Gun","Cricket Bat","Batmiton","ball","Cars","Bikes","Trucks","Tractor","Remote control Cars","Babrie set","Cooking set ","Doll House","phones(dumachale phone)"};
String electricApplianse[] = {"Iron Box","Toaster","Electric stove","Grinder","Owven","Vaccum cleaner","Hair Drier","kettel","ear phone","Fans","Extension Box","Charging cable","Mixer","coffee maker","Speaker","LED bulb","Chapathi maker","Tube Light","Table Fan"};
String spices[] = {"Turmeric","Red Chilli Powder","Coriander Powder","Cumin","Pepper","Mustard Seeds","Fenugreek","Cloves","Cinnamon","Cardamom","Bay Leaf","Star Anise","Fennel","Nutmeg","Mace","Asafoetida","Garam Masala","Chaat Masala","Sambar Powder","Rasam Powder","Dry Ginger","White Pepper","Black Salt","Rock Salt","Curry Leaves"};
String pulses[] = {"Toor Dal","Moong Dal","Masoor Dal","Chana Dal","Urad Dal","Rajma","Chickpeas","Black Gram","Green Gram","Lentils","Cow Peas","Horse Gram","Dry Peas","Soybeans","Pigeon Peas","White Peas","Red Lentils","Split Peas","Bengal Gram","Field Beans","Green Peas","Yellow Peas","Brown Lentils","Kidney Beans","Black Eyed Peas"};
String oils[] = {"Sunflower Oil","Groundnut Oil","Coconut Oil","Mustard Oil","Olive Oil","Palm Oil","Rice Bran Oil","Sesame Oil","Soybean Oil","Canola Oil","Corn Oil","Cottonseed Oil","Avocado Oil","Walnut Oil","Flaxseed Oil","Safflower Oil","Refined Oil","Blended Oil","Butter Oil","Ghee","Peanut Oil","Hazelnut Oil","Pumpkin Seed Oil","Grapeseed Oil","Almond Oil"};
String riceAndGrains[] = {"Basmati Rice","Brown Rice","White Rice","Red Rice","Black Rice","Wheat","Barley","Oats","Millets","Ragi","Jowar","Bajra","Maize","Quinoa","Sorghum","Foxtail Millet","Little Millet","Barnyard Millet","Kodo Millet","Proso Millet","Pearl Millet","Finger Millet","Broken Wheat","Rice Flakes","Corn Grits"};
String sweets[] = {"Ladoo","Jalebi","Gulab Jamun","Rasgulla","Mysore Pak","Kaju Katli","Halwa","Barfi","Peda","Kalakand","Soan Papdi","Modak","Shrikhand","Basundi","Rabri","Payasam","Kesari","Rasmalai","Malpua","Chikki","Milk Cake","Balushahi","Imarti","Cham Cham","Sandesh"};
String personalCare[] = {"Soap","Shampoo","Conditioner","Toothpaste","Toothbrush","Face Wash","Face Cream","Body Lotion","Hand Wash","Sanitizer","Deodorant","Perfume","Hair Oil","Face Scrub","Sunscreen","Shaving Cream","Razor","Lip Balm","Talcum Powder","Face Mask","Hair Gel","Hair Serum","Body Spray","Foot Cream","Hand Cream"};
String householdItems[] = {"Detergent","Dish Wash","Floor Cleaner","Toilet Cleaner","Broom","Mop","Dustbin","Scrubber","Cleaning Cloth","Garbage Bags","Insect Spray","Room Freshener","Phenyl","Bleach","Sponge","Bucket","Wiper","Laundry Bar","Mosquito Repellent","Gloves","Soap Stand","Dust Pan","Doormat","Plastic Box","Storage Container"};
String babyProducts[] = {"Baby Soap","Baby Shampoo","Baby Lotion","Baby Oil","Baby Powder","Diapers","Wipes","Feeding Bottle","Pacifier","Baby Food","Cerelac","Baby Cream","Baby Toothpaste","Baby Toothbrush","Baby Towel","Baby Napkin","Baby Carrier","Baby Walker","Baby Blanket","Baby Soap Bar","Baby Massage Oil","Baby Rash Cream","Baby Bib","Baby Shampoo Mild","Baby Feeding Spoon"};
String stationery[] = {"Notebook","Pen","Pencil","Eraser","Sharpener","Scale","Marker","Highlighter","Sketch Pen","Stapler","Paper Clips","Glue","Fevicol","Chart Paper","White Board Marker","File","Folder","Envelope","Calculator","Diary","Sticky Notes","Drawing Book","Color Pencils","Crayons","Pen Stand"};
String petFood[] = {"Dog Food","Cat Food","Fish Food","Bird Food","Puppy Food","Kitten Food","Dog Biscuits","Cat Treats","Pet Milk","Pet Shampoo","Pet Soap","Pet Collar","Pet Leash","Pet Bowl","Pet Toys","Pet Bed","Pet Vitamins","Pet Supplements","Pet Litter","Pet Cage","Pet Grooming Brush","Pet Nail Cutter","Pet Training Pads","Pet Blanket","Pet Water Bottle"};
String meatAndSeafood[] = {"Chicken","Mutton","Fish","Prawns","Crab","Eggs","Turkey","Duck","Salmon","Tuna","Sardine","Pomfret","Lobster","Squid","Clams","Oysters","Beef","Pork","Keema","Fish Fillet","Chicken Wings","Chicken Sausage","Fish Curry Cut","Shrimp","Crab Meat"};
String electronics[] = {"Television","Refrigerator","Washing Machine","Microwave Oven","Mixer Grinder","Electric Kettle","Rice Cooker","Induction Stove","Ceiling Fan","Table Fan","Air Conditioner","Water Purifier","Vacuum Cleaner","Iron Box","Hair Dryer","Laptop","Desktop Computer","Printer","Router","Mobile Phone","Power Bank","Smart Watch","Bluetooth Speaker","Earphones","Extension Box"};


System.out.println("The available vegetables in supermarket are:");
for(String vegetable: vegetables){
	System.out.println(vegetable);

}

System.out.println("The available fruits in supermarket are:");
for(String fruit : fruits){
    System.out.println(fruit);
}

System.out.println("The available kitchenUtilenses in supermarket are:");
for(String kitchenUtilense : kitchenUtilenses){
    System.out.println(kitchenUtilense);
}

System.out.println("The available perfumes in supermarket are:");
for(String perfume : perfumes){
    System.out.println(perfume);
}

System.out.println("The available stationary in supermarket are:");
for(String item : stationary){
    System.out.println(item);
}

System.out.println("The available meats in supermarket are:");
for(String meat : meats){
    System.out.println(meat);
}

System.out.println("The available toys in supermarket are:");
for(String toy : toys){
    System.out.println(toy);
}

System.out.println("The available electricApplianse in supermarket are:");
for(String appliance : electricApplianse){
    System.out.println(appliance);
}

System.out.println("The available spices in supermarket are:");
for(String spice : spices){
    System.out.println(spice);
}

System.out.println("The available pulses in supermarket are:");
for(String pulse : pulses){
    System.out.println(pulse);
}

System.out.println("The available oils in supermarket are:");
for(String oil : oils){
    System.out.println(oil);
}

System.out.println("The available Rice And Grains in supermarket are:");
for(String grain : riceAndGrains){
    System.out.println(grain);
}

System.out.println("The available sweets in supermarket are:");
for(String sweet : sweets){
    System.out.println(sweet);
}

System.out.println("The available personalCare in supermarket are:");
for(String care : personalCare){
    System.out.println(care);
}

System.out.println("The available householdItems in supermarket are:");
for(String houseitem : householdItems){
    System.out.println(houseitem);
}

System.out.println("The available babyProducts in supermarket are:");
for(String babyItem : babyProducts){
    System.out.println(babyItem);
}

System.out.println("The available stationery in supermarket are:");
for(String stat : stationery){
    System.out.println(stat);
}

System.out.println("The available petFood in supermarket are:");
for(String pet : petFood){
    System.out.println(pet);
}

System.out.println("The available Meat and Seafood in supermarket are:");
for(String food : meatAndSeafood){
    System.out.println(food);
}

System.out.println("The available depends on variable (electronics) in supermarket are:");
for(String electronic : electronics){
    System.out.println(electronic);
}












}



}





