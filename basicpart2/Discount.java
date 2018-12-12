package basicpart2;
/**
 * Write a Java assignment statement to calculate a 35% discount 
 * on an item’s value stored in the variable newItem, 
 * store the discount amount in a variable called discount. 
 * Then calculate the new price for the item subtracting off the discount, 
 * storing the new price in a variable called newItemPrice.
 * 
 * @author shuraut
 *
 */
public class Discount {

	
	public static void main(String[] args) {

		int newItem=100;
		int discount=35;
		int newItemPrice;
		
		newItemPrice=newItem-(newItem*discount/100);
		
		System.out.println(newItemPrice);
		
		
		System.out.println(fic(5));
	}
	
	public static int fic(int n){
		if(n<2)
			return n;
		System.out.println(fic(n-1)+fic(n-2));
		
//		return fic(n-1)+fic(n-2);
		return 0;
	}

}
