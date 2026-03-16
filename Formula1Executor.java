class Formula1Executor{
public static void main(String[] args){

Formula1 f1 = new Formula1(1,"Mercedes","Germany","Toto Wolff","Mercedes",8,2,"Brackley",2010,"Silver","W14",120,135,90,true,"Pirelli","$450M","Champion","Petronas","Constructor");
Franchise fr1 = new Franchise(101,"Daimler AG","Mercedes Motorsport",2010,"Germany","$3B",1500,"James Allison","Brackley","Mercedes Factory","Mercedes Tunnel",true,"Anna Smith","Strong","Intel","Petronas","Mercedes Academy",20,"High","Active");
f1.franchise = fr1;
f1.getTeamDetails();

System.out.println();
Formula1 f2 = new Formula1(2,"Red Bull","Austria","Christian Horner","Honda",6,2,"Milton Keynes",2005,"Blue","RB20",110,100,80,true,"Pirelli","$420M","Leading","Oracle","Constructor");
Franchise fr2 = new Franchise(102,"Dietrich Mateschitz","Red Bull GmbH",2005,"Austria","$2.5B",1400,"Adrian Newey","Milton Keynes","Red Bull Factory","Red Bull Tunnel",true,"John Mark","Excellent","Oracle","Mobil1","RedBull Academy",25,"Very High","Active");
f2.franchise = fr2;
f2.getTeamDetails();

System.out.println();
Formula1 f3 = new Formula1(3,"Ferrari","Italy","Fred Vasseur","Ferrari",16,2,"Maranello",1950,"Red","SF24",240,250,200,true,"Pirelli","$500M","Competitive","Shell","Constructor");
Franchise fr3 = new Franchise(103,"Exor","Ferrari S.p.A",1950,"Italy","$4B",1800,"Enrico Cardile","Maranello","Ferrari Factory","Ferrari Tunnel",false,"Marco Silva","Strong","IBM","Shell","Ferrari Academy",30,"Very High","Active");
f3.franchise = fr3;
f3.getTeamDetails();

System.out.println();
Formula1 f4 = new Formula1(4,"McLaren","UK","Andrea Stella","Mercedes",8,2,"Woking",1966,"Orange","MCL38",180,170,150,true,"Pirelli","$350M","Improving","Google","Constructor");
Franchise fr4 = new Franchise(104,"Bahrain Mumtalakat","McLaren Group",1966,"UK","$2B",1300,"Peter Prodromou","Woking","McLaren Factory","McLaren Tunnel",true,"Sarah Lee","Stable","Dell","Gulf","McLaren Academy",18,"High","Active");
f4.franchise = fr4;
f4.getTeamDetails();

System.out.println();
Formula1 f5 = new Formula1(5,"Aston Martin","UK","Mike Krack","Mercedes",0,2,"Silverstone",2021,"Green","AMR24",10,12,8,true,"Pirelli","$300M","Developing","Aramco","Constructor");
Franchise fr5 = new Franchise(105,"Lawrence Stroll","Aston Martin F1",2021,"UK","$1.5B",1200,"Dan Fallows","Silverstone","Aston Factory","Aston Tunnel",false,"David Brown","Growing","Cognizant","Aramco","Aston Academy",15,"Medium","Active");
f5.franchise = fr5;
f5.getTeamDetails();

System.out.println();
Formula1 f6 = new Formula1(6,"Alpine","France","Bruno Famin","Renault",2,2,"Enstone",1986,"Blue","A524",21,25,18,true,"Pirelli","$250M","Midfield","BWT","Constructor");
Franchise fr6 = new Franchise(106,"Renault Group","Alpine Racing",1986,"France","$1B",900,"Matt Harman","Enstone","Alpine Factory","Alpine Tunnel",true,"Chris Paul","Stable","Microsoft","Total","Alpine Academy",12,"Medium","Active");
f6.franchise = fr6;
f6.getTeamDetails();

System.out.println();
Formula1 f7 = new Formula1(7,"Williams","UK","James Vowles","Mercedes",9,2,"Grove",1977,"Blue","FW46",114,128,133,true,"Pirelli","$200M","Rebuilding","Duracell","Constructor");
Franchise fr7 = new Franchise(107,"Dorilton Capital","Williams Racing",1977,"UK","$800M",700,"Pat Fry","Grove","Williams Factory","Williams Tunnel",false,"Lucy Green","Stable","HP","Gulf","Williams Academy",10,"Medium","Active");
f7.franchise = fr7;
f7.getTeamDetails();

System.out.println();
Formula1 f8 = new Formula1(8,"AlphaTauri","Italy","Laurent Mekies","Honda",0,2,"Faenza",2006,"White","AT05",2,3,1,true,"Pirelli","$180M","Developing","RedBull","Constructor");
Franchise fr8 = new Franchise(108,"Red Bull","AlphaTauri Team",2006,"Italy","$700M",600,"Jonathan Eddolls","Faenza","Alpha Factory","Alpha Tunnel",true,"Mike Ross","Average","Oracle","Mobil1","Alpha Academy",8,"Medium","Active");
f8.franchise = fr8;
f8.getTeamDetails();

System.out.println();
Formula1 f9 = new Formula1(9,"Haas","USA","Ayao Komatsu","Ferrari",0,2,"Kannapolis",2016,"Black","VF24",0,0,0,true,"Pirelli","$150M","Backmarker","MoneyGram","Constructor");
Franchise fr9 = new Franchise(109,"Gene Haas","Haas F1",2016,"USA","$600M",500,"Simone Resta","Kannapolis","Haas Factory","Haas Tunnel",false,"Peter Grant","Stable","Ferrari","Shell","Haas Academy",6,"Low","Active");
f9.franchise = fr9;
f9.getTeamDetails();

System.out.println();
Formula1 f10 = new Formula1(10,"Sauber","Switzerland","Alessandro Alunni","Ferrari",0,2,"Hinwil",1993,"Black","C44",1,1,0,true,"Pirelli","$160M","Midfield","Stake","Constructor");
Franchise fr10 = new Franchise(110,"Sauber Group","Sauber Motorsport",1993,"Switzerland","$650M",650,"James Key","Hinwil","Sauber Factory","Sauber Tunnel",true,"Adam Lee","Stable","Audi","Shell","Sauber Academy",9,"Medium","Active");
f10.franchise = fr10;
f10.getTeamDetails();

}
}