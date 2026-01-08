package Objects;

import java.util.ArrayList;

public class Parent {
    private String name;
    private String firstName;
    private String lastName;
    private ArrayList<Scout> scouts = new ArrayList<>();
    private String email;
    private int phoneNumber = 1111111111;

    public Parent(String name, String firstName, String lastName, ArrayList<Scout> scouts, String email, int phoneNumber) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.scouts = scouts;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public Parent(String name, String firstName, String lastName, String email, int phoneNumber) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
        this.lastName = lastName;
    }

    public ArrayList<Scout> getScouts() {
        return scouts;
    }

    public void setScouts(ArrayList<Scout> scouts) {
        this.scouts = scouts;
    }

    public void addScout(Scout scout) {
        this.scouts.add(scout);
    }

    public void removeScout(Scout scout) {
        this.scouts.remove(scout);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
