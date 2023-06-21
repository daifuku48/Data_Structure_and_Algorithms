

interface Stack<T>{
    fun push(item: T)
    fun pop(): T
    fun peek(): T
    fun isEmpty(): Boolean
    fun size(): Int
    class Base<T> : Stack<T>{

        private val stackArray: MutableList<T> = mutableListOf()
        override fun push(item: T) {
            stackArray.add(T)
        }

        override fun pop(): T {
            if (isEmpty())
                throw NoSuchElementException("Stack is empty.")
            stackArray.remove(stackArray.size - 1)
        }

        override fun peek(): T {
            if (isEmpty())
                throw NoSuchElementException("Stack is empty.")
            return stackArray[stackArray.size - 1]
        }

        fun isEmpty() = stackArray.size == 0

        fun size() = stackArray.size
    }
}