class ConditionerRunner {

    public static void main(String[] args) {

        Conditioner c1 = new Conditioner("Dove","Smooth","White","Floral",350,180,"DryHair",false,true,"Unilever","UK","Bottle",0.5,"2026","Keratin",false,"HairCare","Cream","StoreA",1);
        Conditioner c2 = new Conditioner("Pantene","Repair","White","Fresh",380,200,"Damaged",false,true,"P&G","USA","Bottle",0.55,"2026","ProVitamin",false,"HairCare","Cream","StoreB",1);
        Conditioner c3 = new Conditioner("Tresemme","Keratin","White","Luxury",420,220,"AllHair",false,true,"Unilever","USA","Bottle",0.6,"2026","Keratin",false,"HairCare","Cream","StoreC",1);
        Conditioner c4 = new Conditioner("Sunsilk","Black","Black","Sweet",250,180,"Normal",false,false,"Unilever","India","Bottle",0.5,"2026","Amla",false,"HairCare","Cream","StoreD",1);
        Conditioner c5 = new Conditioner("Loreal","TotalRepair","White","Perfume",400,200,"Damaged",false,true,"Loreal","France","Bottle",0.55,"2026","Protein",false,"HairCare","Cream","StoreE",1);
        Conditioner c6 = new Conditioner("Wow","Onion","Brown","Natural",480,250,"HairFall",true,true,"WowSkin","India","Bottle",0.65,"2026","OnionOil",true,"HairCare","Cream","StoreF",1);
        Conditioner c7 = new Conditioner("MamaEarth","Herbal","Green","Natural",450,250,"AllHair",true,true,"MamaEarth","India","Bottle",0.65,"2026","AloeVera",true,"HairCare","Cream","StoreG",1);
        Conditioner c8 = new Conditioner("Garnier","Fructis","Green","Fruity",360,200,"Normal",false,true,"Garnier","France","Bottle",0.55,"2026","FruitExtract",false,"HairCare","Cream","StoreH",1);
        Conditioner c9 = new Conditioner("ClinicPlus","Strong","White","Mild",220,175,"Normal",false,false,"HUL","India","Bottle",0.45,"2026","MilkProtein",false,"HairCare","Cream","StoreI",1);
        Conditioner c10 = new Conditioner("Head&Shoulders","AntiDandruff","White","Lemon",370,180,"AllHair",false,false,"P&G","USA","Bottle",0.5,"2026","Zinc",true,"HairCare","Cream","StoreJ",1);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
        c7.display();
        c8.display();
        c9.display();
        c10.display();
    }
}