package leetcode.solutions.string;

public class Countvowels {
        public int countVowels(String s) {
            int count = 0;
            for (char c : s.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1) count++;
            }
            return count;
        }
    }

