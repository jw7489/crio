package dsa.sprint101.basicarrays;

import java.util.Scanner;

/*
Problem Description
Given a matrix of dimensions n x n having elements 1 to n*n distinct elements, check whether the matrix is magic square or not.

Magic square is a square that has the same sum along all rows, columns and diagonals.

Input format
There are n + 1 lines of input.

First line contains integer n.

The next n lines contain n space separated elements.

Output format
Print "Yes" if it is a magic square , "No" otherwise.

Sample Input 1
3

4 9 2

3 5 7

8 1 6

Sample Output 1
Yes

Explanation 1
All rows, columns and diagonals have sum 15.

Constraints
1 <= n <= 100

1 <= element of matrix <= n x n
 */
public class CheckMagicSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String checkMagicSquare(int n, int[][] grid) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=grid[i][0];
        }

        for(int j=1;j<n;j++){
            int nSum =0;
            for(int i=0;i<n;i++){
                nSum+=grid[i][j];
            }
            if(nSum!=sum){
                return "No";
            }
        }
        for(int i=0;i<n;i++){
            int nSum=0;
            for(int j=0;j<n;j++){
                nSum+=grid[i][j];
            }
            if(nSum!=sum){
                return "No";
            }
        }
        int nSum=0;
        for(int i=0;i<n;i++){
            nSum+=grid[i][i];
        }
        if(nSum!=sum){
            return "No";
        }
        int jSum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    jSum+=grid[i][j];
                }
            }
        }
        if(jSum!=sum){
            return "No";
        }
        return "Yes";
    }
}
