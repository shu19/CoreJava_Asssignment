package basicpart2;

import java.util.Scanner;

/**
 * Determine whether an integer is a palindrome. 
 * An integer is a palindrome when it reads the same backward as forward.

Example 1:
Input: 121
Output: true

Example 2:
Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 */


public class Palindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int originalNumber=sc.nextInt();

		System.out.println(isPalindrome(originalNumber));
		

	}

	private static boolean isPalindrome(int originalNumber) {

		int temp=0;
		
		int no=originalNumber;
		int s=0;
		while(no>0){
			s=no%10;
			no=no/10;
			temp=temp*10+s;
			
		}
		
		if(temp==originalNumber){
			return true;
		}else{
			return false;
		}


	}

}
