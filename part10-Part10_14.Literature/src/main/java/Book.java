/**
 *
 * @author micheal
 */
public class Book {
    private String name;
    private int ageRating;

    public String getName() {
        return name;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public Book(String name, int ageRating) {
        this.name = name;
        this.ageRating = ageRating;
    }
    
    @Override
    public String toString(){
        return this.name + " (recommended for " + this.ageRating + " year-olds or older)";
    }
}
