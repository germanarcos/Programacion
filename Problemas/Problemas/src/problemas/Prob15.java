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
public class Prob15 {
    public static void Prob15(){
        int contador = 0, contpar = 0, sumaimp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int max = scanner.nextInt();
        System.out.println("Introduce otro número");
        int min = scanner.nextInt();
        if(max<min){
            //Cambio de variable
            int a = max;
            max = min;
            min = a;
        }
        for(int i=min+1;i<max;i++){
            System.out.println(i);
            if(i%2==0){
                contpar = contpar+1;
            }
            else {
                sumaimp = sumaimp + i;
            }
            contador = contador + 1;
        }
        System.out.println("Hay: " + contador + " números naturales entre " +min+ " y " +max);
        System.out.println("La suma de números impares es: " + sumaimp);
        System.out.println("Hay " +contpar+" números pares");
    }
}
