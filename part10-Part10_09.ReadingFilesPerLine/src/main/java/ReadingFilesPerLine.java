
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        String fileName = "file.txt";
        
        List<String> lineList = read(fileName);
        
        lineList.stream().forEach(line -> System.out.println(line));

    }
    
    public static List<String> read(String file){
        List<String> list = new ArrayList<>();
        
        try{
            Files.lines(Paths.get(file))
                    .forEach(line -> list.add(line));
        }catch(IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }
        
        return list;
    }
}
