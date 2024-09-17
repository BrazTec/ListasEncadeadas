package LDE.src.listaDuplamenteEncadeada;

public class DLinkedList {protected NodeLDE head;
    protected NodeLDE tail;
    protected long size;

    // Construtor que cria uma lista vazia
    public DLinkedList() {
        head = tail = null;
        size = 0;
    }

    // Adiciona um elemento no início da lista
    public void addHead(String element) {
        NodeLDE newNode = new NodeLDE(element, null, head);
        if (head != null) {
            head.setPrev(newNode);
        }
        head = newNode;
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    // Adiciona um elemento no final da lista
    public void addTail(String element) {
        NodeLDE newNode = new NodeLDE(element, tail, null);
        if (tail != null) {
            tail.setNext(newNode);
        }
        tail = newNode;
        if (size == 0) {
            head = tail;
        }
        size++;
    }

    // Remove o primeiro elemento da lista
    public void removeFirst() {
        if (size == 0) {
            throw new EmptyDLinkedList("A lista está vazia");
        }
        head = head.getNext();
        if (head != null) {
            head.setPrev(null);
        }
        size--;
        if (size == 0) {
            tail = null;
        }
    }

    // Remove o último elemento da lista
    public void removeLast() {
        if (size == 0) {
            throw new EmptyDLinkedList("A lista está vazia");
        }
        tail = tail.getPrev();
        if (tail != null) {
            tail.setNext(null);
        }
        size--;
        if (size == 0) {
            head = null;
        }
    }

    // Retorna uma representação em string da lista
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        NodeLDE current = head;
        while (current != null) {
            sb.append(current.getElement());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    public long getSize() {
        return size;
    }
}
