class LotionRunner {

    public static void main(String[] args) {

        Lotion l1 = new Lotion("Nivea","Body","Fresh","White",250,200,"Dry",false,true,"Nivea","Germany","Bottle",0.5,"2026","VitaminE",false,"SkinCare","Cream","StoreA",1);
        Lotion l2 = new Lotion("Vaseline","Moisture","Mild","White",220,180,"Dry",false,true,"Unilever","UK","Bottle",0.45,"2026","PetroleumJelly",false,"SkinCare","Cream","StoreB",1);
        Lotion l3 = new Lotion("Himalaya","Herbal","Natural","Green",200,150,"AllSkin",true,true,"Himalaya","India","Bottle",0.4,"2026","AloeVera",false,"SkinCare","Cream","StoreC",1);
        Lotion l4 = new Lotion("Ponds","Soft","Floral","White",270,200,"Normal",false,true,"Unilever","India","Bottle",0.5,"2026","Glycerin",false,"SkinCare","Cream","StoreD",1);
        Lotion l5 = new Lotion("Dove","DeepCare","Floral","White",300,220,"Dry",false,true,"Unilever","USA","Bottle",0.55,"2026","SheaButter",false,"SkinCare","Cream","StoreE",1);
        Lotion l6 = new Lotion("Wow","Herbal","Natural","Green",350,250,"AllSkin",true,true,"WowSkin","India","Bottle",0.6,"2026","CoconutOil",false,"SkinCare","Cream","StoreF",1);
        Lotion l7 = new Lotion("MamaEarth","Aloe","Natural","Green",320,250,"AllSkin",true,true,"MamaEarth","India","Bottle",0.6,"2026","AloeVera",true,"SkinCare","Cream","StoreG",1);
        Lotion l8 = new Lotion("Lotus","Sun","Fresh","White",380,200,"Normal",false,true,"Lotus","India","Bottle",0.55,"2026","SPF",true,"SkinCare","Cream","StoreH",1);
        Lotion l9 = new Lotion("Garnier","Moisture","Fruity","Yellow",290,200,"Normal",false,true,"Garnier","France","Bottle",0.55,"2026","FruitExtract",false,"SkinCare","Cream","StoreI",1);
        Lotion l10 = new Lotion("Biotique","Herbal","Natural","Green",310,210,"AllSkin",true,true,"Biotique","India","Bottle",0.6,"2026","Herbs",false,"SkinCare","Cream","StoreJ",1);

        l1.display();
        l2.display();
        l3.display();
        l4.display();
        l5.display();
        l6.display();
        l7.display();
        l8.display();
        l9.display();
        l10.display();
    }
}