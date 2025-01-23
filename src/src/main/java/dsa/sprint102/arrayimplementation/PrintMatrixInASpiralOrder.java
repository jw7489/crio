package dsa.sprint102.arrayimplementation;

import java.util.Scanner;

/*
Given an integer A, generate a square matrix filled with elements from 1 to A*A in spiral order. The spiral order will be clockwise in nature starting from (0,0)

Input format
One line of input, containing a single integer A.

Output format
Print a 2-d matrix of size A x A satisfying the spiral order.

Sample Input 1
3

Sample Output 1
1 2 3

8 9 4

7 6 5

Explanation
As you can see the matrix goes spirally with each next position incremented by one.

Constraints
1<=A<=1000


 */
public class PrintMatrixInASpiralOrder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[][] = spiralMatrixII(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiralMatrixII(int n) {
        int first_row=0;
        int first_col=0;
        int last_row=n-1;
        int last_col=n-1;
        int count = 1;

        int[][] arr = new int[n][n];
        while(count<=n*n){
            for(int i=first_col;i<=last_col;i++){
                arr[first_row][i]=count++;
            }
            first_row++;

            for(int i=first_row;i<=last_row;i++){
                arr[i][last_col]=count++;
            }
            last_col--;

            for(int i=last_col;i>=first_col;i--){
                arr[last_row][i]=count++;
            }
            last_row--;

            for(int i=last_row;i>=first_row;i--){
                arr[i][first_col]=count++;
            }
            first_col++;
        }
        return arr;
    }
}
