class EducationRunner {

    public static void main(String[] args) {

        Education e1 = new Education("IIT Delhi","Computer Science","BTech","CSE","IIT","Delhi","India",4,8000,500,true,true,"English",200000,"NAAC A++","Top10","1961","Semester","Offline","Premier Institute");
        Education e2 = new Education("MIT","Engineering","BTech","Mechanical","MIT","Boston","USA",4,10000,600,true,true,"English",300000,"ABET","Top5","1861","Semester","Offline","Global Institute");
        Education e3 = new Education("Oxford","Philosophy","BA","Arts","Oxford University","Oxford","UK",3,7000,450,true,true,"English",250000,"AAA","Top3","1096","Semester","Offline","Historic University");
        Education e4 = new Education("Harvard","Business","MBA","Management","Harvard","Boston","USA",2,6000,400,true,true,"English",350000,"AACSB","Top5","1908","Semester","Offline","Elite School");
        Education e5 = new Education("Stanford","Computer Science","MS","CSE","Stanford","California","USA",2,6500,420,true,true,"English",320000,"ABET","Top5","1891","Semester","Offline","Research Institute");
        Education e6 = new Education("Cambridge","Mathematics","BA","Math","Cambridge","Cambridge","UK",3,5500,380,true,true,"English",260000,"AAA","Top5","1209","Semester","Offline","Historic Institute");
        Education e7 = new Education("NIT Trichy","Engineering","BTech","ECE","NIT","Trichy","India",4,9000,480,true,true,"English",180000,"NBA","Top20","1964","Semester","Offline","Top NIT");
        Education e8 = new Education("VTU","Computer Science","BTech","CSE","VTU","Belagavi","India",4,12000,600,false,true,"English",150000,"AICTE","Top50","1998","Semester","Offline","State University");
        Education e9 = new Education("Delhi University","Commerce","BCom","Commerce","DU","Delhi","India",3,15000,700,true,false,"English",80000,"NAAC A+","Top20","1922","Semester","Offline","Central University");
        Education e10 = new Education("Anna University","Engineering","BTech","IT","Anna University","Chennai","India",4,11000,550,false,true,"English",140000,"AICTE","Top30","1978","Semester","Offline","Technical University");

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
        e6.display();
        e7.display();
        e8.display();
        e9.display();
        e10.display();
    }
}