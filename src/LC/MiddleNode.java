package LC;

/*
 @author Myvin Barboza
 08/04/20 9:30 PM


 */

   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

public class MiddleNode {
//123456

    static ListNode middleNode(ListNode head) {
        if(head==null ||head.next==null) return head;
        ListNode slow=head;
    ListNode fast=head;
    while( fast!=null &&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

    }
    return slow;
    }
        //1,2,3,4,5,6
     public static void main(String[] args) {
    ListNode n=new ListNode(1);
//    n.next=new ListNode(2);
//    n.next.next=new ListNode(3);
//    n.next.next.next=new ListNode(4);
//    n.next.next.next.next=new ListNode(5);
    //     n.next.next.next.next.next=new ListNode(6);
    ListNode head=middleNode(n);
    while(head!=null){
        System.out.println(head.val);
        head=head.next;
    }

    }
}