import java.util.Scanner;
public class cuarto {
	static double fahre(int C)
	{
		return  32 + ( 9.0 * C / 5.0); 
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce grados centigrados ");
        int C = scanner.nextInt();
        double F=fahre(C);
        System.out.println("Grados fahre "+F);
        
		
	}

}
