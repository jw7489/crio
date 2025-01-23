package dsa.sprint101.dsabasiccollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
Problem Description
Given a string S containing the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
For an input string to be valid:
Open brackets must be closed by the same type of brackets.( can be closed by ) only
Open brackets must be closed in the correct order. ([]) is valid, ([)] is not.
Note: An empty string is also considered valid.

Input format
One line containing a string with a bracket sequence.

Output format
Return "true" if balanced, false otherwise.

Constraints
0 <= | S | <= 10^5

Sample Input 1
()[]{}
Sample Output 1
true
Explanation 1
The given sequence of brackets is valid as per the rules specified.

Sample Input 2
([)]
Sample Output 2
false
Explanation 2
The given sequence of brackets is invalid as per the rules specified.
 */
public class ValidParenthesis {

    public String isValid(String s) {
        Stack st = new Stack();
        st.push('?');
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('||s.charAt(i) == '{'||s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && (char)st.pop() != '('){
                return "false";
            }
            else if(s.charAt(i) == '}' && (char)st.pop() != '{'){
                return "false";
            }
            else if(s.charAt(i) == ']' && (char)st.pop() != '['){
                return "false";
            }
        }
        if(st.size()==1){
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = in.readLine();
        String result = new ValidParenthesis().isValid(parenthesis);
        System.out.print(String.valueOf(result));
    }
}
