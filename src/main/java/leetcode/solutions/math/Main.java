package leetcode.solutions.math;

public class Main {
    public static void main(String[] args) {
        //ReverseInteger Day1
        ReverseInteger rev = new ReverseInteger();
        int result = rev.reverse(123);
        System.out.println(result);

        PalindromeNumber solution = new PalindromeNumber();

//
        int test = 121;

        boolean isPaliandrome = solution.isPalindrome(test);

        System.out.println("Is palindrome: " + isPaliandrome);
    }

}