import LinkedList.LinkedList

fun main() {
    val list = LinkedList<Int>()
    list.add(4)
    list.add(3)
    list.add(1)
    list.removeFirst()
    list.print()
}