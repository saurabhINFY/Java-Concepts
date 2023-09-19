import java.util.Arrays;

public class ReverseWordInString {
    public static String reverseWords(String s) {
        final StringBuilder sb = new StringBuilder();
        Object[] temp = Arrays.stream(s.split(" ")).filter(ele -> !ele.matches("\\s+")).toList().stream().peek(System.out::println).toArray();
        for(int i=temp.length-1;i>=0;i--){
            sb.append(temp[i]);
        }
        return sb.toString().strip();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
