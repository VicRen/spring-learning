package ren.vic.hellospring;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login() {
        this.userDao.login();
        System.out.println("userService login");
    }
}
