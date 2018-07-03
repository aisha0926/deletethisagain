import java.util.ArrayList;

/*
    Will contain the arraylist of users. Registering them.
 */

public class Library {
    ArrayList<User> usersArrayList = new ArrayList<User>();

    public boolean registerUser(User userArray){
        return usersArrayList.add(userArray);
    }

    public  boolean removeUser(User user){
        return usersArrayList.remove(user);
    }

    public ArrayList<User> getUsersArrayList() {
        return usersArrayList;
    }


}
