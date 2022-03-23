package curaTest;

public class UserData {
    private String name ="John Doe";
    private String password="ThisIsNotAPassword";

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public UserData(String name, String password){
        this.password=password;
        this.name=name;
    }


}
