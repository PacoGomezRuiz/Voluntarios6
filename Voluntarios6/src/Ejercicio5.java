import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe un n�mero de mes para saber sus d�as");
		Scanner entrada = new Scanner(System.in);
		int mes = entrada.nextInt();
		String nmes;
		int dias;
		if(mes>0 && mes<13) {
			if(mes==1) {
				nmes= ("Enero");
				dias=31;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==2) {
				nmes= ("Febrero");
				dias=28;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==3) {
				nmes= ("Marzo");
				dias=31;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==4) {
				nmes= ("Abril");
				dias=30;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==5) {
				nmes= ("Mayo");
				dias=31;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==6) {
				nmes= ("Junio");
				dias=30;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==7) {
				nmes= ("Julio");
				dias=31;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==8) {
				nmes= ("Agosto");
				dias=31;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==9) {
				nmes= ("Septiembre");
				dias=30;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==10) {
				nmes= ("Octubre");
				dias=31;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==11) {
				nmes= ("Noviembre");
				dias=30;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}else if(mes==12) {
				nmes= ("Diciembre");
				dias=31;
				System.out.println("El mes es "+nmes+" y tiene "+dias+" d�as");
			}
		}else {
			System.out.println("Tienes que introducir un n�mero del 1 al 12");
		}
		
		

	}

}
