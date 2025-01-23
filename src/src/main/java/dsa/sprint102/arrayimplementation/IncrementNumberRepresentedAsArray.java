package dsa.sprint102.arrayimplementation;

import java.util.Scanner;

/*
Problem Description
Given a number represented as an array of digits, increment the number by 1, and return the resulting sum as an array.

Input format
There are two lines of input.

First line will contain a single integer N .

Next line will contain N space separated integers for Array A.

Output format
Single integer which will be the incremented number.

Sample Input 1
3

1 1 1

Sample Output 1
112

Explanation
111 + 1 = 112

Constraints
0<=Ai<10

Most significant value will be non-zero in the array.

1<=N<=5000
 */
public class IncrementNumberRepresentedAsArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        int incArr[] = incrementNumber(n, arr);

        for(int i=0;i<incArr.length;i++) {
            System.out.print(incArr[i]);
        }
    }

    static int[] incrementNumber(int n, int arr[]){

        for(int i=n-1;i>=0;i--){
            if(arr[i]!=9)
            {
                arr[i]+=1;
                return arr;
            }
            arr[i]=0;
        }

        int[] nines = new int[n+1];
        nines[0]=1;
        return nines;
    }
}
