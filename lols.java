import java.util.Scanner;

public class lols {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();


        if (numero <= 0) {
            System.out.println("El número no es positivo. Intenta nuevamente.");
        } else {

            int numeroCifras = String.valueOf(numero).length();

            if (numeroCifras == 1) {
                System.out.println("El número tiene 1 cifra.");
            } else {
                System.out.println("El número tiene " + numeroCifras + " cifras.");
            }
        }

	}

}
