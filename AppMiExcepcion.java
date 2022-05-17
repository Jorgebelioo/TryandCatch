package poo;

public class AppMiExcepcion {

	public static void main(String[] args) {
		try{
			System.out.println(Divide(10, 5));
		}catch (MiExcepcion e){
			System.out.println(e.getMessage());
		}
	}
	
	public static int Divide(int a, int b) throws MiExcepcion{
		if(b == 0){
			throw new MiExcepcion("No se puede dividir entre cero");
		}
		return a/b;
	}
}
