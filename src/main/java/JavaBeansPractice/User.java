package JavaBeansPractice;

public class User {
    private String firstName;
    private String lastName;

    public User(){
        firstName = "John";
        lastName = "Doe";
    }

    // Constructor
    public User(String firstName, String lastName) {
        this.firstName = firstName;
    }

    // Getters & Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
    }
}
