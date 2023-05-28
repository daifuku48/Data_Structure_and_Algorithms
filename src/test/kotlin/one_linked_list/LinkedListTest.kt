package one_linked_list

import linked_list.LinkedList
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

    }

}