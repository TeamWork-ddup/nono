package java.com.etc.service;

import com.etc.dao.UserDao;





public class UserService {





    private UserDao userDao;


    public UserService(){

    }
    public UserService(UserDao userDao){
        System.out.println("userService constructor userDao");
        this.userDao = userDao;
    }

    public void add(){
        System.out.println( "user service add" );
        userDao.add();
    }
    public void setUserDao(UserDao userDao){

        this.userDao = userDao;
    }


}
