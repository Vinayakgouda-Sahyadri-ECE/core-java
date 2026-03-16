class MallExecutor{
public static void main(String[] args){

Mall m1 = new Mall(1,"Orion Mall","Rajajinagar","Bengaluru","Karnataka",5,200,"10AM","10PM",true,500,"Brigade","CCTV",true,10,6,"Luxury","Multiplex","Good","Open");
Shop s1 = new Shop(101,"Nike Store","Sports","Nike",2,"Rahul",15,true,"10AM","10PM","1200 sqft","Online & Offline",true,3,"Black","Installed",true,"Clothing","Open","High");
m1.shop = s1;
m1.getMallDetails();

System.out.println();
Mall m2 = new Mall(2,"Garuda Mall","Magrath Road","Bengaluru","Karnataka",6,180,"10AM","10PM",true,400,"Garuda","CCTV",true,8,5,"Premium","Food Court","Good","Open");
Shop s2 = new Shop(102,"Adidas Store","Sports","Adidas",3,"Kiran",12,true,"10AM","10PM","1100 sqft","Online & Offline",true,2,"White","Installed",true,"Clothing","Open","High");
m2.shop = s2;
m2.getMallDetails();

System.out.println();
Mall m3 = new Mall(3,"Forum Mall","Koramangala","Bengaluru","Karnataka",7,210,"10AM","10PM",true,600,"Prestige","CCTV",true,12,8,"Luxury","Cinema","Good","Open");
Shop s3 = new Shop(103,"Puma Store","Sports","Puma",2,"Arjun",10,true,"10AM","10PM","1000 sqft","Online",true,2,"Red","Installed",true,"Clothing","Open","High");
m3.shop = s3;
m3.getMallDetails();

System.out.println();
Mall m4 = new Mall(4,"Phoenix Mall","Whitefield","Bengaluru","Karnataka",8,250,"10AM","11PM",true,700,"Phoenix","CCTV",true,14,10,"Luxury","Gaming Zone","Good","Open");
Shop s4 = new Shop(104,"Zara","Fashion","Zara",4,"Sneha",20,true,"10AM","11PM","2000 sqft","Online & Offline",true,4,"Brown","Installed",true,"Clothing","Open","High");
m4.shop = s4;
m4.getMallDetails();

System.out.println();
Mall m5 = new Mall(5,"UB City Mall","Vittal Mallya Rd","Bengaluru","Karnataka",5,120,"10AM","10PM",true,300,"UB Group","CCTV",true,6,4,"Luxury","Restaurants","Good","Open");
Shop s5 = new Shop(105,"Louis Vuitton","Luxury","LV",2,"Amit",8,true,"10AM","10PM","900 sqft","Offline",true,1,"Gold","Installed",true,"Luxury","Open","High");
m5.shop = s5;
m5.getMallDetails();

System.out.println();
Mall m6 = new Mall(6,"GT Mall","Magadi Road","Bengaluru","Karnataka",4,90,"10AM","9PM",true,200,"GT Group","CCTV",true,4,3,"Normal","Theatre","Average","Open");
Shop s6 = new Shop(106,"Reliance Trends","Clothing","Reliance",1,"Ravi",18,true,"10AM","9PM","1500 sqft","Online & Offline",true,3,"Blue","Installed",true,"Clothing","Open","Medium");
m6.shop = s6;
m6.getMallDetails();

System.out.println();
Mall m7 = new Mall(7,"Esteem Mall","Hebbal","Bengaluru","Karnataka",5,140,"10AM","10PM",true,350,"Esteem","CCTV",true,6,4,"Premium","Food Court","Good","Open");
Shop s7 = new Shop(107,"Levis Store","Clothing","Levis",2,"Manoj",9,true,"10AM","10PM","1000 sqft","Online & Offline",true,2,"Blue","Installed",true,"Clothing","Open","High");
m7.shop = s7;
m7.getMallDetails();

System.out.println();
Mall m8 = new Mall(8,"Lulu Mall","Kochi","Kochi","Kerala",9,300,"9AM","11PM",true,1000,"Lulu Group","CCTV",true,18,12,"Mega","Aquarium","Excellent","Open");
Shop s8 = new Shop(108,"Apple Store","Electronics","Apple",3,"Joseph",25,true,"9AM","11PM","2500 sqft","Online & Offline",false,6,"White","Installed",true,"Electronics","Open","Very High");
m8.shop = s8;
m8.getMallDetails();

System.out.println();
Mall m9 = new Mall(9,"City Centre","Salt Lake","Kolkata","West Bengal",6,180,"10AM","10PM",true,400,"Ambuja","CCTV",true,8,6,"Premium","Cinema","Good","Open");
Shop s9 = new Shop(109,"Reebok","Sports","Reebok",2,"Sourav",11,true,"10AM","10PM","1100 sqft","Online",true,2,"Black","Installed",true,"Sports","Open","Medium");
m9.shop = s9;
m9.getMallDetails();

System.out.println();
Mall m10 = new Mall(10,"Inorbit Mall","Malad","Mumbai","Maharashtra",7,200,"10AM","10PM",true,450,"Inorbit","CCTV",true,9,6,"Premium","Arcade","Good","Open");
Shop s10 = new Shop(110,"Pantaloons","Clothing","Pantaloons",3,"Vikas",16,true,"10AM","10PM","1400 sqft","Online & Offline",true,3,"Yellow","Installed",true,"Clothing","Open","High");
m10.shop = s10;
m10.getMallDetails();

System.out.println();
Mall m11 = new Mall(11,"Express Avenue","Royapettah","Chennai","Tamil Nadu",6,190,"10AM","10PM",true,420,"Express","CCTV",true,8,5,"Premium","Cinema","Good","Open");
Shop s11 = new Shop(111,"H&M","Fashion","H&M",3,"Aravind",20,true,"10AM","10PM","1700 sqft","Online & Offline",true,4,"White","Installed",true,"Clothing","Open","High");
m11.shop = s11;
m11.getMallDetails();

System.out.println();
Mall m12 = new Mall(12,"DLF Mall","Noida","Noida","UP",10,350,"10AM","11PM",true,1200,"DLF","CCTV",true,20,14,"Mega","Theme Park","Excellent","Open");
Shop s12 = new Shop(112,"Samsung Store","Electronics","Samsung",2,"Rohit",22,true,"10AM","11PM","2100 sqft","Online & Offline",false,5,"Blue","Installed",true,"Electronics","Open","Very High");
m12.shop = s12;
m12.getMallDetails();

System.out.println();
Mall m13 = new Mall(13,"Ambience Mall","Gurgaon","Gurgaon","Haryana",8,260,"10AM","10PM",true,650,"Ambience","CCTV",true,12,9,"Luxury","Ice Rink","Excellent","Open");
Shop s13 = new Shop(113,"Gucci","Luxury","Gucci",4,"Kunal",7,true,"10AM","10PM","900 sqft","Offline",true,1,"Black","Installed",true,"Luxury","Open","Very High");
m13.shop = s13;
m13.getMallDetails();

System.out.println();
Mall m14 = new Mall(14,"Forum Vijaya Mall","Vadapalani","Chennai","Tamil Nadu",7,220,"10AM","10PM",true,500,"Prestige","CCTV",true,9,6,"Premium","Cinema","Good","Open");
Shop s14 = new Shop(114,"Nike Store","Sports","Nike",2,"Vijay",14,true,"10AM","10PM","1200 sqft","Online & Offline",true,3,"Black","Installed",true,"Sports","Open","High");
m14.shop = s14;
m14.getMallDetails();

System.out.println();
Mall m15 = new Mall(15,"GIP Mall","Noida","Noida","UP",6,200,"10AM","10PM",true,400,"Unitech","CCTV",true,8,6,"Premium","Food Court","Good","Open");
Shop s15 = new Shop(115,"Zudio","Clothing","Tata",1,"Sanjay",18,true,"10AM","10PM","1500 sqft","Online & Offline",true,3,"Red","Installed",true,"Clothing","Open","High");
m15.shop = s15;
m15.getMallDetails();

System.out.println();
Mall m16 = new Mall(16,"Orion East","Banaswadi","Bengaluru","Karnataka",5,150,"10AM","10PM",true,350,"Brigade","CCTV",true,7,4,"Premium","Cinema","Good","Open");
Shop s16 = new Shop(116,"Puma","Sports","Puma",2,"Deepak",10,true,"10AM","10PM","1000 sqft","Online",true,2,"Red","Installed",true,"Sports","Open","Medium");
m16.shop = s16;
m16.getMallDetails();

System.out.println();
Mall m17 = new Mall(17,"VR Mall","Anna Nagar","Chennai","Tamil Nadu",7,210,"10AM","10PM",true,500,"Virtuous","CCTV",true,10,7,"Premium","Gaming","Good","Open");
Shop s17 = new Shop(117,"Reliance Digital","Electronics","Reliance",3,"Ajay",19,true,"10AM","10PM","1800 sqft","Online & Offline",false,4,"Blue","Installed",true,"Electronics","Open","High");
m17.shop = s17;
m17.getMallDetails();

System.out.println();
Mall m18 = new Mall(18,"Pacific Mall","Tagore Garden","Delhi","Delhi",6,190,"10AM","10PM",true,450,"Pacific","CCTV",true,8,6,"Premium","Cinema","Good","Open");
Shop s18 = new Shop(118,"Adidas","Sports","Adidas",2,"Mohit",13,true,"10AM","10PM","1100 sqft","Online",true,2,"White","Installed",true,"Sports","Open","High");
m18.shop = s18;
m18.getMallDetails();

System.out.println();
Mall m19 = new Mall(19,"High Street Phoenix","Lower Parel","Mumbai","Maharashtra",8,260,"10AM","11PM",true,700,"Phoenix","CCTV",true,14,9,"Luxury","Nightlife","Excellent","Open");
Shop s19 = new Shop(119,"Rolex","Luxury","Rolex",4,"Ramesh",6,true,"10AM","11PM","800 sqft","Offline",false,1,"Gold","Installed",true,"Luxury","Open","Very High");
m19.shop = s19;
m19.getMallDetails();

System.out.println();
Mall m20 = new Mall(20,"Forum Rex","Whitefield","Bengaluru","Karnataka",6,200,"10AM","10PM",true,480,"Prestige","CCTV",true,9,6,"Premium","Cinema","Good","Open");
Shop s20 = new Shop(120,"H&M","Fashion","H&M",3,"Suresh",17,true,"10AM","10PM","1700 sqft","Online & Offline",true,4,"White","Installed",true,"Clothing","Open","High");
m20.shop = s20;
m20.getMallDetails();

}
}