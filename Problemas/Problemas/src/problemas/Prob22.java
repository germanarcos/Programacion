package problemas;
import java.util.Scanner;
public class Prob22 {
	public static void Prob22(){
		System.out.println("Introduce una frase");
		Scanner scanner = new Scanner(System.in);
		String frase;
		frase = scanner.nextLine();
		for(int i=0; i <= 4; i++){
			for(int j = 0;j<i*4;j++){
				System.out.print(" ");
				
			}
			System.out.println(frase);
		}
	}
	
}
