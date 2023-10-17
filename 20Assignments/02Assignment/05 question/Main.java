// Code by saqib ale

public class Main {
    public static void main(String[] args){
        int[] array = {4,10,6,3,2};
        int maxValue = 0, secondMaxvalue =0;
        int temp, RequiredNumber =0;
        boolean flag ;

        // find the max value of array so i set size 5
        // count second maximum value
        for(int i = 0; i< 5; i++){
            flag = true;
            if(array[i] > maxValue){
                secondMaxvalue = maxValue;
                maxValue = array[i];
                flag = false;
            }
            if(array[i] > secondMaxvalue && flag){
                secondMaxvalue = array[i];
            }
        }
        temp = maxValue;

        // this loop count the difference 
        while(maxValue > secondMaxvalue){
            RequiredNumber++;
            maxValue--;
        }
        maxValue = temp;

        // this loop print the output 
        System.out.print("OuptPUt Array: ");
        for(int i =0; i<5; i++){
            if(array[i] == maxValue){
                System.out.print( secondMaxvalue+ ", "+ RequiredNumber +", ");
            }
            else{
                System.out.print(array[i]+", ");
            }
        }
        System.out.println("\n\n");

    }
    
}
