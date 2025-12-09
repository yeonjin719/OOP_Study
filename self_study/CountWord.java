import java.io.*;
import java.util.HashMap;

class WordCounter {
    private final String filePath;
    private final File file;
    private final HashMap<String, Integer> wordCount = new HashMap<>();
    private int totalWords = 0;
    private int frequentWordCount = 0;
    private String frequentWord = "";

    WordCounter(String fileDirection) throws NoFileException {
        this.filePath = fileDirection;
        this.file = new File(fileDirection);

        if (!this.file.exists()) {
            throw new NoFileException(fileDirection);
        }
    }

    void countWord() throws NoFileException {
        if (!file.exists()) {
            throw new NoFileException(filePath);
        }

        try (BufferedReader f = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = f.readLine()) != null) {
                String editLine = line.toLowerCase();

                for (String word : editLine.split("[^A-Za-z]+")) {

                    if (word.length() == 0) continue;

                    int currentCount = wordCount.getOrDefault(word, 0);
                    int newCount = currentCount + 1;

                    wordCount.put(word, newCount);
                    totalWords++;

                    if (newCount > frequentWordCount ||
                            (newCount == frequentWordCount && word.compareTo(frequentWord) < 0)) {
                        frequentWord = word;
                        frequentWordCount = newCount;
                    }
                }
            }

        } catch (IOException e) {
            throw new NoFileException(filePath);
        }
    }

    int getUniqueWords() {
        return wordCount.size();
    }

    int getFrequentWordCount() {
        return frequentWordCount;
    }

    int getTotalWords() {
        return totalWords;
    }

    String getFrequentWord() {
        return frequentWord;
    }
}

class NoFileException extends Exception {
    public NoFileException(String e) {
        super(e);
    }

    @Override
    public String getMessage() {
        return "Error: cannot open file (" + super.getMessage() + ")";
    }
}

public class CountWord {
    public static void main(String[] args) {
        try {
            WordCounter wc = new WordCounter("self_study/input.txt");
            wc.countWord();
            System.out.printf("Total words: %d\n", wc.getTotalWords());
            System.out.printf("Unique words: %d\n", wc.getUniqueWords());
            System.out.printf("Most frequent: \"%s\" (%d)\n",
                    wc.getFrequentWord(), wc.getFrequentWordCount());
        } catch (NoFileException e) {
            System.out.println(e.getMessage());
        }
    }
}