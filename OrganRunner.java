class OrganRunner {

    public static void main(String[] args) {

        Organ o1 = new Organ("Heart","Circulatory","Chest",0.3,12,"PumpBlood","Red",true,"Muscle","Arteries","Nerves","RibCage","Cone","Human","Adult",false,"Cardiology","Research","Healthy","MedLab");
        Organ o2 = new Organ("Liver","Digestive","Abdomen",1.5,15,"Detox","Brown",true,"Gland","HepaticArtery","Nerves","RibCage","Triangle","Human","Adult",false,"Hepatology","Research","Normal","MedLab");
        Organ o3 = new Organ("Kidney","Excretory","Back",0.15,10,"FilterBlood","Red",true,"Epithelial","RenalArtery","Nerves","RibCage","Bean","Human","Adult",true,"Nephrology","Research","Healthy","MedLab");
        Organ o4 = new Organ("Lung","Respiratory","Chest",0.5,14,"GasExchange","Pink",true,"Spongy","Pulmonary","Nerves","RibCage","Lobed","Human","Adult",true,"Pulmonology","Research","Healthy","MedLab");
        Organ o5 = new Organ("Brain","Nervous","Head",1.4,13,"ControlBody","Grey",true,"Neural","Arteries","Nerves","Skull","Oval","Human","Adult",false,"Neurology","Research","Normal","MedLab");
        Organ o6 = new Organ("Stomach","Digestive","Abdomen",0.25,11,"DigestFood","Pink",false,"Muscle","Arteries","Nerves","Abdomen","JShape","Human","Adult",false,"Gastroenterology","Research","Healthy","MedLab");
        Organ o7 = new Organ("Pancreas","Digestive","Abdomen",0.2,12,"ProduceEnzymes","Yellow",false,"Gland","Arteries","Nerves","Abdomen","Flat","Human","Adult",false,"Endocrinology","Research","Normal","MedLab");
        Organ o8 = new Organ("Spleen","Immune","Abdomen",0.18,10,"FilterBlood","Purple",false,"Soft","Arteries","Nerves","RibCage","Oval","Human","Adult",false,"Immunology","Research","Healthy","MedLab");
        Organ o9 = new Organ("Skin","Integumentary","Body",3.0,200,"Protection","Brown",true,"Epithelial","Capillaries","Nerves","None","Sheet","Human","Adult",true,"Dermatology","Research","Normal","MedLab");
        Organ o10 = new Organ("Eye","Sensory","Head",0.02,3,"Vision","White",true,"Neural","Arteries","OpticNerve","Skull","Round","Human","Adult",true,"Ophthalmology","Research","Healthy","MedLab");

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