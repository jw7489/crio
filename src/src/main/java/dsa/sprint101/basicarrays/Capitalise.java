package dsa.sprint101.basicarrays;

import java.util.Scanner;

/*
Problem Description
Given a paragraph of words, capitalise the first character of each word and return the updated paragraph.

Note : No inbuilt function such as split() to be used.

Input format
One line of input which contains a string, the paragraph.

Output format
Return the paragraph after capitalising each word.

Sample Input 1
the quick Brown fox jumps over The lazy dog.

Sample Output 1
The Quick Brown Fox Jumps Over The Lazy Dog.

Explanation 1
The first letter of each word has been capitalised and other permitted characters(dot ‘.’) have remained the same.

Sample Input 2
the quick Brown .... fox jumps over The lazy dog

Sample Output 2
The Quick Brown .... Fox Jumps Over The Lazy Dog.

Explanation 2
The first letter of each word has been capitalised and other permitted characters(dot ‘.’) have remained the same.

Constraints
Length of paragraph < 100

The paragraph contains spaces, lowercase, uppercase characters and ‘.’.
 */
public class Capitalise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);
    }

    static String capitalise(String str) {

        char[] arr = str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(arr[i]==' ' || arr[i]=='.')
                continue;
            else if(i==0||arr[i-1]==' ')
                arr[i]=Character.toUpperCase(arr[i]);
        }
        return String.valueOf(arr);
    }
}
