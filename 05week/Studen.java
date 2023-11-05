package com.mycompany.classwork;

/**
 *
 * @author Saqib Ale
 */
import java.util.Scanner;
public class Studen {
    private String[] studentName;
    private int[] studentRollNo;
    private int[] studentCgpa;
    Scanner objSc ;
    int arraySize;
    //define the constructuor which get array size
    Studen(int Size){
        this.arraySize = Size;
        studentName = new String[arraySize];
        studentRollNo = new int[arraySize];
        studentCgpa = new int[arraySize];
        objSc = new Scanner(System.in);
    }
    
    
    
    public void getStudentData(){
        for(int i = 0 ; i < arraySize ; i ++ ){
            System.out.print("Enter the Student Name:   ");
            studentName[i] = objSc.nextLine();
        }
        for(int i = 0 ; i < arraySize ; i ++ ){
            System.out.print("Enter the Roll No of " + studentName[i]+" : " );
            studentRollNo[i] = objSc.nextInt();
            System.out.print("Enter the  Cgpa   of " + studentName[i]+" : " );
            studentCgpa[i] = objSc.nextInt();

        }
        
    }
    
    
    
}
