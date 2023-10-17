// code by saqib ale

public class Employee {
    public static void main(String[] args){
        String[] employeName = new String[3];
        employeName[0] = "Saif";
        employeName[1] = "Abdull";
        employeName[2] = "Farooq";
        
        String[] employeeAdress = new String[3];
        employeeAdress[0] = "Islamabad";
        employeeAdress[1] = "Lahore";
        employeeAdress[2] = "Karachi";

        int[] joiningYear = new int[3];
        joiningYear[0] = 2012;
        joiningYear[1] = 2021;
        joiningYear[2] = 2021;

        System.out.println("Name\t\tJoining Year\tAdress");
        for(int i = 0 ; i<3; i++){
            System.out.print(employeName[i] +"\t\t"+ joiningYear[i] + "\t\t"+ employeeAdress[i]+"\n");
        }

    }
    
    
}
