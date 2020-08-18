
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        //adds the translation for the word and preserves the old translations.
        if (this.dictionary.containsKey(word)) {

            if (!this.dictionary.get(word).contains(translation)) {
                this.dictionary.get(word).add(translation);
            }
        }else{
            ArrayList<String> list = new ArrayList<>();
            list.add(translation);
            this.dictionary.put(word, list);
        }
    }

    public ArrayList<String> translate(String word) {
        // returns a list of the translations added for the word. 
        // If the word has no translations, the method should return an empty list.
        boolean hasTranslation = this.dictionary.containsKey(word);

        if (hasTranslation) {
            return this.dictionary.get(word);
        } else {
            return new ArrayList<>();
        }
    }
    
    public void remove(String word){
        // removes the word and all its translations from the dictionary.
        boolean hasTranslation = this.dictionary.containsKey(word);

        if (hasTranslation) {
            this.dictionary.remove(word);
        } 
    }
}
