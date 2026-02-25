class FacebookExecutor {
    public static void main(String[] args) {

        String email = "dev123@gmail.com";
        String password = "Mahadev@123";
        long mobileNumber = 8310887363L;

        Facebook.createAccount(email, password);
        Facebook.createAccount(mobileNumber, password);
    }
}