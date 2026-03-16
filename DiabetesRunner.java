class DiabetesRunner {

    public static void main(String[] args) {

        Diabetes d1 = new Diabetes("Ravi",45,"Male","Type2",180,12,true,"Fatigue","Medication","Dr Kumar","Apollo","Bangalore","India",75,170,"LowSugar","Walking",true,"Glucometer","Stable");
        Diabetes d2 = new Diabetes("Anita",50,"Female","Type2",200,15,true,"Thirst","Insulin","Dr Mehta","Fortis","Delhi","India",70,165,"DietControl","Yoga",true,"BloodTest","Monitoring");
        Diabetes d3 = new Diabetes("Raj",40,"Male","Type1",160,10,false,"WeightLoss","Insulin","Dr Shah","CityCare","Mumbai","India",68,172,"LowCarb","Jogging",true,"Glucometer","Stable");
        Diabetes d4 = new Diabetes("Priya",38,"Female","Type2",190,14,true,"Fatigue","Medication","Dr Rao","Apollo","Hyderabad","India",72,168,"LowSugar","Walking",true,"BloodTest","UnderControl");
        Diabetes d5 = new Diabetes("Kiran",47,"Male","Type2",210,16,true,"Thirst","Insulin","Dr Patel","Care","Ahmedabad","India",80,175,"DietControl","Cycling",true,"Glucometer","Monitoring");
        Diabetes d6 = new Diabetes("Meena",55,"Female","Type2",220,18,true,"Fatigue","Medication","Dr Gupta","Max","Delhi","India",74,162,"LowCarb","Yoga",true,"BloodTest","Monitoring");
        Diabetes d7 = new Diabetes("Arun",42,"Male","Type1",170,11,false,"WeightLoss","Insulin","Dr Singh","Apollo","Chennai","India",69,171,"LowSugar","Running",true,"Glucometer","Stable");
        Diabetes d8 = new Diabetes("Sita",48,"Female","Type2",205,15,true,"Fatigue","Medication","Dr Sharma","Fortis","Pune","India",73,167,"DietControl","Walking",true,"BloodTest","Monitoring");
        Diabetes d9 = new Diabetes("Manoj",44,"Male","Type2",195,13,true,"Thirst","Medication","Dr Verma","CityCare","Lucknow","India",78,173,"LowSugar","Gym",true,"Glucometer","Stable");
        Diabetes d10 = new Diabetes("Lata",52,"Female","Type2",215,17,true,"Fatigue","Insulin","Dr Iyer","Apollo","Bangalore","India",71,164,"LowCarb","Yoga",true,"BloodTest","Monitoring");

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
        d6.display();
        d7.display();
        d8.display();
        d9.display();
        d10.display();
    }
}