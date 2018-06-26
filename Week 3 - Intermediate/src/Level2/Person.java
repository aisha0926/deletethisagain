package Level2;

public class Person {
    String name;
    int age;
    String jobTitle;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public Person(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }


}
