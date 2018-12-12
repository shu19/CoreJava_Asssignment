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


	/**
	 * 
	 * @param input : This is input string which is to be reversed
	 * 
	 * @return reverse : This is the String of reverse order of characters in each word
	 */
	public String getReverseString(String input) {

		String reverse=new String();
		for(String s:input.split(" ")){
			for(int i=s.length()-1;i>=0;i--){
				reverse+=s.charAt(i);
			}
			reverse+=" ";
		}

		return reverse;
	}

}
