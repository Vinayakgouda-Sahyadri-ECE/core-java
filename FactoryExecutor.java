class FactoryExecutor{

public static void main(String[] args){

Factory f1 = new Factory(1,"Steel Factory","Peenya","Bengaluru","Karnataka",200,50,"8AM","8PM",true,10,"Ravi","CCTV",true,5,4,"Heavy Industry","Steel Rods","Good","Active");
Machine m1 = new Machine(101,"Lathe Machine","Cutting","TATA","LX200","Blue",2018,"5kW","1200rpm",true,"CNC","500kg","Large","Steel",true,"440V","Medium","Industrial","Good","Working");
f1.machine = m1;
f1.getFactoryDetails();

System.out.println();
Factory f2 = new Factory(2,"Textile Factory","Yelahanka","Bengaluru","Karnataka",150,40,"8AM","7PM",true,8,"Mahesh","CCTV",true,4,3,"Textile","Clothes","Good","Active");
Machine m2 = new Machine(102,"Weaving Machine","Textile","L&T","WX120","White",2019,"4kW","900rpm",true,"Automatic","400kg","Medium","Steel",true,"440V","Low","Industrial","Good","Working");
f2.machine = m2;
f2.getFactoryDetails();

System.out.println();
Factory f3 = new Factory(3,"Plastic Factory","Bommasandra","Bengaluru","Karnataka",120,35,"8AM","6PM",true,6,"Suresh","CCTV",true,3,3,"Plastic","Plastic Bottles","Good","Active");
Machine m3 = new Machine(103,"Injection Molding","Plastic","Bosch","IM500","Gray",2020,"6kW","1000rpm",true,"PLC","600kg","Large","Iron",true,"440V","Medium","Industrial","Good","Working");
f3.machine = m3;
f3.getFactoryDetails();

System.out.println();
Factory f4 = new Factory(4,"Food Factory","Hosur","Hosur","Tamil Nadu",180,45,"7AM","7PM",true,9,"Ramesh","CCTV",true,4,4,"Food","Snacks","Good","Active");
Machine m4 = new Machine(104,"Packaging Machine","Food","ITC","PK200","Silver",2021,"3kW","700rpm",true,"Automatic","300kg","Medium","Steel",true,"440V","Low","Industrial","Good","Working");
f4.machine = m4;
f4.getFactoryDetails();

System.out.println();
Factory f5 = new Factory(5,"Car Factory","Chennai","Chennai","Tamil Nadu",500,120,"8AM","9PM",true,20,"Toyota","CCTV",true,10,8,"Automobile","Cars","Excellent","Active");
Machine m5 = new Machine(105,"Assembly Robot","Automobile","Toyota","AR100","Yellow",2022,"10kW","1500rpm",true,"AI","800kg","Large","Alloy",true,"440V","Low","Industrial","Excellent","Working");
f5.machine = m5;
f5.getFactoryDetails();

System.out.println();
Factory f6 = new Factory(6,"Electronics Factory","Noida","Noida","UP",220,60,"8AM","8PM",true,12,"Vikas","CCTV",true,6,5,"Electronics","Mobile Phones","Good","Active");
Machine m6 = new Machine(106,"PCB Machine","Electronics","Samsung","PCB300","Black",2020,"4kW","800rpm",true,"PLC","350kg","Medium","Steel",true,"440V","Medium","Industrial","Good","Working");
f6.machine = m6;
f6.getFactoryDetails();

System.out.println();
Factory f7 = new Factory(7,"Cement Factory","Bellary","Bellary","Karnataka",300,70,"6AM","10PM",true,15,"Shankar","CCTV",true,7,6,"Cement","Cement Bags","Good","Active");
Machine m7 = new Machine(107,"Crusher Machine","Cement","ACC","CR900","Gray",2017,"15kW","500rpm",true,"Hydraulic","1000kg","Large","Iron",true,"440V","High","Industrial","Good","Working");
f7.machine = m7;
f7.getFactoryDetails();

System.out.println();
Factory f8 = new Factory(8,"Paper Factory","Mysuru","Mysuru","Karnataka",140,38,"7AM","7PM",true,7,"Prakash","CCTV",true,4,3,"Paper","Notebooks","Good","Active");
Machine m8 = new Machine(108,"Paper Cutter","Paper","JK","PC100","White",2019,"2kW","600rpm",false,"Manual","200kg","Small","Steel",true,"220V","Low","Industrial","Good","Working");
f8.machine = m8;
f8.getFactoryDetails();

System.out.println();
Factory f9 = new Factory(9,"Bottle Factory","Pune","Pune","Maharashtra",160,42,"8AM","8PM",true,8,"Ajay","CCTV",true,4,4,"Plastic","Water Bottles","Good","Active");
Machine m9 = new Machine(109,"Blow Molding","Plastic","TATA","BM300","Blue",2021,"5kW","900rpm",true,"PLC","450kg","Medium","Steel",true,"440V","Medium","Industrial","Good","Working");
f9.machine = m9;
f9.getFactoryDetails();

System.out.println();
Factory f10 = new Factory(10,"Furniture Factory","Nagpur","Nagpur","Maharashtra",110,30,"8AM","6PM",true,5,"Rajesh","CCTV",true,3,3,"Wood","Tables","Good","Active");
Machine m10 = new Machine(110,"Wood Cutter","Wood","Bosch","WC200","Red",2018,"3kW","700rpm",false,"Manual","250kg","Medium","Steel",true,"220V","Low","Industrial","Good","Working");
f10.machine = m10;
f10.getFactoryDetails();

System.out.println();
Factory f11 = new Factory(11,"Glass Factory","Surat","Surat","Gujarat",180,48,"8AM","8PM",true,9,"Harish","CCTV",true,5,4,"Glass","Glass Sheets","Good","Active");
Machine m11 = new Machine(111,"Glass Furnace","Glass","TATA","GF500","Orange",2017,"20kW","400rpm",true,"Automatic","1200kg","Large","Iron",true,"440V","High","Industrial","Good","Working");
f11.machine = m11;
f11.getFactoryDetails();

System.out.println();
Factory f12 = new Factory(12,"Bike Factory","Hosur","Hosur","Tamil Nadu",450,100,"8AM","9PM",true,18,"Hero","CCTV",true,9,7,"Automobile","Bikes","Excellent","Active");
Machine m12 = new Machine(112,"Engine Assembler","Automobile","Hero","EA700","Yellow",2022,"8kW","1300rpm",true,"AI","700kg","Large","Alloy",true,"440V","Low","Industrial","Excellent","Working");
f12.machine = m12;
f12.getFactoryDetails();

System.out.println();
Factory f13 = new Factory(13,"Laptop Factory","Chennai","Chennai","Tamil Nadu",250,55,"8AM","8PM",true,11,"Dell","CCTV",true,5,4,"Electronics","Laptops","Good","Active");
Machine m13 = new Machine(113,"Chip Installer","Electronics","Dell","CI300","Black",2021,"4kW","800rpm",true,"PLC","350kg","Medium","Steel",true,"440V","Medium","Industrial","Good","Working");
f13.machine = m13;
f13.getFactoryDetails();

System.out.println();
Factory f14 = new Factory(14,"Toy Factory","Mumbai","Mumbai","Maharashtra",120,30,"9AM","6PM",true,6,"Amit","CCTV",true,3,3,"Plastic","Toys","Good","Active");
Machine m14 = new Machine(114,"Toy Molder","Plastic","FunTech","TM100","Red",2020,"3kW","700rpm",true,"Automatic","250kg","Medium","Steel",true,"220V","Low","Industrial","Good","Working");
f14.machine = m14;
f14.getFactoryDetails();

System.out.println();
Factory f15 = new Factory(15,"Paint Factory","Delhi","Delhi","Delhi",160,45,"8AM","8PM",true,8,"Kumar","CCTV",true,4,4,"Chemical","Paint","Good","Active");
Machine m15 = new Machine(115,"Mixing Machine","Chemical","Asian","MM300","Yellow",2019,"6kW","900rpm",true,"PLC","500kg","Medium","Steel",true,"440V","Medium","Industrial","Good","Working");
f15.machine = m15;
f15.getFactoryDetails();

System.out.println();
Factory f16 = new Factory(16,"Battery Factory","Ahmedabad","Ahmedabad","Gujarat",190,50,"8AM","8PM",true,9,"Exide","CCTV",true,5,4,"Electrical","Batteries","Good","Active");
Machine m16 = new Machine(116,"Battery Assembler","Electrical","Exide","BA200","Black",2021,"4kW","850rpm",true,"PLC","420kg","Medium","Steel",true,"440V","Medium","Industrial","Good","Working");
f16.machine = m16;
f16.getFactoryDetails();

System.out.println();
Factory f17 = new Factory(17,"Chocolate Factory","Ooty","Ooty","Tamil Nadu",100,25,"9AM","7PM",true,5,"Nestle","CCTV",true,2,2,"Food","Chocolate","Good","Active");
Machine m17 = new Machine(117,"Chocolate Mixer","Food","Nestle","CM150","Brown",2020,"2kW","600rpm",true,"Automatic","200kg","Small","Steel",true,"220V","Low","Industrial","Good","Working");
f17.machine = m17;
f17.getFactoryDetails();

System.out.println();
Factory f18 = new Factory(18,"Rubber Factory","Kochi","Kochi","Kerala",140,40,"8AM","7PM",true,7,"Joseph","CCTV",true,3,3,"Rubber","Tyres","Good","Active");
Machine m18 = new Machine(118,"Rubber Press","Rubber","MRF","RP400","Black",2019,"5kW","800rpm",true,"Hydraulic","450kg","Medium","Steel",true,"440V","Medium","Industrial","Good","Working");
f18.machine = m18;
f18.getFactoryDetails();

System.out.println();
Factory f19 = new Factory(19,"Shoes Factory","Agra","Agra","UP",130,35,"8AM","7PM",true,6,"Rahul","CCTV",true,3,3,"Leather","Shoes","Good","Active");
Machine m19 = new Machine(119,"Sole Cutter","Leather","Bata","SC200","Brown",2018,"3kW","700rpm",false,"Manual","250kg","Medium","Steel",true,"220V","Low","Industrial","Good","Working");
f19.machine = m19;
f19.getFactoryDetails();

System.out.println();
Factory f20 = new Factory(20,"Steel Factory","Jamshedpur","Jamshedpur","Jharkhand",400,90,"6AM","10PM",true,20,"TATA","CCTV",true,8,6,"Heavy Industry","Steel Sheets","Excellent","Active");
Machine m20 = new Machine(120,"Steel Roller","Steel","TATA","SR1000","Gray",2021,"18kW","500rpm",true,"Hydraulic","1500kg","Large","Iron",true,"440V","High","Industrial","Excellent","Working");
f20.machine = m20;
f20.getFactoryDetails();

}
}