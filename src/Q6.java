public class Q6 {
    public static void main(String[] args) {
        System.out.print("Input: ");
        String str = UtilX.getStr();
        System.out.print("Given Word: ");
        String word = UtilX.getStr();
        if(str.length()<=word.length()){
            System.out.println("Invalid input");
        }
        for (int i = 0; i < str.length(); i++) {
            int occurrence = str.indexOf(word,i);
            if(occurrence!=-1){
                i = occurrence;
                System.out.println("Found at: "+occurrence+" - " +(occurrence+word.length()));
            } else {
                break;
            }
        }
    }
}
