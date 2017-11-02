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
public class Prob11 {
    public static void Prob11(){
    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.println("Introduce un número");
    n = scanner.nextInt();
    
    for(int i=1;i<n+1;i++)
    {
        //Comprobamos si es multiplo de 3
        if(i%3==0){
            System.out.println(i);
        }
    }
    }
    
}
