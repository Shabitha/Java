import java.util.Scanner;

public class FrequencyString {

	public static void main(String[] args) {
		// Program to find the frequency of one string in another string.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter main string");
		
		String s = scan.nextLine();
		
		System.out.println("Enter String to be searched");
		
		String f = scan.nextLine();
		
		s = s+" ";
		
		int l = s.length();
		
		//System.out.println(s.length());	
		
		char a;
		int c = 0;
		
		String s1 = "";
		
		for(int i=0; i < l ; i++)
		{
			a = s.charAt(i);
			
			if (a !=' '){
				s1 = s1+a;}
				else {
					if (s1.equalsIgnoreCase(f)==true){
						c++;
					}
					s1="";
					
				}
			}
			System.out.println("frequency of the word"+f+"is"+c);
		
		}		

	}

