class NewsPaperExecutor{

public static void main(String[] args){

NewsPaper n1 = new NewsPaper(1,"The Times","Ramesh","Times Group","1838","Mumbai","English",20,5.0,true,"Morning","India","Daily","Times Press","General","times.com","Monthly","Active","5","Sunday Special");
Article a1 = new Article(101,"India Economy","Arun","Economy","10-03-2026",900,"English","Growth Rising","Economic growth improving","Economy,India","Approved","Published","News","RBI","Mumbai","Business","5 min","Print","4.5","General");
n1.article=a1;
n1.getNewsPaperDetails();

System.out.println();

NewsPaper n2 = new NewsPaper(2,"The Hindu","Lakshmi","Hindu Group","1878","Chennai","English",18,6.0,true,"Morning","India","Daily","Hindu Press","General","thehindu.com","Monthly","Active","5","Education Special");
Article a2 = new Article(102,"Education Policy","Sita","Education","11-03-2026",850,"English","Policy Update","New education reforms","Education,Policy","Approved","Published","Editorial","Govt","Delhi","Education","4 min","Print","4.4","Students");
n2.article=a2;
n2.getNewsPaperDetails();

System.out.println();

NewsPaper n3 = new NewsPaper(3,"Deccan Herald","Kiran","DH Group","1948","Bangalore","English",16,4.0,true,"Morning","India","Daily","DH Press","General","dh.com","Monthly","Active","4.5","Weekend Special");
Article a3 = new Article(103,"Tech Growth","Rahul","Technology","12-03-2026",700,"English","AI Boom","AI industry growth","AI,Tech","Approved","Published","News","Tech Report","Bangalore","Tech","3 min","Digital","4.3","Developers");
n3.article=a3;
n3.getNewsPaperDetails();

System.out.println();

NewsPaper n4 = new NewsPaper(4,"Indian Express","Meena","Express Group","1932","Delhi","English",20,5.0,true,"Morning","India","Daily","Express Press","General","express.com","Monthly","Active","4.6","Political Edition");
Article a4 = new Article(104,"Election News","Karthik","Politics","12-03-2026",950,"English","Election Update","Election campaign news","Politics,Election","Approved","Published","News","ECI","Delhi","Politics","6 min","Print","4.2","Public");
n4.article=a4;
n4.getNewsPaperDetails();

System.out.println();

NewsPaper n5 = new NewsPaper(5,"Economic Times","Anil","Times Group","1961","Mumbai","English",22,7.0,true,"Morning","India","Daily","ET Press","Business","economictimes.com","Monthly","Active","4.7","Business Special");
Article a5 = new Article(105,"Stock Market","Priya","Finance","12-03-2026",800,"English","Market Rise","Sensex hits record","Stock,Finance","Approved","Published","News","BSE","Mumbai","Finance","5 min","Digital","4.6","Investors");
n5.article=a5;
n5.getNewsPaperDetails();

}
}