package problemas;
import java.util.Scanner;


public class Prob25 {
	public static void Prob25(){
		int miles;
		int cent;
		int dec;
		int uni;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un número menor que 5000");
		int num = scanner.nextInt();
		while (num>=5000 || num<=0){
			System.out.println("Introduce un número menor que 5000 y mayor que 0");
			num = scanner.nextInt();
		}
		miles = num/1000;
		cent = (num/100) %10;
		dec = (num/10) %10;
		uni = num % 10;
		//MILES
		if(miles<4){
			for (int i=0; i<miles;i++){
				System.out.print("M");
				}
			}
		else{
				System.out.print("ÎV");
		}
		//FIN MILES
		//CENTENAS
		if(cent<4){
			for(int j = 0; j<cent;j++){
				System.out.print("C");
				}
			}else{
				if(cent == 4){
					System.out.print("CD");
				}
				else if (cent ==9){
					System.out.print("CM");
				}
				else{
					System.out.print("D");
					for(int j = 0; j<cent%5;j++){
						System.out.print("C");
					}
				}
			}
		//FIN CENTENAS
		//DECENAS
		if(dec<4){
			for (int k = 0; k<dec;k++){
				System.out.print("X");}
		}
		else{
			if(dec==4){
				System.out.print("XL");
			}
			else if(dec ==9){
				System.out.print("XC");
			}
			else{
				System.out.print("L");
				for (int k=0;k<dec%5;k++){
					System.out.print("X");
				}
			}
		}//FIN DECENAS
		//UNIDADES
		if(uni<4){
			for (int l = 0; l<uni; l++){
				System.out.print("I");
			}
		}
		else{
			if(uni == 4){
				System.out.print("IV");
			}else if(uni==9){
				System.out.print("IX");
			}else{
				System.out.print("V");
				for (int l=0;l<uni%5;l++){
					System.out.print("I");
				}
			}
		}//FIN UNIDADES
	System.out.println();
	}//metodo

}//clase
