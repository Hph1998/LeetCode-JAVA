public class MergeTwoLists021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null){//l1空直接返回l2
            return l2;
        }
        if(l2==null){//l2空直接返回l1
            return l1;
        }
        ListNode res = new ListNode();
        ListNode head = res;//保留第一个结点

        while(l1!=null&&l2!=null){//l1、l2都不为空，进行比较，head创建小的结点
            if(l1.val>l2.val){
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }else{
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            head=head.next;
        }
        if(l1==null){//剩余的l2加入head
            while(l2!=null){
                head.next = new ListNode(l2.val);
                l2 = l2.next;
                head=head.next;
            }
        }
        if(l2==null){//剩余的l1加入head
            while(l1!=null){
                head.next = new ListNode(l1.val);
                l1 = l1.next;
                head=head.next;
            }
        }
        return res.next;
    }

}
