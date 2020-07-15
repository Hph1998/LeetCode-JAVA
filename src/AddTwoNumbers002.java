import java.util.List;

public class AddTwoNumbers002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        int jw=0;//½øÎ»
        while(l1!=null||l2!=null||jw!=0){
            int var1 = l1==null?0:l1.val;
            int var2 = l2==null?0:l2.val;
            int temp = var1+var2+jw;
            head.next = new ListNode(temp%10);
            jw = temp/10;
            head=head.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null) {
                l2 = l2.next;
            }
        }
        return res.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
