class IplExecutor{

public static void main(String[] args){

Ipl i1 = new Ipl(1,"Royal Challengers Bangalore","Virat Kohli","Chinnaswamy Stadium","Bengaluru","Karnataka",25,200,"Andy Flower","United Spirits","Red","Qatar Airways",false,0,"2008","Elite","RCB Academy","Mike Hesson","Active","Huge");
Player p1 = new Player(101,"Virat Kohli","Batsman","Right Hand","None","India",237,7263,4,18,"RCB",35,"5.9ft",130.5,0.0,true,"Top Order","Excellent","Senior","Playing");
i1.player = p1;
i1.getTeamDetails();

System.out.println();
Ipl i2 = new Ipl(2,"Mumbai Indians","Hardik Pandya","Wankhede Stadium","Mumbai","Maharashtra",25,210,"Mark Boucher","Reliance","Blue","Samsung",true,5,"2008","Elite","MI Academy","Shane Bond","Active","Huge");
Player p2 = new Player(102,"Rohit Sharma","Batsman","Right Hand","Off Spin","India",240,6200,15,45,"MI",36,"5.8ft",128.7,7.2,false,"Top Order","Excellent","Senior","Playing");
i2.player = p2;
i2.getTeamDetails();

System.out.println();
Ipl i3 = new Ipl(3,"Chennai Super Kings","MS Dhoni","Chepauk Stadium","Chennai","Tamil Nadu",25,205,"Stephen Fleming","India Cements","Yellow","TVS",true,5,"2008","Elite","CSK Academy","Eric Simmons","Active","Huge");
Player p3 = new Player(103,"MS Dhoni","Wicket Keeper","Right Hand","None","India",250,5082,0,7,"CSK",42,"5.9ft",135.2,0.0,true,"Finisher","Excellent","Senior","Playing");
i3.player = p3;
i3.getTeamDetails();

System.out.println();
Ipl i4 = new Ipl(4,"Kolkata Knight Riders","Shreyas Iyer","Eden Gardens","Kolkata","West Bengal",25,200,"Chandrakant Pandit","Shah Rukh Khan","Purple","Winzo",true,2,"2008","Elite","KKR Academy","Abhishek Nayar","Active","Huge");
Player p4 = new Player(104,"Andre Russell","All Rounder","Right Hand","Fast","West Indies",112,2262,96,12,"KKR",35,"6.1ft",174.0,9.1,false,"All Rounder","Excellent","Senior","Playing");
i4.player = p4;
i4.getTeamDetails();

System.out.println();
Ipl i5 = new Ipl(5,"Delhi Capitals","Rishabh Pant","Arun Jaitley Stadium","Delhi","Delhi",25,190,"Ricky Ponting","JSW Group","Blue","Hero",false,0,"2008","Elite","DC Academy","James Hopes","Active","High");
Player p5 = new Player(105,"David Warner","Batsman","Left Hand","Leg Spin","Australia",176,6397,0,31,"DC",37,"5.7ft",140.5,0.0,false,"Top Order","Excellent","Senior","Playing");
i5.player = p5;
i5.getTeamDetails();

System.out.println();
Ipl i6 = new Ipl(6,"Sunrisers Hyderabad","Pat Cummins","Rajiv Gandhi Stadium","Hyderabad","Telangana",25,180,"Daniel Vettori","Sun Group","Orange","Dream11",true,1,"2013","Elite","SRH Academy","Muttiah Muralitharan","Active","High");
Player p6 = new Player(106,"Bhuvneshwar Kumar","Bowler","Right Hand","Swing","India",160,300,170,15,"SRH",34,"5.10ft",110.2,7.3,false,"Bowler","Good","Senior","Playing");
i6.player = p6;
i6.getTeamDetails();

System.out.println();
Ipl i7 = new Ipl(7,"Punjab Kings","Shikhar Dhawan","Mohali Stadium","Mohali","Punjab",25,190,"Trevor Bayliss","Preity Zinta","Red","EBIXCash",false,0,"2008","Elite","PBKS Academy","Wasim Jaffer","Active","Medium");
Player p7 = new Player(107,"Shikhar Dhawan","Batsman","Left Hand","Off Spin","India",217,6617,4,42,"PBKS",38,"5.11ft",127.0,0.0,true,"Top Order","Good","Senior","Playing");
i7.player = p7;
i7.getTeamDetails();

System.out.println();
Ipl i8 = new Ipl(8,"Rajasthan Royals","Sanju Samson","Sawai Mansingh Stadium","Jaipur","Rajasthan",25,180,"Kumar Sangakkara","Manoj Badale","Pink","Red Bull",true,1,"2008","Elite","RR Academy","Lasith Malinga","Active","High");
Player p8 = new Player(108,"Jos Buttler","Wicket Keeper","Right Hand","None","England",96,3223,0,63,"RR",33,"5.11ft",150.0,0.0,false,"Opener","Excellent","Senior","Playing");
i8.player = p8;
i8.getTeamDetails();

System.out.println();
Ipl i9 = new Ipl(9,"Gujarat Titans","Shubman Gill","Narendra Modi Stadium","Ahmedabad","Gujarat",25,150,"Ashish Nehra","CVC Capital","Dark Blue","Ather",true,1,"2022","Elite","GT Academy","Gary Kirsten","Active","High");
Player p9 = new Player(109,"Shubman Gill","Batsman","Right Hand","Off Spin","India",100,2790,0,77,"GT",25,"5.10ft",135.0,0.0,true,"Top Order","Excellent","Young","Playing");
i9.player = p9;
i9.getTeamDetails();

System.out.println();
Ipl i10 = new Ipl(10,"Lucknow Super Giants","KL Rahul","Ekana Stadium","Lucknow","UP",25,140,"Justin Langer","RPSG Group","Blue","My11Circle",false,0,"2022","Elite","LSG Academy","Andy Flower","Active","High");
Player p10 = new Player(110,"KL Rahul","Batsman","Right Hand","None","India",118,4163,0,1,"LSG",32,"5.11ft",134.6,0.0,true,"Top Order","Excellent","Senior","Playing");
i10.player = p10;
i10.getTeamDetails();



}
}