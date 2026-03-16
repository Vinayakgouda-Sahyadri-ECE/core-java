class ToxicRunner {

    public static void main(String[] args) {

        Toxic t1 = new Toxic("Chlorine","Gas","Green","Strong","Gas",5,9.5,"Hazard","Cool",true,true,"ChemCorp","USA","Industry","High","Cylinder",50,"Danger",true,"ABC Chemicals");
        Toxic t2 = new Toxic("Mercury","Metal","Silver","None","Liquid",3,8.8,"Hazard","Dry",false,true,"ChemCorp","USA","Lab","High","Bottle",20,"Warning",true,"XYZ Traders");
        Toxic t3 = new Toxic("Arsenic","Compound","Grey","None","Solid",2,9.0,"Hazard","Dry",false,true,"LabTech","Germany","Research","High","Jar",10,"Danger",true,"LabSuppliers");
        Toxic t4 = new Toxic("Cyanide","Compound","White","Bitter","Solid",1,10.0,"Hazard","Dry",false,true,"ChemLab","UK","Industry","Critical","Jar",5,"Danger",true,"ABC Chemicals");
        Toxic t5 = new Toxic("Lead","Metal","Grey","None","Solid",4,7.5,"Hazard","Dry",false,false,"MetalCorp","USA","Industry","Medium","Box",30,"Warning",false,"MetalSuppliers");
        Toxic t6 = new Toxic("Ammonia","Gas","Colorless","Strong","Gas",6,6.5,"Hazard","Cool",true,false,"ChemCorp","USA","Industry","Medium","Cylinder",40,"Warning",false,"GasSuppliers");
        Toxic t7 = new Toxic("Benzene","Liquid","Clear","Sweet","Liquid",3,8.2,"Hazard","Cool",true,false,"PetroChem","USA","Fuel","High","Bottle",25,"Danger",true,"FuelSuppliers");
        Toxic t8 = new Toxic("Formaldehyde","Liquid","Clear","Strong","Liquid",2,7.8,"Hazard","Cool",true,false,"ChemLab","UK","Lab","Medium","Bottle",15,"Warning",false,"LabSuppliers");
        Toxic t9 = new Toxic("Pesticide","Chemical","Yellow","Strong","Liquid",5,7.0,"Hazard","Dry",true,false,"AgroChem","India","Agriculture","Medium","Can",35,"Warning",false,"FarmSuppliers");
        Toxic t10 = new Toxic("Sulfuric Acid","Acid","Clear","None","Liquid",4,9.3,"Hazard","Cool",false,true,"ChemCorp","USA","Industry","High","Drum",60,"Danger",true,"ABC Chemicals");

        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        t6.display();
        t7.display();
        t8.display();
        t9.display();
        t10.display();
    }
}