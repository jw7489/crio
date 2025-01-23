package dsa.sprint101.dsabasiccollection;

import java.util.Scanner;
import java.util.Stack;

/*
Problem Description
Postfix expressions are an ordering of mathematical operations, where the operator(+,-,* etc) comes after the operands.
For instance, an operation 2 + 3 (infix notation, which humans use) will be represented as 2 3 + in postfix notation. The computers can understand postfix notation.
Your job is to evaluate the given postfix expression. The expression is given as a string where each token is separated by a space.
The possible operators can be +, - and *
Note that all operands(numbers) are assumed to be non-negative.

Input format
One line of input, containing the string S.

Output format
Print the result of the given expression

Sample Input 1
2 3 +
Sample Output 1
5
Explanation 1
3 + 2 = 5

Sample Input 2
2 3 1 * + 9 -
Sample Output 2
-4
Explanation 2
If the expression is converted into an infix expression, it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.

Constraints
1 <= |S| <= 100
S[i] >= 0, where S[i] is an operand in the expression
 */
public class PostfixExpression {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    static int postfixExpression(String exp) {

        String[] sArray = exp.split(" ");
        Stack<Integer> st=new Stack<Integer>();
        for(String ch: sArray){
            if(ch.equals("+")){
                int y = st.pop();
                int x = st.pop();
                st.push(x+y);
            }
            else if(ch.equals("*")){
                int y = st.pop();
                int x = st.pop();
                st.push(x*y);
            }
            else if(ch.equals("-")){
                int y = st.pop();
                int x = st.pop();
                st.push(x-y);
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}
