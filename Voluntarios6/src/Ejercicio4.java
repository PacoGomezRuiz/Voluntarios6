import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe un carácter");
		Scanner entrada = new Scanner(System.in);
		char caracter = entrada.next().charAt(0);
		if(Character.isDigit(caracter)) {
			if(caracter>'0') {
				if (caracter<'9') {
					System.out.println("Es un dígito numérico");
				}
			}
		}else {
			System.out.println("No es un dígito numérico");
		}
	}
}