package leetcode.solutions.string;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {


        List<String> result = new ArrayList<>();

        public List<String> restoreIpAddresses(String s) {
            backtrack(s, 0, new ArrayList<>());
            return result;
        }

        private void backtrack(String s, int index, List<String> path) {


            if (path.size() == 4) {
                if (index == s.length()) {
                    result.add(String.join(".", path));
                }
                return;
            }


            for (int len = 1; len <= 3; len++) {

                if (index + len > s.length()) break;

                String part = s.substring(index, index + len);

                if (isValid(part)) {
                    path.add(part);
                    backtrack(s, index + len, path);
                    path.remove(path.size() - 1);
                }
            }
        }

        private boolean isValid(String part) {


            if (part.length() > 1 && part.startsWith("0")) {
                return false;
            }

            int val = Integer.parseInt(part);

            return val >= 0 && val <= 255;
        }
    }
