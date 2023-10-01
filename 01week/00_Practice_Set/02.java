// code by Saqib Ale
// 02: Sum of 2 int type numbers using Dialog (joptions lib)

import javax.swing.JOptionPane;
class Main{
    public static void main(String[] args){
        // Define variables
        int numb1 ;
        int numb2 ;
        int Sum;

        //Get input
        numb1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first Value: "));
        numb2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));

        //Calculate sum 
        Sum = numb1 + numb2;

        //display sum 
        JOptionPane.showMessageDialog(null , "Sum = "+ Sum);

        
    }
}