package two_linked_list

interface TwoLinkedList<T> {
    var head : ListNode<T>?
    var prev : ListNode<T>?
    var next : ListNode<T>?
    fun insert(data: T)
    fun deleteLast()
    fun getElement(index: Int) : T
    fun deleteFirst()
    fun deleteElement(index: Int)
    fun getFirst() : T
    fun getLast() : T
    fun isEmpty() : Boolean
    class Base<T> : TwoLinkedList<T> {
        override var head : ListNode<T>? = null
        override var next: ListNode<T>? = null
        override var prev: ListNode<T>? = null

        override fun deleteLast() {
            TODO("Not yet implemented")
        }

        override fun getElement(index: Int): T {
            TODO("Not yet implemented")
        }

        override fun deleteFirst() {
            var current = head
            if (isEmpty())
                return
            current = current?.next
        }

        override fun deleteElement(index: Int) {
            var current = head
            if (isEmpty())
                return
            var count = 0
            while(current?.next != null || count != index) {
                if (count == index)
                {
                    var prevv = current?.prev
                    var next = current?.next
                }
            }
        }

        override fun getFirst(): T {
            return head?.data as T
        }

        override fun isEmpty() = head == null

        override fun getLast(): T {
            var current = head
            while(current?.next != null)
            {
                current = current.next
            }
            return current?.data as T
        }

        override fun insert(data: T) {
            val node = ListNode.Base(data)
            if (isEmpty())
            {
                head = node
                return
            }
            var current = head
            while (current?.next != null)
            {
                if (current.next == null)
                {
                    current.next = ListNode.Base(data)
                    break
                }
                current = current.next
            }
        }
    }
}