/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
    //    List<Integer> l1= new ArrayList<>();
    //    while(head!=null){
    //        l1.add(head.val);
    //        head=head.next;
    //    }
    //    int i=0;
    //    int j=l1.size()-1;
    //    while(i<j){
    //        if(l1.get(i)!=l1.get(j)) return false;
    //        i++;
    //        j--;
    //    }
    //    return true;
    ListNode slow=head;
    ListNode fast= head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    if(fast!=null) slow=slow.next;
    ListNode newHead= reverse(slow);
    while(newHead!=null){
        if(newHead.val!=head.val) return false;
        newHead=newHead.next;
        head=head.next;
    }
    return true;

}
private ListNode reverse(ListNode head){
    ListNode prev=null;
    while(head!=null){
        ListNode next = head.next;
       head.next=prev;
       prev=head;
       head=next; 
    }
    return prev;
}
}
