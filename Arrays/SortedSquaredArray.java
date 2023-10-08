import java.util.Arrays;

public class SortedSquaredArray {
    // avg O(nlog(n))
    public int[] sortedSquaredArray(int[] array) {
        for(int i=0;i<array.length;i++){
            array[i] = array[i]*array[i];
        }
        Arrays.sort(array);
        return array;
    }

    // best O(n)
    public int[] sortedSquaredArray1(int[] array) {
        int[] result = new int[array.length];
        int left = 0;
        int right = array.length - 1;
        int index = array.length - 1;

        while (left <= right) {
            int leftValue = array[left];
            int rightValue = array[right];

            if (Math.abs(leftValue) > Math.abs(rightValue)) {
                result[index] = leftValue * leftValue;
                left++;
            } else {
                result[index] = rightValue * rightValue;
                right--;
            }
            index--;
        }

        return result;
    }
}
