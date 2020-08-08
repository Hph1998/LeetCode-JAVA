public class RemoveNthFromEnd019 {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(-1);
        res.next = head;//指向头结点 return
        ListNode first = res;//采用双指针，移动相同的距离
        ListNode second = res;//当first为最后一个节点是 second则是结点n的前一个结点
        for(int i=0;i<n;i++){//先让first指向第n个结点
            first = first.next;
        }
        while(first.next!=null){//一起移动
            first=first.next;
            second=second.next;
        }
        second.next = second.next.next;//去掉结点n
        return res.next;
    }

}



