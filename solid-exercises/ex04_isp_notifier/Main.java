public class Main {

    public static void main(String[] args) {
        EmailSender emailSender = new EmailNotifier();
        PushSender pushSender = new PushNotifier();
        SmsSender smsSender = new SmsNotifier();

        emailSender.sendEmail("vitorlo.gmail", "Ola Jesus", "obrigado por mais um dia!");
        pushSender.sendPush("vitinhoorei", "Melhor do mundo");
        smsSender.sendSms("47 9 0800-7070", "Paga sua conta de internet!!");
    }
}