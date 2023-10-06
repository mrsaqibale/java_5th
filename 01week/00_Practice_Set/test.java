
import java.util.Scanner;
//private -  scope is defined as it is accessible within same class
//protected  scope is defined as it is accessible within class and child
//public - scope is defined as it is accessible everywhere
public class EmployeeDetails {
    
    String[] empNames;
    Double[] empSalary;
    Scanner objInput;
    int arraySize;
    
    public EmployeeDetails(int aSize)
    {
    objInput = new Scanner(System.in);
    arraySize = aSize;
    empNames = new String[aSize];
    empSalary = new Double[aSize];
    }
    public void readData()
    {
    System.out.println("* UAAR HR Syststem Data Entry *");
        for (int i = 0; i < arraySize; i++) 
        {
        System.out.println("Enter Details at " + i);        
        System.out.println("Enter Employee Name");        
        empNames[i] = objInput.nextLine();
        
        
    }
         for (int i = 0; i < arraySize; i++) 
        {
        System.out.println("Enter Details at " + i);        
        System.out.println("Enter Salary of" + empNames[i]);        
        empSalary[i] = objInput.nextDouble();
        
    }
            
    }
    
    public void showDetails()
    {
        System.out.println("* UAAR HR Syststem Employee Details *");
            System.out.println("S#\tEmp Name\tEmp Salary");
               System.out.println("------------------------------------");
            int sNo = 1;
            Double grandTotal=0.0;
         for (int i = 0; i < arraySize; i++) 
        {
        System.out.println(sNo + "\t" + empNames[i] + "\t\t" + empSalary[i]);        
        sNo++;
        grandTotal = grandTotal + empSalary[i];
        
    }
         System.out.println("-------------------GRand Total" +  grandTotal);
    
         System.out.println("* End of List *");
    }
}