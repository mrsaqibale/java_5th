// 01: Get input from user and calculate sum using Console Scanner lib

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int numb1;
        int numb2;
        int Sum;

        //define Scanner object 
        Scanner inputObject = new Scanner(System.in);

        // get input
        System.out.println("Enter first Value: ");
        numb1 = inputObject.nextInt();
        System.out.println("Enter Second Value: ");
        numb2 = inputObject.nextInt();

        //calculate sum 
        Sum = numb1 + numb2;

        //Display Sum
        System.out.println("Sum = "+Sum);
    }
}