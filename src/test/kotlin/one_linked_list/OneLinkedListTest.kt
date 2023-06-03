package one_linked_list

import org.testng.AssertJUnit.assertEquals
import org.testng.AssertJUnit.assertTrue
import org.testng.annotations.Test


@Test
class OneLinkedListTest {

    @Test
    fun `is Empty`(){
        val list = LinkedList.Base<Int>()
        val answer = list.isEmpty()
        assertTrue(answer)
    }

    @Test
    fun `is add`(){
        val list = LinkedList.Base<Int>()
        list.add(1)
        assertEquals(list.getElement(0), 1)
    }

    fun `get size`(){
        val list = LinkedList.Base<Int>()
        list.add(1)
        list.add(2)
        assertEquals(list.size(), 2)
    }

    @Test
    fun `get elements`(){
        val list = LinkedList.Base<String>()
        list.add("hello")
        list.add("programmer")
        assertEquals("programmer", list.getElement(1))
    }

}