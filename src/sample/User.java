package sample;

public class User {

    public String login;
    public String password;
    public String name;
    public String subname;

    public User(String login, String password, String name, String subname) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.subname = subname;
    }

    public User() { }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSubname() {
        return subname;
    }
}
