import java.util.*;
class LinkedListPalindrome {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public boolean linkedListPalindrome(LinkedList head) {
        // we will go till middle and keep on reversing the list till middle throughout the way
        // and lastly the slow pointer will be at second 2 in the given testcase and prev will be at
        // first 2 and we will traverse them till null checking their specific values are same or not
        if(head == null) return true;
        LinkedList slow = head;
        LinkedList fast = head;
        LinkedList prev = null;
        LinkedList Next = null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            Next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = Next;
        }

        if(fast != null){
            slow = slow.next; // skip the middle node as it will be not equal to any node
        }

        while(prev!=null && slow!=null){
            if(prev.value != slow.value) return false;
            prev = prev.next;
            slow = slow.next;
        }
        return true;
    }
}
