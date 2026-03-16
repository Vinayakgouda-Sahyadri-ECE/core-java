class Machine{

int machineId;
String machineName;
String machineType;
String machineBrand;
String machineModel;
String machineColor;
int manufacturingYear;
String powerConsumption;
String machineSpeed;
boolean automaticMachine;
String controlSystem;
String machineWeight;
String machineSize;
String machineMaterial;
boolean safetyGuard;
String operatingVoltage;
String maintenanceLevel;
String machineCategory;
String machineCondition;
String machineStatus;

Machine(int machineId,String machineName,String machineType,String machineBrand,
String machineModel,String machineColor,int manufacturingYear,
String powerConsumption,String machineSpeed,boolean automaticMachine,
String controlSystem,String machineWeight,String machineSize,
String machineMaterial,boolean safetyGuard,String operatingVoltage,
String maintenanceLevel,String machineCategory,String machineCondition,
String machineStatus){

this.machineId=machineId;
this.machineName=machineName;
this.machineType=machineType;
this.machineBrand=machineBrand;
this.machineModel=machineModel;
this.machineColor=machineColor;
this.manufacturingYear=manufacturingYear;
this.powerConsumption=powerConsumption;
this.machineSpeed=machineSpeed;
this.automaticMachine=automaticMachine;
this.controlSystem=controlSystem;
this.machineWeight=machineWeight;
this.machineSize=machineSize;
this.machineMaterial=machineMaterial;
this.safetyGuard=safetyGuard;
this.operatingVoltage=operatingVoltage;
this.maintenanceLevel=maintenanceLevel;
this.machineCategory=machineCategory;
this.machineCondition=machineCondition;
this.machineStatus=machineStatus;

}

public void getMachineDetails(){

System.out.println("-----------------------------------");
System.out.println("Machine ID: "+this.machineId);
System.out.println("Machine Name: "+this.machineName);
System.out.println("Machine Type: "+this.machineType);
System.out.println("Machine Brand: "+this.machineBrand);
System.out.println("Machine Model: "+this.machineModel);
System.out.println("Machine Color: "+this.machineColor);
System.out.println("Manufacturing Year: "+this.manufacturingYear);
System.out.println("Power Consumption: "+this.powerConsumption);
System.out.println("Machine Speed: "+this.machineSpeed);
System.out.println("Automatic Machine: "+this.automaticMachine);
System.out.println("Control System: "+this.controlSystem);
System.out.println("Machine Weight: "+this.machineWeight);
System.out.println("Machine Size: "+this.machineSize);
System.out.println("Machine Material: "+this.machineMaterial);
System.out.println("Safety Guard: "+this.safetyGuard);
System.out.println("Operating Voltage: "+this.operatingVoltage);
System.out.println("Maintenance Level: "+this.maintenanceLevel);
System.out.println("Machine Category: "+this.machineCategory);
System.out.println("Machine Condition: "+this.machineCondition);
System.out.println("Machine Status: "+this.machineStatus);

}

}