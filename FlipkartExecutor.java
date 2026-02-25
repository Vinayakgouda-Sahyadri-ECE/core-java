class FlipkartExecutor {
    public static void main(String[] args) {

        String email = "dev123@gmail.com";
        String password = "Mahadev@123";
        long mobileNumber = 8310887363L;

        Flipkart.createAccount(email, password);
        Flipkart.createAccount(mobileNumber, password);
    }
}