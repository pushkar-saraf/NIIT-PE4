import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        String paragraph = "Non-magic people (more commonly known as Muggles) were particularly afraid of magic in medieval times, but not very good at recognizing it. On the rare occasion that they did catch a real witch or wizard, burning had no effect whatsoever. The witch or wizard would perform a basic Flame Freezing Charm and then pretend to shriek with pain while enjoying a gentle, tickling sensation. Indeed, Wendelin the Weird enjoyed being burned so much that she allowed herself to be caught no less than forty seven times in various disguises.";
        paragraph = paragraph.replace(".", "").replace(",","").replace("(","").replace(")","").toLowerCase();
        String[] words = paragraph.split(" ");
        Arrays.sort(words);
        for (String word : words) {
            System.out.print(word);
            System.out.print(" ");
        }
    }
}
