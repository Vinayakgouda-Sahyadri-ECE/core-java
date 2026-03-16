class DanceExecutor{

public static void main(String[] args){

Dance d1 = new Dance(1,"Classical Dance","India","Classical","Traditional","Carnatic","Temple","Graceful",1,"Hard","High","Medium","Cultural","Slow","Mridangam","Required","Stage","Bright","60 min","Active");
Form f1 = new Form(101,"Bharatanatyam","Tamil Nadu","Classical",2000,"Temple","Mudras","Carnatic","Silk Costume",true,50,"Precise","High","Mythology","Stage","Professional","Ancient","Famous","India","Active");
d1.form = f1;
d1.getDanceDetails();

System.out.println();
Dance d2 = new Dance(2,"Folk Dance","India","Folk","Colorful","Drums","Village","Energetic",10,"Medium","High","High","Festival","Fast","Dhol","Practice","Open Stage","Normal","30 min","Active");
Form f2 = new Form(102,"Bhangra","Punjab","Folk",500,"Punjab","Jumping","Dhol","Kurta Pajama",false,40,"Energetic","Medium","Celebration","Open Stage","Amateur","Traditional","Popular","India","Active");
d2.form = f2;
d2.getDanceDetails();

System.out.println();
Dance d3 = new Dance(3,"Classical Dance","India","Classical","Traditional","Tabla","Court","Elegant",1,"Hard","High","Medium","Cultural","Medium","Tabla","Required","Stage","Bright","50 min","Active");
Form f3 = new Form(103,"Kathak","Uttar Pradesh","Classical",1000,"North India","Spins","Hindustani","Anarkali",true,60,"Fast","High","Storytelling","Stage","Professional","Ancient","Famous","India","Active");
d3.form = f3;
d3.getDanceDetails();

System.out.println();
Dance d4 = new Dance(4,"Classical Dance","India","Classical","Heavy","Drums","Temple","Powerful",1,"Hard","High","Medium","Mythology","Slow","Chenda","Required","Stage","Bright","70 min","Active");
Form f4 = new Form(104,"Kathakali","Kerala","Classical",1200,"Kerala","Expressions","Traditional","Heavy Makeup",true,45,"Slow","High","Mythology","Stage","Professional","Ancient","Famous","India","Active");
d4.form = f4;
d4.getDanceDetails();

System.out.println();
Dance d5 = new Dance(5,"Classical Dance","India","Classical","Traditional","Odissi Music","Temple","Graceful",1,"Hard","High","Medium","Cultural","Slow","Mardala","Required","Stage","Bright","55 min","Active");
Form f5 = new Form(105,"Odissi","Odisha","Classical",2000,"Odisha","Curves","Odissi Music","Silk Costume",true,50,"Medium","High","Storytelling","Stage","Professional","Ancient","Famous","India","Active");
d5.form = f5;
d5.getDanceDetails();

System.out.println();
Dance d6 = new Dance(6,"Folk Dance","India","Folk","Colorful","Dhol","Village","Energetic",12,"Medium","High","High","Festival","Fast","Dhol","Practice","Open Stage","Normal","25 min","Active");
Form f6 = new Form(106,"Garba","Gujarat","Folk",400,"Gujarat","Circular","Dhol","Chaniya Choli",false,35,"Fast","Medium","Festival","Open Stage","Amateur","Traditional","Popular","India","Active");
d6.form = f6;
d6.getDanceDetails();

System.out.println();
Dance d7 = new Dance(7,"Classical Dance","India","Classical","Traditional","Carnatic","Temple","Elegant",1,"Hard","High","Medium","Cultural","Medium","Mridangam","Required","Stage","Bright","60 min","Active");
Form f7 = new Form(107,"Kuchipudi","Andhra Pradesh","Classical",1500,"Andhra","Expressions","Carnatic","Silk Costume",true,55,"Medium","High","Storytelling","Stage","Professional","Ancient","Famous","India","Active");
d7.form = f7;
d7.getDanceDetails();

System.out.println();
Dance d8 = new Dance(8,"Folk Dance","India","Folk","Traditional","Dholki","Village","Energetic",8,"Medium","High","High","Festival","Fast","Dholki","Practice","Open Stage","Normal","30 min","Active");
Form f8 = new Form(108,"Lavani","Maharashtra","Folk",300,"Maharashtra","Expressions","Lavani Music","Nauvari Saree",false,30,"Fast","Medium","Entertainment","Stage","Professional","Traditional","Popular","India","Active");
d8.form = f8;
d8.getDanceDetails();

System.out.println();
Dance d9 = new Dance(9,"Folk Dance","India","Folk","Colorful","Drums","Village","Energetic",10,"Medium","High","High","Festival","Fast","Drums","Practice","Open Stage","Normal","25 min","Active");
Form f9 = new Form(109,"Ghoomar","Rajasthan","Folk",500,"Rajasthan","Spins","Folk Music","Ghagra",false,35,"Medium","High","Celebration","Open Stage","Amateur","Traditional","Popular","India","Active");
d9.form = f9;
d9.getDanceDetails();

System.out.println();
Dance d10 = new Dance(10,"Modern Dance","Global","Modern","Modern","DJ","Stage","Creative",5,"Medium","High","High","Entertainment","Fast","DJ","Practice","Stage","Colorful","20 min","Active");
Form f10 = new Form(110,"Hip Hop","USA","Modern",50,"Street","Freestyle","Rap","Street Wear",false,25,"Fast","Medium","Entertainment","Stage","Professional","Modern","Famous","Global","Active");
d10.form = f10;
d10.getDanceDetails();

}
}