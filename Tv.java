class Tv{

int tvId;
String tvBrand;
String tvModel;
String tvType;
double screenSize;
String resolution;
boolean smartTv;
String operatingSystem;
int totalChannels;
boolean wifiSupport;
int hdmiPorts;
int usbPorts;
String soundSystem;
String tvColor;
String powerConsumption;
String tvCategory;
String manufacturerCountry;
String warrantyPeriod;
String tvStatus;
String remoteType;

Channel channel;

Tv(int tvId,String tvBrand,String tvModel,String tvType,double screenSize,
String resolution,boolean smartTv,String operatingSystem,int totalChannels,
boolean wifiSupport,int hdmiPorts,int usbPorts,String soundSystem,String tvColor,
String powerConsumption,String tvCategory,String manufacturerCountry,
String warrantyPeriod,String tvStatus,String remoteType){

this.tvId=tvId;
this.tvBrand=tvBrand;
this.tvModel=tvModel;
this.tvType=tvType;
this.screenSize=screenSize;
this.resolution=resolution;
this.smartTv=smartTv;
this.operatingSystem=operatingSystem;
this.totalChannels=totalChannels;
this.wifiSupport=wifiSupport;
this.hdmiPorts=hdmiPorts;
this.usbPorts=usbPorts;
this.soundSystem=soundSystem;
this.tvColor=tvColor;
this.powerConsumption=powerConsumption;
this.tvCategory=tvCategory;
this.manufacturerCountry=manufacturerCountry;
this.warrantyPeriod=warrantyPeriod;
this.tvStatus=tvStatus;
this.remoteType=remoteType;

}

public void getTvDetails(){

System.out.println("TV ID: "+this.tvId);
System.out.println("TV Brand: "+this.tvBrand);
System.out.println("TV Model: "+this.tvModel);
System.out.println("TV Type: "+this.tvType);
System.out.println("Screen Size: "+this.screenSize);
System.out.println("Resolution: "+this.resolution);
System.out.println("Smart TV: "+this.smartTv);
System.out.println("Operating System: "+this.operatingSystem);
System.out.println("Total Channels: "+this.totalChannels);
System.out.println("Wifi Support: "+this.wifiSupport);
System.out.println("HDMI Ports: "+this.hdmiPorts);
System.out.println("USB Ports: "+this.usbPorts);
System.out.println("Sound System: "+this.soundSystem);
System.out.println("TV Color: "+this.tvColor);
System.out.println("Power Consumption: "+this.powerConsumption);
System.out.println("TV Category: "+this.tvCategory);
System.out.println("Manufacturer Country: "+this.manufacturerCountry);
System.out.println("Warranty Period: "+this.warrantyPeriod);
System.out.println("TV Status: "+this.tvStatus);
System.out.println("Remote Type: "+this.remoteType);

this.channel.getChannelDetails();

}

}