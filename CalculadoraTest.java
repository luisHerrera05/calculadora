/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;




public class CalculadoraTest {
        

 public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
      
        calc.setDigito("24");
        
        
        calc.suma("4");
         calc.resta("6");
          calc.multiplicacion("4");
           calc.division("8");
        
      
        System.out.print(calc);
    }

}