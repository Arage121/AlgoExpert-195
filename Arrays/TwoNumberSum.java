import java.util.*;
public class TwoNumberSum {
    //avg O(nlog(n))
    public static int[] twoNumberSum(int[] arr, int targetSum) {
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            if(arr[s]+arr[e] == targetSum){
                return new int[] {arr[s], arr[e]};
            }else if(arr[s]+arr[e] < targetSum){
                s++;
            }else{
                e--;
            }
        }
        return new int[] {};
    }

    // worst case O(n^2)
    public static int[] twoNumberSum1(int[] arr, int targetSum) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    return new int[] {arr[i], arr[j]};
                }
            }
        }
        return new int[] {};
    }

    //best O(n)
    public static int[] twoNumberSum2(int[] array, int targetSum) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int num: array){
            int comp = targetSum-num;
            if(h.containsKey(comp)) return new int[] {comp, num};
            h.put(num, 1);
        }
        return new int[] {};
    }
}
