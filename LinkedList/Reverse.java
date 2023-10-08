public class Reverse {
    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList curr = head;
        LinkedList prev = null;
        while(curr!=null){
            LinkedList newNext = curr.next;
            curr.next = prev;

            prev = curr;
            curr = newNext;
        }
        return prev;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
