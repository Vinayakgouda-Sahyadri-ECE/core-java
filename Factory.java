class Factory{

int factoryId;
String factoryName;
String location;
String city;
String state;
int totalWorkers;
int totalMachines;
String openingTime;
String closingTime;
boolean powerBackup;
int supervisors;
String factoryOwner;
String securitySystem;
boolean safetyEquipment;
int productionLines;
int storageUnits;
String factoryCategory;
String mainProduct;
String maintenanceStatus;
String factoryStatus;

Machine machine;

Factory(int factoryId,String factoryName,String location,String city,String state,
int totalWorkers,int totalMachines,String openingTime,String closingTime,
boolean powerBackup,int supervisors,String factoryOwner,String securitySystem,
boolean safetyEquipment,int productionLines,int storageUnits,
String factoryCategory,String mainProduct,String maintenanceStatus,String factoryStatus){

this.factoryId=factoryId;
this.factoryName=factoryName;
this.location=location;
this.city=city;
this.state=state;
this.totalWorkers=totalWorkers;
this.totalMachines=totalMachines;
this.openingTime=openingTime;
this.closingTime=closingTime;
this.powerBackup=powerBackup;
this.supervisors=supervisors;
this.factoryOwner=factoryOwner;
this.securitySystem=securitySystem;
this.safetyEquipment=safetyEquipment;
this.productionLines=productionLines;
this.storageUnits=storageUnits;
this.factoryCategory=factoryCategory;
this.mainProduct=mainProduct;
this.maintenanceStatus=maintenanceStatus;
this.factoryStatus=factoryStatus;

}

public void getFactoryDetails(){

System.out.println("Factory ID: "+this.factoryId);
System.out.println("Factory Name: "+this.factoryName);
System.out.println("Location: "+this.location);
System.out.println("City: "+this.city);
System.out.println("State: "+this.state);
System.out.println("Total Workers: "+this.totalWorkers);
System.out.println("Total Machines: "+this.totalMachines);
System.out.println("Opening Time: "+this.openingTime);
System.out.println("Closing Time: "+this.closingTime);
System.out.println("Power Backup: "+this.powerBackup);
System.out.println("Supervisors: "+this.supervisors);
System.out.println("Factory Owner: "+this.factoryOwner);
System.out.println("Security System: "+this.securitySystem);
System.out.println("Safety Equipment: "+this.safetyEquipment);
System.out.println("Production Lines: "+this.productionLines);
System.out.println("Storage Units: "+this.storageUnits);
System.out.println("Factory Category: "+this.factoryCategory);
System.out.println("Main Product: "+this.mainProduct);
System.out.println("Maintenance Status: "+this.maintenanceStatus);
System.out.println("Factory Status: "+this.factoryStatus);

this.machine.getMachineDetails();

}

}