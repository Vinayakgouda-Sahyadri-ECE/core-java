class TvExecutor{

public static void main(String[] args){

Tv t1 = new Tv(1,"Samsung","QLED2024","Smart",55,"4K",true,"Tizen",500,true,3,2,"Dolby","Black","150W","LED","South Korea","2 Years","Active","Smart Remote");
Channel c1 = new Channel(101,"Star Plus","Entertainment","Hindi","India","HD","Disney","1992","Anupama",5,"Satellite",true,"INSAT","110MHz","Stereo","1080p","Family","Active","Hotstar","Rishta Wahi Soch Nayi");
t1.channel=c1;
t1.getTvDetails();

System.out.println();
Tv t2 = new Tv(2,"LG","OLEDX","Smart",65,"4K",true,"WebOS",450,true,4,3,"Dolby","Silver","180W","OLED","South Korea","3 Years","Active","Magic Remote");
Channel c2 = new Channel(102,"Sony TV","Entertainment","Hindi","India","HD","Sony","1995","Indian Idol",5,"Satellite",true,"INSAT","115MHz","Stereo","1080p","Family","Active","SonyLIV","Entertainment Unlimited");
t2.channel=c2;
t2.getTvDetails();

System.out.println();
Tv t3 = new Tv(3,"Sony","Bravia","Smart",50,"4K",true,"Android",480,true,3,2,"Dolby","Black","160W","LED","Japan","2 Years","Active","Smart Remote");
Channel c3 = new Channel(103,"Zee TV","Entertainment","Hindi","India","HD","Zee","1992","Kumkum Bhagya",4,"Satellite",true,"INSAT","118MHz","Stereo","1080p","Family","Active","Zee5","Dil Se");
t3.channel=c3;
t3.getTvDetails();

System.out.println();
Tv t4 = new Tv(4,"Panasonic","Viera","Smart",43,"FullHD",true,"Android",400,true,2,2,"Dolby","Black","140W","LED","Japan","2 Years","Active","Smart Remote");
Channel c4 = new Channel(104,"Colors","Entertainment","Hindi","India","HD","Viacom18","2008","Bigg Boss",5,"Satellite",true,"INSAT","120MHz","Stereo","1080p","Youth","Active","JioCinema","Jasbaat Ke Rang");
t4.channel=c4;
t4.getTvDetails();

System.out.println();
Tv t5 = new Tv(5,"Mi","MiTV","Smart",40,"FullHD",true,"Android",350,true,2,2,"Dolby","Black","130W","LED","China","1 Year","Active","Smart Remote");
Channel c5 = new Channel(105,"Discovery","Education","English","USA","HD","Discovery","1985","Man vs Wild",5,"Satellite",false,"INSAT","122MHz","Stereo","1080p","Youth","Active","Discovery+","Explore Your World");
t5.channel=c5;
t5.getTvDetails();

System.out.println();

/* 6–20 */

Tv t6=new Tv(6,"Samsung","Model6","Smart",50,"4K",true,"Tizen",400,true,3,2,"Dolby","Black","150W","LED","Korea","2 Years","Active","Smart Remote");
Channel c6=new Channel(106,"NatGeo","Education","English","USA","HD","Disney","2001","Air Crash Investigation",5,"Satellite",false,"INSAT","123MHz","Stereo","1080p","Youth","Active","Disney+","Further");
t6.channel=c6; t6.getTvDetails();

System.out.println();
Tv t7=new Tv(7,"LG","Model7","Smart",55,"4K",true,"WebOS",420,true,3,2,"Dolby","Black","150W","OLED","Korea","3 Years","Active","Magic Remote");
Channel c7=new Channel(107,"Cartoon Network","Kids","English","USA","HD","Warner","1992","Ben10",4,"Satellite",true,"INSAT","124MHz","Stereo","1080p","Kids","Active","HBO Max","Cartoon Fun");
t7.channel=c7; t7.getTvDetails();

System.out.println();
Tv t8=new Tv(8,"Sony","Model8","Smart",50,"4K",true,"Android",450,true,3,2,"Dolby","Black","150W","LED","Japan","2 Years","Active","Smart Remote");
Channel c8=new Channel(108,"Pogo","Kids","English","India","HD","Warner","2004","Chhota Bheem",4,"Satellite",true,"INSAT","125MHz","Stereo","1080p","Kids","Active","OTT","Fun Time");
t8.channel=c8; t8.getTvDetails();

System.out.println();
Tv t9=new Tv(9,"Panasonic","Model9","Smart",43,"FullHD",true,"Android",300,true,2,2,"Dolby","Black","130W","LED","Japan","2 Years","Active","Smart Remote");
Channel c9=new Channel(109,"Animal Planet","Education","English","USA","HD","Discovery","1996","Wildlife Show",5,"Satellite",false,"INSAT","126MHz","Stereo","1080p","Family","Active","Discovery+","Wild Nature");
t9.channel=c9; t9.getTvDetails();

System.out.println();
Tv t10=new Tv(10,"Mi","Model10","Smart",40,"FullHD",true,"Android",320,true,2,2,"Dolby","Black","130W","LED","China","1 Year","Active","Smart Remote");
Channel c10=new Channel(110,"NDTV","News","English","India","HD","NDTV","1988","News Hour",5,"Satellite",true,"INSAT","127MHz","Stereo","1080p","Adults","Active","YouTube","Truth First");
t10.channel=c10; t10.getTvDetails();

System.out.println();

/* simplified 11–20 */

Tv t11=new Tv(11,"Samsung","Model11","Smart",50,"4K",true,"Tizen",400,true,3,2,"Dolby","Black","150W","LED","Korea","2 Years","Active","Remote");
Channel c11=new Channel(111,"Aaj Tak","News","Hindi","India","HD","TV Today","2000","News",5,"Satellite",true,"INSAT","128MHz","Stereo","1080p","Adults","Active","YouTube","Sabse Tez");
t11.channel=c11; t11.getTvDetails();

System.out.println();
Tv t12=new Tv(12,"LG","Model12","Smart",50,"4K",true,"WebOS",400,true,3,2,"Dolby","Black","150W","LED","Korea","2 Years","Active","Remote");
Channel c12=new Channel(112,"ABP News","News","Hindi","India","HD","ABP","1998","Debate",4,"Satellite",true,"INSAT","129MHz","Stereo","1080p","Adults","Active","OTT","Truth");
t12.channel=c12; t12.getTvDetails();

System.out.println();
Tv t13=new Tv(13,"Sony","Model13","Smart",50,"4K",true,"Android",400,true,3,2,"Dolby","Black","150W","LED","Japan","2 Years","Active","Remote");
Channel c13=new Channel(113,"History TV","Education","English","USA","HD","A&E","2008","Ancient Aliens",5,"Satellite",false,"INSAT","130MHz","Stereo","1080p","Adults","Active","OTT","Past Revealed");
t13.channel=c13; t13.getTvDetails();

System.out.println();
Tv t14=new Tv(14,"Panasonic","Model14","Smart",43,"FullHD",true,"Android",300,true,2,2,"Dolby","Black","130W","LED","Japan","2 Years","Active","Remote");
Channel c14=new Channel(114,"MTV","Music","English","USA","HD","Viacom","1981","Music Show",4,"Satellite",true,"INSAT","131MHz","Stereo","1080p","Youth","Active","OTT","Music First");
t14.channel=c14; t14.getTvDetails();

System.out.println();
Tv t15=new Tv(15,"Mi","Model15","Smart",43,"FullHD",true,"Android",300,true,2,2,"Dolby","Black","130W","LED","China","1 Year","Active","Remote");
Channel c15=new Channel(115,"VH1","Music","English","USA","HD","Viacom","1985","Music Hour",4,"Satellite",true,"INSAT","132MHz","Stereo","1080p","Youth","Active","OTT","Music Life");
t15.channel=c15; t15.getTvDetails();

System.out.println();
Tv t16=new Tv(16,"Samsung","Model16","Smart",50,"4K",true,"Tizen",400,true,3,2,"Dolby","Black","150W","LED","Korea","2 Years","Active","Remote");
Channel c16=new Channel(116,"Sports18","Sports","English","India","HD","Reliance","2022","Football",5,"Satellite",true,"INSAT","133MHz","Stereo","1080p","Sports","Active","JioCinema","Sports First");
t16.channel=c16; t16.getTvDetails();

System.out.println();
Tv t17=new Tv(17,"LG","Model17","Smart",50,"4K",true,"WebOS",400,true,3,2,"Dolby","Black","150W","LED","Korea","2 Years","Active","Remote");
Channel c17=new Channel(117,"Star Sports","Sports","English","India","HD","Disney","1996","Cricket",5,"Satellite",true,"INSAT","134MHz","Stereo","1080p","Sports","Active","Hotstar","Believe");
t17.channel=c17; t17.getTvDetails();

System.out.println();
Tv t18=new Tv(18,"Sony","Model18","Smart",50,"4K",true,"Android",400,true,3,2,"Dolby","Black","150W","LED","Japan","2 Years","Active","Remote");
Channel c18=new Channel(118,"Ten Sports","Sports","English","Pakistan","HD","Sony","2002","Tennis",4,"Satellite",true,"INSAT","135MHz","Stereo","1080p","Sports","Active","SonyLIV","Game On");
t18.channel=c18; t18.getTvDetails();

System.out.println();
Tv t19=new Tv(19,"Panasonic","Model19","Smart",43,"FullHD",true,"Android",300,true,2,2,"Dolby","Black","130W","LED","Japan","2 Years","Active","Remote");
Channel c19=new Channel(119,"DD National","Public","Hindi","India","HD","Prasar Bharati","1959","Ramayan",5,"Satellite",true,"INSAT","136MHz","Stereo","1080p","Family","Active","OTT","Public Service");
t19.channel=c19; t19.getTvDetails();

System.out.println();
Tv t20=new Tv(20,"Mi","Model20","Smart",43,"FullHD",true,"Android",300,true,2,2,"Dolby","Black","130W","LED","China","1 Year","Active","Remote");
Channel c20=new Channel(120,"BBC","News","English","UK","HD","BBC","1922","World News",5,"Satellite",false,"INSAT","137MHz","Stereo","1080p","Adults","Active","BBC iPlayer","Trusted News");
t20.channel=c20; t20.getTvDetails();

}
}