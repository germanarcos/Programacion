package problemas;

import java.util.Scanner;

public class Prob18 {
    public static void Prob18(){
    	int contador = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase;
        frase = scanner.next();
        char[]Array = frase.toCharArray();
        System.out.println("Introduce una letra que buscar");
        char letra;
        letra = scanner.next().charAt(0);
        int a = Array.length;
        //Busqueda secuencial caracteres
        for(int i=0; i<a;i++){
        	if(letra == Array[i]){
        		contador = contador + 1;
        		}
        	
        }
        System.out.println("La letra "+ letra + " ha aparecido " + contador + " veces");
    }
}
