public class Main {

    public static void main(String[] args) {
        UserRepository repository = new UserBanco();
        EmailService email = new SmtpEmail();

        UserController controller = new UserController(repository, email);

        User user = new User("vitorlo@gmail.com");
        controller.registrar(user);

    }
}