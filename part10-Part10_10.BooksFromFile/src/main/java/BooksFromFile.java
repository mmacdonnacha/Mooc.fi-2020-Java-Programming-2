
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();

        try {
            // reading the file line by line
            books = Files.lines(Paths.get(file))
                    // splitting the row into parts on the "," character
                    .map(row -> row.split(","))
                    // creating books from the parts
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]),
                                           Integer.valueOf(parts[2]), parts[3]))
                    // and collect the books into an ArrayList
                    .collect(Collectors.toCollection(ArrayList<Book>::new));
            
            /*
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]),
                                           Integer.valueOf(parts[2]), parts[3]))
                    .forEach(book -> books.add(book));
            */
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return books;
    }
}
