package linked_list


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

        }


        override fun getElement(index: Int) : T{

            return head?.data!!
        }

        override fun removeFirst()
        {
            if (isEmpty()) return
            val value = head
            head = value?.next as ListNode.Base<T>?
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

