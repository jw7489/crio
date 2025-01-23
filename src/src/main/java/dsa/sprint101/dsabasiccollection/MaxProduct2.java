package dsa.sprint101.dsabasiccollection;

import java.util.Scanner;

/*
Problem Description
Given the array of integers nums of size n, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

Input format
First line contains n, the number of distinct integers.
Second line contains n space separated integers.
Output format
Print the maximum product.
Sample Input 1
4
3 4 5 2
Sample Output 1
12
Explanation
If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)(nums[2]-1) = (4-1)(5-1) = 3*4 = 12.
Sample Input 2
4
1 5 4 5
Sample Output 2
16
Explanation
Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Constraints
2 <= n <= 500
1 <= nums[i] <= 10^3
 */
public class MaxProduct2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums[] = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();

        int res = maxProduct2(n,nums);
        System.out.println(res);
    }

    static int maxProduct2(int n,int nums[]){
        int big=0;
        for(int i =0; i<n;i++){
            for(int j=i+1;j<n;j++){
                int product=(nums[i]-1)*(nums[j]-1);
                if(product>big){
                    big=product;
                }
            }
        }
        return big;
    }
}
