
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num < 0){
                break;
            }
            
            numbers.add(num);
        }
        
        numbers.stream()
                .filter(number -> number >= 1 && number <= 5)
                .forEach(number -> System.out.println(number));

    }
}
