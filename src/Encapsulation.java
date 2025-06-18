public class Encapsulation {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setUserName("Akshay");
        user1.setPassword("1234");

        System.out.println(user1.getUserName());
        System.out.println(user1.getPassword());
    }
}
class User {
    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
}
