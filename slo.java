import java.util.Scanner;
public class slo {
	static double Vol(int R)
	{
		return (4.0 / 3.0) * Math.PI * Math.pow(R, 3);
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce radio:");
        int R = scanner.nextInt();
        double V=Vol(R);
        System.out.println("Volumen en cm cubicos: "+V);
	}

}
