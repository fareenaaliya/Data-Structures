#Detect loop in LinkedList

public ListNode DetectLoopInLinkedList()
{
    ListNode slowptr = head;
    ListNode fastptr = head;
    while(fastptr!=null & fastptr.next!=null)
    {
        slowptr=slowptr.next;
        fastptr=fastptr.next.next;
        if(fastptr==slowptr)
        {
            return true;
        }
    }
    return false;
}
