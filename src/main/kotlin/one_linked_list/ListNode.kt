package one_linked_list

interface ListNode<T>
{
    var data: T
    var next : ListNode<T>?
    class Base<T>(override var data: T) : ListNode<T>{
        override var next: ListNode<T>? = null
    }

}


