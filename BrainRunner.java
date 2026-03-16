class BrainRunner {

    public static void main(String[] args) {

        Brain b1 = new Brain("HumanBrain","Human",1.4,1300,"Grey",860000000,4,"ControlBody",true,"ShortTerm","High","Advanced","Central","Skull","Head",20,"Arteries",true,"Neuroscience","Normal");
        Brain b2 = new Brain("AnimalBrain","Dog",0.07,100,"Grey",53000000,4,"ControlBody",true,"Memory","Medium","Moderate","Central","Skull","Head",18,"Arteries",true,"Biology","Healthy");
        Brain b3 = new Brain("PrimateBrain","Monkey",0.4,400,"Grey",300000000,4,"ControlBody",true,"Memory","High","High","Central","Skull","Head",19,"Arteries",true,"Research","Normal");
        Brain b4 = new Brain("BirdBrain","Eagle",0.02,50,"Grey",20000000,2,"VisionControl",true,"Navigation","Medium","Moderate","Central","Skull","Head",15,"Arteries",true,"Biology","Active");
        Brain b5 = new Brain("FishBrain","Shark",0.03,70,"Grey",15000000,2,"Movement",true,"Instinct","Low","Basic","Central","Skull","Head",14,"Arteries",true,"MarineBiology","Normal");
        Brain b6 = new Brain("HumanBrain","Human",1.3,1250,"Grey",850000000,4,"ControlBody",true,"Memory","High","Advanced","Central","Skull","Head",20,"Arteries",true,"Neuroscience","Healthy");
        Brain b7 = new Brain("AnimalBrain","Cat",0.03,90,"Grey",30000000,4,"ControlBody",true,"Memory","Medium","Moderate","Central","Skull","Head",18,"Arteries",true,"Biology","Normal");
        Brain b8 = new Brain("ReptileBrain","Snake",0.01,40,"Grey",10000000,2,"Reflex",true,"Instinct","Low","Basic","Central","Skull","Head",12,"Arteries",true,"Research","Active");
        Brain b9 = new Brain("HumanBrain","Human",1.35,1280,"Grey",860000000,4,"ControlBody",true,"ShortTerm","High","Advanced","Central","Skull","Head",20,"Arteries",true,"Neuroscience","Normal");
        Brain b10 = new Brain("AnimalBrain","Horse",0.6,500,"Grey",400000000,4,"Movement",true,"Memory","Medium","Moderate","Central","Skull","Head",19,"Arteries",true,"Biology","Healthy");

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        b6.display();
        b7.display();
        b8.display();
        b9.display();
        b10.display();
    }
}