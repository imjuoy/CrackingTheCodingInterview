import java.util.Scanner;

public class StringUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the input string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		boolean result = IfUnique(input);
		if (result)
			System.out.println("The string contains only unique characters");
		else
			System.out.println("The string contains duplicate characters");
	}

	public static boolean IfUnique(String input) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					return false;
				}
			}
		}

		return true;
	}

}
