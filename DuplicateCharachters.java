import java.util.HashMap;

public class DuplicateCharacters {

    public static void findDuplicateCharacters(String str) {
        
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        
        str = str.toLowerCase();

        
        for (char ch : str.toCharArray()) {
            
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        
        System.out.println("Duplicate Characters:");
        for (char ch : charFrequencyMap.keySet()) {
            if (charFrequencyMap.get(ch) > 1) {
                System.out.println(ch);
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "Programming";
        findDuplicateCharacters(inputString);
    }
}
