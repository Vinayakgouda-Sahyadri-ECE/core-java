class TourismAngadiExecutor
{
    public static void main(String[] args)
    {

        Package p1 = new Package(1,"Beach Tour","Goa",5,15000,"Bus","3 Star","Yes","Available","Baga Beach","Bangalore","Bangalore","Winter","Family","No","Yes","Open","4.5","Road","10% Discount");
        TourismAngadi t1 = new TourismAngadi(101,"TourismAngadi","Ravi","2015","Bangalore","India",100,"Ravi","Travel",true,true,"Tours","24/7","tour.com","UPI","Yes","Bus","Hotel","Active","4.5");
        t1.pkg = p1;
        t1.getTourismDetails();

        Package p2 = new Package(2,"Hill Tour","Ooty",3,8000,"Car","3 Star","Yes","Available","Botanical Garden","Bangalore","Bangalore","Summer","Couple","No","Yes","Open","4.2","Road","5% Discount");
        TourismAngadi t2 = new TourismAngadi(102,"HolidayTrips","Kiran","2016","Mysore","India",80,"Kiran","Travel",true,false,"Tours","24/7","holiday.com","Card","Yes","Car","Resort","Active","4.2");
        t2.pkg = p2;
        t2.getTourismDetails();

        Package p3 = new Package(3,"Temple Tour","Tirupati",2,5000,"Bus","2 Star","Yes","Available","Balaji Temple","Bangalore","Bangalore","All","Religious","No","Yes","Open","4.8","Road","Free Prasadam");
        TourismAngadi t3 = new TourismAngadi(103,"DivineTours","Mahesh","2014","Hyderabad","India",120,"Mahesh","Travel",true,false,"Pilgrimage","24/7","divine.com","UPI","Yes","Bus","Hotel","Active","4.8");
        t3.pkg = p3;
        t3.getTourismDetails();

        Package p4 = new Package(4,"Desert Tour","Dubai",4,60000,"Flight","5 Star","Yes","Available","Burj Khalifa","Bangalore","Bangalore","Winter","Luxury","Yes","Yes","Open","4.9","Air","20% Discount");
        TourismAngadi t4 = new TourismAngadi(104,"GlobalTours","Arun","2013","Delhi","India",200,"Arun","Travel",true,true,"International","24/7","global.com","Card","Yes","Flight","Luxury Hotel","Active","4.9");
        t4.pkg = p4;
        t4.getTourismDetails();

        Package p5 = new Package(5,"Nature Tour","Coorg",3,9000,"Bus","3 Star","Yes","Available","Abbey Falls","Bangalore","Bangalore","Monsoon","Family","No","Yes","Open","4.3","Road","Free Breakfast");
        TourismAngadi t5 = new TourismAngadi(105,"NatureTrips","Suresh","2017","Bangalore","India",70,"Suresh","Travel",true,false,"Nature","24/7","nature.com","UPI","Yes","Bus","Resort","Active","4.3");
        t5.pkg = p5;
        t5.getTourismDetails();

        Package p6 = new Package(6,"Island Tour","Maldives",5,120000,"Flight","5 Star","Yes","Available","Water Villas","Bangalore","Bangalore","Winter","Luxury","Yes","Yes","Open","4.9","Air","Honeymoon Offer");
        TourismAngadi t6 = new TourismAngadi(106,"DreamTours","Vinay","2012","Mumbai","India",150,"Vinay","Travel",true,true,"Luxury","24/7","dream.com","Card","Yes","Flight","Villa","Active","4.9");
        t6.pkg = p6;
        t6.getTourismDetails();

        Package p7 = new Package(7,"Adventure Tour","Manali",6,20000,"Train","3 Star","Yes","Available","Solang Valley","Bangalore","Bangalore","Winter","Adventure","No","Yes","Open","4.6","Rail","15% Discount");
        TourismAngadi t7 = new TourismAngadi(107,"AdventureTrips","Deepak","2015","Delhi","India",110,"Deepak","Travel",true,true,"Adventure","24/7","adventure.com","UPI","Yes","Train","Hotel","Active","4.6");
        t7.pkg = p7;
        t7.getTourismDetails();

        Package p8 = new Package(8,"City Tour","Mumbai",2,7000,"Train","3 Star","Yes","Available","Gateway of India","Bangalore","Bangalore","All","City","No","Yes","Open","4.1","Rail","Free Dinner");
        TourismAngadi t8 = new TourismAngadi(108,"CityTrips","Ajay","2018","Mumbai","India",90,"Ajay","Travel",true,false,"City Tours","24/7","city.com","UPI","Yes","Train","Hotel","Active","4.1");
        t8.pkg = p8;
        t8.getTourismDetails();

        Package p9 = new Package(9,"Historical Tour","Hampi",3,8500,"Bus","3 Star","Yes","Available","Hampi Ruins","Bangalore","Bangalore","Winter","History","No","Yes","Open","4.4","Road","10% Discount");
        TourismAngadi t9 = new TourismAngadi(109,"HistoryTrips","Rakesh","2016","Hospet","India",60,"Rakesh","Travel",true,false,"History","24/7","history.com","UPI","Yes","Bus","Hotel","Active","4.4");
        t9.pkg = p9;
        t9.getTourismDetails();

        Package p10 = new Package(10,"Wildlife Tour","Bandipur",2,6500,"Bus","Resort","Yes","Available","Safari","Bangalore","Bangalore","Winter","Wildlife","No","Yes","Open","4.3","Road","Free Safari");
        TourismAngadi t10 = new TourismAngadi(110,"WildTrips","Prakash","2019","Mysore","India",50,"Prakash","Travel",true,false,"Wildlife","24/7","wild.com","UPI","Yes","Bus","Resort","Active","4.3");
        t10.pkg = p10;
        t10.getTourismDetails();


        Package p11 = new Package(11,"Kerala Tour","Kerala",5,18000,"Bus","3 Star","Yes","Available","Alleppey","Bangalore","Bangalore","Winter","Family","No","Yes","Open","4.5","Road","10% Discount");
        TourismAngadi t11 = new TourismAngadi(111,"KeralaTrips","Manoj","2015","Kochi","India",80,"Manoj","Travel",true,true,"Tours","24/7","kerala.com","UPI","Yes","Bus","Resort","Active","4.5");
        t11.pkg = p11;
        t11.getTourismDetails();

        Package p12 = new Package(12,"Shimla Tour","Shimla",5,22000,"Train","4 Star","Yes","Available","Mall Road","Bangalore","Bangalore","Winter","Family","No","Yes","Open","4.6","Rail","15% Discount");
        TourismAngadi t12 = new TourismAngadi(112,"SnowTrips","Amit","2014","Delhi","India",100,"Amit","Travel",true,true,"Tours","24/7","snow.com","Card","Yes","Train","Hotel","Active","4.6");
        t12.pkg = p12;
        t12.getTourismDetails();

        Package p13 = new Package(13,"Thailand Tour","Bangkok",6,50000,"Flight","4 Star","Yes","Available","Floating Market","Bangalore","Bangalore","Winter","International","Yes","Yes","Open","4.7","Air","20% Discount");
        TourismAngadi t13 = new TourismAngadi(113,"AsiaTrips","Rahul","2012","Delhi","India",140,"Rahul","Travel",true,true,"International","24/7","asia.com","Card","Yes","Flight","Hotel","Active","4.7");
        t13.pkg = p13;
        t13.getTourismDetails();

        Package p14 = new Package(14,"Singapore Tour","Singapore",5,75000,"Flight","5 Star","Yes","Available","Universal Studios","Bangalore","Bangalore","Winter","Luxury","Yes","Yes","Open","4.9","Air","VIP Offer");
        TourismAngadi t14 = new TourismAngadi(114,"LuxuryTrips","Sanjay","2011","Mumbai","India",180,"Sanjay","Travel",true,true,"Luxury","24/7","luxury.com","Card","Yes","Flight","Luxury Hotel","Active","4.9");
        t14.pkg = p14;
        t14.getTourismDetails();

        Package p15 = new Package(15,"Agra Tour","Agra",2,6000,"Train","3 Star","Yes","Available","Taj Mahal","Bangalore","Bangalore","All","History","No","Yes","Open","4.3","Rail","Free Lunch");
        TourismAngadi t15 = new TourismAngadi(115,"HeritageTrips","Kamal","2016","Agra","India",70,"Kamal","Travel",true,false,"History","24/7","heritage.com","UPI","Yes","Train","Hotel","Active","4.3");
        t15.pkg = p15;
        t15.getTourismDetails();

        Package p16 = new Package(16,"Kashmir Tour","Srinagar",6,40000,"Flight","4 Star","Yes","Available","Dal Lake","Bangalore","Bangalore","Winter","Family","Yes","Yes","Open","4.8","Air","Houseboat Stay");
        TourismAngadi t16 = new TourismAngadi(116,"ParadiseTrips","Imran","2013","Srinagar","India",120,"Imran","Travel",true,true,"Tours","24/7","paradise.com","Card","Yes","Flight","Houseboat","Active","4.8");
        t16.pkg = p16;
        t16.getTourismDetails();

        Package p17 = new Package(17,"Ladakh Tour","Leh",7,45000,"Flight","3 Star","Yes","Available","Pangong Lake","Bangalore","Bangalore","Summer","Adventure","No","Yes","Open","4.7","Air","Bike Ride");
        TourismAngadi t17 = new TourismAngadi(117,"MountainTrips","Karthik","2017","Leh","India",90,"Karthik","Travel",true,true,"Adventure","24/7","mountain.com","UPI","Yes","Flight","Camp","Active","4.7");
        t17.pkg = p17;
        t17.getTourismDetails();

        Package p18 = new Package(18,"Nepal Tour","Kathmandu",5,30000,"Flight","3 Star","Yes","Available","Pashupatinath","Bangalore","Bangalore","Winter","Religious","Yes","Yes","Open","4.5","Air","10% Discount");
        TourismAngadi t18 = new TourismAngadi(118,"HimalayaTrips","Rohit","2014","Kathmandu","Nepal",100,"Rohit","Travel",true,true,"Tours","24/7","himalaya.com","Card","Yes","Flight","Hotel","Active","4.5");
        t18.pkg = p18;
        t18.getTourismDetails();

        Package p19 = new Package(19,"Andaman Tour","Andaman",5,35000,"Flight","4 Star","Yes","Available","Radhanagar Beach","Bangalore","Bangalore","Winter","Family","No","Yes","Open","4.6","Air","Free Snorkeling");
        TourismAngadi t19 = new TourismAngadi(119,"IslandTrips","Naveen","2018","PortBlair","India",75,"Naveen","Travel",true,true,"Tours","24/7","island.com","UPI","Yes","Flight","Resort","Active","4.6");
        t19.pkg = p19;
        t19.getTourismDetails();

        Package p20 = new Package(20,"Europe Tour","Paris",10,200000,"Flight","5 Star","Yes","Available","Eiffel Tower","Bangalore","Bangalore","Summer","Luxury","Yes","Yes","Open","5.0","Air","30% Discount");
        TourismAngadi t20 = new TourismAngadi(120,"WorldTrips","Vikram","2010","London","UK",300,"Vikram","Travel",true,true,"International","24/7","world.com","Card","Yes","Flight","Luxury Hotel","Active","5.0");
        t20.pkg = p20;
        t20.getTourismDetails();

    }
}