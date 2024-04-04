import java.util.HashMap;

public class WordCount {

    public static void countWords(String str) {
       
        String[] words = str.trim().split("\\s+");

        
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        
        for (String word : words) {
            
            word = word.toLowerCase();
            
            
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        
        System.out.println("Word Counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }

    public static void main(String[] args) {
        String inputString = "Java is a programming language. Java is widely used for developing various applications.";
        countWords(inputString);
    }
}
