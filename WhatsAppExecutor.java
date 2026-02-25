
class WhatsAppExecutor {
    public static void main(String[] args) {

        String email = "dev123@gmail.com";
        String password = "Mahadev@123";
        long mobileNumber = 8310887363L;

        WhatsApp.createAccount(email, password);
        WhatsApp.createAccount(mobileNumber, password);
    }
}