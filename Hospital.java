class Hospital{

static void bookAppointment(String patientName,String symptom){

	System.out.println("Basic Check started");

	Nurse.basicCheck(patientName,symptom,false,true);
	System.out.println("Basic Check ended");

}

}