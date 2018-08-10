import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDValidate {

	private Pattern pattern;
	private Matcher matcher;
	private static String regex1 = "^(\\d{3}-?\\d{2}-?\\d{4})$";
	private static String regex2 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#\\$%\\^&\\*])[A-Za-z0-9#$%^&*]{8,}$";
	static IDValidate idval;

	public IDValidate(String regex) {
		pattern = Pattern.compile(regex);
	}

	private boolean ValidId(String id) {
		boolean valid = false;
		matcher = pattern.matcher(id);
		valid = matcher.matches();
		return valid;
	}

	public static void main(String[] args) {

		System.out.println("Enter your ID for validation:");
		Scanner scan = new Scanner(System.in);
		String id = scan.next();
		idval = new IDValidate(regex1);

		boolean validId = idval.ValidId(id);
		if (validId) {
			System.out.println("Input ID is Valid");
			System.out.println("Please Enter password");
			do {
				String password = scan.next();
				idval = new IDValidate(regex2);
				boolean validPassword = idval.ValidId(password);

				if (validPassword) {
					System.out.println("ID and password valid");
					break;
				} else {
					System.err.println("Password not valid");
				}
			} while (true);
		} else
			System.err.println("ID not valid");
	}
}
