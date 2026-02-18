package leetcode.solutions.math;

public class ExcelSheetColumnTitle {
        public String convertToTitle(int columnNumber) {
            StringBuilder sb = new StringBuilder();

            while (columnNumber > 0) {
                columnNumber--; // critical step
                int rem = columnNumber % 26;
                sb.append((char) ('A' + rem));
                columnNumber /= 26;
            }

            return sb.reverse().toString();
        }
    }
