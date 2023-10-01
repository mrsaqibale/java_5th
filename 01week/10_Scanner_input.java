//code by saqib ale
// i define scanner input for every variable
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        // create object of Scanner Class to get input in console
        Scanner input = new Scanner(System.in);
        
        // define variables to get input from user
        short userId;
        long userPhoneNo;
        int userAge;
        String userName;
        

        //Get input
        System.out.println("Enter User Id: ");
        // we use nextShort() method to get data from user in short datatype
        userId = input.nextShort();

        System.out.println("Enter User Name: ");
        // we use nextLine() method to get data from user in String datatype
        userName = input.nextLine();

        System.out.println("Enter User Age ");
        // we use nextInt() method to get data from user in Int datatype
        userAge = input.nextInt();
        


    }
}