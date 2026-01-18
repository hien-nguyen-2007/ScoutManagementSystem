package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Scout {
    private String firstName;
    private String lastName;
    private Date birthday;
    private Rank rank;
    private String patrol;
    private boolean totinChip = false;
    private boolean firemnChit = false;
    private String position = "Patrol member";
    private List<Rank> rankHistory = new ArrayList<>();
    private List<Parent> parents = new ArrayList<>();
    private int unit;
    private Date dateJoined;
    private String email;
    private long phoneNumber = 1111111111;

    public Scout(String firstName, String lastName, Date birthday, Rank rank, String patrol, int unit, Date dateJoined, String email, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.rank = rank;
        this.patrol = patrol;
        this.unit = unit;
        this.dateJoined = dateJoined;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public List<Rank> getRankHistory() {
        return rankHistory;
    }

    public void setRankHistory(List<Rank> rankHistory) {
        this.rankHistory = rankHistory;
    }

    public List<Parent> getParent() {
        return parents;
    }

    public void setParent(List<Parent> parent) {
        this.parents = parent;
    }

    public void addParent(Parent parent) {
        this.parents.add(parent);
    }

    public void removeParent(Parent parent) {
        this.parents.remove(parent);
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

    @Override
    public String toString() {
        return getName() + ", " + rank + ", " + patrol + ", " + unit;
    }

}