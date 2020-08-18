

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker checker = new Checker();
        
        String string = "10:24:04";
        boolean value = checker.isDayOfWeek(string);
        System.out.println(string + ": " + value);
        
        string = "11:24:01";
        value = checker.isDayOfWeek(string);
        System.out.println(string + ": " + value);
        
        string = "11:23:00";
        value = checker.isDayOfWeek(string);
        System.out.println(string + ": " + value);
        
       
    }
    
}
