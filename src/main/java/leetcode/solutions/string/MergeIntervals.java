package leetcode.solutions.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (result.isEmpty()) {
                result.add(interval);
            } else {
                int[] last = result.get(result.size() - 1);


                if (interval[0] <= last[1]) {

                    last[1] = Math.max(last[1], interval[1]);
                } else {
                    result.add(interval);
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}