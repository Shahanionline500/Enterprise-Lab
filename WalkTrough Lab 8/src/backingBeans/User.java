package backingBeans;

import db.DbConnection;

public class User {

    private String email;
    private String password;
    private String phoneNo;
    private String name;
    DbConnection obj = new DbConnection ();

    public User() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

public void db()
{
    obj.insertRecord (getName(),getEmail(),getPassword(),getPhoneNo());
}
    public User(String name, String email, String password, String phoneNo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;

    }


}