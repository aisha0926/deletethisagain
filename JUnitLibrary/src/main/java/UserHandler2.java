import java.util.ArrayList;

public class UserHandler2 {
     ArrayList<User> users = new ArrayList<User>();




    public  void registerUser(User user){
        this.users.add(user);
    }

    public  void deleteUser(User user){
       this.users.remove(user);
    }

    public  void updateUser(){
        for(User x: users){


        }
    }

}
