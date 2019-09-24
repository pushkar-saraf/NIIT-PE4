import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.print("Please enter the string: ");
        String input = UtilX.getStr();
        System.out.print("Enter the character for which number of occurrences needs to be calculated: ");
        char givenChar = UtilX.getChar();
        int noOfOccurrences = input.length() - input.replace(String.valueOf(givenChar), "").length();
        System.out.println("Number of occurrences: "+ noOfOccurrences);
    }


}
