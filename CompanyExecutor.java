class CompanyExecutor{

public static void main(String[] args){

Company c1 = new Company(1,"Infosys","Bangalore","Bangalore","India",350000,20,"Salil Parekh","1981","IT Services",true,150000,"MNC","Software","Bangalore","Ravi","Suresh","Active","NSE","AAA");
Project p1 = new Project(101,"Banking App","Software","HDFC","01-01-2024","01-09-2024",20,500000,"Anil","Java","Finance","Agile","Automation","Cloud","Java","MySQL","India","Running","High","Success");
c1.project=p1;
c1.getCompanyDetails();

System.out.println();
Company c2 = new Company(2,"TCS","Mumbai","Mumbai","India",500000,25,"K Krithivasan","1968","IT Services",true,200000,"MNC","Software","Mumbai","Amit","Rohit","Active","NSE","AAA");
Project p2 = new Project(102,"Insurance Portal","Software","LIC","02-01-2024","12-10-2024",25,600000,"Rahul","Spring","Insurance","Agile","Manual","Cloud","Java","Oracle","India","Running","High","Success");
c2.project=p2;
c2.getCompanyDetails();

System.out.println();
Company c3 = new Company(3,"Wipro","Bangalore","Bangalore","India",250000,18,"Thierry Delaporte","1945","IT Services",true,120000,"MNC","Consulting","Bangalore","Manoj","Arun","Active","NSE","AA");
Project p3 = new Project(103,"Healthcare System","Software","Apollo","03-02-2024","11-11-2024",18,400000,"Deepak","Python","Healthcare","Agile","Automation","Cloud","Python","PostgreSQL","India","Running","Medium","Success");
c3.project=p3;
c3.getCompanyDetails();

System.out.println();
Company c4 = new Company(4,"Google","California","California","USA",150000,30,"Sundar Pichai","1998","Technology",true,1000000,"MNC","Search Engine","California","Ramesh","Mahesh","Active","NASDAQ","AAA");
Project p4 = new Project(104,"AI Chatbot","AI","Global","01-03-2024","12-12-2024",50,900000,"John","Python","AI","Agile","Automation","Cloud","Python","MongoDB","USA","Running","High","Success");
c4.project=p4;
c4.getCompanyDetails();

System.out.println();
Company c5 = new Company(5,"Microsoft","Washington","Seattle","USA",200000,35,"Satya Nadella","1975","Technology",true,1500000,"MNC","Windows","Seattle","Ravi","Arjun","Active","NASDAQ","AAA");
Project p5 = new Project(105,"Cloud Platform","Cloud","Azure","05-02-2024","10-12-2024",40,800000,"David","C#","Cloud","Scrum","Automation","Cloud","C#","SQL Server","USA","Running","High","Success");
c5.project=p5;
c5.getCompanyDetails();

System.out.println();

/* 6–20 */

Company c6=new Company(6,"Amazon","Seattle","Seattle","USA",1500000,40,"Andy Jassy","1994","E-Commerce",true,2000000,"MNC","Online Store","USA","Sanjay","Kumar","Active","NASDAQ","AAA");
Project p6=new Project(106,"Shopping Platform","Web","Global","01-04-2024","12-12-2024",60,1000000,"Alex","Java","E-Commerce","Agile","Automation","Cloud","Java","DynamoDB","USA","Running","High","Success");
c6.project=p6; c6.getCompanyDetails();

System.out.println();
Company c7=new Company(7,"Meta","California","California","USA",80000,22,"Mark Zuckerberg","2004","Social Media",true,900000,"MNC","Facebook","USA","Suresh","Naresh","Active","NASDAQ","AAA");
Project p7=new Project(107,"Social Platform","App","Global","02-02-2024","11-11-2024",35,700000,"Chris","React","Social","Agile","Manual","Cloud","JavaScript","MongoDB","USA","Running","Medium","Success");
c7.project=p7; c7.getCompanyDetails();

System.out.println();
Company c8=new Company(8,"IBM","New York","New York","USA",300000,28,"Arvind Krishna","1911","Technology",true,600000,"MNC","Consulting","USA","Kiran","Dev","Active","NYSE","AA");
Project p8=new Project(108,"Data Analytics","AI","Global","03-03-2024","10-10-2024",30,650000,"Mike","Python","Analytics","Agile","Automation","Cloud","Python","DB2","USA","Running","Medium","Success");
c8.project=p8; c8.getCompanyDetails();

System.out.println();
Company c9=new Company(9,"Oracle","California","California","USA",140000,26,"Safra Catz","1977","Technology",true,500000,"MNC","Database","USA","Prakash","Manu","Active","NYSE","AA");
Project p9=new Project(109,"Database Engine","Software","Global","04-04-2024","09-09-2024",28,600000,"Robert","Java","Database","Agile","Manual","Cloud","Java","OracleDB","USA","Running","Medium","Success");
c9.project=p9; c9.getCompanyDetails();

System.out.println();
Company c10=new Company(10,"Intel","California","California","USA",120000,24,"Pat Gelsinger","1968","Semiconductor",true,700000,"MNC","Processors","USA","Ajay","Rohit","Active","NASDAQ","AA");
Project p10=new Project(110,"Chip Design","Hardware","Global","05-05-2024","08-08-2024",50,900000,"Kevin","C++","Hardware","Agile","Automation","On-Premise","C++","EmbeddedDB","USA","Running","High","Success");
c10.project=p10; c10.getCompanyDetails();

System.out.println();

/* 11–20 simplified */

Company c11=new Company(11,"StartupOne","Delhi","Delhi","India",200,5,"Ravi","2015","Startup",false,5000,"Private","App","Delhi","Rohit","Amit","Active","Private","A");
Project p11=new Project(111,"Mobile App","App","Local","01-01-2024","05-05-2024",10,10000,"Vikram","Flutter","Mobile","Agile","Manual","Cloud","Dart","Firebase","India","Completed","Medium","Success");
c11.project=p11; c11.getCompanyDetails();

System.out.println();
Company c12=new Company(12,"StartupTwo","Delhi","Delhi","India",220,6,"Ankit","2016","Startup",false,6000,"Private","App","Delhi","Rohit","Amit","Active","Private","A");
Project p12=new Project(112,"Web Portal","Web","Local","02-01-2024","06-05-2024",12,12000,"Aman","React","Web","Agile","Manual","Cloud","JavaScript","MySQL","India","Completed","Medium","Success");
c12.project=p12; c12.getCompanyDetails();

System.out.println();
Company c13=new Company(13,"StartupThree","Delhi","Delhi","India",240,7,"Neeraj","2017","Startup",false,7000,"Private","App","Delhi","Rohit","Amit","Active","Private","A");
Project p13=new Project(113,"ERP System","Software","Local","03-01-2024","07-05-2024",14,14000,"Raj","Java","Business","Agile","Manual","Cloud","Java","MySQL","India","Completed","Medium","Success");
c13.project=p13; c13.getCompanyDetails();

System.out.println();
Company c14=new Company(14,"StartupFour","Delhi","Delhi","India",260,7,"Sanjay","2018","Startup",false,8000,"Private","App","Delhi","Rohit","Amit","Active","Private","A");
Project p14=new Project(114,"Inventory System","Software","Local","04-01-2024","08-05-2024",16,15000,"Deepak","Python","Business","Agile","Manual","Cloud","Python","SQLite","India","Completed","Medium","Success");
c14.project=p14; c14.getCompanyDetails();

System.out.println();
Company c15=new Company(15,"StartupFive","Delhi","Delhi","India",280,8,"Aakash","2019","Startup",false,9000,"Private","App","Delhi","Rohit","Amit","Active","Private","A");
Project p15=new Project(115,"Delivery App","Mobile","Local","05-01-2024","09-05-2024",18,16000,"Rohan","Flutter","Delivery","Agile","Manual","Cloud","Dart","Firebase","India","Completed","Medium","Success");
c15.project=p15; c15.getCompanyDetails();

System.out.println();
Company c16=new Company(16,"StartupSix","Delhi","Delhi","India",300,8,"Nikhil","2020","Startup",false,10000,"Private","App","Delhi","Rohit","Amit","Active","Private","A");
Project p16=new Project(116,"Taxi App","Mobile","Local","06-01-2024","10-05-2024",20,17000,"Ravi","Flutter","Transport","Agile","Manual","Cloud","Dart","Firebase","India","Completed","Medium","Success");
c16.project=p16; c16.getCompanyDetails();

System.out.println();
Company c17=new Company(17,"StartupSeven","Delhi","Delhi","India",320,9,"Mohit","2021","Startup",false,11000,"Private","App","Delhi","Rohit","Amit","Active","Private","A");
Project p17=new Project(117,"Food App","Mobile","Local","07-01-2024","11-05-2024",22,18000,"Ramesh","Flutter","Food","Agile","Manual","Cloud","Dart","Firebase","India","Completed","Medium","Success");
c17.project=p17; c17.getCompanyDetails();

System.out.println();
Company c18=new Company(18,"StartupEight","Delhi","Delhi","India",340,9,"Vivek","2022","Startup",false,12000,"Private","App","Delhi","Rohit","Amit","Active","Private","A");
Project p18=new Project(118,"Education App","Mobile","Local","08-01-2024","12-05-2024",24,19000,"Suresh","Flutter","Education","Agile","Manual","Cloud","Dart","Firebase","India","Completed","Medium","Success");
c18.project=p18; c18.getCompanyDetails();

System.out.println();
Company c19=new Company(19,"StartupNine","Delhi","Delhi","India",360,10,"Tarun","2023","Startup",false,13000,"Private","App","Delhi","Rohit","Amit","Active","Private","A");
Project p19=new Project(119,"Hospital App","Mobile","Local","09-01-2024","13-05-2024",26,20000,"Mahesh","Flutter","Health","Agile","Manual","Cloud","Dart","Firebase","India","Completed","Medium","Success");
c19.project=p19; c19.getCompanyDetails();

System.out.println();
Company c20=new Company(20,"StartupTen","Delhi","Delhi","India",380,10,"Rakesh","2024","Startup",false,14000,"Private","App","Delhi","Rohit","Amit","Active","Private","A");
Project p20=new Project(120,"Travel App","Mobile","Local","10-01-2024","14-05-2024",28,21000,"Kiran","Flutter","Travel","Agile","Manual","Cloud","Dart","Firebase","India","Completed","Medium","Success");
c20.project=p20; c20.getCompanyDetails();

}
}