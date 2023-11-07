/*
Reverse Words in a String
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWordInString {
    private static StringBuilder sb;
    public static String reverseWords(String s) {
        sb = new StringBuilder();
        String[]temp = s.trim().replaceAll("\\s+", "-").split("-");
        for(int i= temp.length-1;i>=0;i--){
            sb.append(temp[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static String reverseWordsUsingStreams(String s){
        String[] splittedString = s.trim().replaceAll("\\s+", "-").split("-");
        return IntStream.range(splittedString.length-1,0).mapToObj(index->new StringBuilder(splittedString[index])).
                peek((str)->System.out.println("Builder is " + str))
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
        System.out.println(reverseWordsUsingStreams("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
    }
}
