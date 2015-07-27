package co.edu.udea.pruebassoftware.psp.programa3.linkedlist;

/**
 * Clase nodo donde se guardará la información referente a una tupla o par de 
 * valores del listado total (x, y).
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @since JDK 1.8
 * @version 1.0
 */
public class Node {

    private Node next;
    private double x;
    private double y;

    public Node(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Node() {
        super();
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
