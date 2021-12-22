#Remove loop from LinkedList

public ListNode removeLoop()
{
    ListNode fastptr = head;
    ListNode slowptr = head; 
    while(fastptr!=null && fastptr.next!=null)
    {
        fastptr = next.next;
        slowptr=next; 
        if(fastptr == slowptr)
        {
            removeLoop(slowPtr)
            return;
        }
    }
}

public void removeLoop(ListNode slowPtr)
{
    ListNode temp = head;
    while(slowPtr.next!=temp.next)
    {
        temp = temp.next;
        slowptr = slowptr.next
    }
    slowptr.next = null;
}
