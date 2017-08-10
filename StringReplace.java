
public class StringReplace {

	public static void main(String[] args) {
		//  Write a program to find a substring in a given string and then replace it with another string
		
		String str = "testing a test message";
		System.out.println("Given string: " + str);
		
		System.out.println("After replacing te with ca:  " + str.replaceAll("te", "ca"));	

	}

}
