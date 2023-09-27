import java.lang.reflect.Array;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] arr={"a. public variables\n","b. private variables\n", "c. instance variables\n", "d. class variables\n"};
        System.out.println(new MCQuestion("Question:\n Variables that are shared by every instance of a class are:\n",arr,"answer= d"));

    }
}