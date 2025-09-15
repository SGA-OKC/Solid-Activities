class UserController {
    
    private final UserRepository reposi;
    private final EmailService emailSe;

    public UserController(UserRepository reposi, EmailService emailSe) {
        this.reposi = reposi;
        this.emailSe = emailSe;
    }

    public void registrar(User user){
        reposi.sendSalvando(user);
        emailSe.sendBemVindo(user.getEmail());
    }
}