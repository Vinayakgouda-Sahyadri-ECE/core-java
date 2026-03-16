class Boggy{
  int boggyNumber;
  String boggyType;
  int coachPosition;
  int totalSeats;
  int availableSeats;
  String coachColor;
  int manufacturingYear;
  String coachLength;
  double coachWidth;
  int weight;
  String doorType;
  boolean airConditioner;
  String chargingPoints;
  int washrooms;
  boolean emergencyWindow;
  String fireSafetySystem;
  String coachMaterial;
  String maintenanceStatus;
  String lightingSystem;
  String maximumCapacity;
  
  Boggy(int boggyNumber,
  String boggyType,
  int coachPosition,
  int totalSeats,
  int availableSeats,
  String coachColor,
  int manufacturingYear,
  String coachLength,
  double coachWidth,
  int weight,
  String doorType,
  boolean airConditioner,
  String chargingPoints,
  int washrooms,
  boolean emergencyWindow,
  String fireSafetySystem,
  String coachMaterial,
  String maintenanceStatus,
  String lightingSystem,
  String maximumCapacity){
  
  this.boggyNumber=boggyNumber;
  this.boggyType=boggyType;
  this.coachPosition=coachPosition;
  this.totalSeats=totalSeats;
  this.availableSeats=availableSeats;
  this.coachColor=coachColor;
  this.manufacturingYear=manufacturingYear;
  this.coachLength=coachLength;
  this.coachWidth=coachWidth;
  this.weight=weight;
  this.doorType=doorType;
  this.airConditioner=airConditioner;
  this.chargingPoints=chargingPoints;
  this.washrooms=washrooms;
  this.emergencyWindow=emergencyWindow;
  this.fireSafetySystem=fireSafetySystem;
  this.coachMaterial=coachMaterial;
  this.maintenanceStatus=maintenanceStatus;
  this.lightingSystem=lightingSystem;
  this.maximumCapacity=maximumCapacity;
  }
  
  public void getBoggyDetails(){
	  System.out.println("---------------------------------------");
     System.out.println("The boggy number is:" +this.boggyNumber);
	 System.out.println("The boggy type is:" +this.boggyType);
	 System.out.println("The coach position is:" +this.coachPosition);
	 System.out.println("The total number of seats in a train is:" +this.totalSeats);
	 System.out.println("The available seats are:" +this.availableSeats);
	 System.out.println("The coach color is:" +this.coachColor);
	 System.out.println("The manufacturing Year is:" +this.manufacturingYear);
	 System.out.println("The coach length is:" +this.coachLength);
	 System.out.println("The coach width is:" +this.coachWidth);
	 System.out.println("The weight of train is:" +this.weight);
	 System.out.println("The doortype of train is:" +this.doorType);
	 System.out.println("The train is air conditioned:" +this.airConditioner);
	 System.out.println("The charging point of train:" +this.chargingPoints);
	 System.out.println("Number of wash rooms in a train:" +this.washrooms);
	 System.out.println("Is there emergency window in a train:" +this.emergencyWindow);
	 System.out.println("Is there fire safety system is installed:" +this.fireSafetySystem);
	 System.out.println("The coach material is:" +this.coachMaterial);
	 System.out.println("The maintance status of a train is:" +this.lightingSystem);
	 System.out.println("The lighting system of a train:" +this.lightingSystem);
	 System.out.println("The maximum capacity of train is:" +this.maximumCapacity);
  }
}
  
  