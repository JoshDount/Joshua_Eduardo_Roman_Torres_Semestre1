import java.util.Scanner;
public class pep {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1,num2,sum;
		System.out.println("Ingresa el valor 1:");
         num1 = scanner.nextInt();
        System.out.println("Ingresa el valor 2:");
        num2 = scanner.nextInt();
        sum=num1+num2;
        System.out.println("La suma es: "+sum);
	}

}
