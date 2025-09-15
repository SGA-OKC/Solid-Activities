public class SmsNotifier implements SmsSender {

    @Override
    public void sendSms(String phone, String text) {
        System.out.println("Enviando sms para " + phone + ": " + text);
    }
}