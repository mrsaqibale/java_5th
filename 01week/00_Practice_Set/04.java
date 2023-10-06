//code by Saqib Ale
import javax.swing.JOptionPane;
class Main{
	public static void main(String[] args){
		int firstValue = 0 , secondValue = 1, maxValue, temp ;
		maxValue = Integer.parseInt(JOptionPane.showInputDialog("Enter Maximum Value"));

		//print the first and second value
		System.out.print("Series"+firstValue+", "+secondValue);
		while(secondValue < maxValue ){
			temp = secondValue;
			secondValue = firstValue + secondValue;
			firstValue = temp;
            if(secondValue > maxValue){
                break;
            }
			System.out.print(", " + secondValue );
		}
		System.out.println("\nEnd:");
	}
}