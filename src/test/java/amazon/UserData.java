package amazon;

public class UserData {

    private String email = "tomasz102pl@wp.pl";
    private String password= "Callofduty122432";
    private String searchData="Star Wars";

    public String getSearchData() {return searchData;}

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserData(String email, String password){
        this.password=password;
        this.email=email;
    }


    public UserData (String searchData) {
        this.searchData = searchData;
    }

    public static UserData getData(){
        return new UserData("Star Wars");
    }

    public static UserData getUser(){
        return new UserData("tomasz102pl@wp.pl","Callofduty122432");
    }


}
