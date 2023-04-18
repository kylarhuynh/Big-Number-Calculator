import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCases {

    @Test
    public void testLinkedList()
    {
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(5);
        list.add(6);

        assertEquals(3, list.getSize());
        assertEquals(4, list.getHead().getVal());
        assertEquals(5, list.getHead().getNext().getVal());
    }

    @Test
    public void testAddition1()
    {
        LinkedList expected = new LinkedList();
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.add(1);
        l1.add(1);
        l1.add(1);
        l2.add(1);
        l2.add(1);
        l2.add(1);

        String res = Calculations.Addition(l1, l2).toString();

        assertEquals("222", res);
    }

    @Test
    public void testAddition2()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);
        l1.add(8);
        l1.add(1);

        l2.add(3);
        l2.add(3);
        l2.add(5);

        assertEquals("517", Calculations.Addition(l1, l2).toString());
    }

    @Test
    public void testAddition3()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);
        l1.add(8);
        l1.add(9);

        l2.add(3);
        l2.add(3);
        l2.add(5);

        assertEquals("5151", Calculations.Addition(l1, l2).toString());
    }

    @Test
    public void testAddition4() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);
        l1.add(8);

        l2.add(3);


        assertEquals("58", Calculations.Addition(l1, l2).toString());
    }

    @Test
    public void testAddition5() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(3);

        assertEquals("3", Calculations.Addition(l1, l2).toString());
    }

    @Test
    public void testAddition6() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);
        l1.add(8);

        l2.add(0);
        l2.add(0);


        assertEquals("28", Calculations.Addition(l1, l2).toString());
    }

    @Test
    public void testAddition7() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(0);
        l1.add(0);

        l2.add(0);
        l2.add(0);


        assertEquals("00", Calculations.Addition(l1, l2).toString());
    }

    @Test
    public void testMult1()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(5);
        l1.add(5);

        l2.add(5);
        l2.add(5);

        assertEquals("5203", Calculations.Multiplication(l1, l2).toString());
    }

    @Test
    public void testMult2()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);
        l1.add(1);
        l1.add(3);

        l2.add(2);
        l2.add(0);
        l2.add(2);

        assertEquals("42036", Calculations.Multiplication(l1, l2).toString());
    }

    @Test
    public void testMult3()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(4);
        l1.add(2);
        l1.add(3);

        l2.add(7);
        l2.add(2);

        assertEquals("8478", Calculations.Multiplication(l1, l2).toString());
    }

    @Test
    public void testMult4()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(4);
        l1.add(2);
        l1.add(3);

        l2.add(0);
        l2.add(0);

        assertEquals("0000", Calculations.Multiplication(l1, l2).toString());
    }

    @Test
    public void testMult5()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(9);
        l1.add(8);
        l1.add(7);
        l1.add(6);
        l1.add(4);
        l1.add(3);

        l2.add(7);
        l2.add(6);
        l2.add(1);
        l2.add(0);
        l2.add(2);
        l2.add(1);

        assertEquals("36739527614", Calculations.Multiplication(l1, l2).toString());
    }

    @Test
    public void testExpo1()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(9);
        l1.add(8);

        l2.add(3);
        l2.add(0);

        assertEquals("969407", Calculations.Exponentiation(l1, l2).toString());
    }

    @Test
    public void testExpo2()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);

        l2.add(0);
        l2.add(4);

        assertEquals("6777261159901", Calculations.Exponentiation(l1, l2).toString());
    }

    @Test
    public void testExpo3()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);
        l1.add(9);
        l1.add(1);
        l2.add(5);

        assertTrue(l2.isOdd());
        assertEquals("232362919062", Calculations.Exponentiation(l1, l2).toString());
    }

    @Test
    public void testExpo4()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);
        l1.add(9);
        l1.add(1);
        l2.add(0);

        // test power of 0
        assertEquals("1", Calculations.Exponentiation(l1, l2).toString());
    }

    @Test
    public void testExpo5()
    {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.add(2);
        l1.add(9);
        l1.add(1);
        l2.add(1);

        assertEquals("291", Calculations.Exponentiation(l1, l2).toString());
    }
}



