class SalonExecutor{
public static void main(String[] args){

Service s1 = new Service(1,"Hair Cut","Hair","Basic","30 Min",200,"Men","Scissors","Low","Standard","Normal","Chair","Hair","Manual","Low","High","Morning","10% Off","Active","4.5");
Salon a1 = new Salon(101,"Style Salon","Ravi","2015","Bangalore","India",15,"Ravi","Beauty",true,true,"Hair Services","24/7","style.com","UPI","Yes","AC","Luxury","Open","4.6");
a1.service=s1;
a1.getSalonDetails();

Service s2 = new Service(2,"Hair Spa","Hair","Premium","45 Min",800,"Women","Spa Kit","Medium","Premium","Soft","Chair","Hair","Manual","Medium","High","Evening","15% Off","Active","4.6");
Salon a2 = new Salon(102,"Glow Salon","Kiran","2016","Mysore","India",12,"Kiran","Beauty",true,true,"Spa Services","24/7","glow.com","Card","Yes","AC","Luxury","Open","4.5");
a2.service=s2;
a2.getSalonDetails();

Service s3 = new Service(3,"Facial","Skin","Premium","40 Min",900,"Women","Facial Kit","Medium","Premium","Soft","Bed","Face","Manual","Medium","High","Evening","10% Off","Active","4.7");
Salon a3 = new Salon(103,"Beauty Hub","Anil","2014","Hyderabad","India",18,"Anil","Beauty",true,true,"Skin Care","24/7","beautyhub.com","UPI","Yes","AC","Luxury","Open","4.6");
a3.service=s3;
a3.getSalonDetails();

Service s4 = new Service(4,"Shaving","Hair","Basic","20 Min",150,"Men","Razor","Low","Standard","Normal","Chair","Beard","Manual","Low","Medium","Morning","None","Active","4.3");
Salon a4 = new Salon(104,"Classic Salon","Arun","2013","Delhi","India",10,"Arun","Beauty",true,false,"Grooming","24/7","classic.com","UPI","Yes","Fan","Standard","Open","4.2");
a4.service=s4;
a4.getSalonDetails();

Service s5 = new Service(5,"Hair Coloring","Hair","Premium","60 Min",1200,"Unisex","Color Kit","High","Luxury","Smooth","Chair","Hair","Manual","High","High","Evening","20% Off","Active","4.8");
Salon a5 = new Salon(105,"Trendy Salon","Suresh","2017","Bangalore","India",20,"Suresh","Beauty",true,true,"Hair Style","24/7","trendy.com","Card","Yes","AC","Luxury","Open","4.7");
a5.service=s5;
a5.getSalonDetails();

Service s6 = new Service(6,"Hair Wash","Hair","Basic","15 Min",100,"Unisex","Shampoo","Low","Standard","Smooth","Chair","Hair","Manual","Low","Medium","Morning","None","Active","4.2");
Salon a6 = new Salon(106,"Fresh Look","Vinay","2012","Mumbai","India",14,"Vinay","Beauty",true,true,"Hair Wash","24/7","fresh.com","UPI","Yes","AC","Standard","Open","4.4");
a6.service=s6;
a6.getSalonDetails();

Service s7 = new Service(7,"Beard Styling","Hair","Premium","25 Min",300,"Men","Trimmer","Medium","Premium","Sharp","Chair","Beard","Manual","Medium","High","Evening","10% Off","Active","4.5");
Salon a7 = new Salon(107,"Royal Salon","Deepak","2015","Delhi","India",16,"Deepak","Beauty",true,true,"Beard Care","24/7","royal.com","Card","Yes","AC","Luxury","Open","4.6");
a7.service=s7;
a7.getSalonDetails();

Service s8 = new Service(8,"Manicure","Nails","Premium","35 Min",500,"Women","Nail Kit","Medium","Premium","Soft","Chair","Nails","Manual","Medium","High","Afternoon","5% Off","Active","4.4");
Salon a8 = new Salon(108,"Nail Studio","Ajay","2018","Mumbai","India",13,"Ajay","Beauty",true,true,"Nail Care","24/7","nail.com","UPI","Yes","AC","Luxury","Open","4.5");
a8.service=s8;
a8.getSalonDetails();

Service s9 = new Service(9,"Pedicure","Nails","Premium","40 Min",600,"Women","Nail Kit","Medium","Premium","Smooth","Chair","Feet","Manual","Medium","High","Evening","10% Off","Active","4.6");
Salon a9 = new Salon(109,"Foot Care","Rakesh","2016","Hospet","India",11,"Rakesh","Beauty",true,false,"Foot Care","24/7","footcare.com","UPI","Yes","Fan","Standard","Open","4.3");
a9.service=s9;
a9.getSalonDetails();

Service s10 = new Service(10,"Hair Straightening","Hair","Luxury","90 Min",2500,"Women","Straight Kit","High","Luxury","Smooth","Chair","Hair","Machine","High","High","Evening","25% Off","Active","4.9");
Salon a10 = new Salon(110,"Luxury Salon","Prakash","2019","Mysore","India",25,"Prakash","Beauty",true,true,"Hair Treatment","24/7","luxury.com","Card","Yes","AC","Luxury","Open","4.8");
a10.service=s10;
a10.getSalonDetails();

/* continue same pattern */

Service s11 = new Service(11,"Hair Trim","Hair","Basic","20 Min",150,"Men","Scissors","Low","Standard","Normal","Chair","Hair","Manual","Low","Medium","Morning","None","Active","4.2");
Salon a11 = new Salon(111,"Smart Salon","Manoj","2015","Kochi","India",10,"Manoj","Beauty",true,true,"Hair Cut","24/7","smart.com","UPI","Yes","AC","Standard","Open","4.3");
a11.service=s11;
a11.getSalonDetails();

Service s12 = new Service(12,"Skin Polish","Skin","Premium","45 Min",900,"Women","Skin Kit","Medium","Premium","Soft","Bed","Skin","Manual","Medium","High","Evening","10% Off","Active","4.6");
Salon a12 = new Salon(112,"Glow Beauty","Amit","2014","Delhi","India",15,"Amit","Beauty",true,true,"Skin Care","24/7","glowbeauty.com","Card","Yes","AC","Luxury","Open","4.6");
a12.service=s12;
a12.getSalonDetails();

Service s13 = new Service(13,"Hair Rebonding","Hair","Luxury","120 Min",3500,"Women","Rebond Kit","High","Luxury","Smooth","Chair","Hair","Machine","High","High","Evening","20% Off","Active","4.9");
Salon a13 = new Salon(113,"Premium Salon","Rahul","2012","Delhi","India",30,"Rahul","Beauty",true,true,"Hair Treatment","24/7","premium.com","Card","Yes","AC","Luxury","Open","4.8");
a13.service=s13;
a13.getSalonDetails();

Service s14 = new Service(14,"Makeup","Face","Luxury","60 Min",2000,"Women","Makeup Kit","High","Luxury","Smooth","Chair","Face","Manual","High","High","Evening","15% Off","Active","4.8");
Salon a14 = new Salon(114,"Makeover Studio","Sanjay","2011","Mumbai","India",22,"Sanjay","Beauty",true,true,"Makeup","24/7","makeover.com","Card","Yes","AC","Luxury","Open","4.8");
a14.service=s14;
a14.getSalonDetails();

Service s15 = new Service(15,"Threading","Face","Basic","10 Min",80,"Women","Thread","Low","Standard","Normal","Chair","Eyebrow","Manual","Low","Medium","Morning","None","Active","4.3");
Salon a15 = new Salon(115,"Quick Salon","Kamal","2016","Agra","India",9,"Kamal","Beauty",true,false,"Eyebrow","24/7","quick.com","UPI","Yes","Fan","Standard","Open","4.2");
a15.service=s15;
a15.getSalonDetails();

Service s16 = new Service(16,"Hair Smoothening","Hair","Luxury","90 Min",2800,"Women","Smooth Kit","High","Luxury","Smooth","Chair","Hair","Machine","High","High","Evening","20% Off","Active","4.9");
Salon a16 = new Salon(116,"Smooth Salon","Imran","2013","Srinagar","India",18,"Imran","Beauty",true,true,"Hair Care","24/7","smooth.com","Card","Yes","AC","Luxury","Open","4.7");
a16.service=s16;
a16.getSalonDetails();

Service s17 = new Service(17,"Head Massage","Hair","Basic","20 Min",200,"Unisex","Oil","Low","Standard","Relax","Chair","Head","Manual","Low","Medium","Evening","5% Off","Active","4.4");
Salon a17 = new Salon(117,"Relax Salon","Karthik","2017","Leh","India",12,"Karthik","Beauty",true,true,"Massage","24/7","relax.com","UPI","Yes","AC","Standard","Open","4.5");
a17.service=s17;
a17.getSalonDetails();

Service s18 = new Service(18,"Hair Curling","Hair","Premium","50 Min",1500,"Women","Curl Kit","Medium","Premium","Soft","Chair","Hair","Machine","Medium","High","Evening","10% Off","Active","4.6");
Salon a18 = new Salon(118,"Curl Studio","Rohit","2014","Kathmandu","Nepal",14,"Rohit","Beauty",true,true,"Hair Style","24/7","curl.com","Card","Yes","AC","Luxury","Open","4.6");
a18.service=s18;
a18.getSalonDetails();

Service s19 = new Service(19,"Spa Treatment","Body","Luxury","60 Min",2200,"Unisex","Spa Kit","High","Luxury","Relax","Bed","Body","Manual","High","High","Night","15% Off","Active","4.8");
Salon a19 = new Salon(119,"Body Spa","Naveen","2018","PortBlair","India",20,"Naveen","Beauty",true,true,"Spa","24/7","bodyspa.com","UPI","Yes","AC","Luxury","Open","4.7");
a19.service=s19;
a19.getSalonDetails();

Service s20 = new Service(20,"Full Grooming","Hair","Luxury","120 Min",3000,"Men","Groom Kit","High","Luxury","Smooth","Chair","Hair","Manual","High","High","Evening","25% Off","Active","5.0");
Salon a20 = new Salon(120,"Elite Salon","Vikram","2010","London","UK",35,"Vikram","Beauty",true,true,"Grooming","24/7","elite.com","Card","Yes","AC","Luxury","Open","5.0");
a20.service=s20;
a20.getSalonDetails();

}
}