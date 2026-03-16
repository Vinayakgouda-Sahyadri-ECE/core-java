class LensKartExecutor{

public static void main(String[] args){

LensKart l1 = new LensKart(1,"LensKart Store","Indiranagar","Bengaluru","Karnataka",15,500,"10AM","10PM",true,2,"LensKart Pvt Ltd","CCTV",true,3,4,"Premium","Smart Glasses","Good","Open");
Frame f1 = new Frame(101,"RayBan","Full Rim","Metal","Black","Rectangle","Single Vision","-1.5",true,true,"Medium","Light","Spring","Silicon",true,"Premium","Unisex","Italy","High","Available");
l1.frame = f1;
l1.getStoreDetails();

System.out.println();
LensKart l2 = new LensKart(2,"LensKart Store","Whitefield","Bengaluru","Karnataka",12,450,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,3,3,"Premium","Blue Light Glasses","Good","Open");
Frame f2 = new Frame(102,"Vincent Chase","Full Rim","Plastic","Brown","Round","Blue Cut","0",true,true,"Medium","Light","Standard","Rubber",true,"Fashion","Unisex","India","High","Available");
l2.frame = f2;
l2.getStoreDetails();

System.out.println();
LensKart l3 = new LensKart(3,"LensKart Store","MG Road","Bengaluru","Karnataka",14,470,"10AM","10PM",true,2,"LensKart Pvt Ltd","CCTV",true,3,4,"Premium","Computer Glasses","Good","Open");
Frame f3 = new Frame(103,"John Jacobs","Half Rim","Metal","Silver","Rectangle","Single Vision","-2",true,true,"Large","Light","Spring","Silicon",true,"Premium","Men","UK","High","Available");
l3.frame = f3;
l3.getStoreDetails();

System.out.println();
LensKart l4 = new LensKart(4,"LensKart Store","BTM","Bengaluru","Karnataka",11,420,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,2,3,"Standard","Budget Frames","Good","Open");
Frame f4 = new Frame(104,"RayBan","Full Rim","Metal","Gold","Aviator","Sun Lens","0",true,true,"Large","Medium","Standard","Silicon",true,"Premium","Unisex","Italy","High","Available");
l4.frame = f4;
l4.getStoreDetails();

System.out.println();
LensKart l5 = new LensKart(5,"LensKart Store","Yelahanka","Bengaluru","Karnataka",10,400,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,2,3,"Standard","Kids Frames","Good","Open");
Frame f5 = new Frame(105,"Vincent Chase","Full Rim","Plastic","Blue","Square","Single Vision","-1",true,false,"Small","Light","Standard","Rubber",true,"Kids","Kids","India","Medium","Available");
l5.frame = f5;
l5.getStoreDetails();

System.out.println();
LensKart l6 = new LensKart(6,"LensKart Store","Koramangala","Bengaluru","Karnataka",13,460,"10AM","10PM",true,2,"LensKart Pvt Ltd","CCTV",true,3,4,"Premium","Designer Frames","Good","Open");
Frame f6 = new Frame(106,"Oakley","Full Rim","Fiber","Black","Sport","Polarized","0",true,true,"Large","Light","Spring","Silicon",true,"Sports","Men","USA","High","Available");
l6.frame = f6;
l6.getStoreDetails();

System.out.println();
LensKart l7 = new LensKart(7,"LensKart Store","Jayanagar","Bengaluru","Karnataka",12,440,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,3,3,"Premium","Fashion Frames","Good","Open");
Frame f7 = new Frame(107,"RayBan","Half Rim","Metal","Black","Oval","Single Vision","-1.25",true,true,"Medium","Light","Spring","Silicon",true,"Premium","Women","Italy","High","Available");
l7.frame = f7;
l7.getStoreDetails();

System.out.println();
LensKart l8 = new LensKart(8,"LensKart Store","Malleshwaram","Bengaluru","Karnataka",11,430,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,2,3,"Standard","Budget Frames","Good","Open");
Frame f8 = new Frame(108,"Vincent Chase","Full Rim","Plastic","Grey","Rectangle","Single Vision","-0.75",true,false,"Medium","Light","Standard","Rubber",true,"Standard","Unisex","India","Medium","Available");
l8.frame = f8;
l8.getStoreDetails();

System.out.println();
LensKart l9 = new LensKart(9,"LensKart Store","Electronic City","Bengaluru","Karnataka",12,450,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,3,3,"Premium","Computer Glasses","Good","Open");
Frame f9 = new Frame(109,"John Jacobs","Full Rim","Metal","Brown","Square","Blue Cut","0",true,true,"Medium","Light","Spring","Silicon",true,"Premium","Unisex","UK","High","Available");
l9.frame = f9;
l9.getStoreDetails();

System.out.println();
LensKart l10 = new LensKart(10,"LensKart Store","Hebbal","Bengaluru","Karnataka",10,410,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,2,3,"Standard","Kids Frames","Good","Open");
Frame f10 = new Frame(110,"Vincent Chase","Full Rim","Plastic","Red","Round","Single Vision","-1",true,false,"Small","Light","Standard","Rubber",true,"Kids","Kids","India","Medium","Available");
l10.frame = f10;
l10.getStoreDetails();

System.out.println();
LensKart l11 = new LensKart(11,"LensKart Store","Marathahalli","Bengaluru","Karnataka",12,450,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,3,3,"Premium","Smart Frames","Good","Open");
Frame f11 = new Frame(111,"RayBan","Full Rim","Metal","Black","Square","Single Vision","-1.5",true,true,"Medium","Light","Spring","Silicon",true,"Premium","Men","Italy","High","Available");
l11.frame = f11;
l11.getStoreDetails();

System.out.println();
LensKart l12 = new LensKart(12,"LensKart Store","HSR Layout","Bengaluru","Karnataka",13,460,"10AM","10PM",true,2,"LensKart Pvt Ltd","CCTV",true,3,4,"Premium","Designer Frames","Good","Open");
Frame f12 = new Frame(112,"Oakley","Full Rim","Fiber","Black","Sport","Polarized","0",true,true,"Large","Light","Spring","Silicon",true,"Sports","Men","USA","High","Available");
l12.frame = f12;
l12.getStoreDetails();

System.out.println();
LensKart l13 = new LensKart(13,"LensKart Store","Rajajinagar","Bengaluru","Karnataka",11,420,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,2,3,"Standard","Budget Frames","Good","Open");
Frame f13 = new Frame(113,"Vincent Chase","Full Rim","Plastic","Blue","Rectangle","Single Vision","-0.5",true,false,"Medium","Light","Standard","Rubber",true,"Standard","Unisex","India","Medium","Available");
l13.frame = f13;
l13.getStoreDetails();

System.out.println();
LensKart l14 = new LensKart(14,"LensKart Store","Banashankari","Bengaluru","Karnataka",10,410,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,2,3,"Standard","Kids Frames","Good","Open");
Frame f14 = new Frame(114,"Vincent Chase","Full Rim","Plastic","Pink","Round","Single Vision","-1",true,false,"Small","Light","Standard","Rubber",true,"Kids","Kids","India","Medium","Available");
l14.frame = f14;
l14.getStoreDetails();

System.out.println();
LensKart l15 = new LensKart(15,"LensKart Store","Basavanagudi","Bengaluru","Karnataka",11,430,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,2,3,"Premium","Computer Glasses","Good","Open");
Frame f15 = new Frame(115,"John Jacobs","Half Rim","Metal","Silver","Rectangle","Blue Cut","0",true,true,"Medium","Light","Spring","Silicon",true,"Premium","Unisex","UK","High","Available");
l15.frame = f15;
l15.getStoreDetails();

System.out.println();
LensKart l16 = new LensKart(16,"LensKart Store","JP Nagar","Bengaluru","Karnataka",12,440,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,3,3,"Premium","Fashion Frames","Good","Open");
Frame f16 = new Frame(116,"RayBan","Full Rim","Metal","Black","Oval","Single Vision","-1.25",true,true,"Medium","Light","Spring","Silicon",true,"Premium","Women","Italy","High","Available");
l16.frame = f16;
l16.getStoreDetails();

System.out.println();
LensKart l17 = new LensKart(17,"LensKart Store","KR Puram","Bengaluru","Karnataka",10,400,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,2,3,"Standard","Budget Frames","Good","Open");
Frame f17 = new Frame(117,"Vincent Chase","Full Rim","Plastic","Grey","Rectangle","Single Vision","-0.75",true,false,"Medium","Light","Standard","Rubber",true,"Standard","Unisex","India","Medium","Available");
l17.frame = f17;
l17.getStoreDetails();

System.out.println();
LensKart l18 = new LensKart(18,"LensKart Store","Kengeri","Bengaluru","Karnataka",9,380,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,2,3,"Standard","Kids Frames","Good","Open");
Frame f18 = new Frame(118,"Vincent Chase","Full Rim","Plastic","Green","Square","Single Vision","-1",true,false,"Small","Light","Standard","Rubber",true,"Kids","Kids","India","Medium","Available");
l18.frame = f18;
l18.getStoreDetails();

System.out.println();
LensKart l19 = new LensKart(19,"LensKart Store","Airport Road","Bengaluru","Karnataka",12,450,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,3,3,"Premium","Designer Frames","Good","Open");
Frame f19 = new Frame(119,"RayBan","Full Rim","Metal","Gold","Aviator","Sun Lens","0",true,true,"Large","Medium","Standard","Silicon",true,"Premium","Unisex","Italy","High","Available");
l19.frame = f19;
l19.getStoreDetails();

System.out.println();
LensKart l20 = new LensKart(20,"LensKart Store","Peenya","Bengaluru","Karnataka",10,410,"10AM","10PM",true,1,"LensKart Pvt Ltd","CCTV",true,2,3,"Standard","Budget Frames","Good","Open");
Frame f20 = new Frame(120,"Vincent Chase","Full Rim","Plastic","Black","Rectangle","Single Vision","-1",true,false,"Medium","Light","Standard","Rubber",true,"Standard","Unisex","India","Medium","Available");
l20.frame = f20;
l20.getStoreDetails();

}
}