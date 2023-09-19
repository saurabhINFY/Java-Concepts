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

TAG: 2-pointer

 */
public class ReverseVowelOfString {
    public static String reverseVowels(String s) {
        char[]temp = s.toCharArray();
        int i=0;
        int j= temp.length-1;
        while(i<j){
            while(i<j && !test(temp[i])){
                i++;
            }
            while(j>i && !test(temp[j])){
                j--;
            }
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }
        return new String(temp);
    }
    private static boolean test(char ch) {
        return ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U';
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("a.b,."));
        System.out.println(reverseVowels("aA"));
    }
}
