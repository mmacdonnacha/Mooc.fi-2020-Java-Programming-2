
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

    }

    public static void printKeys(HashMap<String, String> hashmap) {
        // prints all the keys in the hashmap given as a parameter.
        for(String s : hashmap.keySet()){
            System.out.println(s);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        // prints the keys in the hashmap given as a parameter, 
        // which contain the string given as a parameter.
        for(String s : hashmap.keySet()){
            if(s.contains(text)){
                System.out.println(s);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        // prints the values in the given hashmap whichs keys contain the given string.
        for(String s : hashmap.keySet()){
            if(s.contains(text)){
                System.out.println(hashmap.get(s));
            }
        }
    }
}
