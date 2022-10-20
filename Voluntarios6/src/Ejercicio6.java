import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] args) {
		
		
		int personas = 1;
		
		System.out.println("Escribe una edad");
		Scanner entrada1 = new Scanner(System.in);
		int edad1 = entrada1.nextInt();
		
		
		int promedio;
		
		do {
			personas++;
		System.out.println("Escribe la edad de otra persona");
		int edad2 = entrada1.nextInt();
		edad1 =edad1+edad2;
		
		promedio = (edad1/personas);
			
		}while(promedio<25);
		System.out.println("El promedio es "+promedio);

	}

}
