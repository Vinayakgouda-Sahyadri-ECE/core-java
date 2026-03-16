class GovernmentExecutor{
public static void main(String[] args){

Policy p1 = new Policy(1,"Health Policy","Public","Healthcare","2022","Health","Citizens","National",5000,"Health Ministry","Parliament","5 Years","All Citizens","Online","Central Govt","High","Active","Annual","High","4.5");
Government g1 = new Government(101,"Indian Government","India","Karnataka","Prime Minister","BJP","2019","New Delhi",75,"Federal",true,true,"Health","Citizen Welfare","india.gov","GST","Social Schemes","Supreme Court","Active","4.6");
g1.policy=p1;
g1.getGovernmentDetails();

Policy p2 = new Policy(2,"Education Policy","Public","Education","2020","Education","Students","National",4000,"Education Ministry","Parliament","10 Years","Students","Online","Central Govt","High","Active","Annual","High","4.6");
Government g2 = new Government(102,"State Government","India","Tamil Nadu","Chief Minister","DMK","2021","Chennai",50,"State",true,true,"Education","Student Services","tn.gov","GST","Scholarships","High Court","Active","4.5");
g2.policy=p2;
g2.getGovernmentDetails();

Policy p3 = new Policy(3,"Agriculture Policy","Public","Farming","2021","Agriculture","Farmers","National",3500,"Agri Ministry","Parliament","5 Years","Farmers","Offline","Central Govt","Medium","Active","Annual","Medium","4.2");
Government g3 = new Government(103,"State Government","India","Punjab","Chief Minister","AAP","2022","Chandigarh",45,"State",true,true,"Agriculture","Farmer Welfare","punjab.gov","GST","Subsidy","High Court","Active","4.3");
g3.policy=p3;
g3.getGovernmentDetails();

Policy p4 = new Policy(4,"Transport Policy","Public","Transport","2019","Transport","Citizens","National",2000,"Transport Ministry","Parliament","5 Years","Drivers","Online","Central Govt","Medium","Active","Annual","Medium","4.1");
Government g4 = new Government(104,"State Government","India","Maharashtra","Chief Minister","Shiv Sena","2020","Mumbai",60,"State",true,true,"Transport","Road Services","mh.gov","GST","Road Projects","High Court","Active","4.2");
g4.policy=p4;
g4.getGovernmentDetails();

Policy p5 = new Policy(5,"Housing Policy","Public","Housing","2018","Urban","Citizens","National",6000,"Housing Ministry","Parliament","10 Years","Low Income","Online","Central Govt","High","Active","Annual","High","4.5");
Government g5 = new Government(105,"State Government","India","Delhi","Chief Minister","AAP","2020","Delhi",40,"State",true,true,"Housing","Urban Welfare","delhi.gov","GST","Housing Scheme","High Court","Active","4.4");
g5.policy=p5;
g5.getGovernmentDetails();

Policy p6 = new Policy(6,"Water Policy","Public","Water","2021","Water","Citizens","National",1500,"Water Ministry","Parliament","5 Years","Citizens","Offline","Central Govt","Medium","Active","Annual","Medium","4.0");
Government g6 = new Government(106,"State Government","India","Kerala","Chief Minister","LDF","2021","Trivandrum",35,"State",true,true,"Water","Water Supply","kerala.gov","GST","Water Scheme","High Court","Active","4.2");
g6.policy=p6;
g6.getGovernmentDetails();

Policy p7 = new Policy(7,"Energy Policy","Public","Energy","2022","Power","Industries","National",7000,"Energy Ministry","Parliament","10 Years","Companies","Online","Central Govt","High","Active","Annual","High","4.6");
Government g7 = new Government(107,"Central Government","India","Delhi","Prime Minister","BJP","2019","New Delhi",75,"Federal",true,true,"Energy","Power Services","india.gov","GST","Power Subsidy","Supreme Court","Active","4.6");
g7.policy=p7;
g7.getGovernmentDetails();

Policy p8 = new Policy(8,"Digital Policy","Public","Technology","2021","IT","Citizens","National",2500,"IT Ministry","Parliament","5 Years","Citizens","Online","Central Govt","High","Active","Annual","High","4.5");
Government g8 = new Government(108,"State Government","India","Telangana","Chief Minister","BRS","2020","Hyderabad",45,"State",true,true,"IT","Digital Services","tg.gov","GST","Digital India","High Court","Active","4.5");
g8.policy=p8;
g8.getGovernmentDetails();

Policy p9 = new Policy(9,"Tourism Policy","Public","Tourism","2019","Tourism","Businesses","National",1800,"Tourism Ministry","Parliament","5 Years","Companies","Online","Central Govt","Medium","Active","Annual","Medium","4.2");
Government g9 = new Government(109,"State Government","India","Goa","Chief Minister","BJP","2022","Panaji",30,"State",true,true,"Tourism","Tourist Services","goa.gov","GST","Tourism Schemes","High Court","Active","4.3");
g9.policy=p9;
g9.getGovernmentDetails();

Policy p10 = new Policy(10,"Employment Policy","Public","Jobs","2020","Labor","Youth","National",3000,"Labor Ministry","Parliament","5 Years","Youth","Online","Central Govt","High","Active","Annual","High","4.4");
Government g10 = new Government(110,"State Government","India","Gujarat","Chief Minister","BJP","2021","Gandhinagar",50,"State",true,true,"Employment","Job Services","guj.gov","GST","Job Scheme","High Court","Active","4.4");
g10.policy=p10;
g10.getGovernmentDetails();

Policy p11 = new Policy(11,"Industrial Policy","Public","Industry","2021","Industry","Companies","National",8000,"Industry Ministry","Parliament","10 Years","Businesses","Online","Central Govt","High","Active","Annual","High","4.6");
Government g11 = new Government(111,"State Government","India","Karnataka","Chief Minister","Congress","2023","Bangalore",60,"State",true,true,"Industry","Industrial Services","ka.gov","GST","Startup Scheme","High Court","Active","4.6");
g11.policy=p11;
g11.getGovernmentDetails();

Policy p12 = new Policy(12,"Health Insurance Policy","Public","Healthcare","2020","Health","Citizens","National",5500,"Health Ministry","Parliament","5 Years","Citizens","Online","Central Govt","High","Active","Annual","High","4.5");
Government g12 = new Government(112,"Central Government","India","Delhi","Prime Minister","BJP","2019","New Delhi",75,"Federal",true,true,"Health","Medical Services","india.gov","GST","Ayushman","Supreme Court","Active","4.6");
g12.policy=p12;
g12.getGovernmentDetails();

Policy p13 = new Policy(13,"Women Safety Policy","Public","Security","2022","Police","Women","National",1200,"Home Ministry","Parliament","5 Years","Women","Online","Central Govt","High","Active","Annual","High","4.4");
Government g13 = new Government(113,"State Government","India","Rajasthan","Chief Minister","Congress","2022","Jaipur",45,"State",true,true,"Police","Safety Services","raj.gov","GST","Safety Scheme","High Court","Active","4.3");
g13.policy=p13;
g13.getGovernmentDetails();

Policy p14 = new Policy(14,"Food Security Policy","Public","Food","2019","Food","Citizens","National",6500,"Food Ministry","Parliament","10 Years","Low Income","Offline","Central Govt","High","Active","Annual","High","4.5");
Government g14 = new Government(114,"State Government","India","West Bengal","Chief Minister","TMC","2021","Kolkata",50,"State",true,true,"Food","Food Services","wb.gov","GST","Food Scheme","High Court","Active","4.4");
g14.policy=p14;
g14.getGovernmentDetails();

Policy p15 = new Policy(15,"Urban Development Policy","Public","Urban","2021","Cities","Citizens","National",4500,"Urban Ministry","Parliament","10 Years","Cities","Online","Central Govt","High","Active","Annual","High","4.5");
Government g15 = new Government(115,"State Government","India","Haryana","Chief Minister","BJP","2020","Chandigarh",40,"State",true,true,"Urban","City Services","hr.gov","GST","Urban Scheme","High Court","Active","4.3");
g15.policy=p15;
g15.getGovernmentDetails();

Policy p16 = new Policy(16,"Rural Development Policy","Public","Rural","2020","Villages","Farmers","National",4200,"Rural Ministry","Parliament","5 Years","Farmers","Offline","Central Govt","High","Active","Annual","High","4.4");
Government g16 = new Government(116,"State Government","India","Bihar","Chief Minister","JDU","2022","Patna",45,"State",true,true,"Rural","Village Services","bihar.gov","GST","Village Scheme","High Court","Active","4.2");
g16.policy=p16;
g16.getGovernmentDetails();

Policy p17 = new Policy(17,"Startup Policy","Public","Business","2022","Startups","Entrepreneurs","National",2000,"Industry Ministry","Parliament","5 Years","Startups","Online","Central Govt","High","Active","Annual","High","4.6");
Government g17 = new Government(117,"State Government","India","Telangana","Chief Minister","BRS","2021","Hyderabad",45,"State",true,true,"Business","Startup Services","tg.gov","GST","Startup Scheme","High Court","Active","4.5");
g17.policy=p17;
g17.getGovernmentDetails();

Policy p18 = new Policy(18,"Transport Safety Policy","Public","Road","2020","Transport","Drivers","National",1600,"Transport Ministry","Parliament","5 Years","Drivers","Online","Central Govt","Medium","Active","Annual","Medium","4.1");
Government g18 = new Government(118,"State Government","India","Uttar Pradesh","Chief Minister","BJP","2022","Lucknow",70,"State",true,true,"Transport","Road Services","up.gov","GST","Road Scheme","High Court","Active","4.2");
g18.policy=p18;
g18.getGovernmentDetails();

Policy p19 = new Policy(19,"Clean India Policy","Public","Environment","2019","Environment","Citizens","National",3000,"Environment Ministry","Parliament","5 Years","Citizens","Online","Central Govt","High","Active","Annual","High","4.6");
Government g19 = new Government(119,"Central Government","India","Delhi","Prime Minister","BJP","2019","New Delhi",75,"Federal",true,true,"Environment","Clean Services","india.gov","GST","Swachh Bharat","Supreme Court","Active","4.6");
g19.policy=p19;
g19.getGovernmentDetails();

Policy p20 = new Policy(20,"Green Energy Policy","Public","Energy","2023","Renewable","Industries","National",9000,"Energy Ministry","Parliament","15 Years","Companies","Online","Central Govt","High","Active","Annual","High","4.7");
Government g20 = new Government(120,"Central Government","India","Delhi","Prime Minister","BJP","2019","New Delhi",75,"Federal",true,true,"Energy","Power Services","india.gov","GST","Solar Scheme","Supreme Court","Active","4.7");
g20.policy=p20;
g20.getGovernmentDetails();

}
}