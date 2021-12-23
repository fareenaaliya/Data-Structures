#Merge Two Sorted LinkedLists

public ListNode mergeTwoSortedLinkedList(ListNode a, ListNode b)
{
    ListNode dummy = new ListNode(0);
    ListNode tail=dummy;
    while(a!=null && b!= null)
    {
        if(a.data<=b.data)
        {
            tail.next=a;
            a=a.next;
        }
        else
        {
            tail.next = b;
            b=b.next;
        }
        tail=tail.next;
    }
    if(a==null)
    {
        tail.next=b;
    }
    else
    {
        tail.next=a;
    }
    return dummy.next;
}
