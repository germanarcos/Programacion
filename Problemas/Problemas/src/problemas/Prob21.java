package problemas;

public class Prob21 {
	public static void Prob21(){
		int sumapar = 0;
		int sumaimpar = 0;
		for(int i=1;i<=1000;i++){
			switch (i%2){
			case 0:
				sumapar = sumapar + i;
				break;
			case 1:
				sumaimpar = sumaimpar +i;
				break;	
			}
			
		}
		System.out.println("La suma de los números pares es: " + sumapar);
		System.out.println("La suma de los números impares es: " + sumaimpar);
	}
}
