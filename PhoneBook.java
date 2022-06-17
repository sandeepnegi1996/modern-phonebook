import java.util.Scanner;

import javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler;

public class PhoneBook {
    
    public static void main(String[] args) {

        //user input 
        // 1 --> enter details 
        // 2 --> show all details
        // 3 --> find details  
        // 4 --> exit 
        

        Scanner scan=new Scanner(System.in);

        
   

        
        

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

            if (userInput==1) {
                
            }
            else if(userInput==2) {

            }
            else if(userInput==3) {

            }
            else {

                System.out.println("Exit ....");
                isExit=false;
            }

        }while(isExit); 

    }

    public static void addNewUser() {
        //this function add new user 


    }

    public static void displayAllUserDetails() {

    }

    public static void findUserDetails() {

    }

    
}

class User {
    private String name;
    private int phoneNumber;


    User(String name,int phoneNumber) {
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    
}