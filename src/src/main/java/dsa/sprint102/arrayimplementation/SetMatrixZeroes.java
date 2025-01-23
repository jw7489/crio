package dsa.sprint102.arrayimplementation;

import java.util.Scanner;
/*
Problem Description
Given an m x n matrix, if an element is 0, set its entire row and column to 0.
Do it in-place, that is, modify the same matrix. Do not create a new one.

Input format
First line contains 2 integers m,n - number of rows and columns respectively.
Next m lines contain space separated n integers.

Output format
Output the same matrix.

Sample Input 1
3 3
1 1 1
1 0 1
1 1 1

Sample Output 1
1 0 1
0 0 0
1 0 1

Explanation 1
There is one ‘0’ in the 2nd row and 2nd column, so all the elements in that row and column become 0.

Sample Input 2
3 4
0 1 2 0
3 4 5 2
1 3 1 5

Sample Output 2
0 0 0 0
0 4 5 0
0 3 1 0

Explanation 2
The 1st row, 1st column and 4th column all contain ‘0’, so all the values in these rows & columns become 0.

Constraints
M,N <= 500
 */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                matrix[i][j] = in.nextInt();
            }
        }

        in.close();
        new SetMatrixZeroes().setMatrixZeroes(matrix);

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public void setMatrixZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]!=0)
                    continue;
                rows[i]=true;
                cols[j]=true;
            }
        }

        for(int i=0;i<rows.length;i++){
            for(int j=0;j<cols.length;j++){
                if(rows[i]||cols[j])
                    matrix[i][j]=0;
            }
        }
    }
}
