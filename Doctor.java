class Doctor{
   int doctorId;
   String doctorName;
   String specialization;
   String experience;
   int fees;
   
   Doctor(int doctorId, String doctorName, String specialization, String experience, int fees){
     this.doctorId=doctorId;
	 this.doctorName=doctorName;
	 this.specialization=specialization;
	 this.experience=experience;
	 this.fees=fees;
	 }
	 
	 public void getDoctordetails(){
		 System.out.println("------------------------");
		 System.out.println("The doctor details is....................");
	     System.out.println("The doctor id is:" +this.doctorId);
		 System.out.println("The doctor name is:" +this.doctorName);
		 System.out.println("The specialization of doctor is:" +this.specialization);
		 System.out.println("Doctor experience is:" +this.experience);
		 System.out.println("Consultant fees is:" +this.fees);
		 
	 }
}