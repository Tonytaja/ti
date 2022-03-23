package models;

public class NewUserData {
    private String email;
    private String passwd;
    private Integer dbDay;
    private String dbMonth;
    private String dbYear;
    private String name;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postCode;
    private String country;
    private String homeNo;
    private String mobileNo;
    private String addressAlias;

    public String getEmail() {
        return email;
    }

    public String getPasswd() {
        return passwd;
    }

    public Integer getDbDay() {
        return dbDay;
    }

    public String getDbMonth() {
        return dbMonth;
    }

    public String getDbYear() {
        return dbYear;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getAddressAlias() {
        return addressAlias;
    }

    private NewUserData(){

    }


    public static class NewUserDataBuilder{
        private String email = "dsadad@ss.ss";
        private String passwd= "12323SA22AA!!";
        private Integer dbDay= 10;
        private String dbMonth="2";
        private String dbYear="1999";
        private String name="Tom";
        private String lastName="Stark";
        private String company = "Acc";
        private String address1="Pikna";
        private String address2="12";
        private String city="Radom";
        private String state="Usa";
        private String postCode="39-666";
        private String country="Mexicp";
        private String homeNo="2222";
        private String mobileNo="69696969";
        private String addressAlias="sadsa@sss";

        public NewUserDataBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public NewUserDataBuilder setPasswd(String passwd) {
            this.passwd = passwd;
            return this;
        }

        public NewUserDataBuilder setDbDay(Integer dbDay) {
            this.dbDay = dbDay;
            return this;
        }

        public NewUserDataBuilder setDbMonth(String dbMonth) {
            this.dbMonth = dbMonth;
            return this;
        }

        public NewUserDataBuilder setDbYear(String dbYear) {
            this.dbYear = dbYear;
            return this;
        }

        public NewUserDataBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public NewUserDataBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public NewUserDataBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public NewUserDataBuilder setAddress1(String address1) {
            this.address1 = address1;
            return this;
        }

        public NewUserDataBuilder setAddress2(String address2) {
            this.address2 = address2;
            return this;
        }

        public NewUserDataBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public NewUserDataBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public NewUserDataBuilder setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public NewUserDataBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public NewUserDataBuilder setHomeNo(String homeNo) {
            this.homeNo = homeNo;
            return this;
        }

        public NewUserDataBuilder setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
            return this;
        }

        public NewUserDataBuilder setAddressAlias(String addressAlias) {
            this.addressAlias = addressAlias;
            return this;
        }
        public NewUserData build(){
            NewUserData newUserData= new NewUserData();
            newUserData.email= this.email;
            newUserData.passwd=this.passwd;
            newUserData.dbDay=this.dbDay;
            newUserData.dbMonth=this.dbMonth;
            newUserData.dbYear=this.dbYear;
            newUserData.name=this.name;
            newUserData.lastName=this.lastName;
            newUserData.company=this.company;
            newUserData.address1=this.address1;
            newUserData.address2=this.address2;
            newUserData.city=this.city;
            newUserData.state=this.state;
            newUserData.postCode=this.postCode;
            newUserData.country=this.country;
            newUserData.homeNo=this.homeNo;
            newUserData.mobileNo=this.mobileNo;
            newUserData.addressAlias=this.addressAlias;
            return newUserData;
        }
    }
    public static NewUserDataBuilder getGenericUser(){
        return new NewUserDataBuilder()
                .setName("FirstName")
                .setLastName("LastName")
                .setAddress1("Tes1")
                .setAddress2("address2")
                .setAddressAlias("sasd2ss@s");
    }
    public static NewUserDataBuilder getMinimalUser(){
        return new NewUserData.NewUserDataBuilder()
                .setName("FirstName")
                .setLastName("LastName")
                .setPasswd("sad@11");
    }
}
