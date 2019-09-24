import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Replace 'f' & 'l'");
        System.out.print("Original String: ");
        String input = UtilX.getStr();
        input = input
                .replace("d", "f")
                .replace("l","t");
        System.out.println("New String: "+ input);
    }

}
