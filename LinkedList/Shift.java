class Shift {//O(n)
  public static LinkedList shiftLinkedList(LinkedList head, int k) {
    if(head == null || k == 0) return head;
    int n = length(head);
     k = k%n;
     if(k<0) k+=n;
    LinkedList fp = head; // took two pointers first and second
    LinkedList sp = head;
    for(int i=0;i<k;i++){
      sp = sp.next;
    }

    while(sp.next!=null){
      fp = fp.next;
      sp = sp.next;
    }

    sp.next = head;
    head = fp.next;
    fp.next = null;

    return head;
  }

  public static int length(LinkedList head){
    LinkedList curr = head;
    int count=0;
    while(curr!=null){
      count++;
      curr = curr.next;
    }
    return count;
  }

  static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      next = null;
    }
  }

  //second approach
  //O(n^2) brute force
  public static LinkedList shiftLinkedList1(LinkedList head, int k) {
    LinkedList temp = head;
    int length = getLength(head);
    k = k % length; // Ensure k is within the range of the list length
    if (k < 0) {
      k += length; // Convert negative k to its equivalent positive value
    }

    while(k > 0){
      LinkedList tail = findTail(head);
      LinkedList prev = findPrev(head, tail);
      prev.next = null;
      tail.next = head;
      head = tail;
      k--;
    }
    return head;
  }

  public static int getLength(LinkedList head){
    LinkedList temp = head;
    int length = 0;
    while(temp!=null){
      length++;
      temp = temp.next;
    }
    return length;
  }

  public static LinkedList findTail(LinkedList head){
    LinkedList node = head;
    while(node.next != null){
      node = node.next;
    }
    return node;
  }

  public static LinkedList findPrev(LinkedList head, LinkedList tail){
    LinkedList prev = head;
    while(prev.next != tail){
      prev = prev.next;
    }
    return prev;
  }
}
