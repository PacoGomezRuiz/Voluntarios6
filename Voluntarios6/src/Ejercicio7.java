import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe un número del 1 al 10");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0) {
			if(num<13) {
				for(int i=1; i<=12; i++) {
					int multiplo = i;
					int resultado = multiplo*num;
					System.out.println(num+" x "+multiplo+" = "+resultado);
				}
			}
		}
	}
}
