package dsa.sprint101.basicarrays;

import java.util.Scanner;

/*
Problem Description
You are given a positive integer 'N'. You have to find the sum of first 'N' natural numbers.

Input format
First line contains an integer - N.

Output format
Print the sum of first N natural numbers.

Sample Input 1
10

Sample Output 1
55

Explanation
1+2+3+4+5+6+7+8+9+10 = 55

Constraints
1 <= N <= 10^4
 */
public class NaturalSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = naturalSum(n);
        System.out.println(res);
    }

    static int naturalSum(int n){
        int sum=0;
        for(int i=n;i>0;i--){
            sum+=i;
        }
        return sum;
    }
}
