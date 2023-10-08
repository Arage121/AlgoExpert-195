public class RemoveDuplicates {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList head) {
        if(head == null) return head;
        LinkedList curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.value == curr.next.value) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
    }
}
