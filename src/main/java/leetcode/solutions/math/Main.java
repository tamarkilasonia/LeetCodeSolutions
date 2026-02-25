package leetcode.solutions.math;

import static leetcode.solutions.math.AddBinary.addBinary;
import static leetcode.solutions.math.SqrtX.mySqrt;

public class Main {
    public static void main(String[] args) {

        //ReverseInteger Day1
        ReverseInteger rev = new ReverseInteger();
        int result = rev.reverse(123);
        System.out.println(result);

        PalindromeNumber solution = new PalindromeNumber();

//Paliandrome Number Day1
        int test = 121;

        boolean isPaliandrome = solution.isPalindrome(test);

        System.out.println("Is palindrome: " + isPaliandrome);

        //Add Binary Day2
        String a1 = "11";
        String b1 = "1";
        System.out.println(addBinary(a1, b1)); // 100

        String a2 = "1010";
        String b2 = "1011";
        System.out.println(addBinary(a2, b2)); // 10101

        //SqrtX Day2
        System.out.println(mySqrt(4));  // 2
        System.out.println(mySqrt(8));  // 2
        System.out.println(mySqrt(16)); // 4
        System.out.println(mySqrt(1));  // 1
        System.out.println(mySqrt(0));  // 0
    }

}