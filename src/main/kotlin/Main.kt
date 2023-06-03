import one_linked_list.LinkedList

fun main() {
    val list = LinkedList.Base<Int>()
    list.add(4)
    list.add(3)
    list.add(1)
    list.removeFirst()
    list.print()
}