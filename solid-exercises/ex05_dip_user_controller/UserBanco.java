
class UserBanco implements UserRepository{
    
    @Override
    public void sendSalvando(User user) {
        System.out.println("Salvando usuario " + user.getEmail() + " no BD!!");
    }
}