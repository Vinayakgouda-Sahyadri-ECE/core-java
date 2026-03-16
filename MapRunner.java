class MapRunner {

    public static void main(String[] args) {

        Map m1 = new Map("World Map","Political","World","Global","English","National Geographic","Multi",100,70,500,2023,"1:100000","Paper",true,true,1,"Education","Wall","MapStore","Classic");
        Map m2 = new Map("India Map","Political","Asia","India","English","Survey India","Multi",90,60,400,2022,"1:50000","Paper",true,true,1,"Education","Wall","MapStore","Standard");
        Map m3 = new Map("Asia Map","Political","Asia","Multiple","English","GeoPub","Multi",95,65,450,2021,"1:75000","Paper",true,true,1,"Education","Wall","MapStore","Classic");
        Map m4 = new Map("Europe Map","Political","Europe","Multiple","English","GeoPub","Multi",90,60,420,2020,"1:80000","Paper",true,true,1,"Education","Wall","MapStore","Standard");
        Map m5 = new Map("USA Map","Political","North America","USA","English","NatGeo","Multi",85,55,380,2023,"1:60000","Paper",true,true,1,"Education","Wall","MapStore","Classic");
        Map m6 = new Map("Africa Map","Political","Africa","Multiple","English","GeoPub","Multi",88,58,390,2022,"1:90000","Paper",true,true,1,"Education","Wall","MapStore","Standard");
        Map m7 = new Map("Australia Map","Political","Australia","Australia","English","GeoPub","Multi",80,50,360,2021,"1:85000","Paper",true,true,1,"Education","Wall","MapStore","Classic");
        Map m8 = new Map("City Map","Tourist","Urban","India","English","CityMaps","Multi",70,45,250,2023,"1:10000","Paper",false,true,1,"Travel","Pocket","TravelShop","Modern");
        Map m9 = new Map("Road Map","Navigation","Country","India","English","RoadAtlas","Multi",75,50,300,2022,"1:20000","Paper",false,true,1,"Travel","Folded","TravelShop","Standard");
        Map m10 = new Map("World Atlas","Atlas","World","Global","English","NatGeo","Multi",110,80,800,2023,"1:120000","Paper",true,false,200,"Education","Book","BookStore","Premium");

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
        m6.display();
        m7.display();
        m8.display();
        m9.display();
        m10.display();
    }
}