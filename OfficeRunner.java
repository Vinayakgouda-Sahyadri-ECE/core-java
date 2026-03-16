class OfficeRunner {

    public static void main(String[] args) {

        Office o1 = new Office("TechPark","MG Road","Bangalore","India",500,5,"Corporate",15000,true,true,"Ravi","IT",10,50,"9-6","Software",5000,true,"Airtel","Main Office");
        Office o2 = new Office("BusinessHub","Whitefield","Bangalore","India",300,4,"Corporate",12000,true,true,"Anita","HR",8,40,"9-6","Consulting",4200,true,"Jio","Branch Office");
        Office o3 = new Office("GlobalTech","CyberCity","Gurgaon","India",700,8,"Corporate",20000,true,true,"Rahul","IT",15,80,"9-6","Software",6000,true,"Airtel","Head Office");
        Office o4 = new Office("FinServe","BKC","Mumbai","India",450,6,"Corporate",16000,true,true,"Meena","Finance",12,60,"9-6","Finance",5200,true,"Vodafone","Finance Office");
        Office o5 = new Office("HealthCorp","HitechCity","Hyderabad","India",350,5,"Corporate",14000,true,true,"Kiran","Healthcare",9,45,"9-6","Medical",4300,true,"Jio","Healthcare Office");
        Office o6 = new Office("EduTech","T Nagar","Chennai","India",250,3,"Corporate",9000,true,true,"Suresh","Education",7,30,"9-6","EdTech",3000,true,"Airtel","Education Office");
        Office o7 = new Office("RetailHub","Andheri","Mumbai","India",400,4,"Corporate",11000,true,true,"Neha","Retail",10,40,"9-6","Retail",4100,true,"Jio","Retail Office");
        Office o8 = new Office("DesignStudio","Indiranagar","Bangalore","India",150,2,"Creative",6000,true,true,"Arun","Design",5,20,"10-7","Creative",2000,true,"Airtel","Creative Office");
        Office o9 = new Office("StartUpSpace","Koramangala","Bangalore","India",100,2,"Startup",5000,true,true,"Rohit","Development",4,15,"10-7","Startup",1800,true,"Jio","Startup Hub");
        Office o10 = new Office("DataCenter","ElectronicCity","Bangalore","India",600,6,"Tech",18000,true,true,"Deepak","Data",12,70,"9-6","IT",5500,true,"Airtel","Data Office");

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