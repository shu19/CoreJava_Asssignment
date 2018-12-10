import java.util.Scanner;


public class LinearSearch {

	
	public static void main(String[] args) {

		int a[]={5,	12,	14,	6,	78,	19,	1,	23,	26,	35,	37,	7,	52,	86,	47};

		System.out.println("Enter the number");
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		for(int i=0;i<a.length;i++){
			if(a[i]==number){
				System.out.println("Number present in array at index "+i);
				break;
			}
		}
		

	}

}
