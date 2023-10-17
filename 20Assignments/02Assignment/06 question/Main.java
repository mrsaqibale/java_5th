// code by saqib ale
// In Java, Scanner is a class in java.util package used for obtaining the input of the primitive types like int, double, etc. and strings. Using the Scanner class in Java is the easiest way to read input in a Java program, though not very efficient if you want an input method for scenarios where time is a constraint like in competitive programming.
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        // create object of scanner Class
        Scanner sc = new Scanner(System.in);

        // create string array
        String[] studentArray = new String[10];
        
        // get the 10 student names form the user 
        System.out.println("Enter the name of 10 students");
        for(int i= 0; i < 10 ; i++){
            studentArray[i] = sc.nextLine();
        }
        //display names 
        System.out.println("\nThe output results \n\n");
        for(int i= 0; i < 10 ; i++){
            // use contains() method which return tru or false value
            if(studentArray[i].contains("Rehman")){
                System.out.println(studentArray[i]);
            }
        }
        

    }
    
}
