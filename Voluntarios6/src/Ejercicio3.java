import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe un car�cter");
		Scanner entrada = new Scanner(System.in);
		char caracter = entrada.next().charAt(0);
		if(Character.isUpperCase(caracter)) {
			System.out.println("Es un car�cter en may�scula");
		}else if(Character.isLowerCase(caracter)) {
			System.out.println("Es un car�cter en min�scula");
		}else {
			System.out.println("No es una letra");
		}

	}

}
