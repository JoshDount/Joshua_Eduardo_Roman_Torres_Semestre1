import java.util.Scanner;
public class func2 {
	public static int sumar (int numero1, int numero2,int numero3)
	{
		return numero1+numero2+numero3;
	}
	public static int sumar (int numero1, int numero2,int numero3,int numero4)
	{
		return numero1+numero2+numero3+numero4;
	}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce numero 1:");
	        int numero1 = scanner.nextInt();
	        System.out.print("Introduce numero 2:");
	        int numero2 = scanner.nextInt();
	        System.out.print("Introduce numero 3:");
	        int numero3 = scanner.nextInt();
	        int sum=sumar(numero1,numero2,numero3);
	        System.out.println("el resultado de la suma es: "+sum);
		}

	
}
