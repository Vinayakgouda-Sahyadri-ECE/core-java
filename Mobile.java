class Mobile{

static void register(String patientName,String symptom,String email,long mobileNo){

	System.out.println("Book started");

	Reception.book(patientName,symptom,email,mobileNo);
	System.out.println("Book ended");

}

}