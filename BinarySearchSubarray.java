public class BinarySearchSubarray {
    int binarySearchSubarray(int[] arr, int target, int start, int end) {
        int s = start, e = end;
        while (s <= e) {
            int m = s + (e - s) / 2;
 
            // Check if x is present at mid
            if (arr[m] == target)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < target)
                s = m + 1;
 
            // If x is smaller, ignore right half
            else
                e = m - 1;
        }
 
        // If we reach here, then element was
        // not present
        return -1;
    }
}
