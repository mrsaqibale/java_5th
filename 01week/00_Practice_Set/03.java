import javax.swing.JOptionPane;

class Main{
    public static void main(String[] args){
        //define variables 
        int number;
        int endTable;

        //Get input from user
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
        endTable = Integer.parseInt(JOptionPane.showInputDialog("Enter Ending Value:"));

        //Print Table
        for(int i =1; i <= endTable; i++){
            // This print table 1 by 1 
            // JOptionPane.showMessageDialog(null, number + "  X  " + i + "  =  "+ number * i );
            // this code print table in console in 1 time
            System.out.println(number + "  X  " + i + "  =  "+ number * i );
        }
    }
}