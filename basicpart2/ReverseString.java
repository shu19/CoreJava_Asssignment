package basicpart2;
/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

	Example 1:
	Input: "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"

 * @author shuraut
 *
 */
public class ReverseString {

	
	public static void main(String[] args) {
		String str="Let's take LeetCode contest";
		
		for(String s:str.split(" ")){
			for(int i=s.length()-1;i>=0;i--){
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
