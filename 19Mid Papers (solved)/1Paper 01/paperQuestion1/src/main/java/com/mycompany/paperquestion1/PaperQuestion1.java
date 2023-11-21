/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paperquestion1;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;


/**
 *
 * @author saqibAle
 */
public class PaperQuestion1 {

    public static void main(String[] args) {
        //Create a file mid_term and throw error if already exist
        String fileName = "mid_term.txt";
        File file = new File(fileName);
        try{
            if(file.exists()){
                //here throw custom exception but ham ny ni kri so
                System.out.println("File already exist");
            }
            else{
                
                file.createNewFile();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        //Write the file
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
            //here get input from user using scanner class
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any String");
            String input = sc.nextLine();
            bw.write(input );
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
//        Read the file
        int totalLines = 0 , totalWords = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
                totalLines++;
                String[] array = line.split("\\S+");
                totalWords += array.length;
                
                
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(totalLines);
        System.out.println(totalWords);
        System.out.println(file.getTotalSpace());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        file.delete();
    }
}
