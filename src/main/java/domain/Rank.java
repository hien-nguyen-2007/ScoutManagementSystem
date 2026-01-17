package domain;

import java.util.Date;

public class Rank {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    public Rank(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return name;
    }
}