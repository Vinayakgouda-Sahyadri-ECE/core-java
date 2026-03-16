class HospitalExecutor{
 public static void main(String[] args){
    Hospital h= new Hospital(1056);
	Doctor doctor = new Doctor(23, "Rajeev", "Cardiologist", "15yrs", 1200);
	h.doctor=doctor;
	h.getHospitalDetails();
	
	Hospital h1= new Hospital(2000);
	Doctor doctor1 = new Doctor(49, "Charan", "Neurologist", "20yrs", 5000);
	h.doctor=doctor1;
	h.getHospitalDetails();
	
	}
}