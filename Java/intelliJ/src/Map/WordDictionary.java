package Map;

import java.util.HashMap;
import java.util.Locale;

public class WordDictionary {
    private HashMap<String, String> words = new HashMap<>();

    public void addWord(String english, String Korean) {
        words.put(english, Korean);
    }

    public String find(String english) {
        for(String key : words.keySet()) {
            if(key.toLowerCase(Locale.ROOT).equals(english.toLowerCase(Locale.ROOT))) {
                return words.get(key);
            }
        }
        return null;
    }
}
