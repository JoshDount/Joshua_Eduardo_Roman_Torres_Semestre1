import java.util.ArrayList;
public class llslalslalds {

	public static void main(String[] args) {
		 int[] array1a100 = new int[100];
	        for (int i = 0; i < 100; i++) {
	            array1a100[i] = i + 1;
	        }

	        ArrayList<Integer> arrayList101a200 = new ArrayList<>();
	        for (int i = 101; i <= 200; i++) {
	            arrayList101a200.add(i);
	        }

	        ArrayList<Integer> arrayList1a200 = new ArrayList<>();
	        for (int num : array1a100) {
	            arrayList1a200.add(num);
	        }
	        arrayList1a200.addAll(arrayList101a200);

	        System.out.println("ArrayList combinado (1-200): " + arrayList1a200);

	}

}
