class Telegram {

    public static void createAccount(String email, String password) {
        System.out.println("Telegram signup with email: " + email + " password: " + password);
    }

    public static void createAccount(long mobileNumber, String password) {
        System.out.println("Telegram signup with mobile: " + mobileNumber + " password: " + password);
    }
}