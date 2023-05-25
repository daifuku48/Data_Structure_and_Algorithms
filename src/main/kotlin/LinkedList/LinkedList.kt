package LinkedList

class LinkedList<T>() {
    private var head : ListNode<T>? = null
    private var last : ListNode<T>? = null

    fun isEmpty() = head == null

    fun add(data: T) {
        val p = ListNode(data)
        if (isEmpty()) {
            head = p
            last = p
            return
        }
        last?.next = p
        last = p
    }

    fun removeFirst()
    {
        if (isEmpty()) return
        val value = head
        head = value?.next
    }


    fun print()
    {
        if (isEmpty()) return
        var first = head
        while(first != null)
        {
            print(first.data.toString() + " ")
            first = first.next
        }
    }
}