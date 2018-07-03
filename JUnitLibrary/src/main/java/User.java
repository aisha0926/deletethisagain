public class User extends UserHandler {
    String name, address;
    int id ,age;

    public User(){
        this.id = 0;
        this.name = "Aisha";
        this.address = "London";
        this.age = 21;

    }

    public User(int id, String name, int age, String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void addUser(User user){
        UserHandler.registerUser(user);
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }


}
