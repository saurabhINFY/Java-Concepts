import java.util.Stack;

/*
Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
/*
    approach:-
    1.take a stack and traverse through the chars and ( or [ or { found push in stack
    2. while traversing if ] or } or ) found then if stack is empty return false else peek and check the pair if match pop from stack else return false
    3 after complete traversal return if stack is empty or not

 */
public class ValidParentheses {
    private static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        char[]charArr = str.toCharArray();
        for (char c : charArr) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if ((c == ')' || c == '}' || c == ']') && !stack.isEmpty()) {
                if ((stack.peek() == '(' && c == ')') || (stack.peek() == '{' && c == '}') || (stack.peek() == '[' && c == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[]input = new String[]{"()","){","()[]{}","(]"};
        for(String str: input){
            System.out.println(isValid(str));
        }
    }
}