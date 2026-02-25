class PhonePeExecutor {
    public static void main(String[] args) {

        String email = "dev123@gmail.com";
        String password = "Mahadev@123";
        long mobileNumber = 8310887363L;

        PhonePe.createAccount(email, password);
        PhonePe.createAccount(mobileNumber, password);
    }
}