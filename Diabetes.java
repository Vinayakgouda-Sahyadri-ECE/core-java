class Diabetes {

    String patientName;
    int age;
    String gender;
    String diabetesType;
    double bloodSugarLevel;
    double insulinLevel;
    boolean hereditary;
    String symptoms;
    String treatment;
    String doctorName;
    String hospitalName;
    String city;
    String country;
    double weight;
    double height;
    String dietPlan;
    String exercisePlan;
    boolean medicationRequired;
    String monitoringMethod;
    String remarks;

    Diabetes(String patientName,int age,String gender,String diabetesType,
             double bloodSugarLevel,double insulinLevel,boolean hereditary,
             String symptoms,String treatment,String doctorName,String hospitalName,
             String city,String country,double weight,double height,
             String dietPlan,String exercisePlan,boolean medicationRequired,
             String monitoringMethod,String remarks){

        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.diabetesType = diabetesType;
        this.bloodSugarLevel = bloodSugarLevel;
        this.insulinLevel = insulinLevel;
        this.hereditary = hereditary;
        this.symptoms = symptoms;
        this.treatment = treatment;
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
        this.city = city;
        this.country = country;
        this.weight = weight;
        this.height = height;
        this.dietPlan = dietPlan;
        this.exercisePlan = exercisePlan;
        this.medicationRequired = medicationRequired;
        this.monitoringMethod = monitoringMethod;
        this.remarks = remarks;
    }

    void display(){

        System.out.println(patientName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(diabetesType);
        System.out.println(bloodSugarLevel);
        System.out.println(insulinLevel);
        System.out.println(hereditary);
        System.out.println(symptoms);
        System.out.println(treatment);
        System.out.println(doctorName);
        System.out.println(hospitalName);
        System.out.println(city);
        System.out.println(country);
        System.out.println(weight);
        System.out.println(height);
        System.out.println(dietPlan);
        System.out.println(exercisePlan);
        System.out.println(medicationRequired);
        System.out.println(monitoringMethod);
        System.out.println(remarks);
    }
}