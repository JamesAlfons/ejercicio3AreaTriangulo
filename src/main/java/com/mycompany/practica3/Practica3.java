/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

import java.util.Scanner;

/**
 *
 * @author Santiago Developer
 */
public class Practica3 {

    public static void main(String[] args) {
        
        float base;
        float altura;
        float area;
        String nombre;
      
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println(" Bienvenid@.Ingrese su nombre ");
        nombre = leer.next();
        
         //Calcula el area con datos ingresados por usuario de base y altura.
         System.out.println(" Bienvenid@ "+ nombre );
         System.out.println(" Este es un programa que calcula el area de un triangulo segun los datos ingresados  ");
         System.out.println("Ingrese datos de la base del triangulo : ");
          base = leer.nextFloat();
          System.out.println("Ingrese datos de Altura del triangulo : ");
          altura = leer.nextFloat();
         
          area = base * altura / 2;
          System.out.println("El area del Triangulo es : " + area);
          
         
         
         
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
    }
}
