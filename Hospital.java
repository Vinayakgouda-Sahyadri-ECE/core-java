class Hospital{

   int HospitalId;
   Doctor doctor;
   
   Hospital(int HospitalId){
     this.HospitalId=HospitalId;
   }
   
   public void getHospitalDetails(){
	    System.out.println("----------------");
		System.out.println("The hospital details is:" +this.HospitalId);
		this.doctor.getDoctordetails();
	}
}