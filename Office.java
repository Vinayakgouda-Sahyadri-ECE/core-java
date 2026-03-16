class Office {

    String name;
    String location;
    String city;
    String country;
    int employees;
    int floors;
    String buildingType;
    double area;
    boolean parkingAvailable;
    boolean cafeteriaAvailable;
    String managerName;
    String department;
    int meetingRooms;
    int cabins;
    String workingHours;
    String companyType;
    double electricityConsumption;
    boolean securitySystem;
    String internetProvider;
    String notes;

    Office(String name,String location,String city,String country,int employees,
           int floors,String buildingType,double area,boolean parkingAvailable,
           boolean cafeteriaAvailable,String managerName,String department,
           int meetingRooms,int cabins,String workingHours,String companyType,
           double electricityConsumption,boolean securitySystem,
           String internetProvider,String notes){

        this.name = name;
        this.location = location;
        this.city = city;
        this.country = country;
        this.employees = employees;
        this.floors = floors;
        this.buildingType = buildingType;
        this.area = area;
        this.parkingAvailable = parkingAvailable;
        this.cafeteriaAvailable = cafeteriaAvailable;
        this.managerName = managerName;
        this.department = department;
        this.meetingRooms = meetingRooms;
        this.cabins = cabins;
        this.workingHours = workingHours;
        this.companyType = companyType;
        this.electricityConsumption = electricityConsumption;
        this.securitySystem = securitySystem;
        this.internetProvider = internetProvider;
        this.notes = notes;
    }

    void display(){

		System.out.println("-------------");
        System.out.println(name);
        System.out.println(location);
        System.out.println(city);
        System.out.println(country);
        System.out.println(employees);
        System.out.println(floors);
        System.out.println(buildingType);
        System.out.println(area);
        System.out.println(parkingAvailable);
        System.out.println(cafeteriaAvailable);
        System.out.println(managerName);
        System.out.println(department);
        System.out.println(meetingRooms);
        System.out.println(cabins);
        System.out.println(workingHours);
        System.out.println(companyType);
        System.out.println(electricityConsumption);
        System.out.println(securitySystem);
        System.out.println(internetProvider);
        System.out.println(notes);
    }
}