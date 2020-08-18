package dictionary;

public class Main {

    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        
        dictionary.add("banaani", "banana");
        dictionary.add("dia duit", "hello");
        
        wasSuccessful = dictionary.save();

        if (wasSuccessful) {
            System.out.println("Successfully saved the dictionary to the file");
        }
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        System.out.println(dictionary.translate("banaani"));
        System.out.println(dictionary.translate("dia duit"));
    }
}
