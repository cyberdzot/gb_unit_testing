package hw03;

public class User {
    String name;
    String password;

    boolean isAuthenticate = false;
    boolean isAdmin = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)){
            this.isAuthenticate = true;
        }
        return this.isAuthenticate;
    }
}