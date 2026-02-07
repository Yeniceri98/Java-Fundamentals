package sections.sec99_algorithms_livecoding_practice.algorithms.String_Parsing;

public class WordCountsInString {
    public static void main(String[] args) {
        String input = "Fenerbahce is the biggest club in Turkey";
        String[] words = input.trim().split("\\s+");      // Her bir gördüğü boşlukta ayırma işlemi yapar

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Number of words for given input: " + words.length);
    }
}
