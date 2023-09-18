import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            List<String> words = readWordsFromFile(selectedFile);

            Filter shortWordFilter = new ShortWordFilter();

            List<String> shortWords = filterWords(words, shortWordFilter);
            for (String word : shortWords) {
                System.out.println(word);
            }
        }
    }

    private static List<String> readWordsFromFile(File file) {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    words.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    private static List<String> filterWords(List<String> words, Filter filter) {
        List<String> filteredWords = new ArrayList<>();
        for (String word : words) {
            if (filter.accept(word)) {
                filteredWords.add(word);
            }
        }
        return filteredWords;
    }
}
