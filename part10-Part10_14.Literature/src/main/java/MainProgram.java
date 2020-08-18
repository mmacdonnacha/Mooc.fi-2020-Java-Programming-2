
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        
        while(true){
            System.out.print("Input name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int ageRating = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, ageRating));
        }
    
        System.out.println(books.size() + " books in total.");
//        books.stream()
//                .sorted((book1, book2) -> {return book1.getAgeRating() - book2.getAgeRating();})
//                .forEach(book -> System.out.println(book));
    
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRating)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        books.stream().forEach(book -> System.out.println(book));
        
    }
    
    

}
