package yiqixue.yiqixue.houtai.htModel;

public class User {
    int uid;
    String username;
    String email;
    int phone;
    String password;
    float money;

    public User(int uid, String username, String email, int phone, String password, float money) {
        this.uid = uid;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.money = money;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
