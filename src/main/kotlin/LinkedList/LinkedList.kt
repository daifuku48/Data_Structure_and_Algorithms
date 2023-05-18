package LinkedList

class LinkedList<T>() {
    private var head : ListNode<T>? = null

    fun add(data: T)
    {
        head?.data = data
        head = head?.next
    }



}