import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//%=Resto /=Division
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un n�mero de 3 cifras:");
		int num = entrada.nextInt();
		int primera=num/100;
		int medsegunda=num%100;
		int segunda=medsegunda/10;
		int tercera=medsegunda%10;
		
		System.out.println("Las cifras del n�mero "+num+" son:");
		System.out.println("Primera cifra: "+primera);
		System.out.println("Primera cifra: "+segunda);
		System.out.println("Primera cifra: "+tercera);

	}

}
