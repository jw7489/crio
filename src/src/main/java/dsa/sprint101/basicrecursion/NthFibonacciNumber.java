package dsa.sprint101.basicrecursion;

import java.util.Scanner;

/*
Problem Description
Given an integer n, you have to find the nth fibonacci number. The fibonacci sequence is given by 0,1,1,2,3,5,8,... where 0 and 1 are the 0th and 1st fibonacci numbers respectively and every consecutive number is the sum of the previous two numbers in the sequence.
Input format
There is one line of input, containing an integer n.
Output format
Print the nth fibonacci number.

Sample Input 1
3
Sample Output 1
2
Explanation 1
3rd fibonacci number is equal to the sum of 1st and 2nd fibonacci numbers i.e. 1 + 1 = 2.
Constraints
0 <= n <= 20
 */
public class NthFibonacciNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = nthFibonacciNumber(n);
        System.out.println(ans);
    }

    static int nthFibonacciNumber( int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return nthFibonacciNumber(n-1)+nthFibonacciNumber(n-2);
    }
}
