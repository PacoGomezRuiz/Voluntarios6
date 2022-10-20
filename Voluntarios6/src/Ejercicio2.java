import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		System.out.println("Dime tu cumpleaños para calcular tu número de la suerta, empieza por el día: (formato xx)");
		Scanner entrada = new Scanner(System.in);
		int dia = entrada.nextInt();
		System.out.println("ahora el mes: (formato xx)");
		int mes = entrada.nextInt();
		System.out.println("y por último el año ( formato xxxx)");
		int nac = entrada.nextInt();
		int suma = dia+mes+nac;
		int suma1 = suma/1000;
		int suma2 = suma/100%10;
		int suma3 = suma/10%10;
		int suma4 = suma%10;
		int numsuerte = suma1+suma2+suma3+suma4;
		System.out.println(suma);
		System.out.println(suma1 + "+" + suma2 + "+" + suma3 + "+" + suma4);
		System.out.println("Tu número de la suerte es el: "+numsuerte);
	}
}