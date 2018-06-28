package People;

public class People {
    String name;
    int age;
    String jobTitle;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public People(String name, int age, String jobTitle){
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString(){
        return ("Name: " + name + " Age :" + " " + "Jobtitle: " +jobTitle);
    }




}
