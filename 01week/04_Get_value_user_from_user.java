import javax.swing.JOptionPane;

class Main {
    public static void main(String[] argu){
        //define 2 variables 
        String userName;
        int userAge;

        //get value from user 
        userName = JOptionPane.showInputDialog("Enter your name: ");
        //convert value in integer using interger.parseInt() method
        userAge =Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));

        // print name and age of the user in dialog box 
        JOptionPane.showMessageDialog(null,"UserName is: "+userName + "  and age: " + userAge);

        //print name and age in terminal black sxreen
        System.out.println("UserName is: "+userName + "  and age: " + userAge);
    }
    
}
