package dsa.sprint101.dsabasiccollection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
Problem Description
There is an array of N elements. Perform the following operation until there are one or no elements left in the array :
Remove the largest and second largest element from the array and insert their absolute difference back in the array.

Input format
There are two lines of input.
First line contains N, the number of elements.
Second line contains N space separated integers.
Output format
Print the last element left in the array.

Sample Input 1
5
2 1 11 13 7
Sample Output 1
2
Constraints
1 <= N <= 10^5
1 <= A[i] <= 10^9
 */
public class ReduceArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = reduceArray(n, a);
        System.out.println(ans);
    }

    static int reduceArray(int n, int a[]){
        Queue<Integer> q=new PriorityQueue<>();
        for(int i=0; i<n;i++){
            q.add(a[i]);
        }
        for(int i=1; i<n; i++){
            System.out.println("hi "+ (q.poll()-q.poll()));
            q.add(q.poll()-q.poll());
        }
        return q.poll();
    }
}
