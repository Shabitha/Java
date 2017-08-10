
public class ReverseEachString {

	public static void reverse(String input) {
		// Reverse each string
		String revStr = "";
		String[] str = input.split(" ");
		for ( int i = 0 ; i < str.length ; i++)
		{
			String word = str[i];
			String revWord = "";
			for (int x = word.length() -1 ; x >= 0 ; x--)
			{
				revWord = revWord + word.charAt(x); 
			}
			
			revStr = revStr + revWord + " ";
		}
		System.out.println("The Input String is :: " + input);
		System.out.println("Tne Input String in reverse is :: " + revStr);
	}

	public static void main (String[] args) {
		reverse("Hello World, how are you today?");
	}
}
