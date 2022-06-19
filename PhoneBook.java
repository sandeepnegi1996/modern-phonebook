import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

    public static List<User> listOfUsers=new ArrayList<>();

    public static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        //user input 
        // 1 --> enter details 
        // 2 --> show all details
        // 3 --> find details  
        // 4 --> exit 
        

        //this loop will always run 
        //isExit --> true loop run , isExit false, loop exit 
        boolean isExit=true;

        do {

            System.out.println("-------------------------------------");
            System.out.println("1. Add new user ");
            System.out.println("2. show all user details");
            System.out.println("3. find user details ");
            System.out.println("4. Exit application ");

            System.out.println("-------------------------------------");

            System.out.println();

            System.out.println("Please select one option ");
            int userInput = scan.nextInt();

            switch (userInput) {
                case 1:
                    //add new user details
                    addNewUser();
                    break;
                case 2:
                    displayAllUserDetails();
                    System.out.println();
                    break;
                case 3:
                    //lets first find user details using name
                    findUserDetails();
                    break;
                default:
                    System.out.println("Exit ....");
                    isExit=false;
            }
        }while(isExit); 

    }

    public static void addNewUser() {
        //this function add new user 
        
        String name;
        int phoneNumber;
        name=scan.next();
        phoneNumber=scan.nextInt();

        User u=new User(name, phoneNumber);

        listOfUsers.add(u);


    }

    public static void displayAllUserDetails() {

            for(User u:listOfUsers) {
                System.out.println(u);
            }
    }

    public static void findUserDetails() {

        System.out.println(" Enter username to find the user : ");
        String username=scan.next();

        boolean isUserPresent = false;
        for (User user : listOfUsers) {
            if (user.getName().equals(username)) {

               isUserPresent=true;
            }
            
        }

        if (isUserPresent) {

            System.out.println("User is present in database ");
        }
        else {
            System.out.println("User is not present in the database ");
        }







    }

    
}

class User {
    private String name;
    private int phoneNumber;


    User(String name,int phoneNumber) {
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {

        this.name=name;

    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    @Override
    public String toString() {

        return "Username is : " + this.name + "  PhoneNumber : " +this.phoneNumber;
    }


    






    
}