
public class fo3 {

	public static void main(String[] args) {
		int x,y;
		for (x=1; x<=10; x++){
			for (y=x; y<=10; y++) {
			 System.out.println("x:"+x+" y:"+y);
			 if(y==5)
			 {
				 break;
			 }
			}
		}
	}

}
