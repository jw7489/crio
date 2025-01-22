package dsa.sprint101.basicarrays;

import java.util.Scanner;

/*
Problem Description
Given an array of n integers and an integer k, rotate the array k times in clockwise order.

Input format
There are three lines of input.

First line contains integer n.

Next line contains n space separated integers.

Next line contains the value of k.

Output format
Print the rotated array.

Sample Input 1
5

1 2 3 4 5

2

Sample Output 1
4 5 1 2 3

Explanation 1
After first rotation array will be 5 1 2 3 4

After second rotation array will be 4 5 1 2 3

Constraints
1 <= n <= 100000

1 <= element of array <= 100000

0 <= k <= 100000
 */
public class CyclicRotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int rotatedArr[] = cyclicRotation(n, arr, k);

        for (int j : rotatedArr)
            System.out.print(j + " ");

    }

    static int[] cyclicRotation(int n, int[] arr, int k) {
        int temp;
        for(int l=0;l<k;l++){
            int last=arr[n-1];
            for(int i=n-2;i>=1;i--){
                arr[i+1]=arr[i];
                arr[i]=arr[i-1];
            }
            arr[0]=last;
        }

        return arr;
    }
}
