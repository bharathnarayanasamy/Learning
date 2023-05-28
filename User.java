import java.util.*;
public class User{
    private static int counter=0;
    private int userId;
    private String name;
    private String password;
    private String mobileNumber;
    private String email;
    private String gender;

    User(){

    }
    User(String name,String password,String mobileNumber,String email,String gender){
        this.name=name;
        this.password=password;
        this.mobileNumber=mobileNumber;
        this.email=email;
        this.gender=gender;
        this.userId = generateId();
    }
    
    private static synchronized int generateId(){
        return counter++;
    }

    public static User registeration(Scanner sc){
        String name;
        String password;
        String mobileNumber;
        String email;
        String gender;
        System.out.println("You have choosen for Registeration!!");
        System.out.println("Enter your name : ");
        name=sc.next();
        System.out.println("Enter your password : ");
        password=sc.next();
        System.out.println("Enter your mobilenumber : ");
        mobileNumber=sc.next();
        System.out.println("Enter your email : ");
        email=sc.next();
        System.out.println("Enter your gender : ");
        gender=sc.next();
        return new User(name,password,mobileNumber,email,gender);

    }

    public String toString(){
        return "UserId : "+this.userId+"\nName : "+this.name+"\nMobileNumber : "+this.mobileNumber+"\nEmail : "+this.email+"\nGender : "+gender+"\n";
    }

    public void view(Queue<User> user){
        for(User u: user){
            System.out.println(u);
        }
    }

    public void view(User user){
        System.out.println(user);
    }
}
