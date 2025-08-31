public class Person {

    private String name;
    private String occupation;

    public Person(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public String introduce() {
        return "Hello, my name is " + name;
    }

    public String describeJob() {
        return "I am currently working as a(n)" + occupation;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

    public void setoccupation(String o) {
        occupation = o;
    }
}
