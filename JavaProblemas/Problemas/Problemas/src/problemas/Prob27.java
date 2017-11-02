package problemas;
import java.util.Scanner;
public class Prob27 {
	public static void Prob27(){
		Scanner scanner = new Scanner(System.in);
		int num;
		int res;
		System.out.println("Introduce un número");
		num = scanner.nextInt();
		for(int i=1;i<=10;i++){
			res = num*i;
			System.out.println(num + " x " + i + " = " + res);
		}
	}
}
