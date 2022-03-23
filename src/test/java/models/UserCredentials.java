package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserCredentials {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserCredentials(String login, String password) {
        this.login = login;
        this.password=password;
    }

    public static UserCredentials getGenericUser(){
        return new UserCredentials("tony","123ss");
    }
    public static UserCredentials getUser(){
        return new UserCredentials("tina", "243asddf");
    }
    public static UserCredentials getRandomUser(){
        var login=
                String.format("test_%@domena.com", new SimpleDateFormat("yyyyMMdd_HHmmssSS")
                        .format(new Date()));
        return new UserCredentials(login, "asaasdd");
    }
    public static String getCurrentTimeStamp(){return new SimpleDateFormat("yyyyMMdd_HHmmssSS")
            .format(new Date());}
}
