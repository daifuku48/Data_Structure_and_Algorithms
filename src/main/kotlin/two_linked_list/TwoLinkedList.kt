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
            var current = head
            if (isEmpty())
                return
            while (current?.next != null) {
                current = current.next
            }
            current?.prev?.next = null
        }

        override fun getElement(index: Int): T {
            var current = head
            if (isEmpty())
                throw ArrayIndexOutOfBoundsException()
            var count = 0
            while (current?.next != null) {
                if (count == index) {
                    return current.data
                }
                count++
                current = current.next
            }
            throw ArrayIndexOutOfBoundsException()
        }

        override fun deleteFirst() {
            if (isEmpty())
                return
            head = head?.next
            head?.prev = null
        }

        override fun deleteElement(index: Int) {
            var current = head
            if (isEmpty())
                return
            var count = 0
            while (current?.next != null && count != index) {
                count++
                current = current.next
            }
            if (count == index) {
                current?.prev?.next = current?.next
                current?.next?.prev = current?.prev
            }
        }

        override fun getFirst(): T {
            if (isEmpty())
                throw ArrayIndexOutOfBoundsException()
            return head?.data as T
        }

        override fun isEmpty() = head == null

        override fun getLast(): T {
            if (isEmpty())
                throw ArrayIndexOutOfBoundsException()
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            return current?.data as T
        }

        override fun insert(data: T) {
            val node = ListNode.Base(data)
            if (isEmpty()) {
                head = node
                return
            }
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = node
            node.prev = current
        }
    }
}