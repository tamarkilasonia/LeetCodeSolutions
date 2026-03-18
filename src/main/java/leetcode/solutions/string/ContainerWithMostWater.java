package leetcode.solutions.string;

public class ContainerWithMostWater {

        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int max = 0;

            while (left < right) {
                int h = Math.min(height[left], height[right]);
                int width = right - left;
                int area = h * width;

                max = Math.max(max, area);

                // Move the smaller height
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return max;
        }
    }
