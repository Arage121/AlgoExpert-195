public class RemoveKthNodeFromEnd {
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        int count = 0;
        LinkedList curr = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        // Check if k is equal to the length of the list (edge case).When k is equal to the length
        // of the list, you should remove the head of the list and update the head to the next node.
        if (k == count) {
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }

        curr = head;
        for(int i=0;i<count-k-1;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
