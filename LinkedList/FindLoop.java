
public class FindLoop {
    public static LinkedList findLoop(LinkedList head) {
        LinkedList sp = head;
        LinkedList fp = head;

        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;

            if (sp == fp) {
                sp = head; // Reset the slow pointer to the head
                while (sp != fp) {
                    sp = sp.next;
                    fp = fp.next;
                }
                return sp; // Return the node where the loop starts
            }
        }

        return null; // No loop found
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}

