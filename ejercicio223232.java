import java.util.Random;
public class ejercicio223232 {

	public static void main(String[] args) {
		 int[] array = new int[100];
	        Random random = new Random();

	        for (int i = 0; i < array.length; i++) {
	            array[i] = random.nextInt(501) + 500;
	        }

	        System.out.println("Arreglo antes del ordenamiento:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Arreglo después del ordenamiento:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	}

}
