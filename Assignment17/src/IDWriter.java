
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDWriter {
	static FileReader fr;
	static FileWriter fw;
	static BufferedWriter bw;
	static BufferedReader br;

	private static boolean checkValid(String input) {
		String regex = "^(\\d{3}-?\\d{2}-?\\d{4})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();

	}

	private static void writeIntoFile(String input, boolean valid) {
		try {
			String write;
			if (valid)
				write = input + " : valid";
			else
				write = input + " : invalid";
			bw.write(write);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		String input;
		boolean valid = false;
		try {
			fr = new FileReader("IDs.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("IDValid.txt", true);
			bw = new BufferedWriter(fw);
			while ((input = br.readLine()) != null) {
				valid = checkValid(input);
				writeIntoFile(input, valid);
			}
			System.out.println("All IDs Validated and saved");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
					fw.close();
				}
				if (br != null) {
					br.close();
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
