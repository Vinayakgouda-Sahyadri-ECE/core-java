class Reception{

static void book(String patientName,String symptom,String email,long mobileNo){

	System.out.println("Book appoitment started");

	Hospital.bookAppointment(patientName,symptom);
	System.out.println("Book appoitment ended");

}

}