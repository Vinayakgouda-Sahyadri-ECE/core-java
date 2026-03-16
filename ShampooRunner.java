class ShampooRunner {

    public static void main(String[] args) {

        Shampoo s1 = new Shampoo("Head&Shoulders","AntiDandruff","White","Lemon",350,180,"AllHair",false,false,"P&G","USA","Bottle",0.5,"2026","Zinc",true,"HairWash","Liquid","StoreA",1);
        Shampoo s2 = new Shampoo("ClinicPlus","Strong","White","Mild",200,175,"Normal",false,false,"HUL","India","Bottle",0.45,"2026","MilkProtein",false,"HairWash","Liquid","StoreB",1);
        Shampoo s3 = new Shampoo("Dove","Smooth","White","Floral",380,200,"DryHair",false,true,"Unilever","UK","Bottle",0.55,"2026","Keratin",false,"HairWash","Liquid","StoreC",1);
        Shampoo s4 = new Shampoo("Pantene","Repair","White","Fresh",400,180,"Damaged",false,true,"P&G","USA","Bottle",0.5,"2026","ProVitamin",false,"HairWash","Liquid","StoreD",1);
        Shampoo s5 = new Shampoo("Tresemme","Keratin","White","Luxury",450,220,"AllHair",false,true,"Unilever","USA","Bottle",0.6,"2026","Keratin",false,"HairWash","Liquid","StoreE",1);
        Shampoo s6 = new Shampoo("Sunsilk","Black","Black","Sweet",250,180,"Normal",false,false,"Unilever","India","Bottle",0.5,"2026","Amla",false,"HairWash","Liquid","StoreF",1);
        Shampoo s7 = new Shampoo("Wow","Onion","Brown","Natural",500,250,"HairFall",true,true,"WowSkin","India","Bottle",0.7,"2026","OnionOil",true,"HairWash","Liquid","StoreG",1);
        Shampoo s8 = new Shampoo("Loreal","TotalRepair","White","Perfume",420,200,"Damaged",false,true,"Loreal","France","Bottle",0.55,"2026","Protein",false,"HairWash","Liquid","StoreH",1);
        Shampoo s9 = new Shampoo("MamaEarth","Herbal","Green","Natural",480,250,"AllHair",true,true,"MamaEarth","India","Bottle",0.65,"2026","AloeVera",true,"HairWash","Liquid","StoreI",1);
        Shampoo s10 = new Shampoo("Garnier","Fructis","Green","Fruity",360,200,"Normal",false,true,"Garnier","France","Bottle",0.55,"2026","FruitExtract",false,"HairWash","Liquid","StoreJ",1);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
        s7.display();
        s8.display();
        s9.display();
        s10.display();
    }
}