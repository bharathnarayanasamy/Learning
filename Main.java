import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Main extends User{
    public static void message() {
        System.out.println("\\nPlease enter an action: ");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Book Ticket");
        System.out.println("4. Exit");
        System.out.println("");
    }

    public static void main(String[] args) {
        //Declaring variable to store data get fron Users
        int test=2;
        User u1= new User();
        Queue<User> user = new LinkedList<>();
        Queue<Bus> bus = new LinkedList<>();
        //boolean run=true;
        while(test!=0){
            message();
            Scanner sc= new Scanner(System.in);
            switch(sc.nextInt()){
                case 1:
                    System.out.println("login");
                    break;
                case 2:
                    System.out.println("Register");
                    user.add(registeration(sc));
                    u1.view(user);
                    //run=!run;
                    test--;
                    break;
                case 3:
                    System.out.println("Book Ticket");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Input!!! given");

            }
            //run=!run;
        }
        // Bus bus1 = new Bus("B001", "Route A", 10, 3);
        // Bus bus2 = new Bus("B002", "Route B", 4, 5);
        // Seat[][] s1=bus1.getSeats();
        // for(Seat[] row:s1){
        //     for(Seat column:row){
        //         System.out.print(column.isAvailable());
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // user.add(new User("Bharath","abcde","9876544","abc@gmail.com","Male"));
        // user.add(new User("Banu","scvgd","9876","banu@gmail.com","female"));
        
        
        

    }
}