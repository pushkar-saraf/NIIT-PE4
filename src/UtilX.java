import java.util.Scanner;

class UtilX {
    static String getStr() {
        Scanner sc = new Scanner(System.in);
        String result = "";
        boolean done = false;
        while(!done) {
            result = sc.nextLine();
            if(!result.isEmpty()){
                done = true;
            }
        }
        return result;
    }


    static char getChar() {
        Scanner sc = new Scanner(System.in);
        char result = ' ';
        boolean done = false;
        while (!done) {
            String s = sc.nextLine();
            if (s.length() != 1) {
                System.out.println("Invalid input. Expected a character.");
            } else {
                result = s.charAt(0);
                done = true;
            }
        }
        return result;
    }
}
