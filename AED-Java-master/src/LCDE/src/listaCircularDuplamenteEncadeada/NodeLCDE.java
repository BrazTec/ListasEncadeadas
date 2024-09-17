package LCDE.src.listaCircularDuplamenteEncadeada;

public class NodeLCDE {
    private String element;
    private NodeLCDE next;
    private NodeLCDE prev;

    public NodeLCDE(String element, NodeLCDE prev, NodeLCDE next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public String getElement() { return element; }
    public NodeLCDE getNext() { return next; }
    public NodeLCDE getPrev() { return prev; }

    public void setElement(String newElem) { element = newElem; }
    public void setNext(NodeLCDE newNext) { next = newNext; }
    public void setPrev(NodeLCDE newPrev) { prev = newPrev; }
}