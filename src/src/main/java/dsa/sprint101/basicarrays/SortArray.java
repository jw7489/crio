package dsa.sprint101.basicarrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Problem Description
Given an array of n strings, sort the array in lexicographical order.

Lexicographical order is the order in which words appear in a dictionary.

Input format
There are two lines of input.

First line contains integer n.

Next line contains n space separated strings.

Output format
Print the sorted array.

Sample Input 1
4

abc abd ab a

Sample Output 1
a ab abc abd

Constraints
1 <= n <= 10000

Strings contain only lowercase english alphabet.

Each string will have length no more than 15.
 */
public class SortArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();

        String sortedArr[] = sortArray(n, arr);

        for (String word : sortedArr)
            System.out.print(word + " ");
    }

    static String[] sortArray(int n, String[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
