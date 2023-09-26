class Main {
    public static void main(String[] argu){
        //we print number in english 
        int integar = 3;
        String englishNumber;

        switch (integar){

                //case no 1
            case 1:
                englishNumber = "One";
                break;
                //case no 2
            case 2:
                englishNumber = "Two";
                break;
                //case no 3
            case 3:
                englishNumber = "Three";
                break;
                //case no 4
            case 4:
                englishNumber = "Four";
                break;
                //case no 5
            case 5:
                englishNumber = "Five";
                break;
                //case no 6
            case 6:
                englishNumber = "Six";
                break;
                //case no 7
            case 7:
                englishNumber = "Seaven";
                break;
                //case no 8
            case 8:
                englishNumber = "Eight";
                break;
                //case no 9
            case 9:
                englishNumber = "Nine";
                break;
                //default case
            default:
                englishNumber = "Invalid Number";
        }
        System.out.println(integar + " in English is: "+englishNumber);
    }
    
}
