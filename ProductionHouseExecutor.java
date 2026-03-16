class ProductionHouseExecutor{

public static void main(String[] args){

ProductionHouse ph1 = new ProductionHouse(1,"Dharma Productions","Karan Johar","1979","Mumbai","India",500,50,"Kuch Kuch Hota Hai","Bollywood",true,"Yash Raj","Mumbai","Karan Johar","Karan Johar","Film Production","ARRI Camera","Dharma Studio","Active","AAA");
Movie m1 = new Movie(101,"Student Of The Year","Karan Johar","Karan Johar","Varun Dhawan","Alia Bhatt","Romance","Hindi","2012",60,100,"Vishal-Shekhar","Anil Mehta","Deepa Bhatia","India","150 min","U/A","Released","Netflix","4.5");
ph1.movie=m1;
ph1.getProductionHouseDetails();

System.out.println();
ProductionHouse ph2 = new ProductionHouse(2,"Red Chillies","Shah Rukh Khan","2002","Mumbai","India",400,40,"Chennai Express","Bollywood",true,"Eros","Mumbai","Rohit Shetty","Gauri Khan","Film Production","Sony Camera","RC Studio","Active","AAA");
Movie m2 = new Movie(102,"Chennai Express","Rohit Shetty","Gauri Khan","Shah Rukh Khan","Deepika Padukone","Action","Hindi","2013",70,400,"Vishal-Shekhar","Dudley","Steven Bernard","India","140 min","U/A","Released","Netflix","4.7");
ph2.movie=m2;
ph2.getProductionHouseDetails();

System.out.println();
ProductionHouse ph3 = new ProductionHouse(3,"Yash Raj Films","Aditya Chopra","1970","Mumbai","India",600,100,"Dilwale Dulhania Le Jayenge","Bollywood",true,"YRF Distribution","Mumbai","Aditya Chopra","Aditya Chopra","Film Production","ARRI","YRF Studio","Active","AAA");
Movie m3 = new Movie(103,"DDLJ","Aditya Chopra","Yash Chopra","Shah Rukh Khan","Kajol","Romance","Hindi","1995",40,200,"Jatin Lalit","Manmohan Singh","Keshav Naidu","India","189 min","U","Released","Amazon Prime","5");
ph3.movie=m3;
ph3.getProductionHouseDetails();

System.out.println();
ProductionHouse ph4 = new ProductionHouse(4,"Hombale Films","Vijay Kiragandur","2013","Bangalore","India",200,15,"KGF","Sandalwood",true,"AA Films","Bangalore","Prashanth Neel","Vijay Kiragandur","Film Production","RED Camera","Hombale Studio","Active","AAA");
Movie m4 = new Movie(104,"KGF Chapter 1","Prashanth Neel","Vijay Kiragandur","Yash","Srinidhi Shetty","Action","Kannada","2018",80,250,"Ravi Basrur","Bhuvan Gowda","Srikanth","India","156 min","U/A","Released","Amazon Prime","4.8");
ph4.movie=m4;
ph4.getProductionHouseDetails();

System.out.println();
ProductionHouse ph5 = new ProductionHouse(5,"Mythri Movie Makers","Naveen Yerneni","2015","Hyderabad","India",300,20,"Pushpa","Tollywood",true,"Mythri Distribution","Hyderabad","Sukumar","Naveen","Film Production","Sony","Mythri Studio","Active","AAA");
Movie m5 = new Movie(105,"Pushpa","Sukumar","Naveen","Allu Arjun","Rashmika","Action","Telugu","2021",120,350,"Devi Sri Prasad","Miroslaw Kuba","Karthika Srinivas","India","179 min","U/A","Released","Amazon Prime","4.9");
ph5.movie=m5;
ph5.getProductionHouseDetails();

System.out.println();

/* 6–20 simplified */

ProductionHouse ph6=new ProductionHouse(6,"Sun Pictures","Kalanithi Maran","2000","Chennai","India",250,25,"Jailer","Kollywood",true,"Sun Network","Chennai","Nelson","Kalanithi","Film Production","Sony","Sun Studio","Active","AAA");
Movie m6=new Movie(106,"Jailer","Nelson","Kalanithi","Rajinikanth","Tamannaah","Action","Tamil","2023",200,600,"Anirudh","Vijay Kartik","R Nirmal","India","160 min","U/A","Released","Prime","4.7");
ph6.movie=m6; ph6.getProductionHouseDetails();

System.out.println();
ProductionHouse ph7=new ProductionHouse(7,"Geetha Arts","Allu Aravind","1972","Hyderabad","India",220,60,"Magadheera","Tollywood",true,"GA Distribution","Hyderabad","Rajamouli","Allu Aravind","Film Production","ARRI","GA Studio","Active","AAA");
Movie m7=new Movie(107,"Magadheera","Rajamouli","Allu Aravind","Ram Charan","Kajal","Action","Telugu","2009",40,150,"MM Keeravani","Senthil","Kotagiri","India","165 min","U/A","Released","Hotstar","4.8");
ph7.movie=m7; ph7.getProductionHouseDetails();

System.out.println();
ProductionHouse ph8=new ProductionHouse(8,"Aashirvad Cinemas","Antony Perumbavoor","2000","Kerala","India",180,30,"Drishyam","Mollywood",true,"Aashirvad","Kerala","Jeethu Joseph","Antony","Film Production","RED","Aashirvad Studio","Active","AAA");
Movie m8=new Movie(108,"Drishyam","Jeethu Joseph","Antony","Mohanlal","Meena","Thriller","Malayalam","2013",15,75,"Anil Johnson","Sujith","Vinayak","India","160 min","U","Released","Prime","4.9");
ph8.movie=m8; ph8.getProductionHouseDetails();

System.out.println();
ProductionHouse ph9=new ProductionHouse(9,"Excel Entertainment","Farhan Akhtar","1999","Mumbai","India",250,40,"Zindagi Na Milegi Dobara","Bollywood",true,"Excel Dist","Mumbai","Zoya Akhtar","Farhan","Film Production","Sony","Excel Studio","Active","AAA");
Movie m9=new Movie(109,"ZNMD","Zoya Akhtar","Farhan","Hrithik","Katrina","Drama","Hindi","2011",60,150,"Shankar Ehsaan Loy","Carlos Catalan","Anand Subaya","India","153 min","U/A","Released","Netflix","4.7");
ph9.movie=m9; ph9.getProductionHouseDetails();

System.out.println();
ProductionHouse ph10=new ProductionHouse(10,"Rajkamal Films","Kamal Haasan","1981","Chennai","India",200,35,"Vikram","Kollywood",true,"RKF Dist","Chennai","Lokesh Kanagaraj","Kamal","Film Production","ARRI","RK Studio","Active","AAA");
Movie m10=new Movie(110,"Vikram","Lokesh","Kamal","Kamal Haasan","None","Action","Tamil","2022",120,400,"Anirudh","Girish","Philomin","India","175 min","U/A","Released","Hotstar","4.8");
ph10.movie=m10; ph10.getProductionHouseDetails();

System.out.println();

/* 11–20 */

ProductionHouse ph11=new ProductionHouse(11,"Company11","Owner","2000","City","Country",100,10,"Movie","Film",true,"Dist","Studio","Director","Producer","Film","Camera","Edit","Active","A");
Movie m11=new Movie(111,"Movie11","Director","Producer","Hero","Heroine","Genre","Lang","2020",10,20,"Music","Camera","Editor","Country","120","U/A","Released","OTT","4");
ph11.movie=m11; ph11.getProductionHouseDetails();

System.out.println();
ProductionHouse ph12=new ProductionHouse(12,"Company12","Owner","2001","City","Country",110,11,"Movie","Film",true,"Dist","Studio","Director","Producer","Film","Camera","Edit","Active","A");
Movie m12=new Movie(112,"Movie12","Director","Producer","Hero","Heroine","Genre","Lang","2021",10,20,"Music","Camera","Editor","Country","120","U/A","Released","OTT","4");
ph12.movie=m12; ph12.getProductionHouseDetails();

System.out.println();
ProductionHouse ph13=new ProductionHouse(13,"Company13","Owner","2002","City","Country",120,12,"Movie","Film",true,"Dist","Studio","Director","Producer","Film","Camera","Edit","Active","A");
Movie m13=new Movie(113,"Movie13","Director","Producer","Hero","Heroine","Genre","Lang","2022",10,20,"Music","Camera","Editor","Country","120","U/A","Released","OTT","4");
ph13.movie=m13; ph13.getProductionHouseDetails();

System.out.println();
ProductionHouse ph14=new ProductionHouse(14,"Company14","Owner","2003","City","Country",130,13,"Movie","Film",true,"Dist","Studio","Director","Producer","Film","Camera","Edit","Active","A");
Movie m14=new Movie(114,"Movie14","Director","Producer","Hero","Heroine","Genre","Lang","2023",10,20,"Music","Camera","Editor","Country","120","U/A","Released","OTT","4");
ph14.movie=m14; ph14.getProductionHouseDetails();

System.out.println();
ProductionHouse ph15=new ProductionHouse(15,"Company15","Owner","2004","City","Country",140,14,"Movie","Film",true,"Dist","Studio","Director","Producer","Film","Camera","Edit","Active","A");
Movie m15=new Movie(115,"Movie15","Director","Producer","Hero","Heroine","Genre","Lang","2024",10,20,"Music","Camera","Editor","Country","120","U/A","Released","OTT","4");
ph15.movie=m15; ph15.getProductionHouseDetails();

System.out.println();
ProductionHouse ph16=new ProductionHouse(16,"Company16","Owner","2005","City","Country",150,15,"Movie","Film",true,"Dist","Studio","Director","Producer","Film","Camera","Edit","Active","A");
Movie m16=new Movie(116,"Movie16","Director","Producer","Hero","Heroine","Genre","Lang","2025",10,20,"Music","Camera","Editor","Country","120","U/A","Released","OTT","4");
ph16.movie=m16; ph16.getProductionHouseDetails();

System.out.println();
ProductionHouse ph17=new ProductionHouse(17,"Company17","Owner","2006","City","Country",160,16,"Movie","Film",true,"Dist","Studio","Director","Producer","Film","Camera","Edit","Active","A");
Movie m17=new Movie(117,"Movie17","Director","Producer","Hero","Heroine","Genre","Lang","2026",10,20,"Music","Camera","Editor","Country","120","U/A","Released","OTT","4");
ph17.movie=m17; ph17.getProductionHouseDetails();

System.out.println();
ProductionHouse ph18=new ProductionHouse(18,"Company18","Owner","2007","City","Country",170,17,"Movie","Film",true,"Dist","Studio","Director","Producer","Film","Camera","Edit","Active","A");
Movie m18=new Movie(118,"Movie18","Director","Producer","Hero","Heroine","Genre","Lang","2027",10,20,"Music","Camera","Editor","Country","120","U/A","Released","OTT","4");
ph18.movie=m18; ph18.getProductionHouseDetails();

System.out.println();
ProductionHouse ph19=new ProductionHouse(19,"Company19","Owner","2008","City","Country",180,18,"Movie","Film",true,"Dist","Studio","Director","Producer","Film","Camera","Edit","Active","A");
Movie m19=new Movie(119,"Movie19","Director","Producer","Hero","Heroine","Genre","Lang","2028",10,20,"Music","Camera","Editor","Country","120","U/A","Released","OTT","4");
ph19.movie=m19; ph19.getProductionHouseDetails();

System.out.println();
ProductionHouse ph20=new ProductionHouse(20,"Company20","Owner","2009","City","Country",190,19,"Movie","Film",true,"Dist","Studio","Director","Producer","Film","Camera","Edit","Active","A");
Movie m20=new Movie(120,"Movie20","Director","Producer","Hero","Heroine","Genre","Lang","2029",10,20,"Music","Camera","Editor","Country","120","U/A","Released","OTT","4");
ph20.movie=m20;
ph20.getProductionHouseDetails();

}
}