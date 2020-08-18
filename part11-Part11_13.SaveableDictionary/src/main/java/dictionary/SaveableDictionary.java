package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author micheal
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String fileName;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.fileName = file;
    }

    public void add(String words, String translation) {
        // adds a word to the dictionary. 
        // Every word has just one translation, 
        // and if the same word is added for the second time, nothing happens.

        if (!this.dictionary.containsKey(words) && !this.dictionary.containsValue(words)) {
            this.dictionary.put(words, translation);
        }

    }

    public String translate(String word) {
        // returns the translation for the given word. 
        // If the word is not in the dictionary, returns null.
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }

        if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    return key;
                }
            }

        }

        return null;
    }

    public void delete(String word) {
        // deletes the given word and its translation from the dictionary.
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }

        String keyToDelete = "";
        if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    keyToDelete = key;
                }
            }
            this.dictionary.remove(keyToDelete);
        }
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character

                add(parts[0], parts[1]);
            }
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try(PrintWriter writer = new PrintWriter(this.fileName))
        {
            for(String key : this.dictionary.keySet()){
                String translation = key + ":" + this.dictionary.get(key);
                writer.println(translation);
            
            }
            
            writer.close();
            return true;
            
        }catch(Exception e){
            return false;
        }
    }

}
