import java.util.Scanner;

public class func {
public static int sumar (int numero1, int numero2)
{
	return numero1+numero2;
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce numero 1:");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce numero 2:");
        int numero2 = scanner.nextInt();
        int sum=sumar(numero1,numero2);
        System.out.println("el resultado de la suma es: "+sum);
	}

}
