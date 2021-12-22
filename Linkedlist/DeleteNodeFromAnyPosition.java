#Delete a node from Singly Linked List at a given position

public void DeleteAnyNode(int position)
{
    if(position == 1)
    {
        head=head.next;
    }
    else
    {
        ListNode previous = head;
        int count = 1;
        while(count<position-1)
        {
            previous = previous.next;
            count++;
        }
    ListNode current = previous.next;
    previous.next = current.next;
    }
}
