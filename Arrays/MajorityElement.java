import java.util.*;
public class MajorityElement {
    public int majorityElement(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int val=-1;
        int maxFreq=0;
        for(int i: array){
            int count = map.getOrDefault(i,0)+1;
            map.put(i, count);

            if(count > maxFreq){
                maxFreq = count;
                val = i;
            }
        }
        return val;
    }
}
