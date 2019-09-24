import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Transpose string");
        System.out.print("Input String: ");
        String input = UtilX.getStr();
        StringBuilder output = new StringBuilder();
        for (String word : input.split(" ")) {
            StringBuilder sb = new StringBuilder();
            sb.append(word);
            sb.reverse();
            output.append(sb.toString()).append(" ");
        }
        System.out.println("Output String: "+ output.toString());
    }
}
