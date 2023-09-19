/*
Reverse Vowels of a String
https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"


 */
public class ReverseVowelOfString {
    public static String reverseVowels(String s) {
        String[]temp = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j= temp.length-1;
        while(i<j){
            if(test(temp[i]) && test(temp[j])){
                String t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
                i++;
                j--;
            } else if(!test(temp[i])){
                i++;
            } else if (!test(temp[j])) {
                j--;
            }
        }
        for(String t : temp){
            sb.append(t);
        }
        return sb.toString();
    }
    private static boolean test(String str) {
        return str.matches("[a,e,i,o,u,A,E,I,O,U]");
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }
}
