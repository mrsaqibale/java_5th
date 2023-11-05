/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classwork;

/**
 *
 * @author professor_ali
 */
import java.util.Scanner;
public class student {
    
    private String[] studentName;
    private int[] studentRollNo;
    private int[] studentCgpa;
    Scanner objSc ;
    int arraySize;
    //define the constructuor which get array size
    
    student(int Size){
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
    public void displayData(){
        System.out.println("Name\t\tAridNo\t\tCGPA");
        for(int i = 0 ; i< arraySize; i++){
            System.out.println(this.studentName[i]+"\t\t"+this.studentRollNo[i]+"\t\t"+this.studentCgpa[i]);
        }
    }
    
}
