class StandRunner {

    public static void main(String[] args) {

        Stand s1 = new Stand("AmazonBasics","Laptop","Metal","Black",30,25,1.2,1500,true,true,5,"Office","Amazon","USA","Rectangle",true,"Matte",1,"ABC Traders","Modern");
        Stand s2 = new Stand("Portronics","Mobile","Plastic","White",20,15,0.5,500,true,true,2,"Home","Portronics","India","Round",true,"Glossy",1,"XYZ Traders","Simple");
        Stand s3 = new Stand("Ikea","Book","Wood","Brown",40,30,2.0,2000,false,false,10,"Library","Ikea","Sweden","Square",false,"Matte",2,"BookStore","Classic");
        Stand s4 = new Stand("Boat","Headphone","Plastic","Black",15,10,0.4,400,false,true,1,"Desk","Boat","India","Round",true,"Glossy",1,"SoundStore","Modern");
        Stand s5 = new Stand("Dell","Monitor","Metal","Black",35,28,2.5,2500,true,false,1,"Office","Dell","USA","Rectangle",false,"Matte",3,"TechWorld","Premium");
        Stand s6 = new Stand("HP","Laptop","Metal","Silver",32,26,1.3,1600,true,true,5,"Office","HP","USA","Rectangle",true,"Matte",2,"ABC Traders","Modern");
        Stand s7 = new Stand("Lenovo","Tablet","Plastic","Grey",18,12,0.6,600,true,true,2,"Home","Lenovo","China","Round",true,"Glossy",1,"XYZ Traders","Simple");
        Stand s8 = new Stand("Asus","Laptop","Metal","Black",33,27,1.4,1700,true,true,5,"Office","Asus","Taiwan","Rectangle",true,"Matte",2,"TechWorld","Modern");
        Stand s9 = new Stand("Samsung","Mobile","Plastic","Blue",19,13,0.5,550,true,true,2,"Home","Samsung","Korea","Round",true,"Glossy",1,"MobileHub","Simple");
        Stand s10 = new Stand("Apple","Tablet","Aluminum","Silver",21,16,0.7,3000,true,false,2,"Office","Apple","USA","Rectangle",false,"Matte",2,"AppleStore","Premium");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
        s7.display();
        s8.display();
        s9.display();
        s10.display();
    }
}