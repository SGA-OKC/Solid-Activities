public class PushNotifier implements PushSender {
    
    @Override
    public void sendPush(String deviceToken, String msg) {
        System.out.println("Enviando push para " + deviceToken + ": " + msg);
    }
}