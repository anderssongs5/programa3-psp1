package co.edu.udea.pruebassoftware.psp.programa3.linkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListTest {

    @Test()
    public void isEmptyTest1() {
        LinkedList linkedList = new LinkedList();

        assertTrue(linkedList.isEmpty());
    }

    @Test()
    public void isEmptyTest2() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(98, 3.3);

        assertTrue(!linkedList.isEmpty());
    }

    @Test()
    public void getLastNodeTest1() {
        LinkedList linkedList = new LinkedList();

        assertTrue(linkedList.getLastNode() == null);
    }

    @Test()
    public void gestLastNodeTest2() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(86.9, 63.2);

        assertTrue(linkedList.getLastNode() != null && linkedList.getLastNode().
                getX() == 86.9 && linkedList.getLastNode().getY() == 63.2);
    }

    @Test()
    public void gestLastNodeTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(86.9, -3.1);
        linkedList.link(98.3, -84.5);

        assertTrue(linkedList.getLastNode() != null && linkedList.getLastNode().
                getX() == 98.3 && linkedList.getLastNode().getY() == -84.5);
    }

    @Test()
    public void gestLastNodeTest4() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, 35.1);
        linkedList.link(58.6, 54);
        linkedList.link(55, -34);
        linkedList.link(95, -745.3);
        linkedList.link(3, 0);

        assertTrue(linkedList.getLastNode() != null && linkedList.getLastNode().
                getX() == 3 && linkedList.getLastNode().getY() == 0);
    }

    @Test()
    public void getFirstNodeTest1() {
        LinkedList linkedList = new LinkedList();

        assertTrue(linkedList.getFirstNode() == null);
    }

    @Test()
    public void getFirstNodeTest2() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(3, 0);

        assertTrue(linkedList.getFirstNode() != null && linkedList.
                getFirstNode().getX() == 3 && linkedList.getFirstNode().getY()
                == 0);
    }

    @Test()
    public void getFirstNodeTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(3, 0);
        linkedList.link(8, 0.343);

        assertTrue(linkedList.getFirstNode() != null && linkedList.
                getFirstNode().getX() == 3 && linkedList.getFirstNode().getY()
                == 0);
    }

    @Test()
    public void linkTest1() {
        LinkedList linkedList = new LinkedList();
        double x = 9;
        double y = 3;
        Node node = linkedList.link(x, y);

        assertTrue(node != null && x == node.getX() && y == node.getY());
    }

    @Test()
    public void linkTest2() {
        LinkedList linkedList = new LinkedList();
        double x = 9;
        double y = 3;
        linkedList.link(x, y);

        assertTrue(linkedList.getFirstNode() != null && x == linkedList.
                getFirstNode().getX() && y == linkedList.getFirstNode().getY());
    }

    @Test()
    public void linkTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, -3.054);
        linkedList.link(58.6, 53);

        assertTrue(linkedList.getLastNode() != null && linkedList.getLastNode()
                .getX() == 58.6 && linkedList.getLastNode().getY() == 53);
    }

    @Test()
    public void linkTest4() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, 3.2);
        linkedList.link(58.6, 0.62);
        linkedList.link(55, -83);
        linkedList.link(95, -25.1);

        assertTrue(linkedList.getFirstNode() != null && linkedList.getLastNode()
                != null && !linkedList.getFirstNode().equals(linkedList.
                        getLastNode()) && linkedList.getFirstNode().getX()
                == 5.6 && linkedList.getFirstNode().getY() == 3.2 && linkedList.
                getLastNode().getX() == 95 && linkedList.getLastNode().getY()
                == -25.1);
    }

    @Test()
    public void deleteTest1() {
        LinkedList linkedList = new LinkedList();
        linkedList.delete();

        assertTrue(linkedList.getLastNode() == null);
    }

    @Test()
    public void deleteTest2() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, 0);

        linkedList.delete();

        assertTrue(linkedList.getFirstNode() == null
                && linkedList.getLastNode() == null);
    }

    @Test()
    public void deleteTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, 3.2);
        linkedList.link(58.6, 0.62);
        linkedList.link(55, -83);
        linkedList.link(95, -25.1);

        linkedList.delete();

        assertTrue(linkedList.getLastNode() != null && linkedList.getLastNode().
                getX() == 55 && linkedList.getLastNode().getY() == -83);
    }

    @Test()
    public void getAmountTest1() {
        LinkedList linkedList = new LinkedList();

        assertTrue(linkedList.getAmount() == 0);
    }

    @Test()
    public void getAmountTest2() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, 0);

        assertTrue(linkedList.getAmount() == 1);
    }

    @Test()
    public void getAmountTest3() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, 3.2);
        linkedList.link(58.6, 0.62);
        linkedList.link(55, -83);
        linkedList.link(95, -25.1);

        assertTrue(linkedList.getAmount() == 4);
    }

    @Test()
    public void getAmountTest4() {
        LinkedList linkedList = new LinkedList();
        linkedList.link(5.6, 3.2);
        linkedList.link(58.6, 0.62);
        linkedList.link(55, -83);
        linkedList.link(95, -25.1);

        linkedList.delete();
        linkedList.delete();

        assertTrue(linkedList.getAmount() == 2);
    }
}
