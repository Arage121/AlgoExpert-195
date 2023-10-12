import java.util.*;

public class MergeLinkedLists {
    // This is an input class. Do not edit.
    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList mergeLinkedLists(
            LinkedList head1, LinkedList head2
    ) {
        LinkedList dummy = new LinkedList(0);
        LinkedList curr = dummy;
        while(head1!=null && head2!=null){
            if(head1.value < head2.value){
                curr.next = head1;
                head1 = head1.next;
            }else{
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if(head1!=null){
            curr.next = head1;
        }else{
            curr.next = head2;
        }
        return dummy.next;
    }
}
