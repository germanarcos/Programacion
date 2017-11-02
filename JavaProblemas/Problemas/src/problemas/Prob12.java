/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;


/**
 *
 * @author usuario
 */
public class Prob12 {
    public static void Prob12(){
    int sumapar = 0, sumaimpar = 0;
    
    for(int i = 1; i<101; i++){
        //Imprime todos los números
        System.out.println(i);
        //Realiza suma de números pares
        if(i%2==0){
            sumapar += i;
        }
        //Realiza suma de números impares
        else{
            sumaimpar += i;
        }
    }
    System.out.println("La suma de pares es: "+sumapar);
    System.out.println("La suma de impares es: " + sumaimpar);
    }
    
}
