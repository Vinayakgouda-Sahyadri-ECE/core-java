class CCDExecutor{
public static void main(String[] args){

Coffee c1 = new Coffee(1,"Cappuccino","Hot","India","Medium",180,"Medium",true,true,"Chocolate","Medium","Hot","Cup","Arabica","Espresso","Strong","High","Morning","10% Off","4.5");
CCD d1 = new CCD(101,"Cafe Coffee Day","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","50","Active","Bangalore","4.6");
d1.coffee=c1;
d1.getCCDDetails();

Coffee c2 = new Coffee(2,"Latte","Hot","India","Light",170,"Large",true,true,"Vanilla","Low","Hot","Cup","Arabica","Steam","Mild","High","Morning","5% Off","4.4");
CCD d2 = new CCD(102,"CCD Express","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","Card","Yes","40","Active","Mysore","4.5");
d2.coffee=c2;
d2.getCCDDetails();

Coffee c3 = new Coffee(3,"Mocha","Hot","Brazil","Medium",190,"Medium",true,true,"Chocolate","Medium","Hot","Cup","Arabica","Espresso","Strong","High","Evening","10% Off","4.6");
CCD d3 = new CCD(103,"CCD Hub","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","60","Active","Chennai","4.6");
d3.coffee=c3;
d3.getCCDDetails();

Coffee c4 = new Coffee(4,"Americano","Hot","Colombia","Dark",160,"Medium",false,false,"Bitter","High","Hot","Cup","Robusta","Brew","Strong","Medium","Morning","None","4.3");
CCD d4 = new CCD(104,"CCD Lounge","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","70","Active","Hyderabad","4.5");
d4.coffee=c4;
d4.getCCDDetails();

Coffee c5 = new Coffee(5,"Cold Coffee","Cold","India","Light",200,"Large",true,true,"Cream","Medium","Cold","Glass","Arabica","Blend","Smooth","High","Afternoon","15% Off","4.7");
CCD d5 = new CCD(105,"CCD Cafe","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","Card","Yes","55","Active","Pune","4.6");
d5.coffee=c5;
d5.getCCDDetails();

Coffee c6 = new Coffee(6,"Espresso","Hot","Italy","Dark",150,"Small",false,false,"Strong","High","Hot","Cup","Robusta","Espresso","Strong","High","Morning","None","4.5");
CCD d6 = new CCD(106,"CCD Corner","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","35","Active","Delhi","4.4");
d6.coffee=c6;
d6.getCCDDetails();

Coffee c7 = new Coffee(7,"Irish Coffee","Hot","Ireland","Medium",210,"Medium",true,true,"Cream","Medium","Hot","Cup","Arabica","Blend","Smooth","Medium","Night","10% Off","4.6");
CCD d7 = new CCD(107,"CCD Point","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","Card","Yes","45","Active","Kolkata","4.5");
d7.coffee=c7;
d7.getCCDDetails();

Coffee c8 = new Coffee(8,"Iced Latte","Cold","India","Light",195,"Large",true,true,"Milk","Low","Cold","Glass","Arabica","Blend","Smooth","High","Afternoon","10% Off","4.6");
CCD d8 = new CCD(108,"CCD Stop","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","50","Active","Goa","4.5");
d8.coffee=c8;
d8.getCCDDetails();

Coffee c9 = new Coffee(9,"Caramel Latte","Hot","USA","Medium",205,"Large",true,true,"Caramel","Medium","Hot","Cup","Arabica","Steam","Smooth","High","Evening","10% Off","4.7");
CCD d9 = new CCD(109,"CCD Center","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","Card","Yes","60","Active","Jaipur","4.6");
d9.coffee=c9;
d9.getCCDDetails();

Coffee c10 = new Coffee(10,"Hazelnut Coffee","Hot","Brazil","Medium",200,"Medium",true,true,"Hazelnut","Medium","Hot","Cup","Arabica","Blend","Smooth","High","Morning","5% Off","4.6");
CCD d10 = new CCD(110,"CCD Hub","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","65","Active","Ahmedabad","4.5");
d10.coffee=c10;
d10.getCCDDetails();

Coffee c11 = new Coffee(11,"Vanilla Latte","Hot","USA","Light",195,"Large",true,true,"Vanilla","Low","Hot","Cup","Arabica","Steam","Smooth","High","Morning","10% Off","4.6");
CCD d11 = new CCD(111,"CCD Lounge","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","55","Active","Bhopal","4.5");
d11.coffee=c11;
d11.getCCDDetails();

Coffee c12 = new Coffee(12,"Black Coffee","Hot","India","Dark",140,"Medium",false,false,"Bitter","High","Hot","Cup","Robusta","Brew","Strong","Medium","Morning","None","4.3");
CCD d12 = new CCD(112,"CCD Cafe","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","Card","Yes","40","Active","Lucknow","4.4");
d12.coffee=c12;
d12.getCCDDetails();

Coffee c13 = new Coffee(13,"Chocolate Coffee","Hot","Brazil","Medium",210,"Large",true,true,"Chocolate","Medium","Hot","Cup","Arabica","Blend","Smooth","High","Evening","10% Off","4.7");
CCD d13 = new CCD(113,"CCD Express","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","45","Active","Surat","4.5");
d13.coffee=c13;
d13.getCCDDetails();

Coffee c14 = new Coffee(14,"Iced Americano","Cold","Colombia","Dark",180,"Medium",false,false,"Strong","High","Cold","Glass","Robusta","Brew","Strong","Medium","Afternoon","None","4.4");
CCD d14 = new CCD(114,"CCD Point","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","Card","Yes","50","Active","Indore","4.5");
d14.coffee=c14;
d14.getCCDDetails();

Coffee c15 = new Coffee(15,"Cold Brew","Cold","USA","Medium",220,"Large",false,false,"Smooth","Medium","Cold","Glass","Arabica","Brew","Smooth","High","Afternoon","15% Off","4.8");
CCD d15 = new CCD(115,"CCD Stop","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","60","Active","Nagpur","4.6");
d15.coffee=c15;
d15.getCCDDetails();

Coffee c16 = new Coffee(16,"Café Latte","Hot","Italy","Light",175,"Medium",true,true,"Milk","Low","Hot","Cup","Arabica","Steam","Smooth","High","Morning","5% Off","4.5");
CCD d16 = new CCD(116,"CCD Hub","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","Card","Yes","45","Active","Patna","4.4");
d16.coffee=c16;
d16.getCCDDetails();

Coffee c17 = new Coffee(17,"Flat White","Hot","Australia","Medium",185,"Medium",true,true,"Milk","Medium","Hot","Cup","Arabica","Steam","Smooth","High","Morning","None","4.5");
CCD d17 = new CCD(117,"CCD Center","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","55","Active","Ranchi","4.4");
d17.coffee=c17;
d17.getCCDDetails();

Coffee c18 = new Coffee(18,"Affogato","Cold","Italy","Medium",230,"Medium",true,true,"IceCream","Medium","Cold","Glass","Arabica","Blend","Smooth","High","Night","10% Off","4.7");
CCD d18 = new CCD(118,"CCD Lounge","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","Card","Yes","50","Active","Trivandrum","4.6");
d18.coffee=c18;
d18.getCCDDetails();

Coffee c19 = new Coffee(19,"Macchiato","Hot","Italy","Dark",170,"Small",true,false,"Strong","High","Hot","Cup","Arabica","Espresso","Strong","High","Morning","None","4.5");
CCD d19 = new CCD(119,"CCD Cafe","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","UPI","Yes","40","Active","Coimbatore","4.5");
d19.coffee=c19;
d19.getCCDDetails();

Coffee c20 = new Coffee(20,"Special Blend","Hot","India","Medium",240,"Large",true,true,"Rich","Medium","Hot","Cup","Arabica","Blend","Strong","High","Evening","20% Off","4.8");
CCD d20 = new CCD(120,"CCD Premium","Siddhartha","1996","Bangalore","India",5000,"CEO","Cafe",true,true,"Coffee","24/7","ccd.com","Card","Yes","70","Active","Bangalore","4.8");
d20.coffee=c20;
d20.getCCDDetails();

}
}