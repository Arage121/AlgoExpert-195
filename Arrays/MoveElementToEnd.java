import java.util.*;
public class MoveElementToEnd {
    // O(n)
    public static List<Integer> moveElementToEnd(
            List<Integer> array, int toMove
    ) {
        int s=0;
        int e=array.size()-1;
        while(s<e){
            while(s<e && array.get(e) == toMove){
                e--; // decrease the end if it is equal to toMove value
            }
            if(array.get(s) == toMove){
                int temp = array.get(s);
                array.set(s, array.get(e));
                array.set(e, temp);
            }
            s++;
        }
        return array;
    }
}
