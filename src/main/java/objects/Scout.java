package objects;

import java.util.ArrayList;
import java.util.Date;

public class Scout {
    private String name;
    private String firstName;
    private String lastName;
    private int age;
    private Date birthday;
    private Rank rank;
    private String patrol;
    private boolean totinChip = false;
    private boolean firemnChit = false;
    private String position = "Patrol member";
    private ArrayList<Rank> rankHistory = new ArrayList<>();
    private ArrayList<Parent> parent = new ArrayList<>();
    private int unit;
    private Date dateJoined;
    private String email;
    private int phoneNumber = 1111111111;

    public Scout(String name, String firstName, String lastName, int age, Date birthday, Rank rank, String patrol, boolean totinChip, boolean firemnChit, String position, ArrayList<Rank> rankHistory, ArrayList<Parent> parent, int unit, Date dateJoined, String email, int phoneNumber) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.rank = rank;
        this.patrol = patrol;
        this.totinChip = totinChip;
        this.firemnChit = firemnChit;
        this.position = position;
        this.rankHistory = rankHistory;
        this.parent = parent;
        this.unit = unit;
        this.dateJoined = dateJoined;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getPatrol() {
        return patrol;
    }

    public void setPatrol(String patrol) {
        this.patrol = patrol;
    }

    public boolean isTotinChip() {
        return totinChip;
    }

    public void setTotinChip() {
        this.totinChip = true;
    }

    public boolean isFiremnChit() {
        return firemnChit;
    }

    public void setFiremnChit() {
        this.firemnChit = true;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<Rank> getRankHistory() {
        return rankHistory;
    }

    public void setRankHistory(ArrayList<Rank> rankHistory) {
        this.rankHistory = rankHistory;
    }

    public ArrayList<Parent> getParent() {
        return parent;
    }

    public void setParent(ArrayList<Parent> parent) {
        this.parent = parent;
    }

    public void addParent(Parent parent) {
        this.parent.add(parent);
    }

    public void removeParent(Parent parent) {
        this.parent.remove(parent);
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

}