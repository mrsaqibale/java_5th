// code by saqib ale
public class Faculty {
    // Create data members 
    private int Designation;
    private String name;

    // create constucture
    Faculty(int Designation, String name){
        this.Designation = Designation;
        this.name = name;
    }
    //create display method to display data of class Person 
    public void displayPerson(){
        System.out.println("Name: "+ name + "  Designation: " +Designation);
    }
    
}