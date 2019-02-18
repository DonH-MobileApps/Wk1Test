package com.example.wk1test;






import java.util.Arrays;



// problem 2 source code

class Palindrome
{
    // A recursive function that check a str(s..e) is
    // palindrome or not.
    static boolean isPalRec(String word,
                            int s, int e)
    {
        // If there is only one character
        if (s == e)
            return true;

        // If first and last characters do not match
        if ((word.charAt(s)) != (word.charAt(e)))
            return false;

        // If there are more than two characters, check if
        // middle substring is also palindrome or not.
        if (s < e + 1)
            return isPalRec(word, s + 1, e - 1);

        return true;
    }

    static boolean checkPalindrome(String word)
    {
        int n = word.length();

        // An empty string is
        // considered as palindrome
        if (n == 0)
            return true;

        return isPalRec(word, 0, n - 1);
    }

    // Driver Code
    public static void main(String args[])
    {

        String str = "level";


        if (checkPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// problem 3 source code
class FizzBuzz
{
    public static void main(String args[])
    {
        int n = 100;

        // loop for 100 times
        for (int i=1; i<=n; i++)
        {
            if (i%15==0)
                System.out.print("FizzBuzz"+" ");
                // number divisible by 5, print 'Buzz'
                // in place of the number
            else if (i%5==0)
                System.out.print("Buzz"+" ");

                // number divisible by 3, print 'Fizz'
                // in place of the number
            else if (i%3==0)
                System.out.print("Fizz"+" ");

                // number divisible by 15(divisible by
                // both 3 & 5), print 'FizzBuzz' in
                // place of the number

            else // print the numbers
                System.out.print(i+" ");
        }
    }
}


// problem 4 source code

class isAnagram {


    static boolean areAnagram(char[] str1, char[] str2)
    {

        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    /* Driver program to test to print printDups*/
    public static void main(String args[])
    {
        char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 'b', 'e', 's', 't' };
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }
}



public class MainActivity {






    // problem 5 source code

       public static void main(String[] args) {
           int tableSize = 10;
           printMultiplicationTable(tableSize);

        }



        private static void printMultiplicationTable(int tableSize) {

            // first print the top header row
            System.out.format("      ");
            for(int i = 1; i<=tableSize;i++ ) {
                System.out.format("%4d",i);

            }

            System.out.println();
            System.out.println("      ----------------------------------------");



            for(int i = 0 ;i<=tableSize;i++) {

                // print left most column first
                System.out.format("%4d |",i);
                for(int j=1;j<=tableSize;j++) {
                    System.out.format("%4d",i*j);

                }
                 System.out.println();

            }




       }



}



