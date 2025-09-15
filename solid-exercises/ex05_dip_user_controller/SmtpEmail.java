
class SmtpEmail implements EmailService{
   
   @Override
   public void sendBemVindo(String email) {
     System.out.println("Enviando seja bem vindo para: " + email);
   }
}