package domain.scout;

public class ContactInfo {
    private String email;
    private long phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        return email.equals(((ContactInfo) o).getEmail()) && this.phoneNumber == ((ContactInfo) o).getPhoneNumber();
    }

    @Override
    public String toString() {
        return this.email + ", " + this.phoneNumber;
    }
}
