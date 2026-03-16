class RhythmsExecutor{

public static void main(String[] args){

Rhythms r1 = new Rhythms(1,"Rock Beat","Rock","USA","Global","Fast","4/4","Modern","Rock Dance","Concerts",true,1,"High","Energetic","English","John","Stage","1990s","Active","Electric");
MusicInstrument m1 = new MusicInstrument(101,"Electric Guitar","String","Wood","USA","Sharp","String",3.5,100,"Black",true,"Standard",6,"Fender","Concert","Monthly","High","Loud","Very High","Active");
r1.instrument=m1;
r1.getRhythmDetails();

System.out.println();
Rhythms r2 = new Rhythms(2,"Classical Beat","Classical","India","India","Slow","3/4","Traditional","Bharatanatyam","Festivals",true,2,"High","Calm","Sanskrit","Ravi","Temple","1800s","Active","Traditional");
MusicInstrument m2 = new MusicInstrument(102,"Veena","String","Wood","India","Soft","String",4.0,120,"Brown",false,"Manual",7,"Indian Crafts","Concert","Monthly","High","Medium","High","Active");
r2.instrument=m2;
r2.getRhythmDetails();

System.out.println();
Rhythms r3 = new Rhythms(3,"Jazz Groove","Jazz","USA","Global","Medium","4/4","Modern","Jazz Dance","Shows",true,3,"Medium","Smooth","English","Miles","Clubs","1950s","Active","Fusion");
MusicInstrument m3 = new MusicInstrument(103,"Saxophone","Wind","Brass","USA","Smooth","Wind",2.5,70,"Gold",false,"Manual",0,"Yamaha","Jazz","Monthly","High","Medium","High","Active");
r3.instrument=m3;
r3.getRhythmDetails();

System.out.println();
Rhythms r4 = new Rhythms(4,"HipHop Beat","HipHop","USA","Global","Fast","4/4","Modern","HipHop Dance","Shows",true,4,"High","Energetic","English","DJ Mike","Street","2000s","Active","Electronic");
MusicInstrument m4 = new MusicInstrument(104,"Drum Pad","Percussion","Plastic","USA","Bass","Percussion",2.0,60,"Black",true,"Digital",0,"Roland","Studio","Monthly","High","Loud","High","Active");
r4.instrument=m4;
r4.getRhythmDetails();

System.out.println();
Rhythms r5 = new Rhythms(5,"Folk Beat","Folk","India","Rural","Medium","4/4","Traditional","Folk Dance","Festivals",true,5,"High","Happy","Hindi","Local","Village","1700s","Active","Traditional");
MusicInstrument m5 = new MusicInstrument(105,"Dhol","Percussion","Wood","India","Loud","Percussion",5.0,90,"Brown",false,"Manual",0,"Local Maker","Festival","Monthly","High","Loud","High","Active");
r5.instrument=m5;
r5.getRhythmDetails();

System.out.println();

/* 6 – 20 */

Rhythms r6=new Rhythms(6,"Pop Beat","Pop","USA","Global","Fast","4/4","Modern","Pop Dance","Shows",true,6,"High","Happy","English","Alex","Stage","2000s","Active","Electronic");
MusicInstrument m6=new MusicInstrument(106,"Keyboard","Electronic","Plastic","Japan","Digital","Electronic",4.0,110,"Black",true,"Auto",0,"Casio","Concert","Monthly","High","Medium","High","Active");
r6.instrument=m6; r6.getRhythmDetails();

System.out.println();
Rhythms r7=new Rhythms(7,"EDM Beat","EDM","Germany","Global","Fast","4/4","Modern","Club","Parties",true,7,"High","Energetic","English","DJ Max","Club","2010s","Active","Electronic");
MusicInstrument m7=new MusicInstrument(107,"DJ Mixer","Electronic","Plastic","Germany","Bass","Electronic",3.0,50,"Black",true,"Digital",0,"Pioneer","Club","Monthly","High","Loud","High","Active");
r7.instrument=m7; r7.getRhythmDetails();

System.out.println();
Rhythms r8=new Rhythms(8,"Carnatic Beat","Carnatic","India","South India","Medium","Adi","Traditional","Classical Dance","Temple",true,8,"High","Calm","Tamil","Tyagaraja","Temple","1700s","Active","Traditional");
MusicInstrument m8=new MusicInstrument(108,"Mridangam","Percussion","Wood","India","Deep","Percussion",4.5,80,"Brown",false,"Manual",0,"Indian Crafts","Concert","Monthly","High","Medium","High","Active");
r8.instrument=m8; r8.getRhythmDetails();

System.out.println();
Rhythms r9=new Rhythms(9,"Latin Beat","Latin","Brazil","Latin America","Fast","4/4","Modern","Salsa","Shows",true,9,"High","Happy","Spanish","Carlos","Stage","1980s","Active","Fusion");
MusicInstrument m9=new MusicInstrument(109,"Bongo","Percussion","Wood","Brazil","Sharp","Percussion",2.5,40,"Brown",false,"Manual",0,"Latin Maker","Dance","Monthly","High","Medium","High","Active");
r9.instrument=m9; r9.getRhythmDetails();

System.out.println();
Rhythms r10=new Rhythms(10,"Reggae Beat","Reggae","Jamaica","Caribbean","Medium","4/4","Modern","Reggae Dance","Shows",true,10,"High","Relaxed","English","Bob","Stage","1970s","Active","Fusion");
MusicInstrument m10=new MusicInstrument(110,"Bass Guitar","String","Wood","USA","Deep","String",3.8,105,"Black",true,"Standard",4,"Fender","Concert","Monthly","High","Medium","High","Active");
r10.instrument=m10; r10.getRhythmDetails();

System.out.println();
Rhythms r11=new Rhythms(11,"Trap Beat","Trap","USA","Global","Fast","4/4","Modern","HipHop","Clubs",true,11,"High","Dark","English","DJ Tom","Studio","2010s","Active","Electronic");
MusicInstrument m11=new MusicInstrument(111,"Drum Machine","Electronic","Plastic","USA","Bass","Electronic",3.2,60,"Black",true,"Digital",0,"Roland","Studio","Monthly","High","Loud","High","Active");
r11.instrument=m11; r11.getRhythmDetails();

System.out.println();
Rhythms r12=new Rhythms(12,"Bollywood Beat","Bollywood","India","India","Fast","4/4","Modern","Film Dance","Shows",true,12,"High","Happy","Hindi","AR Rahman","Cinema","2000s","Active","Fusion");
MusicInstrument m12=new MusicInstrument(112,"Tabla","Percussion","Wood","India","Sharp","Percussion",3.5,60,"Brown",false,"Manual",0,"Indian Crafts","Concert","Monthly","High","Medium","High","Active");
r12.instrument=m12; r12.getRhythmDetails();

System.out.println();
Rhythms r13=new Rhythms(13,"Flamenco Beat","Flamenco","Spain","Spain","Fast","3/4","Traditional","Flamenco","Shows",true,13,"High","Energetic","Spanish","Paco","Stage","1800s","Active","Traditional");
MusicInstrument m13=new MusicInstrument(113,"Spanish Guitar","String","Wood","Spain","Bright","String",3.6,100,"Brown",false,"Standard",6,"Yamaha","Concert","Monthly","High","Medium","High","Active");
r13.instrument=m13; r13.getRhythmDetails();

System.out.println();
Rhythms r14=new Rhythms(14,"Blues Beat","Blues","USA","USA","Slow","4/4","Traditional","Blues","Clubs",true,14,"High","Sad","English","BB King","Stage","1900s","Active","Traditional");
MusicInstrument m14=new MusicInstrument(114,"Harmonica","Wind","Metal","USA","Soft","Wind",0.5,10,"Silver",false,"Manual",0,"Hohner","Blues","Monthly","High","Medium","High","Active");
r14.instrument=m14; r14.getRhythmDetails();

System.out.println();
Rhythms r15=new Rhythms(15,"Techno Beat","Techno","Germany","Global","Fast","4/4","Modern","Club","Parties",true,15,"High","Energetic","English","DJ Carl","Club","1990s","Active","Electronic");
MusicInstrument m15=new MusicInstrument(115,"Synthesizer","Electronic","Plastic","Germany","Digital","Electronic",5.0,120,"Black",true,"Auto",0,"Korg","Studio","Monthly","High","Loud","High","Active");
r15.instrument=m15; r15.getRhythmDetails();

System.out.println();
Rhythms r16=new Rhythms(16,"Disco Beat","Disco","USA","Global","Fast","4/4","Modern","Disco Dance","Shows",true,16,"High","Happy","English","Donna","Stage","1970s","Active","Fusion");
MusicInstrument m16=new MusicInstrument(116,"Drum Set","Percussion","Metal","USA","Loud","Percussion",20.0,150,"Red",false,"Manual",0,"Pearl","Concert","Monthly","High","Loud","High","Active");
r16.instrument=m16; r16.getRhythmDetails();

System.out.println();
Rhythms r17=new Rhythms(17,"Trance Beat","Trance","Netherlands","Global","Fast","4/4","Modern","Club","Festivals",true,17,"High","Energetic","English","Armin","Stage","2000s","Active","Electronic");
MusicInstrument m17=new MusicInstrument(117,"DJ Console","Electronic","Plastic","Netherlands","Bass","Electronic",4.0,70,"Black",true,"Digital",0,"Pioneer","Club","Monthly","High","Loud","High","Active");
r17.instrument=m17; r17.getRhythmDetails();

System.out.println();
Rhythms r18=new Rhythms(18,"Country Beat","Country","USA","USA","Medium","4/4","Traditional","Country Dance","Shows",true,18,"High","Happy","English","Johnny","Stage","1950s","Active","Traditional");
MusicInstrument m18=new MusicInstrument(118,"Banjo","String","Wood","USA","Bright","String",3.0,95,"Brown",false,"Standard",5,"Gibson","Concert","Monthly","High","Medium","High","Active");
r18.instrument=m18; r18.getRhythmDetails();

System.out.println();
Rhythms r19=new Rhythms(19,"Samba Beat","Samba","Brazil","Brazil","Fast","2/4","Traditional","Samba","Carnival",true,19,"High","Happy","Portuguese","Joao","Festival","1900s","Active","Traditional");
MusicInstrument m19=new MusicInstrument(119,"Surdo Drum","Percussion","Metal","Brazil","Deep","Percussion",6.0,100,"Silver",false,"Manual",0,"Brazil Maker","Festival","Monthly","High","Loud","High","Active");
r19.instrument=m19; r19.getRhythmDetails();

System.out.println();
Rhythms r20=new Rhythms(20,"Ambient Beat","Ambient","UK","Global","Slow","4/4","Modern","Relax","Meditation",true,20,"Medium","Calm","English","Brian","Studio","1990s","Active","Electronic");
MusicInstrument m20=new MusicInstrument(120,"Ambient Synth","Electronic","Plastic","UK","Soft","Electronic",4.0,110,"Black",true,"Auto",0,"Roland","Studio","Monthly","High","Soft","High","Active");
r20.instrument=m20; r20.getRhythmDetails();

}
}