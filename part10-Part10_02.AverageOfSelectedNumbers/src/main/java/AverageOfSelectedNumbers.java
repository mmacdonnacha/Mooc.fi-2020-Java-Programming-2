
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> list = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            
            list.add(input);
        }
        
        
        
        
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String np = scanner.nextLine();
        if(np.equals("p")){
            double averagePositive = list.stream()
                .mapToInt(num -> Integer.valueOf(num))
                .filter(num -> num > 0)
                .average()
                .getAsDouble();
            
            System.out.println("Average of the positive numbers: " + averagePositive);
        }
        
        if(np.equals("n")){
            double averageNegative = list.stream()
                .mapToInt(num -> Integer.valueOf(num))
                .filter(num -> num < 0)
                .average()
                .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + averageNegative);
        }

    }
}
