import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to check Palindrome or Not");
		String str=sc.nextLine();
		
		if(checkPalindrome(str)) {
			System.out.println(str+" is Palindrome");
		}else {
			System.out.println(str+" is Not Palindrome");
		}
		
	}

}
