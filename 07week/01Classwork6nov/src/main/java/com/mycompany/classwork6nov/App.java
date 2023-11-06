/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classwork6nov;

/**
 *
 * @author saqibAle
 */
public class App {

    public static void main(String[] args) {
        extendsFromSuper obj1 = new extendsFromSuper();
        obj1.methodOne();
        
        extendFromInterface obj2 = new extendFromInterface();
        obj2.methodFour();
        obj2.methodThree();
        
        extendFromSuperAndInterface obj3 = new extendFromSuperAndInterface();
        obj3.methodOne();
        obj3.methodThree();
        obj3.methodFour();
        obj3.methodTwo();
    }
}
