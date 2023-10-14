
public class Person {
    // Create data members 
    private int age;
    private String name;

    // create constucture
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    //create display method to display data of class Person 
    public void displayPerson(){
        System.out.println("Name: "+ name + "  Age: " +age);
    }
    
}
