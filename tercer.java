import java.util.Scanner;

public class tercer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número 1: ");
        int numero = scanner.nextInt();
        System.out.print("Introduce el número 2: ");
        int numero2 = scanner.nextInt();
        System.out.print("Introduce el número 3: ");
        int numero3 = scanner.nextInt();
        if (numero>numero2 && numero>numero3)
        {
        	System.out.print("el numero mayor es:"+numero);
        }
        if (numero2>numero && numero2>numero3)
        {
        	System.out.print("el numero mayor es:"+numero2);
        }
        if (numero3>numero2 && numero3>numero)
        {
        	System.out.print("el numero mayor es:"+numero3);
        }
        if (numero3==numero2 && numero3==numero)
        {
        	System.out.print("Son iguales");
        }

	}

}
