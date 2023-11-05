/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classwork;

/**
 *
 * @author saqibAle
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner objSc = new Scanner(System.in);
        int arraySize;
        System.out.println("Enter the Array Size");
        arraySize = objSc.nextInt();
        
        student obj1 = new student(arraySize);
        obj1.getStudentData();
        obj1.displayData();
    }
}
