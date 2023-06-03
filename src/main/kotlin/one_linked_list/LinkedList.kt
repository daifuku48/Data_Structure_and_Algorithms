package one_linked_list


interface LinkedList<T> {

    fun isEmpty() : Boolean
    fun add(data: T)
    fun removeFirst()
    fun removeLast()
    fun print()
    fun getElement(index: Int) : T

    class Base<T>() : LinkedList<T> {
        var head: ListNode.Base<T>? = null
        var last: ListNode.Base<T>? = null

        override fun isEmpty() = head == null

        override fun add(data: T) {
            val p = ListNode.Base(data)
            if (isEmpty()) {
                head = p
                last = p
                return
            }
            last?.next = p
            last = p
        }

        override fun removeLast(){
            if (isEmpty()) return

            if (head?.next == null)
            {
                head = null
            }

            var current = head

            while(current?.next?.next != null)
            {
                current = current.next as ListNode.Base<T>?
            }
            current?.next = null
        }


        override fun getElement(index: Int) : T{
            var current = head
            var currentIndex = 0

            while (current != null && currentIndex < index) {
                current = current.next as ListNode.Base<T>?
                currentIndex++
            }

            return current?.data as T
        }

        override fun removeFirst()
        {
            if (isEmpty()) return
            val value = head
            head = value?.next as ListNode.Base<T>?
        }

        fun size() : Int{
            if (isEmpty()) return 0
            if (head?.next == null) return 1
            var size = 0
            var current = head
            while(current != null)
            {
                current = current.next as ListNode.Base<T>?
                size += 1
            }
            return size
        }

        override fun print()
        {
            if (isEmpty()) return
            var first = head
            while(first != null)
            {
                print(first.data.toString() + " ")
                first = first.next as ListNode.Base<T>?
            }
        }
    }
}

