public  static ListNode  allNodes(ListNode head){
        Set<Integer> hSet= new HashSet<>();
        ListNode p = head;
        ListNode prev = head;
        hSet.add(p.val);
        while(p!=null){
            if(hSet.add(p.val)){
                prev.next=p;
                prev=prev.next;
            }
            p=p.next;
        }
    return head;
    }
    
    public static void main(String[] args) {
       ListNode head = new ListNode(3);
       ListNode l1= new ListNode(4);
       head.next=l1;
        ListNode l2= new ListNode(3);
        l1.next=l2;
        ListNode l3= new ListNode(2);
        l2.next=l3;
        ListNode l4= new ListNode(6);
        l3.next=l4;
        ListNode l5= new ListNode(1);
        l4.next=l5;
        ListNode l6= new ListNode(2);
        l5.next=l6;
        ListNode l7= new ListNode(6);
        l5.next=l7;
        allNodes(head);

    }
