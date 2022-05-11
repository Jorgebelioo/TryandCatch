package poo;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
	        System.out.println(5/1);
		} catch (ArithmeticException error){
			System.out.println("Agarra el rollo mi loco, no dividas entre 0");
		}
		
		int num = 0;
		try{
			System.out.println("Ingrese valor: ");
	        num = sc.nextInt();
	        System.out.println(5/num);
		}
		  catch (InputMismatchException error){
			System.out.println("Agarra el rollo mi loco, se esperaba un valor numerico ");
		}
		  catch (ArithmeticException error){
			System.out.println("Agarra el rollo mi loco, no dividas entre 0 " + error.getMessage());
		}
		  catch (Exception error){
			  System.out.println("Error inesperado: " + error.getMessage());
		  }
		finally{
			System.out.println("Si ejecuto el finally");
			sc.close();
		}
		try{
		System.out.println(Divide(5, num));
		//} catch(IOException e){
			
		}
		finally{
					
	    }
		System.out.println(num);
		
		
	}
	
	public static int Divide(int n1, int n2) throws ArithmeticException{
		return n1/n2;
		
	}

}
