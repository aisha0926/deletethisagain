import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JavaTest {

    @Test
    public void registerUser(){
//        Library registerUser = new Library();
//        User user1 = new User(1,"Name", 23, "Address");
//        User user2 = new User(2,"Aisha", 20, "Address2");
//        registerUser.registerUser(user1);
//        registerUser.registerUser(user2);
//
//        assertEquals(2, registerUser.getUsersArrayList().size());

        User user = new User();
        User user1 = new User(1, "A", 23, "as");
       // user.addUser(user);
        UserHandler.registerUser(user1);

        assertEquals(1, UserHandler.users.size());
    }

    @Test
    public void deleteUser(){
//        Library registerUser = new Library();

//        User user1 = new User(1,"Name", 23, "Address");

//        User user2 = new User(1,"Aisha", 20, "Address2");

//        registerUser.registerUser(user1);

//        registerUser.registerUser(user2);

//        registerUser.removeUser(user2);

        User user = new User();
          User user1 = new User(1, "A", 23, "as");
          user.addUser(user);
          UserHandler.registerUser(user1);
          UserHandler.deleteUser(user);

        assertEquals(1, UserHandler.users.size());

    }


}
