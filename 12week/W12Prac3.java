import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class W12Prac3 {
    static class CountWordsInText {
        String[] doc;
        Map<String, Integer> wordMap;
        ArrayList<String> wordList;

        CountWordsInText(String[] doc) {
            this.doc = doc;
            wordMap = new HashMap<>();
            wordList = new ArrayList<>();
        }
        void countWords() {
            for (String sentense: doc) {
                String[] words = sentense.split("(\\,|\\!|\\;|\\.|\\s+)+");
                for (String word: words) {
                    if (wordMap.containsKey(word)) {
                        wordMap.put(word, wordMap.get(word)+1);
                    } else {
                        wordList.add(word);
                        wordMap.put(word, 1);
                    }
                }
            }
        }

        void printWordsShownMoreThan(int n) {
            for (String word: wordMap.keySet()) {
                if (wordMap.get(word)>=n) {
                    System.out.printf("%s, %d\n", word, wordMap.get(word));
                }
            }
        }
    }
    public static void main(String[] args) {
        String doc[] = {
                "Hear the sledges with the bells",
                "Silver bells!",
                "What a world of merriment their melody foretells!",
                "How they tinkle, tinkle, tinkle,",
                "In the icy air of night!",
                "While the stars, that oversprinkle",
                "All the heavens, seem to twinkle",
                "With  a crystalline delight;",
                "Keeping time, time, time,",
                "In a sort if Runic rhyme,",
                "To the tintinabulation that so musically wells",
                "From the bells, bells, bells, bells,",
                "Bells, bells, bells,",
                "From the jingling and the tinkling of the bells."
        };
        CountWordsInText countWords = new CountWordsInText(doc);
        countWords.countWords();
        countWords.printWordsShownMoreThan(3);

    }
}


