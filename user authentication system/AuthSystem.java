//Abstract class defining a general structure for all users
abstract class User{
    String username;
    String password;

    User(String username, String password){
        this.username = username;
        this.password = password;
    }

    abstract void login();
}

//Subclass for admin users
class Admin extends User{
    Admin(String username, String password){
        super(username, password);
    }

    void login(){
        System.out.println("Admin " + username + " logged in with extra security checks.");
    }
}


//Subclass for regular users
class RegularUser extends User{
    RegularUser(String username, String password){
        super(username, password);
    }

    void login(){
        System.out.println("User " + username + " logged in with standard authentication.");
    }
}


//Main application
public class AuthSystem {
    public static void main(String[] args){
        User admin = new Admin("FarazMirza", "admin123");
        User user = new RegularUser("JonathanJoestar", "user123");

        admin.login();
        user.login();

    }
    
}
