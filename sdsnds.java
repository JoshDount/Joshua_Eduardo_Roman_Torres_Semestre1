import java.util.ArrayList;
import java.util.Scanner;
public class sdsnds {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingresa un número entero (número negativo para salir): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                suma += numero;  
                if (!numeros.contains(numero)) {
                    numeros.add(numero); 
                }
            }
        } while (numero >= 0);
        System.out.println("La suma de los números es: " + suma);
        scanner.close();
	}

}
