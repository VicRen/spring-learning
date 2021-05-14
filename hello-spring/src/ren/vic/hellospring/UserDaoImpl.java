package ren.vic.hellospring;

public class UserDaoImpl implements UserDao {

    @Override
    public void login() {
        System.out.println("UserDao login");
    }
}
