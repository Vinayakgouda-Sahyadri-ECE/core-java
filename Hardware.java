class Hardware{

int hardwareId;
String cpuModel;
String ramType;
String storageType;
String gpuModel;
String motherboardModel;
String powerUnit;
String coolingFan;
boolean rgbLighting;
String cabinetBrand;
String monitorBrand;
String keyboardBrand;
String mouseBrand;
String speakerBrand;
String networkCard;
String soundCard;
String usbPorts;
String hdmiPorts;
String hardwareCondition;
String hardwareStatus;

Hardware(int hardwareId,String cpuModel,String ramType,String storageType,
String gpuModel,String motherboardModel,String powerUnit,String coolingFan,
boolean rgbLighting,String cabinetBrand,String monitorBrand,
String keyboardBrand,String mouseBrand,String speakerBrand,
String networkCard,String soundCard,String usbPorts,String hdmiPorts,
String hardwareCondition,String hardwareStatus){

this.hardwareId=hardwareId;
this.cpuModel=cpuModel;
this.ramType=ramType;
this.storageType=storageType;
this.gpuModel=gpuModel;
this.motherboardModel=motherboardModel;
this.powerUnit=powerUnit;
this.coolingFan=coolingFan;
this.rgbLighting=rgbLighting;
this.cabinetBrand=cabinetBrand;
this.monitorBrand=monitorBrand;
this.keyboardBrand=keyboardBrand;
this.mouseBrand=mouseBrand;
this.speakerBrand=speakerBrand;
this.networkCard=networkCard;
this.soundCard=soundCard;
this.usbPorts=usbPorts;
this.hdmiPorts=hdmiPorts;
this.hardwareCondition=hardwareCondition;
this.hardwareStatus=hardwareStatus;

}

public void getHardwareDetails(){

System.out.println("---------------------------------------");
System.out.println("Hardware ID: "+this.hardwareId);
System.out.println("CPU Model: "+this.cpuModel);
System.out.println("RAM Type: "+this.ramType);
System.out.println("Storage Type: "+this.storageType);
System.out.println("GPU Model: "+this.gpuModel);
System.out.println("Motherboard Model: "+this.motherboardModel);
System.out.println("Power Unit: "+this.powerUnit);
System.out.println("Cooling Fan: "+this.coolingFan);
System.out.println("RGB Lighting: "+this.rgbLighting);
System.out.println("Cabinet Brand: "+this.cabinetBrand);
System.out.println("Monitor Brand: "+this.monitorBrand);
System.out.println("Keyboard Brand: "+this.keyboardBrand);
System.out.println("Mouse Brand: "+this.mouseBrand);
System.out.println("Speaker Brand: "+this.speakerBrand);
System.out.println("Network Card: "+this.networkCard);
System.out.println("Sound Card: "+this.soundCard);
System.out.println("USB Ports: "+this.usbPorts);
System.out.println("HDMI Ports: "+this.hdmiPorts);
System.out.println("Hardware Condition: "+this.hardwareCondition);
System.out.println("Hardware Status: "+this.hardwareStatus);

}

}