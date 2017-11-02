/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Prob14 {
    public static void Prob14(){
        Scanner scanner = new Scanner(System.in);
        int j, k, l, m, n;
        int min, max;
        System.out.println("Introduce un número j");
        j = scanner.nextInt();
        min = j;
        max = j;
        System.out.println("Introduce un número k");
        k = scanner.nextInt();
        if(k>max){
            max = k;
        }
        else{
            min = k;
        }
        System.out.println("Introduce un número l");
        l = scanner.nextInt();
        if(l>max){
            max = l;
        }
        if (l<min){
            min = l;
        }
        System.out.println("Introduce un número m");
        m = scanner.nextInt();
        if (m>max){
            max = m;
        }
        if (m<min){
            min = m;
        }
        System.out.println("Introduce un número n");
        n = scanner.nextInt();
        if (n>max){
            max = n;   
        } 
        if (n<min){
            min = n;
        }
        
        System.out.println("El número más grande es: " + max);
        System.out.println("El número más pequeño es: " + min);
        }
    }
    

