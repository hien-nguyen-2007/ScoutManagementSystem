package objects;

import java.util.ArrayList;

public class Camp {
    private String name;
    private int nights;
    private ArrayList<Scout> scouts = new ArrayList<>();

    public Camp(String name, int nights) {
        this.name = name;
        this.nights = nights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public ArrayList<Scout> getScouts() {
        return scouts;
    }

    public void setScouts(ArrayList<Scout> scouts) {
        this.scouts = scouts;
    }

    public void addScouts(Scout scout) {
        this.scouts.add(scout);
    }

    @Override
    public String toString() {
        return this.name + ": " + nights + " nights"
    }
}
