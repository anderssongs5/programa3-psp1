package co.edu.udea.pruebassoftware.psp.programa3.linkedlist;

/**
 * Clase lista ligada donde se guardará la información requerida para el
 * programa en cada uno de los nodos.
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @since JDK 1.8
 * @version 1.0
 */
public class LinkedList {

    private Node firstNode;
    private Node lastNode;
    private int amount;

    public LinkedList() {
        this.firstNode = null;
        this.lastNode = null;
    }

    public Node getFirstNode() {

        return this.firstNode;
    }

    public boolean isEmpty() {

        return this.firstNode == null;
    }

    public Node getLastNode() {

        return this.lastNode;
    }

    public int getAmount() {

        return this.amount;
    }

    public Node link(double x, double y) {
        Node node = new Node(x, y);

        if (isEmpty()) {
            this.firstNode = node;
            this.lastNode = this.firstNode;
        } else if (this.firstNode == this.lastNode) {
            this.firstNode.setNext(node);
            this.lastNode = node;
        } else {
            this.lastNode.setNext(node);
            this.lastNode = node;
        }

        this.amount++;

        return node;
    }

    public void delete() {
        if (this.lastNode == this.firstNode) {

            this.firstNode = null;
            this.lastNode = this.firstNode;

            return;
        }

        Node previous = null;
        Node next = this.firstNode;
        while (next != this.lastNode) {
            previous = next;
            next = next.getNext();
        }

        this.lastNode = previous;
        this.lastNode.setNext(null);

        this.amount--;
    }
}
