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
public class Prob13 {
    public static void Prob13(){
        for(int i = 1; i<101;i++){
            if(i%2==0){
                System.out.println(i + " Es divisor de 2");
            }
            if(i%3==0){
                System.out.println(i + " Es divisor de 3");
            }
        }
    }
    
}
