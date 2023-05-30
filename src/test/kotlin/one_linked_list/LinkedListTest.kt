package one_linked_list

import linked_list.LinkedList
import org.testng.AssertJUnit.assertEquals
import org.testng.AssertJUnit.assertTrue
import org.testng.annotations.Test


@Test
class LinkedListTest {

    @Test
    fun `is Empty`(){
        val list = LinkedList.Base<Int>()
        val answer = list.isEmpty()
        assertTrue(answer)
    }

    @Test
    fun `is add`(){
        val list = LinkedList.Base<Int>()

    }

    fun `get size`(){
        val list = LinkedList.Base<Int>()
        list.add(1)
        list.add(2)
        assertEquals(list.size(), 2)
    }

}