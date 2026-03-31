package User;

public class User {
    private String name;
    private int year;

    public User(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " - " + year + " anos";
    }

}
