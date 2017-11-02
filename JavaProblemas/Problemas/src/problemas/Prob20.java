package problemas;
import java.util.Scanner;

public class Prob20 {
	
	public static void Prob20(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número del que quieras calcular su factorial");
		int num = scanner.nextInt();
		double resultado = 1;
		for(;num>0;num--){
			resultado *= num;
		}
		System.out.println("El resultado es: " + resultado);
	}
}
