package Empackage;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Welcome";
		String reversedString = reverseString(str);
		System.out.println(reversedString);
	}

	
public static String reverseString(String str) {
	
	StringBuilder sbr = new StringBuilder();
	sbr.append(str);
	sbr.reverse();
	str=sbr.toString();
	return str;
}


}
