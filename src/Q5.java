public class Q5 {
    public static void main(String[] args) {
        System.out.println("Hey Harry!!");
        System.out.print("Input:");
        String input = UtilX.getStr();
        if(input.matches("(.*)Harry(.*)")){
            System.out.println("Is Harry here? true");
        } else {
            System.out.println("Is Harry here? false");
        }
    }
}
