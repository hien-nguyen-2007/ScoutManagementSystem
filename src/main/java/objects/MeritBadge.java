package objects;

public class MeritBadge {
    private String name;
    private String description;
    private boolean eagleRequired = false;

    public MeritBadge(String name, String description, boolean eagleRequired) {
        this.name = name;
        this.description = description;
        this.eagleRequired = eagleRequired;
    }
}
