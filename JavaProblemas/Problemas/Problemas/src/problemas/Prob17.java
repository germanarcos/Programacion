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
public class Prob17 {
    public static void Prob17(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = scanner.nextInt();
        System.out.println("Introduce otro número");
        int num2 = scanner.nextInt();
        while(num2<num){
            System.out.println("Introduce un número mayor que el primero");
            num2= scanner.nextInt();
        }
        if(num%2 == 0){
        	for(int i=num;i<=num2;i+=2){
        		System.out.println(i);
        	}
        }else{
        	for(int i=num+1;i<=num2;i += 2){
        		System.out.println(i);;
        	}
        }
    }
}
