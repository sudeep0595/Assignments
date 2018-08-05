import java.util.Random;

public class SentenceCreation {

	public static void main(String[] args) {
		String[] article = { "the", "a", "one", "some" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };

		Random rand = new Random();
		for (int i = 0; i < 20; i++) {
			String sentence = article[rand.nextInt(article.length)] + " " + noun[rand.nextInt(noun.length)] + " "
					+ verb[rand.nextInt(verb.length)] + " " + preposition[rand.nextInt(preposition.length)] + " "
					+ article[rand.nextInt(article.length)] + " " + noun[rand.nextInt(noun.length)] + ".";

			sentence = (sentence.toUpperCase()).substring(0, 1) + sentence.substring(1, sentence.length());
			System.out.println(sentence);
		}

	}
}
