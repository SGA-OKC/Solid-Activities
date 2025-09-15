

public class EmailNotifier implements EmailSender {

    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Enviando email para " + to + "  Subject: " + subject);
    }
}