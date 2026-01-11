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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEagleRequired() {
        return eagleRequired;
    }

    public void setEagleRequired(boolean eagleRequired) {
        this.eagleRequired = eagleRequired;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.description;
    }
}
