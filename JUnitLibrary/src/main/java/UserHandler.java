import java.util.ArrayList;

public abstract class UserHandler {
    static ArrayList<User> users = new ArrayList<User>();



    public static void registerUser(User user){
        UserHandler.users.add(user);
    }

    public static void deleteUser(User user){
        UserHandler.users.remove(user);
    }

    public static void updateUser(){
        for(User x: users){


        }
    }





}
