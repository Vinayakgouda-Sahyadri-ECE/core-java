class CellRunner {

    public static void main(String[] args) {

        Cell c1 = new Cell("HumanCell","Eukaryotic","Human","Round",10,"True","Lipid","Present","BodyFunction",true,"1665","RobertHooke",46,"Mitosis","Glucose","Complex","Body",true,"Biology","Normal");
        Cell c2 = new Cell("PlantCell","Eukaryotic","Plant","Rectangular",20,"True","CellWall","Present","Photosynthesis",true,"1665","RobertHooke",24,"Mitosis","Sunlight","Complex","Leaf",true,"Botany","GreenCell");
        Cell c3 = new Cell("Bacteria","Prokaryotic","Bacteria","Rod",2,"None","Peptidoglycan","Present","Metabolism",true,"1676","Leeuwenhoek",1,"BinaryFission","Glucose","Simple","Environment",true,"Microbiology","Active");
        Cell c4 = new Cell("Neuron","Eukaryotic","Human","Star",15,"True","Lipid","Present","SignalTransfer",true,"1837","Schwann",46,"Mitosis","Glucose","Complex","Brain",true,"Neuroscience","Important");
        Cell c5 = new Cell("MuscleCell","Eukaryotic","Human","Long",50,"True","Lipid","Present","Movement",true,"1837","Schwann",46,"Mitosis","Glucose","Complex","Muscle",true,"Biology","Strong");
        Cell c6 = new Cell("BloodCell","Eukaryotic","Human","Round",7,"None","Lipid","Present","OxygenTransport",true,"1658","Swammerdam",46,"Mitosis","Glucose","Simple","Blood",true,"Medicine","RBC");
        Cell c7 = new Cell("SkinCell","Eukaryotic","Human","Flat",30,"True","Lipid","Present","Protection",true,"1837","Schwann",46,"Mitosis","Glucose","Complex","Skin",true,"Dermatology","OuterLayer");
        Cell c8 = new Cell("StemCell","Eukaryotic","Human","Round",12,"True","Lipid","Present","Regeneration",true,"1960","Scientists",46,"Mitosis","Glucose","Complex","BoneMarrow",true,"Research","Important");
        Cell c9 = new Cell("AlgaeCell","Eukaryotic","Algae","Oval",15,"True","CellWall","Present","Photosynthesis",true,"1800","Scientists",12,"Mitosis","Sunlight","Complex","Water",true,"MarineBiology","Green");
        Cell c10 = new Cell("FungiCell","Eukaryotic","Fungi","Round",8,"True","Chitin","Present","Decomposition",true,"1700","Scientists",8,"Mitosis","Organic","Complex","Soil",true,"Mycology","Important");

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
        c7.display();
        c8.display();
        c9.display();
        c10.display();
    }
}