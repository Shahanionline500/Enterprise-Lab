package managedBeans;


import backingBeans.User;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserInfoBean {
    public UserInfoBean() {
    }
    User user = new User ();

    public void setUser(User user) {
        this.user = user;
    }
    public User getUser() {
        return user;
    }
    public void getUserData(){
        String name = user.getName();
        String email = user.getEmail();
        String password = user.getPassword();
        String phoneNo = user.getPhoneNo();

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Phone Number: " + phoneNo);
    }
    public void setUserData(){

        user.setName("Abdullah Khan Shahani");
        user.setEmail("Shahani500@gmail.com");
        user.setPassword("abcd");
        user.setPhoneNo("03334255510");

        user.db ();
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Phone Number: " + user.getPhoneNo());
    }}