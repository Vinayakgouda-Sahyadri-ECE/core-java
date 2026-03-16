class TrainExecutor{
  public static void main(String[] args){
      Train t= new Train(16535, "Golgumbaz Express", "Mysuru", "Solapura", "07:00AM", "06:30PM", "786km", "18", "Express", 3, "Electric", "60km/h", "daily", true,4,10,4,"On time", "Online&Offline" ,"South Western Railway");
	  Boggy boggy= new Boggy(21, "AC 3 Tier", 5, 72, 30, "Blue", 2018, "23 meter", 3.2, 40, "Automatic", true, "Available",4, true, "Installed", "Stainless steel", "Good", "LED Lights", "72 passangers");
	  t.boggy=boggy;
	  t.getTrainDetails();
	  
	  
	  System.out.println();
	  Train t2 = new Train(12627, "Karnataka Express", "Bengaluru", "New Delhi", "08:20PM", "10:30AM", "2400km", "22", "Superfast", 5, "Electric", "70km/h", "Daily", true, 5, 12, 5, "On time", "Online & Offline", "South Central Railway");
	  Boggy boggy2 = new Boggy(15, "Sleeper", 8, 72, 40, "Red", 2019, "22 meter", 3.1, 38, "Manual", false, "Available", 4, true, "Installed", "Aluminium", "Good", "Tube Lights", "72 passengers");
	  t2.boggy=boggy2;
	  t2.getTrainDetails();
	  
	  System.out.println();
	  Train t3 = new Train(12028, "Shatabdi Express", "Bengaluru", "Chennai", "06:00AM", "11:30AM", "350km", "16", "Superfast", 2, "Electric", "90km/h", "Except Sunday", true, 8, 4, 4, "On time", "Online", "Southern Railway");
	  Boggy boggy3 = new Boggy(10, "Chair Car", 3, 78, 20, "White", 2020, "21 meter", 3.0, 35, "Automatic", true, "Available", 2, true, "Installed", "Steel", "Excellent", "LED Lights", "78 passengers");
	  t.boggy=boggy3;
	  t.getTrainDetails();
	  
	  System.out.println();
Train t4 = new Train(12951, "Mumbai Rajdhani", "Mumbai", "New Delhi", "05:00PM", "08:30AM", "1385km", "20", "Rajdhani", 4, "Electric", "85km/h", "Daily", true, 6, 10, 4, "On time", "Online", "Western Railway");
Boggy boggy4 = new Boggy(12, "AC First Class", 2, 50, 15, "Silver", 2017, "22 meter", 3.1, 36, "Automatic", true, "Available", 2, true, "Installed", "Steel", "Good", "LED Lights", "50 passengers");
t4.boggy = boggy4;
t4.getTrainDetails();

System.out.println();
Train t5 = new Train(12650, "Karnataka Sampark", "Delhi", "Bengaluru", "08:20PM", "06:40AM", "2350km", "22", "Superfast", 3, "Electric", "75km/h", "Daily", true, 5, 12, 5, "On time", "Online", "South Western Railway");
Boggy boggy5 = new Boggy(14, "Sleeper", 6, 72, 28, "Blue", 2019, "23 meter", 3.2, 40, "Manual", false, "Available", 4, true, "Installed", "Stainless Steel", "Good", "LED Lights", "72 passengers");
t5.boggy = boggy5;
t5.getTrainDetails();

System.out.println();
Train t6 = new Train(16591, "Hampi Express", "Mysuru", "Hubli", "09:00PM", "07:30AM", "530km", "18", "Express", 2, "Diesel", "60km/h", "Daily", false, 3, 10, 5, "On time", "Offline", "South Western Railway");
Boggy boggy6 = new Boggy(16, "General", 10, 90, 40, "Green", 2016, "22 meter", 3.0, 38, "Manual", false, "Not Available", 4, true, "Installed", "Steel", "Average", "Tube Lights", "90 passengers");
t6.boggy = boggy6;
t6.getTrainDetails();

System.out.println();
Train t7 = new Train(16215, "Chamundi Express", "Mysuru", "Bengaluru", "06:45AM", "09:45AM", "140km", "15", "Express", 1, "Electric", "65km/h", "Daily", false, 2, 8, 5, "On time", "Offline", "South Western Railway");
Boggy boggy7 = new Boggy(17, "Chair Car", 3, 78, 25, "Yellow", 2021, "21 meter", 3.0, 34, "Automatic", true, "Available", 2, true, "Installed", "Steel", "Excellent", "LED Lights", "78 passengers");
t7.boggy = boggy7;
t7.getTrainDetails();

System.out.println();
Train t8 = new Train(12610, "Brindavan Express", "Chennai", "Mysuru", "07:40AM", "01:00PM", "500km", "16", "Superfast", 3, "Electric", "80km/h", "Daily", true, 4, 6, 6, "On time", "Online", "Southern Railway");
Boggy boggy8 = new Boggy(18, "AC Chair Car", 4, 78, 30, "White", 2020, "21 meter", 3.1, 35, "Automatic", true, "Available", 2, true, "Installed", "Aluminium", "Good", "LED Lights", "78 passengers");
t8.boggy = boggy8;
t8.getTrainDetails();

System.out.println();
Train t9 = new Train(12607, "Lalbagh Express", "Bengaluru", "Chennai", "06:30AM", "12:30PM", "350km", "16", "Superfast", 2, "Electric", "85km/h", "Daily", true, 5, 6, 5, "On time", "Online", "Southern Railway");
Boggy boggy9 = new Boggy(19, "AC Chair Car", 5, 78, 18, "White", 2021, "21 meter", 3.0, 35, "Automatic", true, "Available", 2, true, "Installed", "Steel", "Excellent", "LED Lights", "78 passengers");
t9.boggy = boggy9;
t9.getTrainDetails();

System.out.println();
Train t10 = new Train(12785, "Kacheguda Express", "Bengaluru", "Hyderabad", "08:50PM", "07:30AM", "610km", "19", "Express", 4, "Electric", "65km/h", "Daily", true, 4, 10, 5, "On time", "Online", "South Central Railway");
Boggy boggy10 = new Boggy(20, "Sleeper", 7, 72, 32, "Blue", 2018, "23 meter", 3.2, 40, "Manual", false, "Available", 4, true, "Installed", "Steel", "Good", "LED Lights", "72 passengers");
t10.boggy = boggy10;
t10.getTrainDetails();


System.out.println();
Train t11 = new Train(12423, "Dibrugarh Rajdhani", "New Delhi", "Dibrugarh", "04:10PM", "07:00AM", "2450km", "21", "Rajdhani", 6, "Electric", "85km/h", "Daily", true, 6, 10, 5, "On time", "Online", "Northeast Frontier Railway");
Boggy boggy11 = new Boggy(22, "AC 2 Tier", 4, 54, 20, "Silver", 2019, "22 meter", 3.1, 36, "Automatic", true, "Available", 2, true, "Installed", "Steel", "Good", "LED Lights", "54 passengers");
t11.boggy = boggy11;
t11.getTrainDetails();

System.out.println();
Train t12 = new Train(12245, "Duronto Express", "Howrah", "Mumbai", "08:00PM", "10:30AM", "1960km", "20", "Duronto", 5, "Electric", "90km/h", "Daily", true, 7, 8, 5, "On time", "Online", "Eastern Railway");
Boggy boggy12 = new Boggy(23, "AC 3 Tier", 6, 72, 24, "Blue", 2020, "23 meter", 3.2, 40, "Automatic", true, "Available", 4, true, "Installed", "Stainless Steel", "Excellent", "LED Lights", "72 passengers");
t12.boggy = boggy12;
t12.getTrainDetails();

System.out.println();
Train t13 = new Train(12555, "Gorakhdham Express", "Gorakhpur", "Delhi", "06:00PM", "07:30AM", "780km", "18", "Express", 3, "Electric", "65km/h", "Daily", false, 3, 10, 5, "On time", "Offline", "Northern Railway");
Boggy boggy13 = new Boggy(24, "Sleeper", 8, 72, 35, "Green", 2017, "23 meter", 3.1, 38, "Manual", false, "Available", 4, true, "Installed", "Steel", "Average", "Tube Lights", "72 passengers");
t13.boggy = boggy13;
t13.getTrainDetails();

System.out.println();
Train t14 = new Train(12621, "Tamil Nadu Express", "Chennai", "New Delhi", "10:00PM", "07:00AM", "2180km", "22", "Superfast", 4, "Electric", "80km/h", "Daily", true, 6, 12, 4, "On time", "Online", "Southern Railway");
Boggy boggy14 = new Boggy(25, "AC First Class", 2, 48, 16, "Silver", 2021, "22 meter", 3.0, 35, "Automatic", true, "Available", 2, true, "Installed", "Steel", "Excellent", "LED Lights", "48 passengers");
t14.boggy = boggy14;
t14.getTrainDetails();

System.out.println();
Train t15 = new Train(12723, "Telangana Express", "Hyderabad", "New Delhi", "06:30AM", "09:30AM", "1670km", "20", "Superfast", 5, "Electric", "75km/h", "Daily", true, 5, 10, 5, "On time", "Online", "South Central Railway");
Boggy boggy15 = new Boggy(26, "AC 3 Tier", 5, 72, 22, "Blue", 2019, "23 meter", 3.2, 39, "Automatic", true, "Available", 4, true, "Installed", "Steel", "Good", "LED Lights", "72 passengers");
t15.boggy = boggy15;
t15.getTrainDetails();

System.out.println();
Train t16 = new Train(12695, "Trivandrum Express", "Chennai", "Trivandrum", "07:45PM", "11:30AM", "900km", "18", "Express", 3, "Electric", "70km/h", "Daily", true, 4, 9, 5, "On time", "Online", "Southern Railway");
Boggy boggy16 = new Boggy(27, "Sleeper", 9, 72, 40, "Blue", 2018, "23 meter", 3.2, 40, "Manual", false, "Available", 4, true, "Installed", "Steel", "Good", "Tube Lights", "72 passengers");
t16.boggy = boggy16;
t16.getTrainDetails();

System.out.println();
Train t17 = new Train(12864, "Howrah Express", "Bengaluru", "Howrah", "11:30PM", "09:00AM", "1960km", "21", "Superfast", 4, "Electric", "75km/h", "Daily", true, 5, 12, 4, "On time", "Online", "South Eastern Railway");
Boggy boggy17 = new Boggy(28, "AC 2 Tier", 6, 54, 18, "Silver", 2020, "22 meter", 3.1, 36, "Automatic", true, "Available", 2, true, "Installed", "Steel", "Excellent", "LED Lights", "54 passengers");
t17.boggy = boggy17;
t17.getTrainDetails();

System.out.println();
Train t18 = new Train(20901, "Vande Bharat Express", "Mumbai", "Ahmedabad", "06:00AM", "12:30PM", "520km", "12", "Semi High Speed", 1, "Electric", "110km/h", "Except Monday", true, 8, 2, 2, "On time", "Online", "Western Railway");
Boggy boggy18 = new Boggy(29, "Executive Chair", 1, 52, 10, "White", 2022, "21 meter", 3.0, 34, "Automatic", true, "Available", 2, true, "Installed", "Aluminium", "Excellent", "LED Lights", "52 passengers");
t18.boggy = boggy18;
t18.getTrainDetails();

System.out.println();
Train t19 = new Train(17229, "Sabari Express", "Hyderabad", "Thiruvananthapuram", "01:00PM", "06:00AM", "1550km", "19", "Express", 3, "Electric", "65km/h", "Daily", false, 3, 10, 6, "On time", "Offline", "South Central Railway");
Boggy boggy19 = new Boggy(30, "General", 11, 95, 50, "Green", 2016, "22 meter", 3.0, 38, "Manual", false, "Not Available", 4, true, "Installed", "Steel", "Average", "Tube Lights", "95 passengers");
t19.boggy = boggy19;
t19.getTrainDetails();

System.out.println();
Train t20 = new Train(16592, "Mysuru Express", "Hubli", "Mysuru", "08:00PM", "07:30AM", "530km", "17", "Express", 2, "Diesel", "60km/h", "Daily", false, 2, 9, 6, "On time", "Offline", "South Western Railway");
Boggy boggy20 = new Boggy(31, "Sleeper", 7, 72, 33, "Blue", 2017, "23 meter", 3.2, 40, "Manual", false, "Available", 4, true, "Installed", "Steel", "Good", "Tube Lights", "72 passengers");
t20.boggy = boggy20;
t20.getTrainDetails();

	  
	  }
	}