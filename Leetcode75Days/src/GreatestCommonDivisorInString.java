/*
Greatest Common Divisor of Strings
https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""

 */
public class GreatestCommonDivisorInString {
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1.concat(str2).equals(str2.concat(str1)))){
            return "";
        } else {
            if(str1.length() > str2.length()){
                int gcd = gcdOfLength(str1.length(),str2.length());
                return str1.substring(0,gcd);
            } else{
                int gcd = gcdOfLength(str2.length(),str1.length());
                return str2.substring(0,gcd);
            }
        }
    }

    private static int gcdOfLength(int num1, int num2) {
        if(num2==0){
            return num1;
        }
        return gcdOfLength(num2,num1%num2);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC","ABC"));
        System.out.println(gcdOfStrings("ABABAB","ABAB"));
        System.out.println(gcdOfStrings("LEET","CODE"));
        System.out.println(gcdOfStrings("ABCDEF","ABC"));
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}
