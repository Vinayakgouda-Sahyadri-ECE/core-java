class MuseumExecutor{

public static void main(String[] args){

Museum m1 = new Museum(1,"National Museum","Janpath","Delhi","India",25,5000,"10AM","6PM",true,50,"Govt of India","CCTV",true,120,60,"History","Kohinoor Replica","Good","Open");
Diamond d1 = new Diamond(101,"Kohinoor",105.6,"Colorless","Flawless","Brilliant","India","1300","Oval",1000000,"British Crown","Glass Box","10","Very High","Low","Royal","Rare","Temperature Control","Safe","Historic");
m1.diamond=d1;
m1.getMuseumDetails();

System.out.println();
Museum m2 = new Museum(2,"Louvre Museum","Paris","Paris","France",35,10000,"9AM","6PM",true,100,"French Govt","Laser Security",true,200,100,"Art","Hope Diamond","Good","Open");
Diamond d2 = new Diamond(102,"Hope Diamond",45.5,"Blue","Very Clear","Cushion","India","1666","Oval",900000,"Smithsonian","Glass Case","10","High","Medium","Royal","Rare","Temperature Control","Safe","Historic");
m2.diamond=d2;
m2.getMuseumDetails();

System.out.println();
Museum m3 = new Museum(3,"British Museum","London","London","UK",30,8000,"9AM","5PM",true,80,"UK Govt","CCTV",true,150,80,"History","Cullinan Diamond","Good","Open");
Diamond d3 = new Diamond(103,"Cullinan",3106,"Colorless","Flawless","Rough","South Africa","1905","Irregular",2000000,"British Crown","Display Case","10","High","Low","Royal","Very Rare","Controlled","Safe","Historic");
m3.diamond=d3;
m3.getMuseumDetails();

System.out.println();
Museum m4 = new Museum(4,"Metropolitan Museum","New York","New York","USA",40,12000,"10AM","7PM",true,120,"Private Trust","CCTV",true,300,150,"Art","Pink Star","Good","Open");
Diamond d4 = new Diamond(104,"Pink Star",59.6,"Pink","Very Clear","Oval","Africa","1999","Oval",1500000,"Private","Display Box","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m4.diamond=d4;
m4.getMuseumDetails();

System.out.println();
Museum m5 = new Museum(5,"Indian Museum","Park Street","Kolkata","India",20,6000,"10AM","5PM",true,40,"Govt of India","CCTV",true,90,40,"History","Regent Diamond","Good","Open");
Diamond d5 = new Diamond(105,"Regent",140.6,"White","Clear","Brilliant","India","1701","Round",1200000,"French Crown","Display Box","10","High","Low","Royal","Rare","Controlled","Safe","Historic");
m5.diamond=d5;
m5.getMuseumDetails();

System.out.println();

/* 6 – 20 */

Museum m6=new Museum(6,"Heritage Museum","Mysuru","Mysuru","India",15,3000,"10AM","5PM",true,30,"State Govt","CCTV",true,60,25,"History","Diamond Exhibit","Good","Open");
Diamond d6=new Diamond(106,"Blue Moon",12.0,"Blue","Clear","Round","Africa","2014","Round",800000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m6.diamond=d6; m6.getMuseumDetails();

System.out.println();
Museum m7=new Museum(7,"Art Museum","Bangalore","Bangalore","India",18,3500,"10AM","6PM",true,35,"Private","CCTV",true,70,30,"Art","Diamond Show","Good","Open");
Diamond d7=new Diamond(107,"Golden Jubilee",545.6,"Yellow","Clear","Cushion","South Africa","1985","Cushion",1000000,"Royal","Glass","10","High","Low","Royal","Very Rare","Controlled","Safe","Historic");
m7.diamond=d7; m7.getMuseumDetails();

System.out.println();
Museum m8=new Museum(8,"Science Museum","Chennai","Chennai","India",12,2000,"9AM","5PM",true,25,"State Govt","CCTV",true,50,20,"Science","Crystal Exhibit","Good","Open");
Diamond d8=new Diamond(108,"Centenary Diamond",273.8,"Colorless","Flawless","Heart","South Africa","1986","Heart",1100000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m8.diamond=d8; m8.getMuseumDetails();

System.out.println();
Museum m9=new Museum(9,"Royal Museum","Jaipur","Jaipur","India",14,2200,"10AM","6PM",true,30,"Royal Trust","CCTV",true,60,25,"Royal","Crown Diamond","Good","Open");
Diamond d9=new Diamond(109,"Orlov",189.6,"White","Clear","Rose","India","1700","Oval",1300000,"Russian Crown","Glass","10","High","Low","Royal","Rare","Controlled","Safe","Historic");
m9.diamond=d9; m9.getMuseumDetails();

System.out.println();
Museum m10=new Museum(10,"Cultural Museum","Mumbai","Mumbai","India",16,2600,"10AM","6PM",true,40,"State Govt","CCTV",true,65,28,"Culture","Diamond Crown","Good","Open");
Diamond d10=new Diamond(110,"Great Mogul",280,"White","Clear","Rose","India","1650","Round",1500000,"Mughal Crown","Glass","10","High","Low","Royal","Very Rare","Controlled","Safe","Historic");
m10.diamond=d10; m10.getMuseumDetails();

System.out.println();

/* 11–20 simplified */

Museum m11=new Museum(11,"City Museum","Delhi","Delhi","India",10,1500,"10AM","5PM",true,20,"City Govt","CCTV",true,40,15,"History","Diamond","Good","Open");
Diamond d11=new Diamond(111,"Diamond11",20,"White","Clear","Round","Africa","1900","Round",500000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m11.diamond=d11; m11.getMuseumDetails();

System.out.println();
Museum m12=new Museum(12,"City Museum","Delhi","Delhi","India",10,1500,"10AM","5PM",true,20,"City Govt","CCTV",true,40,15,"History","Diamond","Good","Open");
Diamond d12=new Diamond(112,"Diamond12",22,"White","Clear","Round","Africa","1901","Round",520000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m12.diamond=d12; m12.getMuseumDetails();

System.out.println();
Museum m13=new Museum(13,"City Museum","Delhi","Delhi","India",10,1500,"10AM","5PM",true,20,"City Govt","CCTV",true,40,15,"History","Diamond","Good","Open");
Diamond d13=new Diamond(113,"Diamond13",25,"White","Clear","Round","Africa","1902","Round",530000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m13.diamond=d13; m13.getMuseumDetails();

System.out.println();
Museum m14=new Museum(14,"City Museum","Delhi","Delhi","India",10,1500,"10AM","5PM",true,20,"City Govt","CCTV",true,40,15,"History","Diamond","Good","Open");
Diamond d14=new Diamond(114,"Diamond14",28,"White","Clear","Round","Africa","1903","Round",540000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m14.diamond=d14; m14.getMuseumDetails();

System.out.println();
Museum m15=new Museum(15,"City Museum","Delhi","Delhi","India",10,1500,"10AM","5PM",true,20,"City Govt","CCTV",true,40,15,"History","Diamond","Good","Open");
Diamond d15=new Diamond(115,"Diamond15",30,"White","Clear","Round","Africa","1904","Round",550000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m15.diamond=d15; m15.getMuseumDetails();

System.out.println();
Museum m16=new Museum(16,"City Museum","Delhi","Delhi","India",10,1500,"10AM","5PM",true,20,"City Govt","CCTV",true,40,15,"History","Diamond","Good","Open");
Diamond d16=new Diamond(116,"Diamond16",32,"White","Clear","Round","Africa","1905","Round",560000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m16.diamond=d16; m16.getMuseumDetails();

System.out.println();
Museum m17=new Museum(17,"City Museum","Delhi","Delhi","India",10,1500,"10AM","5PM",true,20,"City Govt","CCTV",true,40,15,"History","Diamond","Good","Open");
Diamond d17=new Diamond(117,"Diamond17",34,"White","Clear","Round","Africa","1906","Round",570000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m17.diamond=d17; m17.getMuseumDetails();

System.out.println();
Museum m18=new Museum(18,"City Museum","Delhi","Delhi","India",10,1500,"10AM","5PM",true,20,"City Govt","CCTV",true,40,15,"History","Diamond","Good","Open");
Diamond d18=new Diamond(118,"Diamond18",36,"White","Clear","Round","Africa","1907","Round",580000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m18.diamond=d18; m18.getMuseumDetails();

System.out.println();
Museum m19=new Museum(19,"City Museum","Delhi","Delhi","India",10,1500,"10AM","5PM",true,20,"City Govt","CCTV",true,40,15,"History","Diamond","Good","Open");
Diamond d19=new Diamond(119,"Diamond19",38,"White","Clear","Round","Africa","1908","Round",590000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m19.diamond=d19; m19.getMuseumDetails();

System.out.println();
Museum m20=new Museum(20,"City Museum","Delhi","Delhi","India",10,1500,"10AM","5PM",true,20,"City Govt","CCTV",true,40,15,"History","Diamond","Good","Open");
Diamond d20=new Diamond(120,"Diamond20",40,"White","Clear","Round","Africa","1909","Round",600000,"Private","Glass","10","High","Low","Luxury","Rare","Controlled","Safe","Historic");
m20.diamond=d20; m20.getMuseumDetails();

}
}