#Search a key from given Linked List - Floyds cycle detection Algo

public Boolean SearchAnElement(int element)
{
    LinkedList current = head;
    while(current!=null)
    {
        if(current.data == element)
        {
            return true;
        }
        current = current.next;
    }
    return false;
}
