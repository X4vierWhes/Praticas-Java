import java.util.HashMap;
import java.util.Map;

public class Quest33 {
    public static void main(String[] args) {
        String word = "casa";
        Map<Character, Integer> letters = new HashMap<Character, Integer>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letters.containsKey(letter)) {
                int frequency = letters.get(letter);
                letters.put(letter, frequency + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        for (char key : letters.keySet()) {
            System.out.println(key + ": " + letters.get(key));
        }

    }
}
