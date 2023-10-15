// code by saqib ali q3
class Main {
    public static void main(String[] args){
        int[] mainArray = {58, 24, 13, 15, 63, 9, 8, 81, 1, 78};

        // create 2 split arrays
        int[] splitArray1 = new int[5];
        int[] splitArray2 = new int[5];
        for(int i =0; i<  5; i++){
            splitArray1[i] = mainArray[i];
        }
        

        int j = 5; //j variable manage the index of mainArray
        for(int i =0; i<  5; i++){
            splitArray2[i] = mainArray[j];
            j++;
        }
        // Display
        System.out.println("\nMainArray: "  );
        for(int i = 0; i<10; i++){
            System.out.print(mainArray[i]+", ");
        }
        System.out.println("\n\nSplitArray01:  ");
        for(int i = 0; i<5; i++){
            System.out.print(splitArray1[i]+", ");
        }
        System.out.println("\n\nSplitArray01: ");
        for(int i = 0; i<5; i++){
            System.out.print(splitArray1[i]+", ");
        }
        System.out.println("");
    }
}
    
