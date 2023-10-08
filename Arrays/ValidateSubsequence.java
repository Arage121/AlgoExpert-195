import java.util.*;
public class ValidateSubsequence {
    // best case soln O(n)
    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        int Ai=0;
        int Si=0;
        while(Ai<array.size() && Si<sequence.size()){
            if(array.get(Ai).equals(sequence.get(Si))){
                Si++;
            }
            Ai++;
        }
        return Si == sequence.size();
    }
}
