package DAY5;

public class coff {

    public static int minimumCoffeeSpeed(int[] coffee, int breakTime) {
        int left = 1;
        int right = 0;

        // Maximum coffee required by any developer
        for (int cups : coffee) {
            right = Math.max(right, cups);
        }

        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPossible(coffee, breakTime, mid)) {
                answer = mid;
                right = mid - 1; // Try a smaller speed
            } else {
                left = mid + 1; // Increase the speed
            }
        }

        return answer;
    }

    private static boolean isPossible(int[] coffee, int breakTime, int speed) {
        int totalTime = 0;

        for (int cups : coffee) {
            // ceil(cups / speed)
            totalTime += (cups + speed - 1) / speed;

            if (totalTime > breakTime) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] coffee = {3, 6, 7, 11};
        int breakTime = 15;

        System.out.println(minimumCoffeeSpeed(coffee, breakTime)); // Output: 2
    }
}