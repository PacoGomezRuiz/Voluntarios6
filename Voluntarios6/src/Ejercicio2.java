import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		System.out.println("Dime tu cumplea�os para calcular tu n�mero de la suerta, empieza por el d�a: (formato xx)");
		Scanner entrada = new Scanner(System.in);
		int dia = entrada.nextInt();
		System.out.println("ahora el mes: (formato xx)");
		Scanner entrada2 = new Scanner(System.in);
		int mes = entrada2.nextInt();
		System.out.println("y por �ltimo el a�o ( formato xxxx)");
		Scanner entrada3 = new Scanner(System.in);
		int a�o = entrada3.nextInt();
		int suma = dia+mes+a�o;
		int suma1 = suma/1000;
		int suma2 = suma/100%10;
		int suma3 = suma/10%10;
		int suma4 = suma%10;
		int numsuerte = suma1+suma2+suma3+suma4;
		System.out.println(suma);
		System.out.println(suma1 + "+" + suma2 + "+" + suma3 + "+" + suma4);
		System.out.println("Tu n�mero de la suerte es el: "+numsuerte);
	}
}
