package one_linked_list

import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test
import two_linked_list.TwoLinkedList


@Test
class TwoLinkedListTest<T> {

    @Test
    fun isInsert()
    {
        val list = TwoLinkedList.Base<Int>()
        list.insert(3)
        assertEquals(list.getLast(), 3)
    }


}