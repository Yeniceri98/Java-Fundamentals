package sections.sec36_Grouping_Data_Using_HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class WordTranslation {
    private HashMap<String, ArrayList<String>> dictionary;

    public WordTranslation() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, new ArrayList<>());
        dictionary.get(word).add(translation);
    }

    public void remove(String word) {
        dictionary.remove(word);
    }

    public void print() {
        for (String e : dictionary.keySet()) {
            System.out.println(e + ": " + dictionary.get(e));
        }
    }
}
