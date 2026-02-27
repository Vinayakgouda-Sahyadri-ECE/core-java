class Nurse{

static void basicCheck(String patientName,String symptom,boolean bp,boolean sugar){

	System.out.println("treat started");

	Doctor.treat(patientName,symptom);
	System.out.println("treat ended");

}

}