public class MontonicArray {
    public static boolean isMonotonic(int[] array) {
        if (array.length <= 1) return true;

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                isDecreasing = false;
            } else if (array[i - 1] > array[i]) {
                isIncreasing = false;
            }

            // If both flags become false, the array is neither increasing nor decreasing, so return false.
            if (!isIncreasing && !isDecreasing) {
                return false;
            }
        }

        return true;
    }
}
