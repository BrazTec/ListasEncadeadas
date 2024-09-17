package LCSE.src.listaCircularSimplesmenteEncadeada;

public class CSLinkedList {

    protected NodeLCSE tail;
    protected long size;
    // Construtor que cria uma lista vazia
    public CSLinkedList() {
        tail = null;
        size = 0;
    }

    public void addHead(String element) {
        if (size == 0) {
            NodeLCSE newNode = new NodeLCSE(element, null);
            newNode.setNext(newNode); // aponta para si mesmo
            tail = newNode;
        } else {
            NodeLCSE newNode = new NodeLCSE(element, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    // Adiciona um elemento no final da lista
    public void addTail(String element) {
        addHead(element);
        tail = tail.getNext();
    }

    // Remove o primeiro elemento da lista
    public void removeFirst() {
        if (size == 0) {
            throw new EmptyCSLinkedList("A lista está vazia");
        }

        if (size == 1) {
            tail = null;
        } else {
            NodeLCSE head = tail.getNext();
            tail.setNext(head.getNext());
        }
        size--;
    }

    // Remove o último elemento da lista
    public void removeLast() {
        if (size == 0) {
            throw new EmptyCSLinkedList("A lista está vazia");
        }

        if (size == 1) {
            tail = null;
        } else {
            NodeLCSE current = tail.getNext();
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            current.setNext(tail.getNext());
            tail = current;
        }
        size--;
    }
    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        NodeLCSE current = tail.getNext();
        do {
            sb.append(current.getElement());
            current = current.getNext();
            if (current != tail.getNext()) {
                sb.append(", ");
            }
        } while (current != tail.getNext());
        sb.append("]");
        return sb.toString();
    }

    public long getSize() {
        return size;
    }
}