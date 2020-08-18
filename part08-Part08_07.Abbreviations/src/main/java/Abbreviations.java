
import java.util.HashMap;

/**
 *
 * @author micheal
 */
public class Abbreviations {

    private HashMap<String, String> map;

    public Abbreviations() {
        this.map = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        // adds a new abbreviation and its explanation.
        
        this.map.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        // checks if an abbreviation has already been added; 
        // returns true if it has and false if it has not.
        
        return this.map.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        // finds the explanation for an abbreviation; 
        // returns null if the abbreviation has not been added yet.
        
        return this.map.get(abbreviation);
    }
    
    
}
