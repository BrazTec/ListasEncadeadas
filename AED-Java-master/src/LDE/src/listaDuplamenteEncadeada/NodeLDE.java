package LDE.src.listaDuplamenteEncadeada;

public class NodeLDE {
    private String element;
    private NodeLDE next;
    private NodeLDE prev;

    public NodeLDE(String element, NodeLDE prev, NodeLDE next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public String getElement() { return element; }
    public NodeLDE getNext() { return next; }
    public NodeLDE getPrev() { return prev; }

    public void setElement(String newElem) { element = newElem; }
    public void setNext(NodeLDE newNext) { next = newNext; }
    public void setPrev(NodeLDE newPrev) { prev = newPrev; }
}
