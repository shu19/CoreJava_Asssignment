
public class SquareTable {

	public static void main(String[] args) {

			
		createTable(5);
		
	}

	private static void createTable(int i) {
		
		for(int j=1;j<=10;j++){
			int result=i*j;
			System.out.println(i+" * "+j+" = "+result+" ------ "+result*result);
		}
//		System.out.println();
	}
	
	
		
}
