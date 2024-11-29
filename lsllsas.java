
public class lsllsas {

	public static void main(String[] args) {
		
        int[][] tablasMultiplicar = new int[101][101];  

        
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                tablasMultiplicar[i][j] = i * j;  
            }
        }
        System.out.println("Tablas de multiplicar del 1 al 100:");
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                System.out.print(tablasMultiplicar[i][j] + "\t");  
            }
            System.out.println();  
	}

}
}

