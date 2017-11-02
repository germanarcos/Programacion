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
public class Prob10 {
    public static void Prob10(){
    Scanner scanner = new Scanner(System.in);
    //Declaración de la variable num como un entero
    int num;
    System.out.println("Introduce un número");
    //Asignamos el valor que escribimos a la variable num
    num = scanner.nextInt();
    
        if (num%2==0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar.");
        }
    }
    
}
