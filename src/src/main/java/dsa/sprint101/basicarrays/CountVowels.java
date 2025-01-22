package dsa.sprint101.basicarrays;

import java.util.Scanner;

/*
Problem Description
Given a string, count the total number of vowels present in that string.

Note: The string contains uppercase and lowercase english alphabets only.

Input format
One line of input, which contains the given string.

Output format
Print the total number of vowels.

Sample Input 1
language

Sample Output 1
4

Explanation 1
There are a total of 4 vowels in the string "language" i.e. 'a', 'u', 'a', 'e'.

Constraints
0 < Length of string < 100
 */
public class CountVowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
    }

    static int countVowels(String str) {
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.toLowerCase().charAt(i)=='a' || str.toLowerCase().charAt(i)=='e' || str.toLowerCase().charAt(i)=='i' || str.toLowerCase().charAt(i)=='o' || str.toLowerCase().charAt(i)=='u')
                count++;
        }
        return count;
    }
}
