
class Spotify{}

public static void main(String[] args){

String favouriteSongs[]={"Nadaaniyan","Paro","Jo Tum Mere Ho","Husn","Samjho Na","Dil Tu Jaan Tu","Naina","One Love","No Love","Soni Soni","Sahiba","Radio"};

//for each for(datatype variablename : array name){}
for(String favouritesong: favouriteSongs){
 System.out.println(favouritesong);

}




}}





class Spotify{


public static void main(String[] args){

String favouriteSongs[]={"Nadaaniyan","Paro","Jo Tum Mere Ho","Husn","Samjho Na","Dil Tu Jaan Tu","Naina","One Love","No Love","Soni Soni","Sahiba","Radio"};

String nadaaniyan=favouriteSongs[0];
String paro=favouriteSongs[1];
String jo=favouriteSongs[2];
String husn=favouriteSongs[3];
String samjho=favouriteSongs[4];
String dil=favouriteSongs[5];
String naina=favouriteSongs[6];
String one=favouriteSongs[7];
String no=favouriteSongs[8];
String soni=favouriteSongs[9];
String sahiba=favouriteSongs[10];
String radio=favouriteSongs[11];


int size=favouriteSongs.length;
System.out.println("Favourite songs of the chota bheem is "+ size);
System.out.println("The List of songs are:");
System.out.println( nadaaniyan+","+paro+","+jo+","+husn+","+samjho+","+dil+","+naina+","+one+","+no+","+soni+","+sahiba+","+radio+".");






}}