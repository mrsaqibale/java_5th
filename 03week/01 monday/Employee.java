import java.util.Scanner;
public class Employee {
    //define all variables 
    int arraySize;
    String[] empName;
    int[] empId;
    int[] empPay;
    Scanner sc = new Scanner(System.in);
    public Employee(){
        
    }
    public Employee(int Size){
        arraySize = Size;
        empName = new String[Size];
        empId = new int[Size];
        empPay = new int[Size];
    }
    //this method read the data of employee
    void readEmpData(){
        int j = 0;
        System.out.println("__________Employee Data Input__________");
        for(int i =0; i < arraySize; i++){
            j = i;
            System.out.println("Enter the Employe name  "+ j++ + " : ");
            empName[i] = sc.nextLine();
        }
        for(int i =0; i < arraySize; i++){
            System.out.println("Enter the id of " + empName[i]+" : ");
            empId[i] = sc.nextInt();
            System.out.println("Enter the pay of " + empName[i]+" : ");
            empPay[i] = sc.nextInt();
        }
    }
    void displayEmpData(){
        int j =0;
        for(int i = 0 ; i < arraySize ; i++){
            j = i;
            System.out.println("__________Display Employee Data__________");
            // System.out.println("Index\tId\tName\tPay");
            System.out.println(j+++"\t"+empId[i]+"\t"+empName[i]+"\t"+empPay[i]);
   
        }
    }
    
}
