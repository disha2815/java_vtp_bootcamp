package DAY5;

public class demo {
    public static int minimumCapacity(int[] workloads, int deadline) {
int left = 0;
for(int workload : workloads) {
    left = Math.max(left, workload);
    }
    int right = 0;
    for(int workload : workloads) {
        right += workload;
    }
    int answer = right;
    while(left <= right) {
        int mid = left + (right - left) / 2; 
        if(isPossible(workloads, deadline, mid)) {
            answer = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return answer;
}   
   private static boolean isPossible(int[] workloads, int deadline, int capacity) {
    int days = 1;
    int currentLoad = 0;

    for (int workload : workloads) {
        if (currentLoad + workload <= capacity) {
            currentLoad += workload;
        } else {
            days++;
            currentLoad = workload;

            if (days > deadline) {
                return false;
            }
        }
    }

    return true;
}
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,7,9,11,23};
        int target = 9;
       int low = 0, high = arr.length -1;
       while(low< high) {
        int mid = low + (high - low) / 2;
        if(arr[mid] <= target) {
            high = mid;
       }     else {
        low = mid+1;
       }
    }
    System.err.println("low: " + low);
}
}