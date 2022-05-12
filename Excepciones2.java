package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(CapturaEntero("Escribe el dato: "));
		sc.close();
	}
	
	public static int CapturaEntero(String msg){
		Scanner sc = new Scanner(System.in);
		boolean sigue;
		int op = -1;
		System.out.println(msg);
		do{
			sigue = false;
			try{
				op = sc.nextInt();
			}catch(InputMismatchException e){
				sc.next();
				System.out.println("El dato debe ser numerico. Intente de nuevo");
				sigue = true;
			}
		} while (sigue);
		return op;
	}
	public static String CapturaString(String msg){
		Scanner sc = new Scanner(System.in);
		boolean sigue;
		String op = "";
		System.out.println(msg);
		do{
			sigue = false;
			try{
				op = sc.nextLine();
			}catch(InputMismatchException e){
				sc.next();
				System.out.println("El dato debe ser numerico. Intente de nuevo");
				sigue = true;
			}
		} while (sigue);
		return op;
	}

}
