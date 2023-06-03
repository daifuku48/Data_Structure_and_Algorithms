package two_linked_list

interface ListNode<T> {
    var data : T
    var prev : ListNode<T>?
    var next : ListNode<T>?

    class Base<T>(override var data: T) : ListNode<T>{
        override var prev: ListNode<T>? = null
        override var next: ListNode<T>? = null
    }
}