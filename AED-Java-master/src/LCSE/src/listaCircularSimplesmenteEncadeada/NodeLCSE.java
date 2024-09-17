package LCSE.src.listaCircularSimplesmenteEncadeada;

public class NodeLCSE {
    private String element;
    private NodeLCSE next;

    public NodeLCSE(String element, NodeLCSE next) {
        this.element = element;
        this.next = next;
    }

    public String getElement() { return element; }
    public NodeLCSE getNext() { return next; }

    public void setElement(String newElem) { element = newElem; }
    public void setNext(NodeLCSE newNext) { next = newNext; }
}