
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Literacy> literacy = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim(),
                            Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .forEach(piece -> literacy.add(piece));
        }catch(IOException ioe){
            System.out.println("Error IO: " + ioe.getMessage());
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
            
        literacy.stream()
                .sorted((p1, p2) -> {
                    if(p1.getLiteraryPercentage() - p2.getLiteraryPercentage() > 0) return 1;
                    else if (p1.getLiteraryPercentage() - p2.getLiteraryPercentage() < 0) return -1;
                    else return 0;            
                })
                .forEach(p -> System.out.println(p.getCountry() + " (" + p.getYear() + "), " 
                                               + p.getGender().replace(" (%)", "") + ", " + p.getLiteraryPercentage()));
    }
}
