import java.util.*;
public class FindDuplicateStrings{
    public static void main(String[] args) {
        String[] sa = {"apple", "banana", "apple", "orange", "banana", "grape"};
        for (int i = 0; i < sa.length - 1; i++) {
            for (int j = i + 1; j < sa.length; j++) {
                if (sa[i]==(sa[j])) {
                    System.out.println("Duplicate found: " + sa[i]);
                }
            }
        }
    }
}
