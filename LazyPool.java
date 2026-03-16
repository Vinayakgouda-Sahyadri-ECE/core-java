class LazyPool{

int poolId;
String poolName;
String poolType;
String waterSource;
double poolLength;
double poolWidth;
double poolDepth;
String waterTemperature;
boolean lifeGuardAvailable;
int tubesAvailable;
String poolColor;
String filtrationSystem;
String safetySystem;
int maxCapacity;
String poolMaterial;
String maintenanceSchedule;
boolean waveFeature;
String poolCategory;
String poolCondition;
String poolStatus;

LazyPool(int poolId,String poolName,String poolType,String waterSource,
double poolLength,double poolWidth,double poolDepth,String waterTemperature,
boolean lifeGuardAvailable,int tubesAvailable,String poolColor,
String filtrationSystem,String safetySystem,int maxCapacity,
String poolMaterial,String maintenanceSchedule,boolean waveFeature,
String poolCategory,String poolCondition,String poolStatus){

this.poolId=poolId;
this.poolName=poolName;
this.poolType=poolType;
this.waterSource=waterSource;
this.poolLength=poolLength;
this.poolWidth=poolWidth;
this.poolDepth=poolDepth;
this.waterTemperature=waterTemperature;
this.lifeGuardAvailable=lifeGuardAvailable;
this.tubesAvailable=tubesAvailable;
this.poolColor=poolColor;
this.filtrationSystem=filtrationSystem;
this.safetySystem=safetySystem;
this.maxCapacity=maxCapacity;
this.poolMaterial=poolMaterial;
this.maintenanceSchedule=maintenanceSchedule;
this.waveFeature=waveFeature;
this.poolCategory=poolCategory;
this.poolCondition=poolCondition;
this.poolStatus=poolStatus;

}

public void getLazyPoolDetails(){

System.out.println("-----------------------------------");
System.out.println("Pool ID: "+this.poolId);
System.out.println("Pool Name: "+this.poolName);
System.out.println("Pool Type: "+this.poolType);
System.out.println("Water Source: "+this.waterSource);
System.out.println("Pool Length: "+this.poolLength);
System.out.println("Pool Width: "+this.poolWidth);
System.out.println("Pool Depth: "+this.poolDepth);
System.out.println("Water Temperature: "+this.waterTemperature);
System.out.println("Life Guard Available: "+this.lifeGuardAvailable);
System.out.println("Tubes Available: "+this.tubesAvailable);
System.out.println("Pool Color: "+this.poolColor);
System.out.println("Filtration System: "+this.filtrationSystem);
System.out.println("Safety System: "+this.safetySystem);
System.out.println("Max Capacity: "+this.maxCapacity);
System.out.println("Pool Material: "+this.poolMaterial);
System.out.println("Maintenance Schedule: "+this.maintenanceSchedule);
System.out.println("Wave Feature: "+this.waveFeature);
System.out.println("Pool Category: "+this.poolCategory);
System.out.println("Pool Condition: "+this.poolCondition);
System.out.println("Pool Status: "+this.poolStatus);

}

}