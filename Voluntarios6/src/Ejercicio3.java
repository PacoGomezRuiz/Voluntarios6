import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe un carácter");
		Scanner entrada = new Scanner(System.in);
		char caracter = entrada.next().charAt(0);
		if(Character.isUpperCase(caracter)) {
			System.out.println("Es un carácter en mayúscula");
		}else if(Character.isLowerCase(caracter)) {
			System.out.println("Es un carácter en minúscula");
		}else {
			System.out.println("No es una letra");
		}

	}

}
