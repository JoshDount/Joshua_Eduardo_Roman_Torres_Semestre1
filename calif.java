import java.util.Scanner;
public class calif {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int calif,num2,sum;
		System.out.println("Ingresa la calificación:");
         calif = scanner.nextInt();
       if (calif>=70)
       {
    	   System.out.println("Usted aprobo con "+calif);
       }
       else
       {
    	   System.out.println("Usted reprobo con "+calif);
       }

	}

}
