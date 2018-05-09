import java.util.Scanner;

public class StringUniqueCharacters_method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the input string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		boolean result = IfUnique(input);
		System.out.println(result);
		
	}
	
	public static boolean IfUnique(String input)
	{
		boolean char_val [] = new boolean [256];
		if (input.length() < 2 || input == null)
			return true;
		for(int i=0; i< input.length(); i++)
		{
		 int val = input.charAt(i);
		 if(char_val[val])
			return false;
		 char_val[val] = true;
		}
		return true;
	}

}
