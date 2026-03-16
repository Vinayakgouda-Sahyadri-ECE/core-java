class OrganizerRunner {

    public static void main(String[] args) {

        Organizer o1 = new Organizer("HomeStore","Desk","Plastic","Black",300,5,"Office",0.5,"HomeStore","India","Medium",true,false,"Modern","Box","StoreA",1,"Matte","Large",1);
        Organizer o2 = new Organizer("Ikea","Drawer","Wood","Brown",600,4,"Home",1.2,"Ikea","Sweden","Large",false,false,"Classic","Box","StoreB",2,"Polish","Large",1);
        Organizer o3 = new Organizer("AmazonBasics","Desk","Plastic","White",250,6,"Office",0.4,"Amazon","USA","Small",true,false,"Simple","Box","StoreC",1,"Matte","Medium",1);
        Organizer o4 = new Organizer("OfficeMate","File","Metal","Grey",450,3,"Office",0.8,"OfficeMate","India","Medium",false,true,"Modern","Box","StoreD",1,"Glossy","Large",1);
        Organizer o5 = new Organizer("HomePlus","Kitchen","Plastic","Blue",350,5,"Kitchen",0.6,"HomePlus","India","Medium",true,true,"Modern","Box","StoreE",1,"Matte","Medium",1);
        Organizer o6 = new Organizer("UrbanStore","Desk","Wood","Black",700,4,"Office",1.0,"UrbanStore","India","Large",false,false,"Premium","Box","StoreF",2,"Polish","Large",1);
        Organizer o7 = new Organizer("SmartHome","Drawer","Plastic","Grey",280,6,"Home",0.5,"SmartHome","India","Medium",true,false,"Modern","Box","StoreG",1,"Matte","Medium",1);
        Organizer o8 = new Organizer("Deco","Desk","Plastic","Pink",320,5,"Study",0.5,"Deco","India","Small",true,false,"Cute","Box","StoreH",1,"Matte","Small",1);
        Organizer o9 = new Organizer("StoragePro","File","Metal","Black",480,4,"Office",0.9,"StoragePro","USA","Medium",false,true,"Industrial","Box","StoreI",2,"Glossy","Large",1);
        Organizer o10 = new Organizer("HomeStyle","Desk","Wood","Brown",650,5,"Study",1.1,"HomeStyle","India","Large",false,false,"Classic","Box","StoreJ",2,"Polish","Large",1);

        o1.display();
        o2.display();
        o3.display();
        o4.display();
        o5.display();
        o6.display();
        o7.display();
        o8.display();
        o9.display();
        o10.display();
    }
}