
public class SequentialSort {

	public static void main(String[] args) {
		int a[]={5,	12,	14,	6,	78,	19,	1,	23,	26,	35,	37,	7,	52,	86,	47};
		int length=a.length-1;
		int itration=length;
		for(int j=0;j<itration;j++){
		for(int i=0;i<length;i++){
			
			if(a[i]>a[i+1]){
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}

		}
		
		}
		for(int ar:a){
			System.out.print(ar+" ");
		}
	}

}
